package com.yhp.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by haipengyuan on 18-1-22.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
