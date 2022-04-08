package com.generation.task4e5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController


class Perfilragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment



        val view = inflater.inflate(R.layout.fragment_perfilragment, container, false)





        val botaocatalogoperfil = view.findViewById<ImageButton>(R.id.catalogo_doarfrag)

        botaocatalogoperfil.setOnClickListener {

            findNavController().navigate(
                R.id.action_perfilragment_to_catalogoFragment
            )

        }
        val botaohomeperfil = view.findViewById<ImageButton>(R.id.homehome)

        botaohomeperfil.setOnClickListener {

            findNavController().navigate(
                R.id.action_perfilragment_to_listFragment
            )

        }
        val botaodoarperfil = view.findViewById<ImageButton>(R.id.doar_doar)

        botaodoarperfil.setOnClickListener {

            findNavController().navigate(
                R.id.action_perfilragment_to_doarFragment
            )

        }
        val botaoeditdadosperfil = view.findViewById<ImageButton>(R.id.imageView88)

        botaoeditdadosperfil.setOnClickListener {

            findNavController().navigate(
                R.id.action_perfilragment_to_editDadosFragment
            )

        }









        return view
    }


}