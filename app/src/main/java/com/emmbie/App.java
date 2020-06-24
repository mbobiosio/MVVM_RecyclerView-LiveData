package com.emmbie;

import android.app.Application;

import androidx.appcompat.app.AppCompatDelegate;

import com.emmbie.util.ReleaseTree;

import timber.log.Timber;

/**
 * MVVM RecyclerView - LiveData
 * Created by Mbuodile Obiosio on Jun 22, 2020
 * https://twitter.com/cazewonder
 * Nigeria.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        initLog();
    }

    protected void initLog() {
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        } else {
            Timber.plant(new ReleaseTree());
        }
    }

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }
}
