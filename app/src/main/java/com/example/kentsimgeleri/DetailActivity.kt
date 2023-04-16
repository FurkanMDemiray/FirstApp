package com.example.kentsimgeleri

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kentsimgeleri.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    // add binding to the activity
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        // initialize binding
        binding = ActivityDetailBinding.inflate(layoutInflater)
        // set the content view to the binding root
        setContentView(binding.root)
        super.onCreate(savedInstanceState)

    }


}


