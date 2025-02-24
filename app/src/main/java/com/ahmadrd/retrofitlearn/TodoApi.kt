package com.ahmadrd.retrofitlearn

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface TodoApi {

    @GET("/todos")
    suspend fun getTodos(): Response<List<Todo>>

    // Example
//    @GET("/todos")
//    fun getTodos(@Query("key") key: String): Response<List<Todo>>
//
//    @POST("/createTodos")
//    fun createTodo(@Body todo: Todo): Response<CreateTodoResponse>

}