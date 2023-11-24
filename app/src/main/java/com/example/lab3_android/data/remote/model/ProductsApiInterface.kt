package com.example.lab3_android.data.remote.model

import com.example.lab3_android.data.local.model.ProductsApiModel
import retrofit2.Response
import retrofit2.http.GET

interface ProductsApiInterface {
    // ApiInterface2

    @GET("/products")
    suspend fun getAll(): Response<ProductsApiModel>

}