package com.example.salvardados.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.salvardados.Usuario
import com.example.salvardados.databinding.CardLayoutBinding

class UserAdapter : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    private var listUser = emptyList<Usuario>()

    class UserViewHolder( val binding: CardLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(CardLayoutBinding.inflate(
            LayoutInflater.from(parent.context),parent,false
        ))
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = listUser[position]

        holder.binding.textId.text = user.id.toString()
        holder.binding.textNome.text = user.nome
        holder.binding.textSobrenome.text = user.sobrenome
        holder.binding.textIdade.text = user.idade.toString()
    }

    override fun getItemCount(): Int {

        return listUser.size
    }

    fun setList(list: List<Usuario>){
        listUser =list
        notifyDataSetChanged()
    }
}