package com.example.lab3_android.presentation.secondFragment

import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.lab3_android.data.remote.model.ApiFactory
import com.example.lab3_android.data.remote.model.ProductsApiInterface
import kotlinx.coroutines.launch
import java.lang.Exception
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.ViewModel
import com.example.lab3_android.data.remote.model.ApiFactory2
import com.example.lab3_android.data.remote.model.WeatherApiInterface
import com.example.lab3_android.databinding.ActivityMainBinding
import com.example.lab3_android.databinding.FragmentSecondBinding
import kotlinx.coroutines.launch

class SecondViewModel: ViewModel() {
    private lateinit var txtData2 : TextView

    lateinit var binding: FragmentSecondBinding
    //txtData2 = binding.

    var txtData: MutableLiveData<String> = MutableLiveData()

    fun getProductList() {
        val retrofit = ApiFactory2.getInstance()
        val apiInterface = retrofit.create(WeatherApiInterface::class.java)

        // Use viewModelScope instead of lifecycleScope
        viewModelScope.launch {
            try {
                val response = apiInterface.getAll()
                if (response.isSuccessful) {
                    if ((response.body()?.data?.size ?: 0) <= 0) {
                        // Handle case when no data is available
                    } else {
                        response.body()?.let {
                            // Update the LiveData with the new data
                            txtData.value = it.data.joinToString("\n\n")
                        }
                    }
                } else {
                    // Handle unsuccessful response
                }
            } catch (ex: Exception) {
                ex.localizedMessage?.let { Log.e("Error", it) }
            }
        }
    }
}