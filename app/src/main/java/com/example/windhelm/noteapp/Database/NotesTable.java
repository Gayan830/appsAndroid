package com.example.windhelm.noteapp.Database;



public class NotesTable {
    public static final String TABLE_NAME = "notes";
    public static final String COLUMN_NOTE_ID = "noteId";
    public static final String COLUMN_NOTE_TITLE = "noteTitle";
    public static final String COLUMN_NOTE_BODY = "noteBody";
    public static final String COLUMN_NOTE_DATE = "noteDate";
    public static final String SQL_CREATE = "CREATE TABLE "+ TABLE_NAME + "(" +
                                            COLUMN_NOTE_ID + " TEXT PRIMARY KEY," +
                                            COLUMN_NOTE_TITLE + " TEXT," +
                                            COLUMN_NOTE_BODY + " TEXT," +
                                            COLUMN_NOTE_DATE +" TEXT);";

    public static final String SQL_DELETE = "DROP TABLE IF EXISTS"+ TABLE_NAME;
}
