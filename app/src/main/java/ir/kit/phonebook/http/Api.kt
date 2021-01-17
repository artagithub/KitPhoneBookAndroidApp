package com.sematec.basic.api

import ir.kit.phonebook.http.dto.KitGithubAccountDTO
import ir.kit.phonebook.room.KitGithubAccount
import retrofit2.Call
import retrofit2.http.*

interface Api {

    @POST("http://192.168.1.103:8080/api/account/create")
    fun create(
            @Body request: KitGithubAccountDTO
    ): Call<KitGithubAccount>

    @PUT("http://192.168.1.103:8080/api/account/update")
    fun update(
            @Body request: KitGithubAccountDTO
    ): Call<KitGithubAccount>


    @GET("http://192.168.1.103:8080/api/account/search")
    fun search(
        @Body request: KitGithubAccount
    ): Call<KitGithubAccount>


    @GET("http://192.168.1.103:8080/api/account/find")
    fun find(
            @Query("id") id: String
    ): Call<KitGithubAccount>

    @DELETE("http://192.168.1.103:8080/api/account/delete")
    fun delete(
            @Query("id") id: String
    ): Call<KitGithubAccount>

    @GET("http://192.168.1.103:8080/api/account/list")
    fun getKitAccounts( ): Call<List<KitGithubAccount>>


}