package com.example.notesappcompose.data.notes

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.notesappcompose.utils.Constants

@Dao
interface NoteDAO {
    @Query("SELECT * FROM ${Constants.note_table_name}")
    fun getAll(): List<NoteEntity>

    @Insert
    fun insert(noteEntity: NoteEntity)

    @Delete
    fun delete(noteEntity: NoteEntity)

    @Update
    fun update(noteEntity: NoteEntity)
}