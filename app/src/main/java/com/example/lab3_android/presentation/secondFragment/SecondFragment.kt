package com.example.lab3_android.presentation.secondFragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.lab3_android.R
import com.example.lab3_android.data.remote.model.ApiFactory2
import com.example.lab3_android.data.remote.model.WeatherApiInterface
import com.example.lab3_android.databinding.FragmentSecondBinding
import com.example.lab3_android.presentation.MAIN
import kotlinx.coroutines.launch
import java.lang.Exception
import androidx.activity.viewModels
import androidx.fragment.app.viewModels

import androidx.lifecycle.ViewModel
import com.example.lab3_android.presentation.secondFragment.SecondViewModel

class SecondFragment : Fragment() {
    // TODO: Rename and change types of parameters
//    private var param1: String? = null
//    private var param2: String? = null

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//    }

private val viewModel: SecondViewModel by viewModels()
   private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(layoutInflater, container, false)

        return binding.root

       // return inflater.inflate(R.layout.fragment_second, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

       // lateinit var txtData_2 : TextView
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecToFirst.setOnClickListener {

            MAIN.navController.navigate(R.id.action_secondFragment_to_firstFragment)


            }


            binding.buttonNew.setOnClickListener {

                viewModel.getProductList()

                viewModel.txtData.observe(viewLifecycleOwner) { newData ->
                    binding.txtDataNew.text = newData
            }
            // Trigger the API call



        }
      //   txtData_2 = binding.txtDataNew
      //  val p = binding.buttonNew


            // getUserList()
           // getWeatherList()

            // Отримати посилання на txtData_2 в контексті фрагмента


            //val p = findViewById<Button>(R.id.button_2)

            // Тепер ви можете використовувати txtData_2 за потреби


//.create(ProductsApiInterface::class.java)





    }




//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment SecondFragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            SecondFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
}