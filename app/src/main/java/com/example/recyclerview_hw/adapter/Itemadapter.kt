package com.example.recyclerview_hw.adapter

import android.content.Context
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_hw.R
import com.example.recyclerview_hw.model.show


class ItemAdapter (private val context: Context, private val dataset: List<show>
): RecyclerView.Adapter<ItemAdapter.ItemViewHolder> (){

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.textView)
//        val imageView : ImageView = view.findViewById(R.id.months)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.month)
//        holder.imageView.setImageResource(item.imageId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}



