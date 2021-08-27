package com.example.androidmongoorattrapagepuech

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context : Activity, private val arrayList : ArrayList<Salad>) : ArrayAdapter<Salad>(context, R.layout.salad_list, arrayList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.salad_list, null)

        val imageView : ImageView = view.findViewById(R.id.salad_pic)
        val saladName : TextView = view.findViewById(R.id.saladName)
        val ingredient : TextView = view.findViewById(R.id.ingredient)
        val price : TextView = view.findViewById(R.id.price)

        imageView.setImageResource(arrayList[position].imageId)
        saladName.text = arrayList[position].name
        ingredient.text = arrayList[position].ingredient
        price.text = arrayList[position].price

        return view
    }
}