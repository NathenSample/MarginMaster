package codes.nathen.Market;

/**
 * Created by nsample on 06/10/2016.
 */
public class MarketableImpl implements Marketable {
    PriceGetterImpl priceGetter;
    int itemId;
    String itemName;

    public MarketableImpl(int itemId, String itemName){
        this.itemId = itemId;
        this.itemName = itemName;
        priceGetter = new PriceGetterImpl(itemId, 10000002, 60003760); // TODO: Currently hardcoded to the forge, jita 4-4
    }


    public int getSellPrice() {
        return 0;
    }


    public int getBuyPrice() {
        return 0;
    }

}
