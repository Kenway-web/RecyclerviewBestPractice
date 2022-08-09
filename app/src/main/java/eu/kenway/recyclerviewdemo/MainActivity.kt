package eu.kenway.recyclerviewdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val fruitslist= listOf<Fruit>(
       Fruit( "Mango","Joe"),
        Fruit("Apple","Alen"),
        Fruit("Bannana","Kenway"),
        Fruit("Guava","Venom"),
        Fruit("Orange","Vicky")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recylerview=findViewById<RecyclerView>(R.id.recyclerView)
        recylerview.setBackgroundColor(Color.YELLOW)
        recylerview.layoutManager=LinearLayoutManager(this)
        recylerview.adapter=MyRecyclerViewAdapter(fruitslist)

    }
}