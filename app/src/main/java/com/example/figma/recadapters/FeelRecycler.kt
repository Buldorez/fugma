package com.example.figma.recadapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.figma.DataBase.feelings
import com.example.figma.R

class FeelRecycler (val context: Context, val feelings: feelings) : RecyclerView.Adapter<FeelRecycler.MyWH>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeelRecycler.MyWH {
        val root = LayoutInflater.from(context).inflate(R.layout.feel_adapter,parent,false)
        return MyWH(root)

    }
    class MyWH(ListOfView: View): RecyclerView.ViewHolder(ListOfView){
        val image: ImageView = itemView.findViewById(R.id.img_feel)
        val textView: TextView = itemView.findViewById(R.id.text_feel)

    }

    override fun onBindViewHolder(holder: FeelRecycler.MyWH, position: Int) {
        Glide.with(context).load(feelings.data[position].image).into(holder.image)
        holder.textView.text = feelings.data[position].title

    }

    override fun getItemCount(): Int {
        return feelings.data.size

    }
}