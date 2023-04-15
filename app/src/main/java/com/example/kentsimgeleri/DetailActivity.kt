package com.example.kentsimgeleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kentsimgeleri.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    // add binding to the activity
    private lateinit var binding: ActivityDetailBinding
    val city = LandMark("Ankara", "Turkey", R.drawable.city)
    val pedro = LandMark("Pedro", "Mexico", R.drawable.pedro)
    val witzel = LandMark("Witzel", "Germany", R.drawable.witzel)
    val witzell = LandMark("Witzell", "Germany", R.drawable.witzell)

    // create landmark list
    val landmarks = listOf(city, pedro, witzel, witzell)
    override fun onCreate(savedInstanceState: Bundle?) {
        // initialize binding
        binding = ActivityDetailBinding.inflate(layoutInflater)
        // set the content view to the binding root
        setContentView(binding.root)
        super.onCreate(savedInstanceState)

        changeImage()
    }

    fun changeImage() {
        binding.imageView.setImageResource(city.image)
    }

    fun changeText() {
        //binding.textView.text = "Kent"
    }

}


