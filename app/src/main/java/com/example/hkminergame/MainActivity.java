package com.example.hkminergame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;

import com.example.hkminergame.database.DatabaseBeReader;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {
    final static BigDecimal zero = BigDecimal.valueOf(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseBeReader db = new DatabaseBeReader(this);
        db.open();
        Cursor cur = db.queryNick();
        if (cur.moveToFirst()) {
            Intent levelactivity = new Intent(MainActivity.this, LevelActivity.class);
            startActivity(levelactivity);
            db.close();
            finish();
        }else{
            Intent firstactivity = new Intent(MainActivity.this, FirstActivity.class);
            db.insertAmount(zero,zero,zero,zero,zero,zero,zero,zero,zero,zero);
            db.insertAmountAlga(zero,zero,zero,zero,zero,zero,zero,zero,zero,zero);
            db.insertAmountSand(zero,zero,zero,zero,zero,zero,zero,zero,zero,zero);
            db.insertAmountStone(zero,zero,zero,zero,zero,zero,zero,zero,zero,zero);
            db.insertAmountWood(zero,zero,zero,zero,zero,zero,zero,zero,zero,zero);
            db.insertAmountCoal(zero,zero,zero,zero,zero,zero,zero,zero,zero,zero);
            db.insertAmountPlastic(zero,zero,zero,zero,zero,zero,zero,zero,zero,zero);
            db.insertAmountCoral(zero,zero,zero,zero,zero,zero,zero,zero,zero,zero);
            db.insertAmountGold(zero,zero,zero,zero,zero,zero,zero,zero,zero,zero);
            db.insertAmountGas(zero,zero,zero,zero,zero,zero,zero,zero,zero,zero);
            db.insertAmountIce(zero,zero,zero,zero,zero,zero,zero,zero,zero,zero);
            db.insertLockIsland(0,0,0,0,0,0,0,0,0,0);
            startActivity(firstactivity);
            db.close();
            finish();
        }
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