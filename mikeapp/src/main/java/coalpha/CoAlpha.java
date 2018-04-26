
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
    "name",
    "topLevelDomain",
    "alpha2Code",
    "alpha3Code",
    "callingCodes",
    "capital",
    "altSpellings",
    "region",
    "subregion",
    "population",
    "latlng",
    "demonym",
    "area",
    "gini",
    "timezones",
    "borders",
    "nativeName",
    "numericCode",
    "currencies",
    "languages",
    "translations",
    "flag",
    "regionalBlocs",
    "cioc"
})
public class CoAlpha {

    @JsonProperty("name")
    private String name;
    @JsonProperty("topLevelDomain")
    private List<String> topLevelDomain = new ArrayList<String>();
    @JsonProperty("alpha2Code")
    private String alpha2Code;
    @JsonProperty("alpha3Code")
    private String alpha3Code;
    @JsonProperty("callingCodes")
    private List<String> callingCodes = new ArrayList<String>();
    @JsonProperty("capital")
    private String capital;
    @JsonProperty("altSpellings")
    private List<String> altSpellings = new ArrayList<String>();
    @JsonProperty("region")
    private String region;
    @JsonProperty("subregion")
    private String subregion;
    @JsonProperty("population")
    private int population;
    @JsonProperty("latlng")
    private List<Double> latlng = new ArrayList<Double>();
    @JsonProperty("demonym")
    private String demonym;
    @JsonProperty("area")
    private int area;
    @JsonProperty("gini")
    private int gini;
    @JsonProperty("timezones")
    private List<String> timezones = new ArrayList<String>();
    @JsonProperty("borders")
    private List<String> borders = new ArrayList<String>();
    @JsonProperty("nativeName")
    private String nativeName;
    @JsonProperty("numericCode")
    private String numericCode;
    @JsonProperty("currencies")
    private List<Currency> currencies = new ArrayList<Currency>();
    @JsonProperty("languages")
    private List<Language> languages = new ArrayList<Language>();
    @JsonProperty("translations")
    private Translations translations;
    @JsonProperty("flag")
    private String flag;
    @JsonProperty("regionalBlocs")
    private List<RegionalBloc> regionalBlocs = new ArrayList<RegionalBloc>();
    @JsonProperty("cioc")
    private String cioc;

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
     *     The topLevelDomain
     */
    @JsonProperty("topLevelDomain")
    public List<String> getTopLevelDomain() {
        return topLevelDomain;
    }

