package kz.example.coutirine

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import kz.example.coutirine.data.Meme
import kz.example.coutirine.data.RetrofitService
import kz.example.coutirine.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycleScope.launch {
            try {
                val response = RetrofitService.apiServiceMemes.getMemes()
                Log.d("TAG", "onCreate: ${response.data.memes}")
                val listMemes : List<Meme> = response.data.memes
                Log.d("AAA", listMemes.toString())
                val adapter= RecycledAdapter()
                binding.rcMeme.adapter = adapter
                adapter.submitList(listMemes)
            } catch (e: Exception) {
                Log.d("AAAerror", "onCreate: ${e.message}" )
            }
        }
    }
}