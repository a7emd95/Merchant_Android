package com.example.yalladealz_merchant.remote;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private final static String BASE_URL = "https://yalla-ebdaa.herokuapp.com/api/";
    private static APIInterface API = null;

    private final static String Key = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9." +
            "eyJfaWQiOiI1ZTdmYTM5MWZkNTJjODFhMzAyNTQ5ZDciLCJpYXQiOjE1ODU0MzU5MTAsImV4cCI6MTU4NjI5OTkxMH0." +
            "aj8pU_3RphsCS8k-J-FpRwBF_VV75-9Vpc6lxGa9cQQ";


    public static APIInterface getClient() {


        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

      /*  httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request().newBuilder().addHeader("authorization", Key).build();
                return chain.proceed(request);
            }
        });*/

        httpClient.addInterceptor(httpLoggingInterceptor);

        if (API == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(httpClient.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            API = retrofit.create(APIInterface.class);
        }

        return API;
    }
}
