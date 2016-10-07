package codes.nathen.Market;

import codes.nathen.Crest.Item;
import codes.nathen.Crest.Market;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nsample on 06/10/2016.
 */
public class PriceGetterImpl implements PriceGetter{
    static final Logger LOGGER = LogManager.getLogger(PriceGetterImpl.class);
    private long itemId;
    private long regionId;
    private long stationId;
    private String crestString = "https://Crest-tq.eveonline.com/market/%s/orders/%s/?type=https://Crest-tq.eveonline.com/inventory/types/%s/";

    public PriceGetterImpl(long itemId, int regionId, int stationId){
        this.itemId = itemId;
        this.regionId = regionId;
        this.stationId = stationId;
    }


    public long getItemId() {
        return itemId;
    }


    public long getRegionId() {
        return regionId;
    }

    private List<Item> getMarketOrders(String orderType){
        Market markets = new Market();
        try {
            String jsonResponseAsString = IOUtils.toString(new URL(String.format(crestString, regionId, orderType, itemId)), "UTF-8");
            ObjectMapper mapper = new ObjectMapper();
            markets = mapper.readValue(jsonResponseAsString, Market.class);
        } catch(Exception e) {
            LOGGER.error("Exception on getPriceFromCrest - REGION_ID:" + regionId + " itemId:" + itemId);
            e.printStackTrace();
        }
        return markets.getItems();
    }

    //Returning -1 signifies a exception(Which will be logged), or that no pricing information could be found(also logged)
    //TODO: Refactor out repeated logic, it's an improvement on what it used to be but still needs more.
    public double getBuyPriceFromCrest(){
        double price = -1;

        ArrayList<Item> orderList = (ArrayList<Item>) getMarketOrders("buy");

        for(Item order : orderList){
            if(order.getLocation().getId() != stationId) continue;
            double currentPrice = order.getPrice();
            if(price == -1) price = currentPrice;
            if (currentPrice > price) price = currentPrice;
        }

        return price;
    }

    //Returning -1 signifies a exception(Which will be logged), or that no pricing information could be found(also logged)
    //TODO: Refactor out repeated logic, it's an improvement on what it used to be but still needs more.
    public double getSellPriceFromCrest(){
        double price = -1;
        ArrayList<Item> orderList = (ArrayList<Item>) getMarketOrders("sell");

        for(Item order : orderList){
            if(order.getLocation().getId() != stationId) continue;
            double currentPrice = order.getPrice();
            if(price == -1) price = currentPrice;
            if(currentPrice < price) price = currentPrice;
        }

        return price;
    }



}
