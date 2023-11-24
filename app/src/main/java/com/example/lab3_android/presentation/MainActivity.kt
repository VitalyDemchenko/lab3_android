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



class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController
    private lateinit var txtData : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = Navigation.findNavController(this, R.id.fragment1)

        MAIN = this

        txtData = findViewById(R.id.txtData)

        val b = findViewById<Button>(R.id.button_get_1)

        b.setOnClickListener {
            // getUserList()
            getProductList()
        }



    }


    private fun getProductList(){
//.create(ProductsApiInterface::class.java)
        val retrofit = ApiFactory.getInstance()
        val apiInterface = retrofit.create(ProductsApiInterface::class.java)
        lifecycleScope.launch{
            try {
                val response = apiInterface.getAll()
                if(response.isSuccessful){
                    if((response.body()?.products?.size?:0) <=0){
                        Toast.makeText(
                            this@MainActivity,
                            "No Data",
                            Toast.LENGTH_LONG


                        ).show()
                    }else   {
                        response.body()?.let {
                            txtData.text = it.products.joinToString("\n\n")
                        }

                    }

                }
                else{
                    Toast.makeText(
                        this@MainActivity,
                        response.errorBody().toString(),
                        Toast.LENGTH_LONG

                    ).show()
                }



            } catch (Ex: Exception){
                Ex.localizedMessage?.let { Log.e("Error",it) }
            }



        }



    }


}