package codes.nathen.Crest;


import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "volume_str",
        "buy",
        "issued",
        "price",
        "volumeEntered",
        "minVolume",
        "volume",
        "range",
        "href",
        "duration_str",
        "location",
        "duration",
        "minVolume_str",
        "volumeEntered_str",
        "type",
        "id",
        "id_str"
})
public class Item {

    @JsonProperty("volume_str")
    private String volumeStr;
    @JsonProperty("buy")
    private Boolean buy;
    @JsonProperty("issued")
    private String issued;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("volumeEntered")
    private Long volumeEntered;
    @JsonProperty("minVolume")
    private Long minVolume;
    @JsonProperty("volume")
    private Long volume;
    @JsonProperty("range")
    private String range;
    @JsonProperty("href")
    private String href;
    @JsonProperty("duration_str")
    private String durationStr;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("duration")
    private Long duration;
    @JsonProperty("minVolume_str")
    private String minVolumeStr;
    @JsonProperty("volumeEntered_str")
    private String volumeEnteredStr;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("id_str")
    private String idStr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The volumeStr
     */
    @JsonProperty("volume_str")
    public String getVolumeStr() {
        return volumeStr;
    }

    /**
     *
     * @param volumeStr
     * The volume_str
     */
    @JsonProperty("volume_str")
    public void setVolumeStr(String volumeStr) {
        this.volumeStr = volumeStr;
    }

    /**
     *
     * @return
     * The buy
     */
    @JsonProperty("buy")
    public Boolean getBuy() {
        return buy;
    }

    /**
     *
     * @param buy
     * The buy
     */
    @JsonProperty("buy")
    public void setBuy(Boolean buy) {
        this.buy = buy;
    }

    /**
     *
     * @return
     * The issued
     */
    @JsonProperty("issued")
    public String getIssued() {
        return issued;
    }

    /**
     *
     * @param issued
     * The issued
     */
    @JsonProperty("issued")
    public void setIssued(String issued) {
        this.issued = issued;
    }

    /**
     *
     * @return
     * The price
     */
    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    /**
     *
     * @param price
     * The price
     */
    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     *
     * @return
     * The volumeEntered
     */
    @JsonProperty("volumeEntered")
    public Long getVolumeEntered() {
        return volumeEntered;
    }

    /**
     *
     * @param volumeEntered
     * The volumeEntered
     */
    @JsonProperty("volumeEntered")
    public void setVolumeEntered(Long volumeEntered) {
        this.volumeEntered = volumeEntered;
    }

    /**
     *
     * @return
     * The minVolume
     */
    @JsonProperty("minVolume")
    public Long getMinVolume() {
        return minVolume;
    }

    /**
     *
     * @param minVolume
     * The minVolume
     */
    @JsonProperty("minVolume")
    public void setMinVolume(Long minVolume) {
        this.minVolume = minVolume;
    }

    /**
     *
     * @return
     * The volume
     */
    @JsonProperty("volume")
    public Long getVolume() {
        return volume;
    }

    /**
     *
     * @param volume
     * The volume
     */
    @JsonProperty("volume")
    public void setVolume(Long volume) {
        this.volume = volume;
    }

    /**
     *
     * @return
     * The range
     */
    @JsonProperty("range")
    public String getRange() {
        return range;
    }

    /**
     *
     * @param range
     * The range
     */
    @JsonProperty("range")
    public void setRange(String range) {
        this.range = range;
    }

    /**
     *
     * @return
     * The href
     */
    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    /**
     *
     * @param href
     * The href
     */
    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    /**
     *
     * @return
     * The durationStr
     */
    @JsonProperty("duration_str")
    public String getDurationStr() {
        return durationStr;
    }

    /**
     *
     * @param durationStr
     * The duration_str
     */
    @JsonProperty("duration_str")
    public void setDurationStr(String durationStr) {
        this.durationStr = durationStr;
    }

    /**
     *
     * @return
     * The location
     */
    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The duration
     */
    @JsonProperty("duration")
    public Long getDuration() {
        return duration;
    }

    /**
     *
     * @param duration
     * The duration
     */
    @JsonProperty("duration")
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     *
     * @return
     * The minVolumeStr
     */
    @JsonProperty("minVolume_str")
    public String getMinVolumeStr() {
        return minVolumeStr;
    }

    /**
     *
     * @param minVolumeStr
     * The minVolume_str
     */
    @JsonProperty("minVolume_str")
    public void setMinVolumeStr(String minVolumeStr) {
        this.minVolumeStr = minVolumeStr;
    }

    /**
     *
     * @return
     * The volumeEnteredStr
     */
    @JsonProperty("volumeEntered_str")
    public String getVolumeEnteredStr() {
        return volumeEnteredStr;
    }

    /**
     *
     * @param volumeEnteredStr
     * The volumeEntered_str
     */
    @JsonProperty("volumeEntered_str")
    public void setVolumeEnteredStr(String volumeEnteredStr) {
        this.volumeEnteredStr = volumeEnteredStr;
    }

    /**
     *
     * @return
     * The type
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The id
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The idStr
     */
    @JsonProperty("id_str")
    public String getIdStr() {
        return idStr;
    }

    /**
     *
     * @param idStr
     * The id_str
     */
    @JsonProperty("id_str")
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}