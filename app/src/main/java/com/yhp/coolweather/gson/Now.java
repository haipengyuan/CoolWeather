package com.yhp.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by haipengyuan on 18-1-22.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }

}
