package com.abraham24.recyclerviewkotlin

import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_list_view.*
import android.os.Bundle
import android.widget.ArrayAdapter

class ListViewActivity : AppCompatActivity() {

    var dataArray = arrayOf("Java", "Kotlin", "Dart", "Swift", "C#")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        var list_view_adapter = ArrayAdapter( ListViewActivity@this, android.R.layout.simple_list_item_1, dataArray)
        list_view_1.adapter = list_view_adapter
    }
}
