package com.example.databindinig_test.data.remote

import com.example.databindinig_test.data.model.UserModel
import retrofit2.Response
import retrofit2.http.GET

interface UserApi {

    @GET("users")
    suspend fun getUser() : Response<List<UserModel>>
}