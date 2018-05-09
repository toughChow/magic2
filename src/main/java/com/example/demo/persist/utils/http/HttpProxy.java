package com.example.demo.persist.utils.http;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.HashMap;
import java.util.Map;

public class HttpProxy {
    public static final HttpProxy INSTANCE = new HttpProxy();
    private static Map<Class<?>, Object> PROXIES_MAP = new HashMap<>();

    public synchronized <T> Object getApiProxy(Class<T> clazz, String host) {
        if (PROXIES_MAP.containsKey(clazz)) {
            return PROXIES_MAP.get(clazz);
        }

        HttpLoggingInterceptor logInterceptor = new HttpLoggingInterceptor((String s) -> {
        });
        logInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(logInterceptor)
                .build();
        Retrofit retrofitUser = new Retrofit.Builder()
                .baseUrl(host)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Object apiProxy = retrofitUser.create(clazz);
        PROXIES_MAP.put(clazz, apiProxy);
        return apiProxy;
    }
}

