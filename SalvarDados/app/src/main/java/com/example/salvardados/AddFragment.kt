package com.example.salvardados

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.salvardados.databinding.FragmentAddBinding

class AddFragment : Fragment() {

    private lateinit var binding: FragmentAddBinding
    private lateinit var mainViwModel: MainViwModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAddBinding.inflate(layoutInflater, container, false)

        mainViwModel = ViewModelProvider(this).get(MainViwModel::class.java)

        binding.buttonAdicionar.setOnClickListener {
            //inserirNoBanco
        }
        return binding.root
    }

    fun verificarCampos(nome:String,sobrenome:String,idade:String):Boolean{
        return !(nome == ""|| sobrenome == ""|| idade == "")
    }
    fun inserirNoBanco(){
        val nome = binding.editNome.text.toString()
        val sobrenome = binding.editSobrenome.text.toString()
        val idade = binding.editIdade.text.toString()

        if(verificarCampos(nome, sobrenome, idade)){
            val user = Usuario(0,nome,sobrenome, idade.toInt())
            mainViwModel.addUser(user)
            Toast.makeText(context,"Adicionado com Sucesso!",Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_addFragment_to_listFragment)

        }else{
            Toast.makeText(context,"Verifique os Campos!",Toast.LENGTH_LONG).show()
        }
    }
}