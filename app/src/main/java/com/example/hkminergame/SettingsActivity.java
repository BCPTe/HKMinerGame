package com.example.hkminergame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {
    ImageButton exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // visibility settings
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        // end visibility settings

        exitButton = findViewById(R.id.exit_button);
        exitButton.setOnClickListener(exit_button_listener);
    }

    private ImageButton.OnClickListener exit_button_listener =
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            };
}
