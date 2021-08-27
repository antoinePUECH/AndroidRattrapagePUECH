package com.example.androidmongoorattrapagepuech

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.androidmongoorattrapagepuech.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var userArrayList: ArrayList<Salad>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.salade, R.drawable.salademaroc,R.drawable.saladeee,R.drawable.salade,R.drawable.saladeoeufs,R.drawable.salademaroc,R.drawable.saladeee,
        )

        val name = arrayOf(
            "Salade césar",
            "Salade marocaine",
            "Salade printanière",
            "Salade chèvre chaud",
            "Salade aux oeufs dur",
            "Salade tomate mozzarrella",
            "Salade parisienne"
        )

        val ingredient = arrayOf(
            "Laitue romaine, parmesan, œuf dur, croûtons et « sauce César »",
            "Tomate , Oignon rouge coupé en carrés, Concombre, Petite poignée de coriandre ciselée",
            "tomate, poulet, oeufs, salade, huile dolive",
            "salade, tomate, semoule, poulet",
            "salade, tomate",
            "salade, poulet",
            "salade, oeufs poisson"
        )

        val price = arrayOf(
            "14€",
            "10€",
            "9€",
            "16€",
            "11€",
            "13€",
            "17€"
        )

        userArrayList = ArrayList()

        for (i in name.indices){
            val salad = Salad(name[i], ingredient[i], price[i], imageId[i])
            userArrayList.add(salad)
        }
        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this,userArrayList)
        binding.listview.setOnItemClickListener { parent, view, position, id ->

            val name = name[position]
            val ingredient = ingredient[position]
            val price = price[position]
            val imageId = imageId[position]

            val i = Intent(this, SaladActivity::class.java)
            i.putExtra("name", name)
            i.putExtra("ingredient", ingredient)
            i.putExtra("price", price)
            i.putExtra("imageId", imageId)
            startActivity(i)

        }

        val buttonIngredient = findViewById<View>(R.id.go_ingredient_button) as Button
        buttonIngredient.setOnClickListener {
            val intent = Intent(applicationContext, IngredientActivity::class.java)
            startActivity(intent)
        }
    }
}