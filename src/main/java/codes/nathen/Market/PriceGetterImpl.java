package codes.nathen.Market;

import codes.nathen.Crest.Item;
import codes.nathen.Crest.Market;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by nsample on 06/10/2016.
 */
public class PriceGetterImpl implements PriceGetter{
    static final Logger LOGGER = LogManager.getLogger(PriceGetterImpl.class);
    private int itemId;
    private int regionId;
    private int stationId;
    private String crestString = "https://Crest-tq.eveonline.com/market/%s/orders/%s/?type=https://Crest-tq.eveonline.com/inventory/types/%s/";

    public PriceGetterImpl(int itemId, int regionId, int stationId){
        this.itemId = itemId;
        this.regionId = regionId;
        this.stationId = stationId;
    }


    public int getItemId() {
        return itemId;
    }


    public int getRegionId() {
        return regionId;
    }


    public double getSellPrice() {
        return getPriceFromCrest(String.format(crestString, regionId, "sell", itemId), "sell");
    }


    public double getBuyPrice() {
        return getPriceFromCrest(String.format(crestString, regionId, "buy", itemId), "buy");
    }

    //Returning -1 signifies a exception(Which will be logged), or that no pricing information could be found(also logged)
    //TODO: Still needs work but significant improvement
    private double getPriceFromCrest(String crestUrlAsString, String mode){
        double price = -1;
        try {
            double best = -1;
            String jsonResponseAsString = IOUtils.toString(new URL(crestUrlAsString), "UTF-8");
            ObjectMapper mapper = new ObjectMapper();
            ArrayList orders = (ArrayList) mapper.readValue(jsonResponseAsString, Map.class).get("items");

            Market markets = mapper.readValue(jsonResponseAsString, Market.class);
            ArrayList<Item> orderList = (ArrayList<Item>) markets.getItems();

            for(Item order : orderList){
                if(order.getLocation().getId() != stationId) continue;
                double currentPrice = order.getPrice();
                if(best == -1) best = currentPrice;
                if(mode.equals("buy")) {
                    if (currentPrice > best) best = currentPrice;
                }else {
                    if(currentPrice < best) best = currentPrice;
                }
            }

            price = best;
        } catch (Exception e) {
            LOGGER.error("Exception on getPriceFromCrest - REGION_ID:" + regionId + " itemId:" + itemId);
            e.printStackTrace();
        }
        return price;
    }



}
