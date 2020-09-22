package com.example.hkminergame;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


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
                    progressStatus += 23;
                    handler.post(new Runnable() {
                        public void run() {
                            pb.setProgress(progressStatus);
                            text.setText((progressStatus + " %").toString());
                        }
                    });
                    try{
                        Thread.sleep( 1000 );
                    } catch(Exception e){
                        System.out.println("Error in progress bar");
                    }
                    progressStatus += 27;
                    handler.post(new Runnable() {
                        public void run() {
                            pb.setProgress(progressStatus);
                            text.setText((progressStatus + " %").toString());
                        }
                    });
                    try{
                        Thread.sleep( 500 );
                    } catch(Exception e){
                        System.out.println("Error in progress bar");
                    }
                    progressStatus += 31;
                    handler.post(new Runnable() {
                        public void run() {
                            pb.setProgress(progressStatus);
                            text.setText((progressStatus + " %").toString());
                        }
                    });
                    try{
                        Thread.sleep( 700 );
                    } catch(Exception e){
                        System.out.println("Error in progress bar");
                    }
                    for(int i = 0 ; i < 19 ; i++) {
                        progressStatus++;
                        handler.post(new Runnable() {
                            public void run() {
                                pb.setProgress(progressStatus);
                                text.setText((progressStatus + " %").toString());
                            }
                        });
                        try{
                            Thread.sleep( 50 );
                        } catch(Exception e){
                            System.out.println("Error in progress bar");
                        }
                    }
                }
                startActivity(new Intent(LoadingActivity.this, MainActivity.class));
                finish();
            }
        }).start();
    }
}
