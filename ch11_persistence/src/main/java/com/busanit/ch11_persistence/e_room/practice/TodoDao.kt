package com.busanit.ch11_persistence.e_room.practice

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface TodoDao {
    @Insert
    suspend fun insert(todo: Todo)

    @Query("SELECT * FROM todos")
    suspend fun getAll(): List<Todo>
}