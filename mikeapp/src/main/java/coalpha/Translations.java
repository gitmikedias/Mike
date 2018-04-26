
package coalpha;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "de",
    "es",
    "fr",
    "ja",
    "it",
    "br",
    "pt",
    "nl",
    "hr",
    "fa"
})
public class Translations {

    @JsonProperty("de")
    private String de;
    @JsonProperty("es")
    private String es;
    @JsonProperty("fr")
    private String fr;
    @JsonProperty("ja")
    private String ja;
    @JsonProperty("it")
    private String it;
    @JsonProperty("br")
    private String br;
    @JsonProperty("pt")
    private String pt;
    @JsonProperty("nl")
    private String nl;
    @JsonProperty("hr")
    private String hr;
    @JsonProperty("fa")
    private String fa;

    /**
     * 
     * @return
     *     The de
     */
    @JsonProperty("de")
    public String getDe() {
        return de;
    }

    /**
     * 
     * @param de
     *     The de
     */
    @JsonProperty("de")
    public void setDe(String de) {
        this.de = de;
    }

    /**
     * 
     * @return
     *     The es
     */
    @JsonProperty("es")
    public String getEs() {
        return es;
    }

    /**
     * 
     * @param es
     *     The es
     */
    @JsonProperty("es")
    public void setEs(String es) {
        this.es = es;
    }

    /**
     * 
     * @return
     *     The fr
     */
    @JsonProperty("fr")
    public String getFr() {
        return fr;
    }

    /**
     * 
     * @param fr
     *     The fr
     */
    @JsonProperty("fr")
    public void setFr(String fr) {
        this.fr = fr;
    }

    /**
     * 
     * @return
     *     The ja
     */
    @JsonProperty("ja")
    public String getJa() {
        return ja;
    }

    /**
     * 
     * @param ja
     *     The ja
     */
    @JsonProperty("ja")
    public void setJa(String ja) {
        this.ja = ja;
    }

    /**
     * 
     * @return
     *     The it
     */
    @JsonProperty("it")
    public String getIt() {
        return it;
    }

    /**
     * 
     * @param it
     *     The it
     */
    @JsonProperty("it")
    public void setIt(String it) {
        this.it = it;
    }

    /**
     * 
     * @return
     *     The br
     */
    @JsonProperty("br")
    public String getBr() {
        return br;
    }

    /**
     * 
     * @param br
     *     The br
     */
    @JsonProperty("br")
    public void setBr(String br) {
        this.br = br;
    }

    /**
     * 
     * @return
     *     The pt
     */
    @JsonProperty("pt")
    public String getPt() {
        return pt;
    }

    /**
     * 
     * @param pt
     *     The pt
     */
    @JsonProperty("pt")
    public void setPt(String pt) {
        this.pt = pt;
    }

    /**
     * 
     * @return
     *     The nl
     */
    @JsonProperty("nl")
    public String getNl() {
        return nl;
    }

    /**
     * 
     * @param nl
     *     The nl
     */
    @JsonProperty("nl")
    public void setNl(String nl) {
        this.nl = nl;
    }

    /**
     * 
     * @return
     *     The hr
     */
    @JsonProperty("hr")
    public String getHr() {
        return hr;
    }

    /**
     * 
     * @param hr
     *     The hr
     */
    @JsonProperty("hr")
    public void setHr(String hr) {
        this.hr = hr;
    }

    /**
     * 
     * @return
     *     The fa
     */
    @JsonProperty("fa")
    public String getFa() {
        return fa;
    }

    /**
     * 
     * @param fa
     *     The fa
     */
    @JsonProperty("fa")
    public void setFa(String fa) {
        this.fa = fa;
    }

}
