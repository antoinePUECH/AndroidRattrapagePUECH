package com.example.androidmongoorattrapagepuech

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class IngredientActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingredient)
        val buttonIngredient = findViewById<View>(R.id.orderbutton) as Button
        buttonIngredient.setOnClickListener {
            val intent = Intent(applicationContext, OrderActivity::class.java)
            startActivity(intent)
        }
    }
}