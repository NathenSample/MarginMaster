package codes.nathen.Crest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        "totalCount_str",
        "items",
        "pageCount",
        "pageCount_str",
        "totalCount"
})
public class Market {

    @JsonProperty("totalCount_str")
    private String totalCountStr;
    @JsonProperty("items")
    private List<Item> items = new ArrayList<Item>();
    @JsonProperty("pageCount")
    private Integer pageCount;
    @JsonProperty("pageCount_str")
    private String pageCountStr;
    @JsonProperty("totalCount")
    private Integer totalCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The totalCountStr
     */
    @JsonProperty("totalCount_str")
    public String getTotalCountStr() {
        return totalCountStr;
    }

    /**
     *
     * @param totalCountStr
     * The totalCount_str
     */
    @JsonProperty("totalCount_str")
    public void setTotalCountStr(String totalCountStr) {
        this.totalCountStr = totalCountStr;
    }

    /**
     *
     * @return
     * The items
     */
    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    /**
     *
     * @param items
     * The items
     */
    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     *
     * @return
     * The pageCount
     */
    @JsonProperty("pageCount")
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     *
     * @param pageCount
     * The pageCount
     */
    @JsonProperty("pageCount")
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    /**
     *
     * @return
     * The pageCountStr
     */
    @JsonProperty("pageCount_str")
    public String getPageCountStr() {
        return pageCountStr;
    }

    /**
     *
     * @param pageCountStr
     * The pageCount_str
     */
    @JsonProperty("pageCount_str")
    public void setPageCountStr(String pageCountStr) {
        this.pageCountStr = pageCountStr;
    }

    /**
     *
     * @return
     * The totalCount
     */
    @JsonProperty("totalCount")
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     *
     * @param totalCount
     * The totalCount
     */
    @JsonProperty("totalCount")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
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