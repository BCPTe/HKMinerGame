package com.example.hkminergame;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;;
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
    int[] pos;
    ArrayList<int[]> position;
    RelativeLayout.LayoutParams params;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        // visibility settings
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        // end visibility settings

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

        position = new ArrayList<>();
        pos = new int[2];

        display = getWindowManager().getDefaultDisplay();
        size = new Point();
        display.getSize(size);

        onWindowFocusChanged();

        for(ImageView island : arrayisland){
            searchposition(island, arrayisland.indexOf(island));
            if(arrayisland.indexOf(island) > 0 && arrayisland.indexOf(island) < 10) {
                for (int j = 1; j < 100; j++) {
                    if (position.get(arrayisland.indexOf(island))[1] > (size.y / 100) * j && position.get(arrayisland.indexOf(island))[1] < (size.y / 100) * (j + 1)) {
                        params = (RelativeLayout.LayoutParams) island.getLayoutParams();
                        params.width = ((size.y / 100) * j) / 7;
                        params.height = ((size.y / 100) * j) / 7;
                        island.setLayoutParams(params);
                        break;
                    }
                }
            }
        }
        for(ImageView island : arrayisland){
            if(arrayisland.indexOf(island)<5)
                continue;
            params = (RelativeLayout.LayoutParams) island.getLayoutParams();
            params.width = ((size.y/100)*99)/7;
            params.height = ((size.y/100)*99)/7;
            island.setLayoutParams(params);
        }

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (y < scroll.getScrollY()) {
                            for (ImageView island : arrayisland) {
                                searchposition(island, arrayisland.indexOf(island));
                                if(position.get(arrayisland.indexOf(island))[1] > 0 && position.get(arrayisland.indexOf(island))[1] < size.y) {
                                    for(int j = 1; j < 100; j++) {
                                        if(position.get(arrayisland.indexOf(island))[1] > (size.y/100)*j && position.get(arrayisland.indexOf(island))[1] < (size.y/100)*(j+1)) {
                                            params = (RelativeLayout.LayoutParams) island.getLayoutParams();
                                            params.width = ((size.y/100)*j)/7;
                                            params.height = ((size.y/100)*j)/7;
                                            island.setLayoutParams(params);
                                            break;
                                        }
                                    }
                                }
                                y = scroll.getScrollY();
                            }
                        } else if (y > scroll.getScrollY()) {
                            for (ImageView island : arrayisland) {
                                searchposition(island, arrayisland.indexOf(island));
                                if(position.get(arrayisland.indexOf(island))[1] > 0 && position.get(arrayisland.indexOf(island))[1] < size.y) {
                                    for(int j = 1; j < 100; j++) {
                                        if (position.get(arrayisland.indexOf(island))[1] > (size.y/100)*j && position.get(arrayisland.indexOf(island))[1] < (size.y/100)*(j+1)) {
                                            params = (RelativeLayout.LayoutParams) island.getLayoutParams();
                                            params.width = ((size.y/100)*j)/7;
                                            params.height = ((size.y/100)*j)/7;
                                            island.setLayoutParams(params);
                                            break;
                                        }
                                    }
                                }
                                y = scroll.getScrollY();
                            }
                        }
                    }
                });
            }
        },0,1000/FPS);
    }

    public void searchposition (ImageView img, int i) {
            img.getLocationOnScreen(pos);
            position.set(i,pos);
    }

    public void onWindowFocusChanged () {
        for(int i = arrayisland.size()-1; i >= 0; i--) {
            arrayisland.get(i).getLocationOnScreen(pos);
            position.add(pos);
        }
    }
}
