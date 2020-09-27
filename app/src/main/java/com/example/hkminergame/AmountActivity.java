package com.example.hkminergame;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AmountActivity extends AppCompatActivity{
    ImageButton exitButton;
    TextView text_alga, text_sand, text_stone, text_wood, text_coal, text_plastic, text_coral, text_gold, text_gas, text_ice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amount);

        exitButton = findViewById(R.id.exit_button);
        exitButton.setOnClickListener(exit_button_listener);

        text_alga = findViewById(R.id.text_alga);
        text_sand = findViewById(R.id.text_sand);
        text_stone = findViewById(R.id.text_stone);
        text_wood = findViewById(R.id.text_wood);
        text_coal = findViewById(R.id.text_coal);
        text_plastic = findViewById(R.id.text_plastic);
        text_coral = findViewById(R.id.text_coral);
        text_gold = findViewById(R.id.text_gold);
        text_gas = findViewById(R.id.text_gas);
        text_ice = findViewById(R.id.text_ice);
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

    private ImageButton.OnClickListener exit_button_listener =
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                }
            };
}
