package com.generation.task4e5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class IAFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_i_a, container, false)

        val ButtonDeB = view.findViewById<Button>(R.id.button2)
        val ButtonOng = view.findViewById<Button>(R.id.buttonOng)



        ButtonDeB.setOnClickListener {
            findNavController().navigate(R.id.action_IAFragment_to_cadastroFragment


            )

        }


        ButtonOng.setOnClickListener {
            findNavController().navigate(R.id.action_IAFragment_to_cadastroFragment


            )

        }



        return view
    }

}
