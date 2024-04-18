package kz.example.coutirine

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kz.example.coutirine.data.MemesResponse
import kz.example.coutirine.data.Data
import kz.example.coutirine.data.Meme
import kz.example.coutirine.databinding.RecycledAdapterBinding

class RecycledAdapter() : RecyclerView.Adapter<RecycledAdapter.ViewHolder>() {
    private val adapterList = mutableListOf<Meme>()

    inner class ViewHolder(private var binding: RecycledAdapterBinding): RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: Meme) {
            binding.txMeme1.text = item.name
            binding.tvMeme2.text = item.url
            Glide.with(binding.root)
                .load(item.url)
                .into(binding.imgMeme)
        }
    }

    fun submitList(list: List<Meme>) {
        adapterList.addAll(list)
//        list.forEach { meme ->
//            Log.d("AAAlist", "Name: ${meme.name}, URL: ${meme.url}")
//        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            RecycledAdapterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return adapterList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(adapterList[position])
    }
}
