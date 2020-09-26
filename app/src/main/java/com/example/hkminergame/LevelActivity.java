package com.example.hkminergame;
import com.example.hkminergame.island.*;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class LevelActivity extends AppCompatActivity {
    final int FPS = 40;
    NestedScrollView scroll;
    ImageView island1, island2, island3, island4, island5, island6, island7, island8, island9, island10;
    ArrayList<ImageView> arrayisland;
    ArrayList<int[]> position;
    int[] pos;
    int scrollStartPosition = 0, indexOfIsland;
    Timer timer;
    Display display;
    Point size;
    ConstraintLayout.LayoutParams params;

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
        island1.setOnClickListener(island1listener);
        island2.setOnClickListener(island2listener);
        island3.setOnClickListener(island3listener);
        island4.setOnClickListener(island4listener);
        island5.setOnClickListener(island5listener);
        island6.setOnClickListener(island6listener);
        island7.setOnClickListener(island7listener);
        island8.setOnClickListener(island8listener);
        island9.setOnClickListener(island9listener);
        island10.setOnClickListener(island10listener);

        position = new ArrayList<>();
        pos = new int[2];

        display = getWindowManager().getDefaultDisplay();
        size = new Point();
        display.getSize(size);

        calculateIslandsPosition();

        for(ImageView island : arrayisland){
            indexOfIsland = arrayisland.indexOf(island);
            setActualPositionOfIsland(island, indexOfIsland);
            for (int j = 1; j < 100; j++) {
                if (position.get(indexOfIsland)[1] > (size.y / 100) * j && position.get(indexOfIsland)[1] < (size.y / 100) * (j + 1)) {
                    params = (ConstraintLayout.LayoutParams) island.getLayoutParams();
                    params.width = ((size.y / 100) * j) / 6;
                    params.height = ((size.y / 100) * j) / 6;
                    island.setLayoutParams(params);
                    break;
                }
            }
        }

        for(ImageView island : arrayisland){
            if(arrayisland.indexOf(island)<3)
                continue;
            params = (ConstraintLayout.LayoutParams) island.getLayoutParams();
            params.width = ((size.y/100)*99)/6;
            params.height = ((size.y/100)*99)/6;
            island.setLayoutParams(params);
        }

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        for (ImageView island : arrayisland) {
                            indexOfIsland = arrayisland.indexOf(island);
                            setActualPositionOfIsland(island, indexOfIsland);
                            for (int j = 1; j < 100; j++) {
                                if (position.get(indexOfIsland)[1] > (size.y / 100) * j && position.get(indexOfIsland)[1] < (size.y / 100) * (j + 1)) {
                                    ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) island.getLayoutParams();
                                    params.width = ((size.y/100)*j)/6;
                                    params.height = ((size.y/100)*j)/6;
                                    island.setLayoutParams(params);
                                    break;
                                }
                            }
                            scrollStartPosition = scroll.getScrollY();
                        }
                    }
                });
            }
        },0,1000/FPS);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        View decorView = getWindow().getDecorView();
        if (hasFocus) {
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        }
    }

    /**
     * Calculate actual position of img and put in *position* ArrayList
     * @param img ImageView to calculate the position of
     * @param i index of the island in the *position* ArrayList
     */
    public void setActualPositionOfIsland(ImageView img, int i) {
        img.getLocationOnScreen(pos);
        position.set(i,pos);
    }

    /**
     * Calculate current position of the islands in *arrayislands* and add them to the *position* ArrayList
     */
    public void calculateIslandsPosition() {
        for(int i = arrayisland.size()-1; i >= 0; i--) {
            arrayisland.get(i).getLocationOnScreen(pos);
            position.add(pos);
        }
    }

    private ImageView.OnClickListener island1listener =
            new ImageView.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(LevelActivity.this, AlgaIsland.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
                }
            };

    private ImageView.OnClickListener island2listener =
            new ImageView.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(LevelActivity.this, SandIsland.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
                }
            };

    private ImageView.OnClickListener island3listener =
            new ImageView.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(LevelActivity.this, StoneIsland.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
                }
            };

    private ImageView.OnClickListener island4listener =
            new ImageView.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(LevelActivity.this, WoodIsland.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
                }
            };

    private ImageView.OnClickListener island5listener =
            new ImageView.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(LevelActivity.this, CoalIsland.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
                }
            };

    private ImageView.OnClickListener island6listener =
            new ImageView.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(LevelActivity.this, PlasticIsland.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
                }
            };

    private ImageView.OnClickListener island7listener =
            new ImageView.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(LevelActivity.this, CoralIsland.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
                }
            };

    private ImageView.OnClickListener island8listener =
            new ImageView.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(LevelActivity.this, GoldIsland.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
                }
            };

    private ImageView.OnClickListener island9listener =
            new ImageView.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(LevelActivity.this, GasIsland.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
                }
            };

    private ImageView.OnClickListener island10listener =
            new ImageView.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(LevelActivity.this, IceIsland.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
                }
            };
}
