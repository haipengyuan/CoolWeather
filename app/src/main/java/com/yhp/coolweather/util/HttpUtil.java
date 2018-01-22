package com.yhp.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by haipengyuan on 18-1-22.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback calllback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(calllback);
    }

}
