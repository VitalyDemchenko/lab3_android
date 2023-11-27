package com.example.lab3_android.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.lab3_android.R
import com.example.lab3_android.databinding.ActivityMainBinding
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lab3_android.data.remote.model.ApiFactory
import com.example.lab3_android.data.remote.model.ProductsApiInterface
import kotlinx.coroutines.launch
import java.lang.Exception
import com.example.lab3_android.presentation.secondFragment.SecondFragment
import com.example.lab3_android.presentation.secondFragment.SecondViewModel
import androidx.activity.viewModels


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController



    private val viewModel: SecondViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = Navigation.findNavController(this, R.id.fragment1)

        MAIN = this




    }


//    Стара функція


//    private fun getProductList(){
//        val retrofit = ApiFactory.getInstance()
//        val apiInterface = retrofit.create(ProductsApiInterface::class.java)
//        lifecycleScope.launch{
//            try {
//                val response = apiInterface.getAll()
//                if(response.isSuccessful){
//                    if((response.body()?.products?.size?:0) <=0){
//                        Toast.makeText(
//                            this@MainActivity,
//                            "No Data",
//                            Toast.LENGTH_LONG
//
//
//                        ).show()
//                    }else   {
//                        response.body()?.let {
//                            txtData.text = it.products.joinToString("\n\n")
//                        }
//
//                    }
//
//                }
//                else{
//                    Toast.makeText(
//                        this@MainActivity,
//                        response.errorBody().toString(),
//                        Toast.LENGTH_LONG
//
//                    ).show()
//                }
//
//
//
//            } catch (Ex: Exception){
//                Ex.localizedMessage?.let { Log.e("Error",it) }
//            }
//
//
//
//        }
//
//
//
//    }




}