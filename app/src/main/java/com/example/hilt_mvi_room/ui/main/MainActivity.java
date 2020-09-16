package com.example.hilt_mvi_room.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import com.example.hilt_mvi_room.databinding.ActivityMainBinding;
import com.example.hilt_mvi_room.model.Note;
import com.example.hilt_mvi_room.room.NoteDao;
import com.example.hilt_mvi_room.viewmodel.NoteViewmodel;

import java.util.List;

import dagger.hilt.android.AndroidEntryPoint;


@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    ActivityMainBinding binding;
    private NoteViewmodel noteViewmodel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        noteViewmodel = new ViewModelProvider(this).get(NoteViewmodel.class);
        Note noteRef = new Note("First", "Note");
        noteViewmodel.insert(noteRef);
    }
}