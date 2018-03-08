package io.github.httponefrenchtoast.soundboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Vitas Soundboard PRO");

    }



    public void clickHandler(View v){

        int id = v.getId();
        MediaPlayer mp = MediaPlayer.create(this, R.raw.haue);

        switch (id){

            case R.id.button1:
                mp = MediaPlayer.create(this, R.raw.haue);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button2:
                mp = MediaPlayer.create(this, R.raw.ya_prishel);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button3:
                mp = MediaPlayer.create(this, R.raw.hauu);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button4:
                mp = MediaPlayer.create(this, R.raw.aaa);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button5:
                mp = MediaPlayer.create(this, R.raw.brlblr);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button6:
                mp = MediaPlayer.create(this, R.raw.aaa_full);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button7:
                mp = MediaPlayer.create(this, R.raw.chandra);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button8:
                mp = MediaPlayer.create(this, R.raw.hrustal);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button9:
                mp = MediaPlayer.create(this, R.raw.iz_mira);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button10:
                mp = MediaPlayer.create(this, R.raw.dla_lubvi);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button11:
                mp = MediaPlayer.create(this, R.raw.chandra_full);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;


        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onContextItemSelected(item);

        switch (item.getItemId()){

            case R.id.pleaseRead:
                Intent i = new Intent(this, PleaseRead.class);
                startActivity(i);
                return true;

            default:
                return false;

        }



    }
}
