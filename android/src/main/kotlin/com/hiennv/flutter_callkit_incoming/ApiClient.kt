package com.hiennv.flutter_callkit_incoming

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private val okHttpClient = OkHttpClient.Builder().build()

    val instance: CallApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://prod-be.legalavenue.pk/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CallApiService::class.java)
    }
}
