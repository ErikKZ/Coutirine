package kz.example.coutirine.data


import com.google.gson.annotations.SerializedName

data class Meme(
    @SerializedName("box_count")
    val boxCount: Int, // 2
    @SerializedName("captions")
    val captions: Int, // 1223250
    @SerializedName("height")
    val height: Int, // 1200
    @SerializedName("id")
    val id: String, // 181913649
    @SerializedName("name")
    val name: String, // Drake Hotline Bling
    @SerializedName("url")
    val url: String, // https://i.imgflip.com/30b1gx.jpg
    @SerializedName("width")
    val width: Int // 1200
)