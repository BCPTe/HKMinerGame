package com.example.hkminergame;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hkminergame.database.DatabaseBeReader;

public class FirstActivity extends AppCompatActivity {
    Button button;
    EditText text;
    Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        button = findViewById(R.id.button_nick);
        button.setOnClickListener(button_listener);
        text = findViewById(R.id.text_nick);
        context = this;
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
