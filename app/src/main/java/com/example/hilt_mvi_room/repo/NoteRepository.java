package com.example.hilt_mvi_room.repo;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.hilt_mvi_room.model.Note;
import com.example.hilt_mvi_room.room.NoteDao;
import com.example.hilt_mvi_room.room.NoteDatabase;

import java.util.List;

import javax.inject.Inject;

public class NoteRepository {

    private NoteDao noteDao;
    LiveData<List<Note>> allNotes;

//    @Inject
//    public NoteRepository(Application application) {
//        NoteDatabase noteDatabase = NoteDatabase.getDatabase(application);
//        noteDao = noteDatabase.noteDao();
//        allNotes = noteDao.getAllNotes();
//    }


    @Inject
    public NoteRepository(NoteDao noteDao) {
       this.noteDao = noteDao;
       allNotes=noteDao.getAllNotes();
    }

    public void insert(Note note) {
//        NoteDatabase.databaseExecutorService.execute(() -> {
//            noteDao.insert(note);
//        });

        noteDao.insert(note);
    }

    public LiveData<List<Note>> getAllNotes() {
        return allNotes;
    }


    public void deleteAll(){
        noteDao.deleteAllData();
    }

}
