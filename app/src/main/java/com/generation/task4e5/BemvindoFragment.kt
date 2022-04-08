package com.generation.task4e5

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.generation.task4e5.databinding.FragmentBemvindoBinding
import com.generation.task4e5.databinding.FragmentSegundoBinding

class BemvindoFragment : Fragment() {

    private lateinit var binding: FragmentBemvindoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val view = inflater.inflate(R.layout.fragment_bemvindo, container, false)

        val bemvindoButton = view.findViewById<Button>(R.id.imageButton)


        bemvindoButton.setOnClickListener {
            findNavController().navigate(R.id.action_bemvindoFragment_to_loginFragment)

        }



        return view
    }



}