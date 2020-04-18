package com.example.sony.sagartask;

import android.app.Application;

import timber.log.Timber;

/**
 *  Created by Sagar on 18/04/20.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) Timber.plant(new Timber.DebugTree());
    }
}
