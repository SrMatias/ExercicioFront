package com.example.salvardados.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.salvardados.Usuario

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)

    fun addUser(usuario: Usuario)

    @Query ("SELECT * FROM user_table ORDER BY id ASC")

    fun selectusers():LiveData<List<Usuario>>
}