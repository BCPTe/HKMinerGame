package com.example.hkminergame.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

import java.math.BigDecimal;


public class DatabaseBeReader {
    SQLiteDatabase mDb;
    DatabaseHelper mDbHelper;
    Context mContext;
    static final String DB_NAME = "bereader_db";
    private static final int DB_VERSION = 1;


    public DatabaseBeReader(Context ctx) {
        mContext = ctx;
        try {
            mDbHelper = new DatabaseHelper(ctx, DB_NAME, null, DB_VERSION);
        }
        catch (SQLException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
        }
    }


    public void open()
    {
        try {
            mDb = mDbHelper.getWritableDatabase();
        }
        catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }


    public void close()
    {
        mDb.close();
    }


    public void insertAmount(BigDecimal alga,BigDecimal sand,BigDecimal stone,BigDecimal wood,BigDecimal coal,BigDecimal plastic,BigDecimal coral,BigDecimal gold,BigDecimal gas,BigDecimal ice) {
        ContentValues cv = new ContentValues();
        cv.put("alga", String.valueOf(alga));
        cv.put("sand", String.valueOf(sand));
        cv.put("stone", String.valueOf(stone));
        cv.put("wood", String.valueOf(wood));
        cv.put("coal", String.valueOf(coal));
        cv.put("plastic", String.valueOf(plastic));
        cv.put("coral", String.valueOf(coral));
        cv.put("gold", String.valueOf(gold));
        cv.put("gas", String.valueOf(gas));
        cv.put("ice", String.valueOf(ice));
      
        try {
            mDb.insertOrThrow("Amount", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }


    public void insertLocklevel(int alga,int sand,int stone,int wood,int coal,int plastic,int coral,int gold,int gas,int ice){
        ContentValues cv = new ContentValues();
        cv.put("alga", alga);
        cv.put("sand", sand);
        cv.put("stone", stone);
        cv.put("wood", wood);
        cv.put("coal", coal);
        cv.put("plastic", plastic);
        cv.put("coral", coral);
        cv.put("gold", gold);
        cv.put("gas", gas);
        cv.put("ice", ice);
      
        try {
            mDb.insertOrThrow("LockLevel", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }


       public void insertLockPlanet(int alga,int sand,int stone,int wood,int coal,int plastic,int coral,int gold,int gas,int ice){
           ContentValues cv = new ContentValues();
           cv.put("alga", alga);
           cv.put("sand", sand);
           cv.put("stone", stone);
           cv.put("wood", wood);
           cv.put("coal", coal);
           cv.put("plastic", plastic);
           cv.put("coral", coral);
           cv.put("gold", gold);
           cv.put("gas", gas);
           cv.put("ice", ice);

        try {
            mDb.insertOrThrow("LockPlanet", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }


    public void insertNickName(String nick){
        ContentValues cv = new ContentValues();
        cv.put("nick",nick);

        try {
            mDb.insertOrThrow("NickName", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }


    public void insertOfftime(String online, String offtime){
        ContentValues cv = new ContentValues();
        cv.put("online",online);
        cv.put("offtime",offtime);
      
        try {
            mDb.insertOrThrow("Offtime", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }

    public Cursor queryNick(){
        return mDb.query("NickName",null,null,null,null,null,null);
    }

    public Cursor queryAmount(){
        return mDb.query("Amount", null, null, null,null, null, null);
    }

    public Cursor queryALockLevel(){
        return mDb.query("LockLevel", null, null, null,null, null, null);
    }

    public Cursor queryLockPlanet(){
        return mDb.query("LockPlanet", null, null, null,null, null, null);
    }

    public Cursor queryOfftime(){
        return mDb.query("Offtime", null, null, null,null, null, null);
    }
}