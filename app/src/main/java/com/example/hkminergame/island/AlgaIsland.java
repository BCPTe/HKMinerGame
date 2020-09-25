package com.example.hkminergame.island;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.hkminergame.R;

public class AlgaIsland extends AppCompatActivity implements AbstractIsland{
    ImageView elevator, test, test1;
    float y = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.island_alga);

        elevator = findViewById(R.id.elevator);
        test = findViewById(R.id.level1);
        test.setOnClickListener(clicklistener);
        test1 = findViewById(R.id.level2);
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

    @Override
    public void move_y() {
        y += 10;
        elevator.setTranslationY(y);
     }

    ImageView.OnClickListener clicklistener =
            new ImageView.OnClickListener(){
                @Override
                public void onClick(View view) {
                    move_y();
                }
            };
}
