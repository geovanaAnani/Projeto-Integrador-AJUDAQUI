package com.generation.task4e5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.generation.task4e5.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentLoginBinding.inflate(layoutInflater, container, false)







        binding.button3.setOnClickListener {

            validaremail()

        }



        binding.button4.setOnClickListener {

            findNavController().navigate(R.id.action_loginFragment_to_IAFragment)


        }




        return binding.root
    }



    fun validaremail(){

        val email = binding.nomeLogin.text.toString()
        val senha  = binding.senhaLogin.text.toString()
        val emailinterno = "grupo7@ajudaqui.com.br"
        val senhainterna = "12345678"


        if(email != emailinterno || senha!=senhainterna){

            Toast.makeText(context, "Usuario não cadastrado!", Toast.LENGTH_SHORT).show()

        }else{
            findNavController().navigate(R.id.action_loginFragment_to_listFragment)
        }

        if (email.isEmpty() || senha.isEmpty()){

            Toast.makeText(context, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()


        }else if(email.length<10 || email.length>30 || senha.length<8 || senha.length>30){

            Toast.makeText(context, "E-mail ou Senha Invalidos!", Toast.LENGTH_SHORT).show()
        }

    }




}