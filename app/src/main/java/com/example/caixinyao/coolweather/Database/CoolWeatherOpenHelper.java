package com.example.caixinyao.coolweather.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by CaiXinyao on 2016/8/25.
 */
public class CoolWeatherOpenHelper  extends SQLiteOpenHelper{
    //省份建表
    public static final String CREATE_PROVINCE = "create table Province ("
            + "id integer primary key autoincreacment,"
            + "province_name text,"
            + "province_code text)";

    //市建表
    public static final String CREATE_CITY = "create table City ("
            + "id integer primary key autoincreacment,"
            + "city_name text,"
            + "city_code text,"
            + "privince_id integer)";
    //县建表
    public static final String CREATE_COUNTRY = "create table country ("
            + "id integer primary key autoincreacment,"
            + "country_name text,"
            + "country_code text,"
            + "city_id integer)";

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,int version) {
        super(context,name,factory,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTRY);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion) {

    }
}
