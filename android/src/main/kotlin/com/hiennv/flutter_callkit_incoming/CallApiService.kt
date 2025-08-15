package com.hiennv.flutter_callkit_incoming

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface CallApiService {
    @Headers(
        "Content-Type: application/json",
        "x-api-key: legalAvenue@tNAFQl2Z+GY9_avx9",
    )
    @POST("v1/user/call/status")
    suspend fun updateCallStatus(@Body request: CallData): Response<Unit>
}
