package com.nombs.tagonsample;

import android.app.Application;

import com.nmobs.tagonandroid.main.TagOn;

/**
 * Created by ozgursakizli on 26.10.2017.
 */

public class SampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TagOn.with(this);
    }

}
