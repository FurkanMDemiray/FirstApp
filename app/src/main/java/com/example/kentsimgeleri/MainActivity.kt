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

    val city = LandMark("Ankara", "Turkey", R.drawable.city)
    val pedro = LandMark("Pedro", "Mexico", R.drawable.pedro)
    val witzel = LandMark("Witzel", "Germany", R.drawable.witzel)
    val witzell = LandMark("Witzell", "Germany", R.drawable.witzell)


    override fun onCreate(savedInstanceState: Bundle?) {
        // initialize binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        // set the content view to the binding root
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        // add variable to the list
        landMarkList = ArrayList()

        landMarkList.add(pedro)
        landMarkList.add(city)
        landMarkList.add(witzel)
        landMarkList.add(witzell)

        binding.recycler.layoutManager = LinearLayoutManager(this)
        val adapter = Adapter(landMarkList)
        binding.recycler.adapter = adapter

    }


    // change to DetailActivity


}