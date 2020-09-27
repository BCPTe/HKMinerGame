package com.example.hkminergame;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hkminergame.database.DatabaseBeReader;

public class Scapocchione extends AppCompatActivity {
    ImageButton playButton, settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = findViewById(R.id.start_button);
        playButton.setOnClickListener(play_button_listener);
        settingsButton = findViewById(R.id.settings_button);
        settingsButton.setOnClickListener(settings_button_listener);

        DatabaseBeReader db = new DatabaseBeReader(this);
        db.open();
        Cursor cur = db.queryNick();
        if (cur.moveToFirst()) {

        }
        db.close();
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

    private ImageButton.OnClickListener play_button_listener =
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Scapocchione.this, LevelActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
                }
            };

    private ImageButton.OnClickListener settings_button_listener =
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Scapocchione.this, SettingsActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                }
            };
}
