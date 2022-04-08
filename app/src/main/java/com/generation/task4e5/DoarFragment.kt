package com.generation.task4e5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.navigation.fragment.findNavController


class DoarFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_doar, container, false)

        val buttonDoacao = view?.findViewById<Button>(R.id.button2)


        if (buttonDoacao != null) {
            buttonDoacao.setOnClickListener {

                Toast.makeText(context, "Doação Feita", Toast.LENGTH_LONG).show()
            }
        }


        val botaocatalodoar = view.findViewById<ImageButton>(R.id.catalogo_doarfrag)

        botaocatalodoar.setOnClickListener {

            findNavController().navigate(
                R.id.action_doarFragment_to_catalogoFragment
            )

        }

        val botaohomedoar = view.findViewById<ImageButton>(R.id.homehome)

        botaohomedoar.setOnClickListener {

            findNavController().navigate(
                R.id.action_doarFragment_to_listFragment
            )

        }


        val botaoperfildoar = view.findViewById<ImageButton>(R.id.perfil_doar)

        botaoperfildoar.setOnClickListener {

            findNavController().navigate(
                R.id.action_doarFragment_to_perfilragment
            )

        }
        val botaoeditdadosdoar = view.findViewById<ImageButton>(R.id.imageView88)

        botaoeditdadosdoar.setOnClickListener {

            findNavController().navigate(
                R.id.action_doarFragment_to_editDadosFragment
            )

        }



        return view

    }
}
