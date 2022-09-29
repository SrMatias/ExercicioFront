package com.example.todoapp.model

data class Categoria (
    var id : Long,
    var nome : String?,
    var descricao : String?,
    var tarefa : List<Tarefa>?
        ){
    override fun toString(): String {
        return descricao!!
    }
}