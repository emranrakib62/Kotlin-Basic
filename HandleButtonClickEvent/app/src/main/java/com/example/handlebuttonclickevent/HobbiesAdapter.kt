package com.example.handlebuttonclickevent

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.handlebuttonclickevent.Supplier.hobbies



class HobbiesAdapter(context: Context, hobbies: List<Hobby>, val context: Context):RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbiesAdapter.MyViewHolder {
val View=LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: HobbiesAdapter.MyViewHolder, position: Int) {
val hobby= hobbies[position]
        holder.setData(hobby:Hobby?){
            itemView.tvTitle.text=hobby!!.title
        }
    }

    override fun getItemCount(): Int {
return hobbies.size
    }


}