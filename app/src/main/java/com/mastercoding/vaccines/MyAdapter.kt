package com.mastercoding.vaccines

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val vaccinesList: ArrayList<VaccineModel>)
    : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

        inner class MyViewHolder(itemView: View)
            :RecyclerView.ViewHolder(itemView){
                lateinit var vaccineImage: ImageView
                lateinit var vaccineTitle: TextView

                init {
                    vaccineImage = itemView.findViewById(R.id.imageview)
                    vaccineTitle = itemView.findViewById(R.id.text1)

                    itemView.setOnClickListener(){
                        Toast.makeText(itemView.context,
                            "You choose: ${vaccinesList[adapterPosition].name}",
                            Toast.LENGTH_SHORT
                            ).show()
                    }

                }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_custom_layout,parent,false)

        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return vaccinesList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.vaccineTitle.setText(vaccinesList[position].name)
        holder.vaccineImage.setImageResource(vaccinesList[position].img)
    }

}