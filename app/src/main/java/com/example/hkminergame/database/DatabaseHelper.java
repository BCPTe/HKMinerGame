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

        String create_table_amountAlga = "create table AmountAlga("
                + "level1 numeric,"
                + "level2 numeric,"
                + "level3 numeric,"
                + "level4 numeric,"
                + "level5 numeric,"
                + "level6 numeric,"
                + "level7 numeric,"
                + "level8 numeric,"
                + "level9 numeric,"
                + "level10 numeric);";
        db.execSQL(create_table_amountAlga);

        String create_table_amountSand = "create table AmountSand("
                + "level1 numeric,"
                + "level2 numeric,"
                + "level3 numeric,"
                + "level4 numeric,"
                + "level5 numeric,"
                + "level6 numeric,"
                + "level7 numeric,"
                + "level8 numeric,"
                + "level9 numeric,"
                + "level10 numeric);";
        db.execSQL(create_table_amountSand);

        String create_table_amountStone = "create table AmountStone("
                + "level1 numeric,"
                + "level2 numeric,"
                + "level3 numeric,"
                + "level4 numeric,"
                + "level5 numeric,"
                + "level6 numeric,"
                + "level7 numeric,"
                + "level8 numeric,"
                + "level9 numeric,"
                + "level10 numeric);";
        db.execSQL(create_table_amountStone);

        String create_table_amountWood = "create table AmountWood("
                + "level1 numeric,"
                + "level2 numeric,"
                + "level3 numeric,"
                + "level4 numeric,"
                + "level5 numeric,"
                + "level6 numeric,"
                + "level7 numeric,"
                + "level8 numeric,"
                + "level9 numeric,"
                + "level10 numeric);";
        db.execSQL(create_table_amountWood);

        String create_table_amountCoral = "create table AmountCoral("
                + "level1 numeric,"
                + "level2 numeric,"
                + "level3 numeric,"
                + "level4 numeric,"
                + "level5 numeric,"
                + "level6 numeric,"
                + "level7 numeric,"
                + "level8 numeric,"
                + "level9 numeric,"
                + "level10 numeric);";
        db.execSQL(create_table_amountCoral);

        String create_table_amountPlastic = "create table AmountPlastic("
                + "level1 numeric,"
                + "level2 numeric,"
                + "level3 numeric,"
                + "level4 numeric,"
                + "level5 numeric,"
                + "level6 numeric,"
                + "level7 numeric,"
                + "level8 numeric,"
                + "level9 numeric,"
                + "level10 numeric);";
        db.execSQL(create_table_amountPlastic);

        String create_table_amountCoal = "create table AmountCoal("
                + "level1 numeric,"
                + "level2 numeric,"
                + "level3 numeric,"
                + "level4 numeric,"
                + "level5 numeric,"
                + "level6 numeric,"
                + "level7 numeric,"
                + "level8 numeric,"
                + "level9 numeric,"
                + "level10 numeric);";
        db.execSQL(create_table_amountCoal);

        String create_table_amountGold = "create table AmountGold("
                + "level1 numeric,"
                + "level2 numeric,"
                + "level3 numeric,"
                + "level4 numeric,"
                + "level5 numeric,"
                + "level6 numeric,"
                + "level7 numeric,"
                + "level8 numeric,"
                + "level9 numeric,"
                + "level10 numeric);";
        db.execSQL(create_table_amountGold);

        String create_table_amountGas = "create table AmountGas("
                + "level1 numeric,"
                + "level2 numeric,"
                + "level3 numeric,"
                + "level4 numeric,"
                + "level5 numeric,"
                + "level6 numeric,"
                + "level7 numeric,"
                + "level8 numeric,"
                + "level9 numeric,"
                + "level10 numeric);";
        db.execSQL(create_table_amountGas);

        String create_table_amountIce = "create table AmountIce("
                + "level1 numeric,"
                + "level2 numeric,"
                + "level3 numeric,"
                + "level4 numeric,"
                + "level5 numeric,"
                + "level6 numeric,"
                + "level7 numeric,"
                + "level8 numeric,"
                + "level9 numeric,"
                + "level10 numeric);";
        db.execSQL(create_table_amountIce);

        String create_table_lockisland = "create table LockIsland("
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
        db.execSQL(create_table_lockisland);

        String create_table_lockAlga = "create table LockAlga("
                + "level1 int,"
                + "level2 int,"
                + "level3 int,"
                + "level4 int,"
                + "level5 int,"
                + "level6 int,"
                + "level7 int,"
                + "level8 int,"
                + "level9 int,"
                + "level10 int);";
        db.execSQL(create_table_lockAlga);

        String create_table_lockSand = "create table LockSand("
                + "level1 int,"
                + "level2 int,"
                + "level3 int,"
                + "level4 int,"
                + "level5 int,"
                + "level6 int,"
                + "level7 int,"
                + "level8 int,"
                + "level9 int,"
                + "level10 int);";
        db.execSQL(create_table_lockSand);

        String create_table_lockStone = "create table LockStone("
                + "level1 int,"
                + "level2 int,"
                + "level3 int,"
                + "level4 int,"
                + "level5 int,"
                + "level6 int,"
                + "level7 int,"
                + "level8 int,"
                + "level9 int,"
                + "level10 int);";
        db.execSQL(create_table_lockStone);

        String create_table_lockWood = "create table LockWood("
                + "level1 int,"
                + "level2 int,"
                + "level3 int,"
                + "level4 int,"
                + "level5 int,"
                + "level6 int,"
                + "level7 int,"
                + "level8 int,"
                + "level9 int,"
                + "level10 int);";
        db.execSQL(create_table_lockWood);

        String create_table_lockCoral = "create table LockCoral("
                + "level1 int,"
                + "level2 int,"
                + "level3 int,"
                + "level4 int,"
                + "level5 int,"
                + "level6 int,"
                + "level7 int,"
                + "level8 int,"
                + "level9 int,"
                + "level10 int);";
        db.execSQL(create_table_lockCoral);

        String create_table_lockPlastic = "create table LockPlastic("
                + "level1 int,"
                + "level2 int,"
                + "level3 int,"
                + "level4 int,"
                + "level5 int,"
                + "level6 int,"
                + "level7 int,"
                + "level8 int,"
                + "level9 int,"
                + "level10 int);";
        db.execSQL(create_table_lockPlastic);

        String create_table_lockCoal = "create table LockCoal("
                + "level1 int,"
                + "level2 int,"
                + "level3 int,"
                + "level4 int,"
                + "level5 int,"
                + "level6 int,"
                + "level7 int,"
                + "level8 int,"
                + "level9 int,"
                + "level10 int);";
        db.execSQL(create_table_lockCoal);

        String create_table_lockGold = "create table LockGold("
                + "level1 int,"
                + "level2 int,"
                + "level3 int,"
                + "level4 int,"
                + "level5 int,"
                + "level6 int,"
                + "level7 int,"
                + "level8 int,"
                + "level9 int,"
                + "level10 int);";
        db.execSQL(create_table_lockGold);

        String create_table_lockGas = "create table LockGas("
                + "level1 int,"
                + "level2 int,"
                + "level3 int,"
                + "level4 int,"
                + "level5 int,"
                + "level6 int,"
                + "level7 int,"
                + "level8 int,"
                + "level9 int,"
                + "level10 int);";
        db.execSQL(create_table_lockGas);

        String create_table_lockIce = "create table LockIce("
                + "level1 int,"
                + "level2 int,"
                + "level3 int,"
                + "level4 int,"
                + "level5 int,"
                + "level6 int,"
                + "level7 int,"
                + "level8 int,"
                + "level9 int,"
                + "level10 int);";
        db.execSQL(create_table_lockIce);

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
