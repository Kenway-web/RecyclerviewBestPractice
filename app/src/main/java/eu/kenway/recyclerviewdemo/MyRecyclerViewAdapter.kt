package eu.kenway.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(val fruitslist: List<Fruit>) : RecyclerView.Adapter<MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layputInflater = LayoutInflater.from(parent.context)
        val listItem = layputInflater.inflate(R.layout.list_item, parent, false)
        return MyViewHolder(listItem)
    }

    // we use onBindViewHolder to display data on the list item
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val fruit=fruitslist[position]
        holder.bind(fruit)   // send data to the bind fun of ViewHolder class for setting values
        
    }

    override fun getItemCount(): Int {
        return fruitslist.size
    }
}

class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    fun bind(fruit:Fruit) {
        val myTextView = view.findViewById<TextView>(R.id.tvName)
        myTextView.text=fruit.name
    }
}