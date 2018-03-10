package com.vitassoundboard.app;

import android.annotation.TargetApi;
import android.app.Activity;

import android.content.Intent;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.view.Window;
import android.view.WindowManager;

import com.crashlytics.android.Crashlytics;
import com.vitassoundboard.app.soundboard.R;

import io.fabric.sdk.android.Fabric;


public class LoadingScreenActivity extends Activity {

    int delay;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void onCreate(Bundle savedInstanceState){
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(window.getContext(), R.color.colorPrimary));

        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.loading_screen);
        delay = 3000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(LoadingScreenActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, delay);

    }
}