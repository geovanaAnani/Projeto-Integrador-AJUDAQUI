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
import com.generation.task4e5.adapter.TaskItemClickListener
import com.generation.task4e5.model.Post
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ListFragment : Fragment(), TaskItemClickListener {

    private val mainViewModel: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mainViewModel.listPost()

        val view = inflater.inflate(R.layout.fragment_list, container, false)


        val recyclepost = view.findViewById<RecyclerView>(R.id.recycletarefa)

        val adapter = Postadapter(this, mainViewModel,requireContext())

        recyclepost.layoutManager = LinearLayoutManager(context)
        recyclepost.adapter = adapter

        recyclepost.setHasFixedSize(true)


        val botaoir = view.findViewById<ImageButton>(R.id.floatingActionButton)

        botaoir.setOnClickListener {
           mainViewModel.postSelecionado = null
            findNavController().navigate(
                R.id.action_listFragment_to_segundoFragment
            )





        }


        mainViewModel.myPostResponse.observe(viewLifecycleOwner, {

                response ->
            if (response != null) {

                adapter.setlista(response.body()!!)
            }


        })



        val botaocatalogolist = view.findViewById<ImageButton>(R.id.catalogo_doarfrag)

        botaocatalogolist.setOnClickListener {

            findNavController().navigate(
                R.id.action_listFragment_to_catalogoFragment
            )

        }
        val botaodoarlist = view.findViewById<ImageButton>(R.id.doar_doar)

        botaodoarlist.setOnClickListener {

            findNavController().navigate(
                R.id.action_listFragment_to_doarFragment
            )

        }
        val botaoperfillist = view.findViewById<ImageButton>(R.id.perfil_doar)

        botaoperfillist.setOnClickListener {

            findNavController().navigate(
                R.id.action_listFragment_to_perfilragment
            )

        }
        val botaoeditdados = view.findViewById<ImageButton>(R.id.imageView88)

        botaoeditdados.setOnClickListener {

            findNavController().navigate(
                R.id.action_listFragment_to_editDadosFragment
            )

        }



        return view
    }

    override fun onTaskClicked(post: Post) {

        mainViewModel.postSelecionado = post
        findNavController().navigate(R.id.action_listFragment_to_segundoFragment)

    }

}
