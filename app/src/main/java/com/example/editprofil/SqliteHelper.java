package com.example.editprofil;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public abstract class SqliteHelper extends SQLiteOpenHelper{
    private static final String DATABASE_NAME="user";
    private static final int DATABASE_VERSION =1;

    public SqliteHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void OnCreate(SQLiteDatabase db){
        db.execSQL(
                "CREATE TABLE nama(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"+
                        "nama VARCHAR(100),"+
                        "email VARCHAR (50),"+
                        "nomor VARCHAR(13),"+
                        "negara VARCHAR(20));"
        );
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,int newVersion){
        db.execSQL("DROP TABLE IF EXISTS nama");
    }
}