    /**
     * 
     * @param topLevelDomain
     *     The topLevelDomain
     */
    @JsonProperty("topLevelDomain")
    public void setTopLevelDomain(List<String> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    /**
     * 
     * @return
     *     The alpha2Code
     */
    @JsonProperty("alpha2Code")
    public String getAlpha2Code() {
        return alpha2Code;
    }

    /**
     * 
     * @param alpha2Code
     *     The alpha2Code
     */
    @JsonProperty("alpha2Code")
    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    /**
     * 
     * @return
     *     The alpha3Code
     */
    @JsonProperty("alpha3Code")
    public String getAlpha3Code() {
        return alpha3Code;
    }

    /**
     * 
     * @param alpha3Code
     *     The alpha3Code
     */
    @JsonProperty("alpha3Code")
    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    /**
     * 
     * @return
     *     The callingCodes
     */
    @JsonProperty("callingCodes")
    public List<String> getCallingCodes() {
        return callingCodes;
    }

    /**
     * 
     * @param callingCodes
     *     The callingCodes
     */
    @JsonProperty("callingCodes")
    public void setCallingCodes(List<String> callingCodes) {
        this.callingCodes = callingCodes;
    }

    /**
     * 
     * @return
     *     The capital
     */
    @JsonProperty("capital")
    public String getCapital() {
        return capital;
    }

    /**
     * 
     * @param capital
     *     The capital
     */
    @JsonProperty("capital")
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     * 
     * @return
     *     The altSpellings
     */
    @JsonProperty("altSpellings")
    public List<String> getAltSpellings() {
        return altSpellings;
    }

    /**
     * 
     * @param altSpellings
     *     The altSpellings
     */
    @JsonProperty("altSpellings")
    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    /**
     * 
     * @return
     *     The region
     */
    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    /**
     * 
     * @param region
     *     The region
     */
    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * 
     * @return
     *     The subregion
     */
    @JsonProperty("subregion")
    public String getSubregion() {
        return subregion;
    }

    /**
     * 
     * @param subregion
     *     The subregion
     */
    @JsonProperty("subregion")
    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    /**
     * 
     * @return
     *     The population
     */
    @JsonProperty("population")
    public int getPopulation() {
        return population;
    }

    /**
     * 
     * @param population
     *     The population
     */
    @JsonProperty("population")
    public void setPopulation(int population) {
        this.population = population;
    }

    /**
     * 
     * @return
     *     The latlng
     */
    @JsonProperty("latlng")
    public List<Double> getLatlng() {
        return latlng;
    }

    /**
     * 
     * @param latlng
     *     The latlng
     */
    @JsonProperty("latlng")
    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    /**
     * 
     * @return
     *     The demonym
     */
    @JsonProperty("demonym")
    public String getDemonym() {
        return demonym;
    }

    /**
     * 
     * @param demonym
     *     The demonym
     */
    @JsonProperty("demonym")
    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    /**
     * 
     * @return
     *     The area
     */
    @JsonProperty("area")
    public int getArea() {
        return area;
    }

    /**
     * 
     * @param area
     *     The area
     */
    @JsonProperty("area")
    public void setArea(int area) {
        this.area = area;
    }

    /**
     * 
     * @return
     *     The gini
     */
    @JsonProperty("gini")
    public int getGini() {
        return gini;
    }

    /**
     * 
     * @param gini
     *     The gini
     */
    @JsonProperty("gini")
    public void setGini(int gini) {
        this.gini = gini;
    }

    /**
     * 
     * @return
     *     The timezones
     */
    @JsonProperty("timezones")
    public List<String> getTimezones() {
        return timezones;
    }

    /**
     * 
     * @param timezones
     *     The timezones
     */
    @JsonProperty("timezones")
    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

    /**
     * 
     * @return
     *     The borders
     */
    @JsonProperty("borders")
    public List<String> getBorders() {
        return borders;
    }

    /**
     * 
     * @param borders
     *     The borders
     */
    @JsonProperty("borders")
    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    /**
     * 
     * @return
     *     The nativeName
     */
    @JsonProperty("nativeName")
    public String getNativeName() {
        return nativeName;
    }

    /**
     * 
     * @param nativeName
     *     The nativeName
     */
    @JsonProperty("nativeName")
    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    /**
     * 
     * @return
     *     The numericCode
     */
    @JsonProperty("numericCode")
    public String getNumericCode() {
        return numericCode;
    }

    /**
     * 
     * @param numericCode
     *     The numericCode
     */
    @JsonProperty("numericCode")
    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    /**
     * 
     * @return
     *     The currencies
     */
    @JsonProperty("currencies")
    public List<Currency> getCurrencies() {
        return currencies;
    }

    /**
     * 
     * @param currencies
     *     The currencies
     */
    @JsonProperty("currencies")
    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    /**
     * 
     * @return
     *     The languages
     */
    @JsonProperty("languages")
    public List<Language> getLanguages() {
        return languages;
    }

    /**
     * 
     * @param languages
     *     The languages
     */
    @JsonProperty("languages")
    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    /**
     * 
     * @return
     *     The translations
     */
    @JsonProperty("translations")
    public Translations getTranslations() {
        return translations;
    }

    /**
     * 
     * @param translations
     *     The translations
     */
    @JsonProperty("translations")
    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    /**
     * 
     * @return
     *     The flag
     */
    @JsonProperty("flag")
    public String getFlag() {
        return flag;
    }

    /**
     * 
     * @param flag
     *     The flag
     */
    @JsonProperty("flag")
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
     * 
     * @return
     *     The regionalBlocs
     */
    @JsonProperty("regionalBlocs")
    public List<RegionalBloc> getRegionalBlocs() {
        return regionalBlocs;
    }

    /**
     * 
     * @param regionalBlocs
     *     The regionalBlocs
     */
    @JsonProperty("regionalBlocs")
    public void setRegionalBlocs(List<RegionalBloc> regionalBlocs) {
        this.regionalBlocs = regionalBlocs;
    }

    /**
     * 
     * @return
     *     The cioc
     */
    @JsonProperty("cioc")
    public String getCioc() {
        return cioc;
    }

    /**
     * 
     * @param cioc
     *     The cioc
     */
    @JsonProperty("cioc")
    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

}
