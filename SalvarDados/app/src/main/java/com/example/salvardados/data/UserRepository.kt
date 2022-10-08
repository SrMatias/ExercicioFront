package com.example.salvardados.data

import com.example.salvardados.Usuario

class UserRepository(private val userDao: UserDao) {

    val selectUsers = userDao.selectusers()
    fun addUser(usuario: Usuario){
        userDao.addUser(usuario)
    }
}