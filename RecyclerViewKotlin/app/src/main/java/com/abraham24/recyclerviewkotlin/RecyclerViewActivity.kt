package com.abraham24.recyclerviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {

    var namaArray = arrayOf("Java", "Kotlin", "Dart", "Swift", "C#")
    var gambarArray = arrayOf(R.drawable.java, R.drawable.kotlin, R.drawable.dartlogo, R.drawable.swiftlogo, R.drawable.csharp)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        var recyclerAdapter = CustomRecyclerAdapter(this, namaArray, gambarArray)
        var linear = LinearLayoutManager(applicationContext)
        recycler_view_1.layoutManager = linear
        recycler_view_1.adapter = recyclerAdapter
    }
}
