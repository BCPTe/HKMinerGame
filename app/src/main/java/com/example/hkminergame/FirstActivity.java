package com.example.hkminergame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hkminergame.database.DatabaseBeReader;

import java.util.Timer;
import java.util.TimerTask;

public class FirstActivity extends AppCompatActivity {
    Button button;
    EditText text;
    Context context;
    Bitmap bitmap;
    Timer timer;
    Sprite_Test_No sprite;
    Canvas canvas;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        button = findViewById(R.id.button_nick);
        button.setOnClickListener(button_listener);
        text = findViewById(R.id.text_nick);
        context = this;

        ImageView image = findViewById(R.id.image_test);
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.test_sprite_no);
        image.setImageBitmap(bitmap);
        Bitmap scaled = Bitmap.createScaledBitmap(bitmap, 150, 100, true);
        sprite= new Sprite_Test_No(scaled, 0, 0, 150, 100, 100, 10);
        canvas = new Canvas();
        sprite.draw(canvas);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        sprite.update(System.currentTimeMillis());
                    }
                });
            }
        },0,100);
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

    private Button.OnClickListener button_listener =
            new Button.OnClickListener(){
                @Override
                public void onClick(View view) {
                    DatabaseBeReader db = new DatabaseBeReader(context);
                    db.open();
                    db.insertNickName(text.getText().toString());
                    db.close();
                }
            };
}
