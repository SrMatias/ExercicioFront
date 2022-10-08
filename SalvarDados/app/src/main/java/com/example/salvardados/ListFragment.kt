package com.example.salvardados

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.salvardados.adapter.UserAdapter
import com.example.salvardados.databinding.FragmentListBinding


class ListFragment : Fragment() {

   private lateinit var binding:FragmentListBinding
   private lateinit var mainViwModel: MainViwModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater,container,false)

        mainViwModel = ViewModelProvider(this).get(MainViwModel ::class.java)

        val adapter = UserAdapter()

        binding.recyclerUser.layoutManager = LinearLayoutManager(context)
        binding.recyclerUser.adapter = adapter
        binding.recyclerUser.setHasFixedSize(true)

        mainViwModel.selectusers.observe(viewLifecycleOwner){
            response -> adapter.setList(response)
        }
        binding.floatingAdd.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_addFragment)
        }
        return binding.root
    }


}
