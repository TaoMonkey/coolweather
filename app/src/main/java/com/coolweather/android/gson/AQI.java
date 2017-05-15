package com.coolweather.android.gson;

/**
 * Created by taoguo on 2017/5/13.
 */

public class AQI {

    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
