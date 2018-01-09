package com.example.android.quakereport;

/**
 * Created by phiph on 1/3/2018.
 */

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mMilliseconds;
    private String mUrl;

    public Earthquake(double mMagnitude, String mLocation, long mMilliseconds, String mUrl) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mMilliseconds = mMilliseconds;
        this.mUrl = mUrl;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public void setmMagnitude(double mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public long getmMilliseconds() {
        return mMilliseconds;
    }

    public void setmMilliseconds(long mMilliseconds) {
        this.mMilliseconds = mMilliseconds;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }
}
