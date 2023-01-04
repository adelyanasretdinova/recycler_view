package com.example.recyclerview

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private var itemsList: List<String>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    class ViewHolder(view:View): RecyclerView.ViewHolder(view) {
    val textView:TextView

        init {
           textView = view.findViewById(R.id.textView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = itemsList[position]

        if (position % 2 == 0) {
            holder.itemView.setBackgroundColor(Color.YELLOW)
        }
        else {
            holder.itemView.setBackgroundColor(Color.WHITE)
        }
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }
}