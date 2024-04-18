package kz.example.coutirine.data

import retrofit2.http.GET

interface ApiService {
    @GET("get_memes")
    suspend fun getMemes(): MemesResponse
}