package com.yhp.coolweather.gson;

/**
 * Created by haipengyuan on 18-1-22.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }

}
