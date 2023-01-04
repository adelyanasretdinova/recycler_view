package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val itemsList: ArrayList<String> = ArrayList()
    private lateinit var customAdapter: CustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler)

        prepareItems()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        customAdapter = CustomAdapter(itemsList)
        recyclerView.adapter = customAdapter
    }

    private fun prepareItems() {

//        itemsList.add("London")
//        itemsList.add("Paris")
//        itemsList.add("Berlin")
//        itemsList.add("Rome")

        for (i in 0..100) {
//            print("${itemsList[i]} ")
            itemsList.add("Item number $i")
        }
    }
}