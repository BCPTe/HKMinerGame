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

    public void insertAmountAlga(BigDecimal level1,BigDecimal level2,BigDecimal level3,BigDecimal level4,BigDecimal level5,BigDecimal level6,BigDecimal level7,BigDecimal level8,BigDecimal level9,BigDecimal level10) {
        ContentValues cv = new ContentValues();
        cv.put("level1", String.valueOf(level1));
        cv.put("level2", String.valueOf(level2));
        cv.put("level3", String.valueOf(level3));
        cv.put("level4", String.valueOf(level4));
        cv.put("level5", String.valueOf(level5));
        cv.put("level6", String.valueOf(level6));
        cv.put("level7", String.valueOf(level7));
        cv.put("level8", String.valueOf(level8));
        cv.put("level9", String.valueOf(level9));
        cv.put("level10", String.valueOf(level10));

        try {
            mDb.insertOrThrow("AmountAlga", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }

    public void insertAmountSand(BigDecimal level1,BigDecimal level2,BigDecimal level3,BigDecimal level4,BigDecimal level5,BigDecimal level6,BigDecimal level7,BigDecimal level8,BigDecimal level9,BigDecimal level10) {
        ContentValues cv = new ContentValues();
        cv.put("level1", String.valueOf(level1));
        cv.put("level2", String.valueOf(level2));
        cv.put("level3", String.valueOf(level3));
        cv.put("level4", String.valueOf(level4));
        cv.put("level5", String.valueOf(level5));
        cv.put("level6", String.valueOf(level6));
        cv.put("level7", String.valueOf(level7));
        cv.put("level8", String.valueOf(level8));
        cv.put("level9", String.valueOf(level9));
        cv.put("level10", String.valueOf(level10));

        try {
            mDb.insertOrThrow("AmountSand", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }

    public void insertAmountStone(BigDecimal level1,BigDecimal level2,BigDecimal level3,BigDecimal level4,BigDecimal level5,BigDecimal level6,BigDecimal level7,BigDecimal level8,BigDecimal level9,BigDecimal level10) {
        ContentValues cv = new ContentValues();
        cv.put("level1", String.valueOf(level1));
        cv.put("level2", String.valueOf(level2));
        cv.put("level3", String.valueOf(level3));
        cv.put("level4", String.valueOf(level4));
        cv.put("level5", String.valueOf(level5));
        cv.put("level6", String.valueOf(level6));
        cv.put("level7", String.valueOf(level7));
        cv.put("level8", String.valueOf(level8));
        cv.put("level9", String.valueOf(level9));
        cv.put("level10", String.valueOf(level10));

        try {
            mDb.insertOrThrow("AmountStone", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }

    public void insertAmountWood(BigDecimal level1,BigDecimal level2,BigDecimal level3,BigDecimal level4,BigDecimal level5,BigDecimal level6,BigDecimal level7,BigDecimal level8,BigDecimal level9,BigDecimal level10) {
        ContentValues cv = new ContentValues();
        cv.put("level1", String.valueOf(level1));
        cv.put("level2", String.valueOf(level2));
        cv.put("level3", String.valueOf(level3));
        cv.put("level4", String.valueOf(level4));
        cv.put("level5", String.valueOf(level5));
        cv.put("level6", String.valueOf(level6));
        cv.put("level7", String.valueOf(level7));
        cv.put("level8", String.valueOf(level8));
        cv.put("level9", String.valueOf(level9));
        cv.put("level10", String.valueOf(level10));

        try {
            mDb.insertOrThrow("AmountWood", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }

    public void insertAmountCoal(BigDecimal level1,BigDecimal level2,BigDecimal level3,BigDecimal level4,BigDecimal level5,BigDecimal level6,BigDecimal level7,BigDecimal level8,BigDecimal level9,BigDecimal level10) {
        ContentValues cv = new ContentValues();
        cv.put("level1", String.valueOf(level1));
        cv.put("level2", String.valueOf(level2));
        cv.put("level3", String.valueOf(level3));
        cv.put("level4", String.valueOf(level4));
        cv.put("level5", String.valueOf(level5));
        cv.put("level6", String.valueOf(level6));
        cv.put("level7", String.valueOf(level7));
        cv.put("level8", String.valueOf(level8));
        cv.put("level9", String.valueOf(level9));
        cv.put("level10", String.valueOf(level10));

        try {
            mDb.insertOrThrow("AmountCoal", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }

    public void insertAmountPlastic(BigDecimal level1,BigDecimal level2,BigDecimal level3,BigDecimal level4,BigDecimal level5,BigDecimal level6,BigDecimal level7,BigDecimal level8,BigDecimal level9,BigDecimal level10) {
        ContentValues cv = new ContentValues();
        cv.put("level1", String.valueOf(level1));
        cv.put("level2", String.valueOf(level2));
        cv.put("level3", String.valueOf(level3));
        cv.put("level4", String.valueOf(level4));
        cv.put("level5", String.valueOf(level5));
        cv.put("level6", String.valueOf(level6));
        cv.put("level7", String.valueOf(level7));
        cv.put("level8", String.valueOf(level8));
        cv.put("level9", String.valueOf(level9));
        cv.put("level10", String.valueOf(level10));

        try {
            mDb.insertOrThrow("AmountPlastic", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }

    public void insertAmountCoral(BigDecimal level1,BigDecimal level2,BigDecimal level3,BigDecimal level4,BigDecimal level5,BigDecimal level6,BigDecimal level7,BigDecimal level8,BigDecimal level9,BigDecimal level10) {
        ContentValues cv = new ContentValues();
        cv.put("level1", String.valueOf(level1));
        cv.put("level2", String.valueOf(level2));
        cv.put("level3", String.valueOf(level3));
        cv.put("level4", String.valueOf(level4));
        cv.put("level5", String.valueOf(level5));
        cv.put("level6", String.valueOf(level6));
        cv.put("level7", String.valueOf(level7));
        cv.put("level8", String.valueOf(level8));
        cv.put("level9", String.valueOf(level9));
        cv.put("level10", String.valueOf(level10));

        try {
            mDb.insertOrThrow("AmountCoral", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }

    public void insertAmountGold(BigDecimal level1,BigDecimal level2,BigDecimal level3,BigDecimal level4,BigDecimal level5,BigDecimal level6,BigDecimal level7,BigDecimal level8,BigDecimal level9,BigDecimal level10) {
        ContentValues cv = new ContentValues();
        cv.put("level1", String.valueOf(level1));
        cv.put("level2", String.valueOf(level2));
        cv.put("level3", String.valueOf(level3));
        cv.put("level4", String.valueOf(level4));
        cv.put("level5", String.valueOf(level5));
        cv.put("level6", String.valueOf(level6));
        cv.put("level7", String.valueOf(level7));
        cv.put("level8", String.valueOf(level8));
        cv.put("level9", String.valueOf(level9));
        cv.put("level10", String.valueOf(level10));

        try {
            mDb.insertOrThrow("AmountGold", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }

    public void insertAmountGas(BigDecimal level1,BigDecimal level2,BigDecimal level3,BigDecimal level4,BigDecimal level5,BigDecimal level6,BigDecimal level7,BigDecimal level8,BigDecimal level9,BigDecimal level10) {
        ContentValues cv = new ContentValues();
        cv.put("level1", String.valueOf(level1));
        cv.put("level2", String.valueOf(level2));
        cv.put("level3", String.valueOf(level3));
        cv.put("level4", String.valueOf(level4));
        cv.put("level5", String.valueOf(level5));
        cv.put("level6", String.valueOf(level6));
        cv.put("level7", String.valueOf(level7));
        cv.put("level8", String.valueOf(level8));
        cv.put("level9", String.valueOf(level9));
        cv.put("level10", String.valueOf(level10));

        try {
            mDb.insertOrThrow("AmountGas", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }

    public void insertAmountIce(BigDecimal level1,BigDecimal level2,BigDecimal level3,BigDecimal level4,BigDecimal level5,BigDecimal level6,BigDecimal level7,BigDecimal level8,BigDecimal level9,BigDecimal level10) {
        ContentValues cv = new ContentValues();
        cv.put("level1", String.valueOf(level1));
        cv.put("level2", String.valueOf(level2));
        cv.put("level3", String.valueOf(level3));
        cv.put("level4", String.valueOf(level4));
        cv.put("level5", String.valueOf(level5));
        cv.put("level6", String.valueOf(level6));
        cv.put("level7", String.valueOf(level7));
        cv.put("level8", String.valueOf(level8));
        cv.put("level9", String.valueOf(level9));
        cv.put("level10", String.valueOf(level10));

        try {
            mDb.insertOrThrow("AmountIce", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }


       public void insertLockIsland(int alga,int sand,int stone,int wood,int coal,int plastic,int coral,int gold,int gas,int ice){
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
            mDb.insertOrThrow("LockIsland", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }

    public void insertLockAlga(int level1,int level2,int level3,int level4,int level5,int level6,int level7,int level8,int level9,int level10){
        ContentValues cv = new ContentValues();
        cv.put("level1", level1);
        cv.put("level2", level2);
        cv.put("level3", level3);
        cv.put("level4", level4);
        cv.put("level5", level5);
        cv.put("level6", level6);
        cv.put("level7", level7);
        cv.put("level8", level8);
        cv.put("level9", level9);
        cv.put("level10", level10);

        try {
            mDb.insertOrThrow("LockAlga", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }

    public void insertLockSand(int level1,int level2,int level3,int level4,int level5,int level6,int level7,int level8,int level9,int level10){
        ContentValues cv = new ContentValues();
        cv.put("level1", level1);
        cv.put("level2", level2);
        cv.put("level3", level3);
        cv.put("level4", level4);
        cv.put("level5", level5);
        cv.put("level6", level6);
        cv.put("level7", level7);
        cv.put("level8", level8);
        cv.put("level9", level9);
        cv.put("level10", level10);

        try {
            mDb.insertOrThrow("LockSand", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }

    public void insertLockStone(int level1,int level2,int level3,int level4,int level5,int level6,int level7,int level8,int level9,int level10){
        ContentValues cv = new ContentValues();
        cv.put("level1", level1);
        cv.put("level2", level2);
        cv.put("level3", level3);
        cv.put("level4", level4);
        cv.put("level5", level5);
        cv.put("level6", level6);
        cv.put("level7", level7);
        cv.put("level8", level8);
        cv.put("level9", level9);
        cv.put("level10", level10);

        try {
            mDb.insertOrThrow("LockStone", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }

    public void insertLockWood(int level1,int level2,int level3,int level4,int level5,int level6,int level7,int level8,int level9,int level10){
        ContentValues cv = new ContentValues();
        cv.put("level1", level1);
        cv.put("level2", level2);
        cv.put("level3", level3);
        cv.put("level4", level4);
        cv.put("level5", level5);
        cv.put("level6", level6);
        cv.put("level7", level7);
        cv.put("level8", level8);
        cv.put("level9", level9);
        cv.put("level10", level10);

        try {
            mDb.insertOrThrow("LockWood", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }

    public void insertLockCoal(int level1,int level2,int level3,int level4,int level5,int level6,int level7,int level8,int level9,int level10){
        ContentValues cv = new ContentValues();
        cv.put("level1", level1);
        cv.put("level2", level2);
        cv.put("level3", level3);
        cv.put("level4", level4);
        cv.put("level5", level5);
        cv.put("level6", level6);
        cv.put("level7", level7);
        cv.put("level8", level8);
        cv.put("level9", level9);
        cv.put("level10", level10);

        try {
            mDb.insertOrThrow("LockCoal", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }

    public void insertLockPlastic(int level1,int level2,int level3,int level4,int level5,int level6,int level7,int level8,int level9,int level10){
        ContentValues cv = new ContentValues();
        cv.put("level1", level1);
        cv.put("level2", level2);
        cv.put("level3", level3);
        cv.put("level4", level4);
        cv.put("level5", level5);
        cv.put("level6", level6);
        cv.put("level7", level7);
        cv.put("level8", level8);
        cv.put("level9", level9);
        cv.put("level10", level10);

        try {
            mDb.insertOrThrow("LockPlastic", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }

    public void insertLockCoral(int level1,int level2,int level3,int level4,int level5,int level6,int level7,int level8,int level9,int level10){
        ContentValues cv = new ContentValues();
        cv.put("level1", level1);
        cv.put("level2", level2);
        cv.put("level3", level3);
        cv.put("level4", level4);
        cv.put("level5", level5);
        cv.put("level6", level6);
        cv.put("level7", level7);
        cv.put("level8", level8);
        cv.put("level9", level9);
        cv.put("level10", level10);

        try {
            mDb.insertOrThrow("LockCoral", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }

    public void insertLockGold(int level1,int level2,int level3,int level4,int level5,int level6,int level7,int level8,int level9,int level10){
        ContentValues cv = new ContentValues();
        cv.put("level1", level1);
        cv.put("level2", level2);
        cv.put("level3", level3);
        cv.put("level4", level4);
        cv.put("level5", level5);
        cv.put("level6", level6);
        cv.put("level7", level7);
        cv.put("level8", level8);
        cv.put("level9", level9);
        cv.put("level10", level10);

        try {
            mDb.insertOrThrow("LockGold", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }

    public void insertLockGas(int level1,int level2,int level3,int level4,int level5,int level6,int level7,int level8,int level9,int level10){
        ContentValues cv = new ContentValues();
        cv.put("level1", level1);
        cv.put("level2", level2);
        cv.put("level3", level3);
        cv.put("level4", level4);
        cv.put("level5", level5);
        cv.put("level6", level6);
        cv.put("level7", level7);
        cv.put("level8", level8);
        cv.put("level9", level9);
        cv.put("level10", level10);

        try {
            mDb.insertOrThrow("LockGas", null, cv);
        } catch (SQLiteException e) {
            Log.d("HKGame", "Exception: " + Log.getStackTraceString(e));
            throw new SQLiteException();
        }
    }

    public void insertLockIce(int level1,int level2,int level3,int level4,int level5,int level6,int level7,int level8,int level9,int level10){
        ContentValues cv = new ContentValues();
        cv.put("level1", level1);
        cv.put("level2", level2);
        cv.put("level3", level3);
        cv.put("level4", level4);
        cv.put("level5", level5);
        cv.put("level6", level6);
        cv.put("level7", level7);
        cv.put("level8", level8);
        cv.put("level9", level9);
        cv.put("level10", level10);

        try {
            mDb.insertOrThrow("LockIce", null, cv);
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

    public Cursor queryAmountAlga(){
        return mDb.query("AmountAlga",null,null,null,null,null,null);
    }

    public Cursor queryAmountSand(){
        return mDb.query("AmountSand",null,null,null,null,null,null);
    }

    public Cursor queryAmountStone(){
        return mDb.query("AmountStone",null,null,null,null,null,null);
    }

    public Cursor queryAmountWood(){
        return mDb.query("AmountWood",null,null,null,null,null,null);
    }

    public Cursor queryAmountCoal(){
        return mDb.query("AmountCoal",null,null,null,null,null,null);
    }

    public Cursor queryAmountPlastic(){
        return mDb.query("AmountPlastic",null,null,null,null,null,null);
    }

    public Cursor queryAmountCoral(){
        return mDb.query("AmountCoral",null,null,null,null,null,null);
    }

    public Cursor queryAmountGold(){
        return mDb.query("AmountGold",null,null,null,null,null,null);
    }

    public Cursor queryAmountGas(){
        return mDb.query("AmountGas",null,null,null,null,null,null);
    }

    public Cursor queryAmountIce(){
        return mDb.query("AmountIce",null,null,null,null,null,null);
    }

    public Cursor queryAmount(){
        return mDb.query("Amount", null, null, null,null, null, null);
    }

    public Cursor queryLockLevel(){
        return mDb.query("LockLevel", null, null, null,null, null, null);
    }

    public Cursor queryLockIsland(){
        return mDb.query("LockIsland", null, null, null,null, null, null);
    }

    public Cursor queryLockAlga(){
        return mDb.query("LockAlga", null, null, null,null, null, null);
    }

    public Cursor queryLockSand(){
        return mDb.query("LockSand", null, null, null,null, null, null);
    }

    public Cursor queryLockStone(){
        return mDb.query("LockStone", null, null, null,null, null, null);
    }

    public Cursor queryLockWood(){
        return mDb.query("LockWood", null, null, null,null, null, null);
    }

    public Cursor queryLockCoal(){
        return mDb.query("LockCoal", null, null, null,null, null, null);
    }

    public Cursor queryLockPlastic(){
        return mDb.query("LockPlastic", null, null, null,null, null, null);
    }

    public Cursor queryLockCoral(){
        return mDb.query("LockCoral", null, null, null,null, null, null);
    }

    public Cursor queryLockGold(){
        return mDb.query("LockGold", null, null, null,null, null, null);
    }

    public Cursor queryLockGas(){
        return mDb.query("LockGas", null, null, null,null, null, null);
    }

    public Cursor queryLockIce(){
        return mDb.query("LockIce", null, null, null,null, null, null);
    }

    public Cursor queryOfftime(){
        return mDb.query("Offtime", null, null, null,null, null, null);
    }
}