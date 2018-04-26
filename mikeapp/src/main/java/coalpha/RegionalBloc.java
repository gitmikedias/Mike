
package coalpha;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "acronym",
    "name",
    "otherAcronyms",
    "otherNames"
})
public class RegionalBloc {

    @JsonProperty("acronym")
    private String acronym;
    @JsonProperty("name")
    private String name;
    @JsonProperty("otherAcronyms")
    private List<Object> otherAcronyms = new ArrayList<Object>();
    @JsonProperty("otherNames")
    private List<Object> otherNames = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The acronym
     */
    @JsonProperty("acronym")
    public String getAcronym() {
        return acronym;
    }

    /**
     * 
     * @param acronym
     *     The acronym
     */
    @JsonProperty("acronym")
    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The otherAcronyms
     */
    @JsonProperty("otherAcronyms")
    public List<Object> getOtherAcronyms() {
        return otherAcronyms;
    }

    /**
     * 
     * @param otherAcronyms
     *     The otherAcronyms
     */
    @JsonProperty("otherAcronyms")
    public void setOtherAcronyms(List<Object> otherAcronyms) {
        this.otherAcronyms = otherAcronyms;
    }

    /**
     * 
     * @return
     *     The otherNames
     */
    @JsonProperty("otherNames")
    public List<Object> getOtherNames() {
        return otherNames;
    }

    /**
     * 
     * @param otherNames
     *     The otherNames
     */
    @JsonProperty("otherNames")
    public void setOtherNames(List<Object> otherNames) {
        this.otherNames = otherNames;
    }

}
