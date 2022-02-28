package com.example.earthquackreport;

import java.text.SimpleDateFormat;
import java.util.Date;

public class QuackReport {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMillisecond;
    private String mUrl;

    //Constructor
    public QuackReport(double quackMagnitude, String quackLocation, Long quackTime, String url){
        mMagnitude = quackMagnitude;
        mLocation = quackLocation;
        mTimeInMillisecond = quackTime;
        mUrl = url;

//        Date dateObject = new Date(quackTime);
//        SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM DD, yyyy");
//        String dateToDisplay = dateFormatter.format(dateObject);
//        mTime = dateToDisplay;
    }

    //getter methods
    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmTimeInMillisecond() {
        return mTimeInMillisecond;
    }

    public String getUrl() {    return mUrl;    }
}
