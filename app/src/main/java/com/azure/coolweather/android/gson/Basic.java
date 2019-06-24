package com.azure.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    
    public class Update {
        @SerializedName("loc")
        public String updateTime;

        @SerializedName("utc")
        public String utc;
    }
}
