package com.example.kentsimgeleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kentsimgeleri.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // add binding to the activity
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        // initialize binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        // set the content view to the binding root
        setContentView(binding.root)
        super.onCreate(savedInstanceState)

        binding.hello.text = "Hello World! I am Kotlin"
    }


    // change to DetailActivity
    fun changeButton(view: View) {
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }


}