package eu.kenway.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(
    private val fruitslist: List<Fruit>,
    private val clickListener: (Fruit) -> Unit //unit  means not returning anything
) : RecyclerView.Adapter<MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layputInflater = LayoutInflater.from(parent.context)
        val listItem = layputInflater.inflate(R.layout.list_item, parent, false)
        return MyViewHolder(listItem)
    }

    // we use onBindViewHolder to display data on the list item
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val fruit = fruitslist[position]
        // send data to the bind fun of ViewHolder class for setting values
        holder.bind(
            fruit,
            clickListener
        )

    }

    override fun getItemCount(): Int {
        return fruitslist.size
    }
}


class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    //getting data from holder.bind(__,__)  from onBindViewHolder()
    fun bind(fruit: Fruit, clickListener: (Fruit) -> Unit) {
        val myTextView = view.findViewById<TextView>(R.id.tvName)
        myTextView.text = fruit.name
        view.setOnClickListener {
            clickListener(fruit)
        }

    }


}