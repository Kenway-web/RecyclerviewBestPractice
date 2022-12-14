package eu.kenway.recyclerviewdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val fruitslist = listOf<Fruit>(
        Fruit("Mango", "Joe"),
        Fruit("Apple", "Alen"),
        Fruit("Bannana", "Kenway"),
        Fruit("Guava", "Venom"),
        Fruit("Orange", "Vicky")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recylerview = findViewById<RecyclerView>(R.id.recyclerView)
        recylerview.setBackgroundColor(Color.YELLOW)
        recylerview.layoutManager = LinearLayoutManager(this)


        // lambda expression as an argument for adapter
        recylerview.adapter = MyRecyclerViewAdapter(fruitslist,) { selectedItem: Fruit ->
            listItemClicked(selectedItem)
        }

    }

    private fun listItemClicked(fruit: Fruit) {
        Toast.makeText(this@MainActivity,
            "Suppliers name : ${fruit.supplier}",
            Toast.LENGTH_LONG).show()
    }
}