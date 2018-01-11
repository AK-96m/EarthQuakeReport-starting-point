package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by admus on 2018-01-05.
 */

public class EarthQuakeAL {
    private double magnitude;
    private String location;
    private long mTimeInMilliSeconds;
    private String mUrl;

  public   EarthQuakeAL (double mag,String loc,long t, String url){
        magnitude = mag;
        location = loc;
        mTimeInMilliSeconds = t;
        mUrl = url;
    }
public double getMagnitude(){
        return magnitude;
}
public String getLocation(){
    return location;
}
public long getmTimeInMilliSeconds(){
    return mTimeInMilliSeconds;
}
public String getUrl(){
    return mUrl;
}


}
