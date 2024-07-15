package com.callenge.conversor.service;

import com.callenge.conversor.modelo.Divisa;
import com.callenge.conversor.modelo.DivisaApi;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConvierteDatos {
    public DivisaApi convierteDatos(String json){

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .setPrettyPrinting()
                .create();

        DivisaApi divisaApi = gson.fromJson(json, DivisaApi.class);

        Divisa divisa = new Divisa(divisaApi);

        return divisaApi;
    }
}
