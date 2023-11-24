package com.example.lab3_android.presentation.firstFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lab3_android.R
import com.example.lab3_android.databinding.FragmentFirstBinding
import com.example.lab3_android.presentation.MAIN
//
class FirstFragment : Fragment() {
//    // TODO: Rename and change types of parameters
//    private var param1: String? = null
//    private var param2: String? = null

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//    }
lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        return  binding.root

        //return inflater.inflate(R.layout.fragment_first, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.buttonFirstToSec.setOnClickListener {

            MAIN.navController.navigate(R.id.action_firstFragment_to_secondFragment)

        }



    }

}