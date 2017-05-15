package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by taoguo on 2017/5/13.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash {
        @SerializedName("txt")
        public String info;
    }
    public class Sport {
        public String info;
    }
}
