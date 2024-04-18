package kz.example.coutirine.data


import com.google.gson.annotations.SerializedName

data class MemesResponse(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("success")
    val success: Boolean // true
)