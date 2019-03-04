package com.example.windhelm.noteapp.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.windhelm.noteapp.dataModel.Note;


public class DbHelper extends SQLiteOpenHelper {

    private static final String DB_FILE_NAME = "notes.db";
    private static final int DB_VERSION = 1;

    public DbHelper(Context context) {
        super(context, DB_FILE_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(NotesTable.SQL_CREATE);
        Note note = new Note(null,"helllo","hitt","23/23/4444");
        Note note1 = new Note(null,"helllo","hdsitt","23/23/4444");
        db.insert(NotesTable.TABLE_NAME,null,noteInsert(note));
        db.insert(NotesTable.TABLE_NAME,null,noteInsert(note1));
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(NotesTable.SQL_DELETE);
        onCreate(db);
    }

    public ContentValues noteInsert(Note note){
        ContentValues values = note.insertNotes();
        return values;
    }
}
