package com.example.hilt_mvi_room.di;


import android.app.Application;

import androidx.room.Room;

import com.example.hilt_mvi_room.room.NoteDao;
import com.example.hilt_mvi_room.room.NoteDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;

@Module
@InstallIn(ApplicationComponent.class)
public abstract class databaseModule {

    @Provides
    @Singleton
    public static NoteDatabase getDatabase(final Application application) {
        return Room.databaseBuilder(application.getApplicationContext(), NoteDatabase.class, "note_database")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
    }

    @Provides
    @Singleton
    public static NoteDao getNoteDao(NoteDatabase noteDatabase) {
        return noteDatabase.noteDao();
    }
}
