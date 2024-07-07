import com.google.gson.annotations.SerializedName;

public class Divisa {
    @SerializedName("base_code")
    private String monedaBase;
    @SerializedName("target_code")
    private String monedaAConvertir;
    @SerializedName("conversion_rate")
    private String radioDeConversion;
    @SerializedName("conversion_result")
    private String resultadoConversion;

    public Divisa(String monedaBase, String monedaAConvertir, String radioDeConversion, String resultadoConversion) {
        this.monedaBase = monedaBase;
        this.monedaAConvertir = monedaAConvertir;
        this.radioDeConversion = radioDeConversion;
        this.resultadoConversion = resultadoConversion;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public void setMonedaBase(String monedaBase) {
        this.monedaBase = monedaBase;
    }

    public String getMonedaAConvertir() {
        return monedaAConvertir;
    }

    public void setMonedaAConvertir(String monedaAConvertir) {
        this.monedaAConvertir = monedaAConvertir;
    }

    public String getRadioDeConversion() {
        return radioDeConversion;
    }

    public void setRadioDeConversion(String radioDeConversion) {
        this.radioDeConversion = radioDeConversion;
    }

    public String getResultadoConversion() {
        return resultadoConversion;
    }

    public void setResultadoConversion(String resultadoConversion) {
        this.resultadoConversion = resultadoConversion;
    }
}
