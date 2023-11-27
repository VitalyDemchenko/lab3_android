package com.example.lab3_android.data.local.model

//import com.example.lab3_android.filesretro.Data
import com.google.gson.annotations.SerializedName
import com.example.lab3_android.domain.products.model.Products

data class ProductsApiModel(
//responselistproducts

    @SerializedName("products")
    var products: List<Products>,

    @SerializedName("total")
    var total: Int,

    @SerializedName("skip")
    var skip : Int,

    @SerializedName("limit")
    var limit : Int,
)
