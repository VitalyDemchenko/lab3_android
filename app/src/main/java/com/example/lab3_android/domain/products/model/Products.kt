package com.example.lab3_android.domain.products.model

import com.google.gson.annotations.SerializedName

data class Products(

    @SerializedName("id")
    var id: Int
    ,
    @SerializedName("title")
    var title: String,

    @SerializedName("description")
    var description: String,

    @SerializedName("price")
    var price: Int,

    @SerializedName("discountPercentage")
    var discountPercentage: Float,

    @SerializedName("rating")
    var rating: Float,

    @SerializedName("stock")
    var stock: Int,

    @SerializedName("brand")
    var brand: String,

    @SerializedName("category")
    var category: String,


)
