package com.example.hilt_mvi_room.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.hilt_mvi_room.repo.NoteRepository;
import com.example.hilt_mvi_room.model.Note;
import com.example.hilt_mvi_room.room.NoteDao;

import java.util.List;

public class NoteViewmodel extends ViewModel {

    NoteRepository noteRepository;
    LiveData<List<Note>> getAllNotes;


    @ViewModelInject
    public NoteViewmodel(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public void insert(Note note) {
        noteRepository.insert(note);
    }

    public LiveData<List<Note>> getAllNotes() {
        return noteRepository.getAllNotes();
    }

    public void delete(){
        noteRepository.deleteAll();
    }


}
