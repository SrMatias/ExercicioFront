package com.example.salvardados

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.salvardados.data.UserDatabase
import com.example.salvardados.data.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViwModel(application: Application):AndroidViewModel(application) {
    val selectusers : LiveData<List<Usuario>>
    val repository : UserRepository
    init {
        val userDao = UserDatabase.getDatabase(application).userDao()
        repository = UserRepository(userDao)
        selectusers = repository.selectUsers
    }
    fun addUser (usuario: Usuario){
        viewModelScope.launch(Dispatchers.IO){
            repository.addUser(usuario)
        }
    }
}