package com.example.hkminergame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.stream.IntStream;

public class LoadingActivity extends AppCompatActivity {
    ProgressBar pb;
    TextView text;
    int progressStatus;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        // visibility settings
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        // end visibility settings

        pb = findViewById(R.id.pb);
        text = findViewById(R.id.pb_text);
        progressStatus = pb.getProgress();

        new Thread(new Runnable() {
            public void run() {
                while ( progressStatus < 100 ){
                    progressStatus += 2;
                    try{
                        Thread.sleep( 50 );
                    } catch(Exception e){
                        System.out.println("Error in progress bar");
                    }
                    handler.post(new Runnable() {
                        public void run() {
                            pb.setProgress(progressStatus);
                            text.setText((progressStatus + " %").toString());
                        }
                    });
                }
                startActivity(new Intent(LoadingActivity.this, LevelActivity.class));
                finish();
            }
        }).start();
    }
}
