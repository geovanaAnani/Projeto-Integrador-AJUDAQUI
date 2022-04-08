package com.generation.task4e5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.Toast
import androidx.navigation.fragment.findNavController


class editDadosFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_edit_dados, container, false)


        val botaologof = view.findViewById<ImageButton>(R.id.imageView88)


        botaologof.setOnClickListener {

            Toast.makeText(context, "Você saiu, até breve!", Toast.LENGTH_LONG).show()

            findNavController().navigate(
                R.id.action_editDadosFragment_to_loginFragment
            )

        }


        val botaoeditvoltar = view.findViewById<ImageButton>(R.id.imageb9)

        botaoeditvoltar.setOnClickListener {

            findNavController().navigate(
                R.id.action_editDadosFragment_to_listFragment
            )

        }

        return view
    }
}