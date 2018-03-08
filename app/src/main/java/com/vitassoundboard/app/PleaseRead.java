package com.vitassoundboard.app;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

import com.vitassoundboard.app.soundboard.R;


public class PleaseRead extends Activity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.please_read);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * 0.8), (int) (height * 0.8));
    }
}
