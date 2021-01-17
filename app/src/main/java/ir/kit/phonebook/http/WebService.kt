package com.sematec.basic.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object WebService {


    private fun getRetrofit(): Retrofit {

        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
        val client = OkHttpClient.Builder()
            .addInterceptor(logging)
           // .connectTimeout(20.toLong())
            .build()


        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create()).baseUrl("http://192.168.1.103:8080").client(client).build()
    }


    val api: Api by lazy {
        getRetrofit().create(Api::class.java)
    }

}