import codes.nathen.Market.PriceGetter;
import codes.nathen.Market.PriceGetterImpl;

/**
 * Created by nsample on 06/10/2016.
 */
public class bootstrap {
    public static void main(String[] args) {
        PriceGetter myGetter = new PriceGetterImpl(34, 10000002, 60003760);
        System.out.println(myGetter.getBuyPrice());
    }

}
