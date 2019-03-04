package com.example.windhelm.noteapp.dataModel;
import android.content.ContentValues;

import com.example.windhelm.noteapp.Database.NotesTable;

import java.util.UUID;

public class Note {
    private String noteId;
    private String noteDescription;
    private String noteTitle;
    private String noteDate;

    public Note(String noteId,String noteDescription, String noteTitle, String noteDate) {
        if (noteId == null) {
            noteId = UUID.randomUUID().toString();
        }
        this.noteId = noteId;
        this.noteDescription = noteDescription;
        this.noteTitle = noteTitle;
        this.noteDate = noteDate;
    }

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    public String getNoteDescription() {
        return noteDescription;
    }

    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(String noteDate) {
        this.noteDate = noteDate;
    }

    public ContentValues insertNotes(){
        ContentValues noteValues = new ContentValues(4);
        noteValues.put(NotesTable.COLUMN_NOTE_ID,noteId);
        noteValues.put(NotesTable.COLUMN_NOTE_TITLE,noteTitle);
        noteValues.put(NotesTable.COLUMN_NOTE_BODY,noteDescription);
        noteValues.put(NotesTable.COLUMN_NOTE_DATE,noteDate);

        return noteValues;
    }
}
