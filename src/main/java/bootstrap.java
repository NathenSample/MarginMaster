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

/**
 * Created by nsample on 06/10/2016.
 */
public class bootstrap {
    public static void main(String[] args) throws IOException {
        String jsonResponseAsString = IOUtils.toString(new URL("https://crest-tq.eveonline.com/market/types/"), "UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        MarketType myItems = mapper.readValue(jsonResponseAsString, MarketType.class);

        System.out.println(myItems.getItems().size());
        for(Item x : myItems.getItems()){
            PriceGetter getter = new PriceGetterImpl(x.getId(), 10000002, 60003760);
            Double buy = getter.getBuyPriceFromCrest();
            Double sell = getter.getSellPriceFromCrest();
            if(buy != -1 && sell != -1) {
                System.out.printf("Highest Buy Price of " + x.getType().getName() + ": %.2f\n", buy);
                System.out.printf("Lowest Sell Price of " + x.getType().getName() + ": %.2f\n", sell);
                System.out.printf("The margin on " + x.getType().getName() + " is : %.2f \n\n", (sell - buy));
            }
        }

    }

}
