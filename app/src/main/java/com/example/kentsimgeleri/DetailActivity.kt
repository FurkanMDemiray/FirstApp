package com.example.kentsimgeleri

import android.content.Intent
import android.os.Bundle
import android.view.View
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

        val intent = intent

        val selectedLandMark = intent.getSerializableExtra("landMark") as LandMark


        binding.hello.text = selectedLandMark.name
        binding.textCountry.text = selectedLandMark.Country
        binding.imageView.setImageResource(selectedLandMark.image)

        print(selectedLandMark.name)
        print(selectedLandMark.Country)

    }

    fun buttonBack(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}


