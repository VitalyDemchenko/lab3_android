package com.example.lab3_android.presentation.firstFragment

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lab3_android.data.remote.model.ApiFactory
import com.example.lab3_android.data.remote.model.ProductsApiInterface
import com.example.lab3_android.databinding.FragmentFirstBinding
import kotlinx.coroutines.launch
import java.lang.Exception

class FirsViewModel: ViewModel() {


    lateinit var binding: FragmentFirstBinding
    var txtDataViewM1: MutableLiveData<String> = MutableLiveData()


    fun getListProducts1() {
        val retrofit = ApiFactory.getInstance()
        val apiInterface = retrofit.create(ProductsApiInterface::class.java)


        viewModelScope.launch {
            try {
                val response = apiInterface.getAll()
                if (response.isSuccessful) {
                    if ((response.body()?.products?.size ?: 0) <= 0) {

                       //
                    } else {
                        response.body()?.let {

                            txtDataViewM1.value = it.products.joinToString("\n\n")
                        }
                    }
                } else {

                   //
                }
            } catch (ex: Exception) {
                ex.localizedMessage?.let { Log.e("Error", it) }
            }
        }
    }






}