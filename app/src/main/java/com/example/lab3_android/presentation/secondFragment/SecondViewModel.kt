package com.example.lab3_android.presentation.secondFragment

import android.util.Log
import android.widget.TextView
import kotlinx.coroutines.launch
import java.lang.Exception
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.ViewModel
import com.example.lab3_android.data.remote.model.ApiFactory2
import com.example.lab3_android.data.remote.model.ReqresApiInterface
import com.example.lab3_android.databinding.FragmentSecondBinding

class SecondViewModel: ViewModel() {
    private lateinit var txtData2 : TextView

    lateinit var binding: FragmentSecondBinding


    var txtDataViewM2: MutableLiveData<String> = MutableLiveData()

    fun getListReqres1() {
        val retrofit = ApiFactory2.getInstance()
        val apiInterface = retrofit.create(ReqresApiInterface::class.java)


        viewModelScope.launch {
            try {
                val response = apiInterface.getAll()
                if (response.isSuccessful) {
                    if ((response.body()?.data?.size ?: 0) <= 0) {

                        txtDataViewM2.value = " ПОМИЛКА ЗАГРУЗКИ "

                        //
                    } else {
                        response.body()?.let {

                            //
                            txtDataViewM2.value = it.data.joinToString("\n\n")


                            txtDataViewM2.value += "\n"
                            txtDataViewM2.value += "\nTotal: ${it.page}"

                            txtDataViewM2.value += "\n"
                            txtDataViewM2.value += "\nSkip: ${it.per_page}"

                            txtDataViewM2.value += "\n"
                            txtDataViewM2.value += "\nLimit: ${it.total}"

                            txtDataViewM2.value += "\n"
                            txtDataViewM2.value += "\nLimit: ${it.total_pages}"
                        }
                    }
                } else {

                    txtDataViewM2.value = " ПОМИЛКА ЗАГРУЗКИ "

                    //
                }
            } catch (ex: Exception) {
                ex.localizedMessage?.let { Log.e("Error", it) }
            }
        }
    }












}