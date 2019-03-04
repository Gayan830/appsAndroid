package com.example.windhelm.noteapp.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class Datasource {
    private Context mContext;
    private SQLiteDatabase mDatabase;
    SQLiteOpenHelper sqLiteOpenHelper;

    public Datasource(Context context) {
        this.mContext = context;
        sqLiteOpenHelper = new DbHelper(context);
        sqLiteOpenHelper.getWritableDatabase();
    }

    public void open(){
        mDatabase = sqLiteOpenHelper.getWritableDatabase();
    }

    public void close(){
        mDatabase.close();
    }
}
