package com.generation.task4e5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.generation.task4e5.adapter.Postadapter


class CatalogoFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val view = inflater.inflate(R.layout.fragment_catalogo, container, false)



        val botaohomecatalogo = view.findViewById<ImageButton>(R.id.homehome)

        botaohomecatalogo.setOnClickListener {

            findNavController().navigate(
                R.id.action_catalogoFragment_to_listFragment
            )

        }

        val botaoperfilcatalogo = view.findViewById<ImageButton>(R.id.perfil_doar)

        botaoperfilcatalogo.setOnClickListener {

            findNavController().navigate(
                R.id.action_catalogoFragment_to_perfilragment
            )

        }

        val botaodoarcatalogo = view.findViewById<ImageButton>(R.id.doar_doar)

        botaodoarcatalogo.setOnClickListener {

            findNavController().navigate(
                R.id.action_catalogoFragment_to_doarFragment
            )

        }

        val botaoeditdadoscatalogo = view.findViewById<ImageButton>(R.id.imageView88)

        botaoeditdadoscatalogo.setOnClickListener {

            findNavController().navigate(
                R.id.action_catalogoFragment_to_editDadosFragment
            )

        }


   return view

    }


}