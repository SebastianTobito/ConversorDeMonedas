package com.callenge.conversor.modelo;

import com.google.gson.annotations.SerializedName;

public class Divisa {
    @SerializedName("base_code")
    private String monedaBase;
    @SerializedName("target_code")
    private String monedaAConvertir;
    @SerializedName("conversion_rate")
    private Double radioDeConversion;
    @SerializedName("conversion_result")
    private Double resultadoConversion;
    @SerializedName("time_last_update_utc")
    private String fechaUltimaConversion;


    public Divisa(DivisaApi divisaApi) {
        this.monedaBase = divisaApi.base_code();
        this.monedaAConvertir =divisaApi.target_code();
        this.radioDeConversion = divisaApi.conversion_rate();
        this.resultadoConversion = divisaApi.conversion_result();
        this.fechaUltimaConversion = divisaApi.time_last_update_utc();
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public String getMonedaAConvertir() {
        return monedaAConvertir;
    }

    public Double getRadioDeConversion() {
        return radioDeConversion;
    }

    public Double getResultadoConversion() {
        return resultadoConversion;
    }

    public String getFechaUltimaConversion() {
        return fechaUltimaConversion;
    }

    @Override
    public String toString() {
        return
                "fecha de ultima actualizacion='" + fechaUltimaConversion + '\'' +
                ", Moneda base: '" + monedaBase + '\'' +
                ", moneda a convertir=: '" + monedaAConvertir + '\'' +
                ", tasa a convertir: '" + radioDeConversion + '\'' +
                ", resultado de la conversion: '" + resultadoConversion + '\'';
    }
}
