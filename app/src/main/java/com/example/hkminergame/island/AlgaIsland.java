package com.example.hkminergame.island;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.hkminergame.Elevator;
import com.example.hkminergame.R;

import java.util.ArrayList;

public class AlgaIsland extends AppCompatActivity{
    Elevator elevator;
    ImageView elevator_img, test, test1;
    ConstraintLayout layout, layout1, layout2, layout3, layout4, layout5, layout6, layout7, layout8, layout9;
    ArrayList<Integer> array_layout;
    int x = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.island_alga);

        elevator_img = findViewById(R.id.elevator);
        test = findViewById(R.id.level1);
        test.setOnClickListener(clicklistener);
        test1 = findViewById(R.id.level2);

        array_layout = new ArrayList<>();
        layout = findViewById(R.id.constraint_principal);
        array_layout.add(R.id.constraint);
        array_layout.add(R.id.constraint1);
        array_layout.add(R.id.constraint2);
        array_layout.add(R.id.constraint3);
        array_layout.add(R.id.constraint4);
        array_layout.add(R.id.constraint5);
        array_layout.add(R.id.constraint6);
        array_layout.add(R.id.constraint7);
        array_layout.add(R.id.constraint8);
        elevator = new Elevator(elevator_img, layout);
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

    ImageView.OnClickListener clicklistener =
            new ImageView.OnClickListener(){
                @Override
                public void onClick(View view) {
                    elevator.move_y(R.id.elevator, array_layout.get(x));
                    x++;
                }
            };
}
