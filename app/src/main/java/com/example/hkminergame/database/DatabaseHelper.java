package com.example.hkminergame.database;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class DatabaseHelper extends SQLiteOpenHelper {


    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) throws SQLException {
        String create_table_amount = "create table Amount("
                + "alga numeric,"
                + "sand numeric,"
                + "stone numeric,"
                + "wood numeric,"
                + "coal numeric,"
                + "plastic numeric,"
                + "coral numeric,"
                + "gold numeric,"
                + "gas numeric,"
                + "ice numeric);";
        db.execSQL(create_table_amount);

        String create_table_locklevel = "create table LockLevel("
                + "alga int,"
                + "sand int,"
                + "stone int,"
                + "wood int,"
                + "coal int,"
                + "plastic int,"
                + "coral int,"
                + "gold int,"
                + "gas int,"
                + "ice int);";
        db.execSQL(create_table_locklevel);

        String create_table_lockplanet = "create table LockPlanet("
                + "alga int,"
                + "sand int,"
                + "stone int,"
                + "wood int,"
                + "coal int,"
                + "plastic int,"
                + "coral int,"
                + "gold int,"
                + "gas int,"
                + "ice int);";
        db.execSQL(create_table_lockplanet);

        String create_table_nickname = "create table NickName("
                + "nick varchar(15));";
        db.execSQL(create_table_nickname);

        String create_table_offtime = "create table Offtime("
                + "online text,"
                + "offline text);";
        db.execSQL(create_table_offtime);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
}
