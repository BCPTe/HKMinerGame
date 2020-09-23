package com.example.hkminergame;

import android.graphics.Point;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class LevelActivity extends AppCompatActivity {
    ScrollView scroll;
    ImageView island1, island2, island3, island4, island5, island6, island7, island8, island9, island10;
    ArrayList<ImageView> arrayisland;
    int y;
    Timer timer;
    final int FPS = 40;
    Display display;
    Point size;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        scroll = findViewById(R.id.scroll);
        arrayisland = new ArrayList<>();
        arrayisland.add(island1 = findViewById(R.id.island1));
        arrayisland.add(island2 = findViewById(R.id.island2));
        arrayisland.add(island3 = findViewById(R.id.island3));
        arrayisland.add(island4 = findViewById(R.id.island4));
        arrayisland.add(island5 = findViewById(R.id.island5));
        arrayisland.add(island6 = findViewById(R.id.island6));
        arrayisland.add(island7 = findViewById(R.id.island7));
        arrayisland.add(island8 = findViewById(R.id.island8));
        arrayisland.add(island9 = findViewById(R.id.island9));
        arrayisland.add(island10 = findViewById(R.id.island10));

        y = scroll.getScrollY();

        display = getWindowManager().getDefaultDisplay();
        size = new Point();
        display.getSize(size);

        System.out.println("posizione scroll:"+y);
        float x = island1.getY();
        System.out.println("posizione isola:"+x);
        float start = island1.getPivotY();
        System.out.println("differenza:"+start);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(y);
                        if (y < scroll.getScrollY()) {
                            for (ImageView island : arrayisland) {
                                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) island.getLayoutParams();
                                params.width = (int) (island.getWidth() - ((float)1/(1-(float)y/10)));
                                params.height = (int) (island.getHeight() - ((float)1/(1-(float)y/10)));
                                island.setLayoutParams(params);
                                y = scroll.getScrollY();
                            }
                        } else if (y > scroll.getScrollY()) {
                            for (ImageView island : arrayisland) {
                                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) island.getLayoutParams();
                                params.width = (int) (island.getWidth() + ((float)1/(1-(float)y/10)));
                                params.height = (int) (island.getHeight() + ((float)1/(1-(float)y/10)));
                                island.setLayoutParams(params);
                                y = scroll.getScrollY();
                            }
                        }
                    }
                });
            }
        },0,1000/FPS);


        // visibility settings
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        // end visibility settings
    }
}
