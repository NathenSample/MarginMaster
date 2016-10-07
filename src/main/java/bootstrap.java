import codes.nathen.Crest.Item;
import codes.nathen.Crest.Market;
import codes.nathen.Crest.MarketType;
import codes.nathen.Market.PriceGetter;
import codes.nathen.Market.PriceGetterImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nsample on 06/10/2016.
 */
public class bootstrap {
    public static void main(String[] args) throws IOException {
        String jsonResponseAsString = IOUtils.toString(new URL("https://crest-tq.eveonline.com/market/types/"), "UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        MarketType myItems = mapper.readValue(jsonResponseAsString, MarketType.class);
        Map<String, MarketType> crestResponse = new HashMap<String, MarketType>();
        crestResponse.put("1", myItems);
        int pageCount = 2;
        System.out.println(myItems.getPageCount());
        while(myItems.getNext() != null){
            System.out.println(myItems.getNext().getHref());
            jsonResponseAsString = IOUtils.toString(new URL(myItems.getNext().getHref()), "UTF-8");
            myItems = mapper.readValue(jsonResponseAsString, MarketType.class);
            crestResponse.put(Integer.toString(pageCount), myItems);
            pageCount++;
        }

        System.out.println(crestResponse.keySet().size());
        for(String key : crestResponse.keySet()) {
            myItems = crestResponse.get(key);
            for (Item x : myItems.getItems()) {
                PriceGetter getter = new PriceGetterImpl(x.getId(), 10000002, 60003760);
                Double buy = getter.getBuyPriceFromCrest();
                Double sell = getter.getSellPriceFromCrest();
                Double margin = (sell-buy);
                Double marginPercent = (margin/buy) *100;
                if (buy != -1 && sell != -1 && margin > 10000000 && marginPercent > 10 && !x.getType().getName().contains("SKIN") && !x.getType().getName().contains("Blueprint")) {
                    System.out.printf("Highest Buy Price of " + x.getType().getName() + ": %.2f\n", buy);
                    System.out.printf("Lowest Sell Price of " + x.getType().getName() + ": %.2f\n", sell);
                    System.out.printf("The margin on " + x.getType().getName() + " is : %.2f (%.0f)\n\n", (sell - buy), marginPercent);
                }
            }
        }

    }

}
