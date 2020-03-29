package com.example.yalladealz_merchant.remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private final static String BASE_URL = "http://192.168.1.10:8081";
    private static APIInterface API = null;

    public static APIInterface getClient(){

        if(API == null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            API = retrofit.create(APIInterface.class);
        }

        return API;
    }
}
