package com.example.todoapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list,container,false)

        val floatinAdd = view.findViewById<FloatingActionButton>(R.id.floatingAdd)

        floatinAdd.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }
        return view
    }


    }
