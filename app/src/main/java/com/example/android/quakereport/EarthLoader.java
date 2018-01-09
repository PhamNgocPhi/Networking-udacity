package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by phiph on 1/9/2018.
 */

public class EarthLoader extends AsyncTaskLoader<List<Earthquake>> {

    private static final String LOG_TAG = EarthLoader.class.getSimpleName();

    private String mURL;

    public EarthLoader(Context context, String url) {
        super(context);
        mURL = url;
        Log.v(LOG_TAG,"Khoi tao EarthLoader");
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
        Log.v(LOG_TAG,"Ham onStartLoading");
    }

    @Override
    public List<Earthquake> loadInBackground() {

        if(mURL == null) {
            return null;
        }
        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(mURL);
        Log.v(LOG_TAG,"Ham loadInBackground");
        return earthquakes;
    }
}
