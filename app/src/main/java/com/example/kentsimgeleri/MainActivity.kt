package com.example.kentsimgeleri

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kentsimgeleri.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // add binding to the activity
    private lateinit var binding: ActivityMainBinding
    private lateinit var landMarkList: ArrayList<LandMark>
    // add data to the list

    val city = LandMark("Ayasofya", "Turkey", R.drawable.ayasofya)
    val pedro = LandMark("Eifel", "France", R.drawable.eifel)
    val witzel = LandMark("Pisa", "Italy", R.drawable.pisa)


    override fun onCreate(savedInstanceState: Bundle?) {
        // initialize binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        // set the content view to the binding root
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        // add variable to the list

        landMarkList = ArrayList<LandMark>()
        landMarkList.add(city)
        landMarkList.add(pedro)
        landMarkList.add(witzel)

        binding.recycler.layoutManager = LinearLayoutManager(this)
        val adapter = Adapter(landMarkList)
        binding.recycler.adapter = adapter

    }


    // change to DetailActivity


}