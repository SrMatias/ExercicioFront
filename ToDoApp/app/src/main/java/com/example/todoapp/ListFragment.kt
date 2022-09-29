package com.example.todoapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todoapp.adapter.TarefaAdapter
import com.example.todoapp.api.MainViewModel
import com.example.todoapp.databinding.FragmentListBinding
import com.example.todoapp.model.Categoria
import com.example.todoapp.model.Tarefa

import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListFragment : Fragment() {

    private lateinit  var binding: FragmentListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater,container,false)


            val adapter = TarefaAdapter()

            binding.recyclerTarefa.layoutManager  = LinearLayoutManager(context)
            binding.recyclerTarefa.adapter = adapter
            binding.recyclerTarefa.setHasFixedSize(true)

            binding.floatingAdd.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }
        return binding.root
    }


    }
