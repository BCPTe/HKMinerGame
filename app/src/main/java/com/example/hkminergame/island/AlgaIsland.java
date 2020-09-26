package com.example.hkminergame.island;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.example.hkminergame.Elevator;
import com.example.hkminergame.R;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class AlgaIsland extends AppCompatActivity{
    final int FPS = 1500;
    Elevator elevator;
    ImageView elevator_img;
    ConstraintLayout layout;
    ArrayList<Integer> array_layout;
    int x = 0;
    Timer timer;
    boolean up = false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.island_alga);

        elevator_img = findViewById(R.id.elevator);

        array_layout = new ArrayList<>();
        layout = findViewById(R.id.constraint_principal);
        array_layout.add(R.id.storage);
        array_layout.add(R.id.constraint0);
        array_layout.add(R.id.constraint1);
        array_layout.add(R.id.constraint2);
        array_layout.add(R.id.constraint3);
        array_layout.add(R.id.constraint4);
        array_layout.add(R.id.constraint5);
        array_layout.add(R.id.constraint6);
        array_layout.add(R.id.constraint7);
        array_layout.add(R.id.constraint8);
        array_layout.add(R.id.constraint9);
        elevator = new Elevator(elevator_img, layout);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (x == 0) {
                            if(!up) {
                                elevator.destruct(R.id.elevator);
                                elevator.move_y(R.id.elevator, R.id.constraint0);
                            }
                            else{
                                elevator.depose(R.id.elevator);
                                up = !up;
                            }
                        }
                        if (!up) {
                            elevator.move_y(R.id.elevator, array_layout.get(x));
                            x++;
                        } else {
                            elevator.move_y(R.id.elevator, array_layout.get(x));
                            x--;
                        }
                        if (x == array_layout.size() - 1) {
                            up = !up;
                        }
                    }
                });
            }
        },0,FPS);
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
}