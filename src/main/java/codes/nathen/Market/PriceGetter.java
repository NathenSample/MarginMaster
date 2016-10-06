package codes.nathen.Market;

/**
 * Created by nsample on 06/10/2016.
 */
public interface PriceGetter {
    int getItemId();

    int getRegionId();

    double getSellPrice();

    double getBuyPrice();
}
