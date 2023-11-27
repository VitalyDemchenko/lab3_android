package com.example.lab3_android.data.local.model

import com.example.lab3_android.domain.products.model.Reqres
import com.google.gson.annotations.SerializedName

data class ReqresApiModel(



    @SerializedName("data")
   var data: List<Reqres>,





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
