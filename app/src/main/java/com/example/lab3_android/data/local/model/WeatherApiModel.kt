package com.example.lab3_android.data.local.model

import com.example.lab3_android.domain.products.model.Products
import com.example.lab3_android.domain.products.model.Weather
import com.google.gson.annotations.SerializedName

data class WeatherApiModel(



    @SerializedName("data")
   var data: List<Weather>,
//
//    @SerializedName("total")
//    var total: Int,
//
//    @SerializedName("skip")
//    var skip : Int,
//
//    @SerializedName("limit")
//    var limit : Int,
)
