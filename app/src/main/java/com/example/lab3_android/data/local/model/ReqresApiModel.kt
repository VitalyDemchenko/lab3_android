package com.example.lab3_android.data.local.model

import com.example.lab3_android.domain.products.model.Reqres
import com.google.gson.annotations.SerializedName

data class ReqresApiModel(

    @SerializedName("page")
    var page: Int,

    @SerializedName("per_page")
    var per_page: Int,

    @SerializedName("total")
    var total: Int,

    @SerializedName("total_pages")
    var total_pages: Int,

    @SerializedName("data")
   var data: List<Reqres>,



)
