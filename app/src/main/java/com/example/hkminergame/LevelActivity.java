package com.example.hkminergame;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;

import java.util.ArrayList;

public class LevelActivity extends AppCompatActivity {
    NestedScrollView scroll;
    ImageView island1, island2, island3, island4, island5, island6, island7, island8, island9, island10;
    ArrayList<ImageView> arrayisland;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        scroll = findViewById(R.id.scroll);
        scroll.setOnScrollChangeListener(scroll_listener);
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

        // visibility settings
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        // end visibility settings
    }

    private NestedScrollView.OnScrollChangeListener scroll_listener = new NestedScrollView.OnScrollChangeListener() {
        @Override
        public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
            if(scrollY - oldScrollY > 0) {
                for(ImageView island : arrayisland) {
                    ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) island.getLayoutParams();
                    params.width = island.getWidth() - 1;
                    params.height = island.getHeight() - 1;
                    island.setLayoutParams(params);
                }
            }
            else {
                for(ImageView island : arrayisland) {
                    ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) island.getLayoutParams();
                    params.width = island.getWidth() + 1;
                    params.height = island.getHeight() + 1;
                    island.setLayoutParams(params);
                }
            }
        }
    };
}
