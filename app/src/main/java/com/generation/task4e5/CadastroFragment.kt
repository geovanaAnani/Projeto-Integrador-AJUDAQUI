package com.generation.task4e5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.generation.task4e5.databinding.FragmentCadastroBinding
import com.generation.task4e5.databinding.FragmentLoginBinding

class CadastroFragment : Fragment() {


    private lateinit var binding: FragmentCadastroBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentCadastroBinding.inflate(layoutInflater, container, false)

        binding.imageButton3.setOnClickListener {
            validarCampos()

        }

        return binding.root
    }

    fun validarCampos() {

        val nome = binding.editTextTextPersonName16.text.toString()
        val emailcad = binding.editTextTextPersonName12.text.toString()
        val senhacad = binding.editTextTextPersonName9.text.toString()
        val confirmsenha = binding.editTextTextPersonName15.text.toString()
        val cpf_cnpj = binding.editTextTextPersonName14.text.toString()
        val cidade = binding.editTextTextPersonName13.text.toString()
        val estado = binding.editTextTextPersonName17.text.toString()
        val telefone = binding.editTextTextPersonName18.text.toString()

        if (nome.isEmpty() || emailcad.isEmpty() || senhacad.isEmpty() || confirmsenha.isEmpty() ||
            cpf_cnpj.isEmpty() || cidade.isEmpty() || estado.isEmpty() || telefone.isEmpty()
        ) {
            Toast.makeText(context, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()

        } else if (nome.length < 8 || nome.length > 30 || emailcad.length < 8 || emailcad.length > 30 ||
            senhacad.length < 8 || senhacad.length > 30 || confirmsenha.length < 8 || confirmsenha.length > 30 ||
            cpf_cnpj.length < 11 || cpf_cnpj.length > 14 || cidade.length < 8 || cidade.length > 30 ||
            estado.length < 8 || estado.length > 15 || telefone.length < 8 || telefone.length > 12
        ) {

            Toast.makeText(context, "Preencha os campos corretamente!", Toast.LENGTH_SHORT).show()
        } else {

            findNavController().navigate(R.id.action_cadastroFragment_to_listFragment)

        }

    }


}