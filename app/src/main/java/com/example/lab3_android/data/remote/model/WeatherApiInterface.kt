package com.example.lab3_android.data.remote.model

import com.example.lab3_android.data.local.model.WeatherApiModel
import retrofit2.Response
import retrofit2.http.GET

interface WeatherApiInterface {

    @GET("/api/users?page=2")
    suspend fun getAll(): Response<WeatherApiModel>

}