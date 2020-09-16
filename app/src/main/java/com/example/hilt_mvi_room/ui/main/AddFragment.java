package com.example.hilt_mvi_room.ui.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hilt_mvi_room.R;
import com.example.hilt_mvi_room.viewmodel.NoteViewmodel;

public class AddFragment extends Fragment {

    NoteViewmodel noteViewmodel;

    public AddFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        noteViewmodel = new ViewModelProvider(this).get(NoteViewmodel.class);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add, container, false);


        return view;
    }
}