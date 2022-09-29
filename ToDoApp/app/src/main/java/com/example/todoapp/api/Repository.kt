package com.example.todoapp.api

import com.example.todoapp.model.Categoria
import retrofit2.Response

class Repository {
    suspend fun listCategoria(): Response<List<Categoria>>{
        return RetrofitInstance.api.listCategoria()
    }
}