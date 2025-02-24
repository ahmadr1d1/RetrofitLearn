package com.ahmadrd.retrofitlearn

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetorifitInstance {

    val api: TodoApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TodoApi::class.java)
    }
}