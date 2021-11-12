package com.example.recyclerview

import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CustomRecyclerAdapter(private val names: List<String>,private val voice: List<String>):
    RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder>()  {

    class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        var largeTextView: TextView? = null
        var smallTextView: TextView? = null

        init {
            largeTextView = itemView.findViewById(R.id.textViewLarge)
            smallTextView = itemView.findViewById(R.id.textViewSmall)
        }

    }

      override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
          val itemView =
              LayoutInflater.from(parent.context)
                  .inflate(R.layout.recyclerview_item, parent, false)
          return MyViewHolder(itemView)
      }
      override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
          holder.largeTextView?.text = names[position]
          holder.smallTextView?.text = voice[position]
      }

      override fun getItemCount(): Int {
          return names.size
      }
  }