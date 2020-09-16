package com.example.hilt_mvi_room.room;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.hilt_mvi_room.model.Note;

import java.util.List;

@Dao
public interface NoteDao {

    @Insert
    void insert(Note note);

    @Query("SELECT * FROM note")
    LiveData<List<Note>> getAllNotes();

    @Query("DELETE FROM note")
    void deleteAllData();


}
