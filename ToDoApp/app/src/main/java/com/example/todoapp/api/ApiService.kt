package com.example.todoapp.api

import com.example.todoapp.model.Categoria
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET

interface ApiService {

    @GET("categoria")
    suspend fun listCategoria():Response<List<Categoria>>
}