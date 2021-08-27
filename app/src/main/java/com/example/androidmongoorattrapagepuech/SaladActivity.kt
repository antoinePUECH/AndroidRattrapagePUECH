package com.example.androidmongoorattrapagepuech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidmongoorattrapagepuech.databinding.ActivitySaladBinding

class SaladActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySaladBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySaladBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val ingredient = intent.getStringExtra("ingredient")
        val price = intent.getStringExtra("price")
        val imageId = intent.getIntExtra("imageId", R.drawable.salade)

        binding.saladPic.setImageResource(imageId)
        binding.ingredient.text = ingredient
        binding.saladName.text = name
        binding.price.text = price
    }
}