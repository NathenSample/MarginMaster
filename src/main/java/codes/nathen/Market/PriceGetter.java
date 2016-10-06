package codes.nathen.Market;

/**
 * Created by nsample on 06/10/2016.
 */
public interface PriceGetter {
    long getItemId();

    long getRegionId();

    double getBuyPriceFromCrest();

    double getSellPriceFromCrest();
}
