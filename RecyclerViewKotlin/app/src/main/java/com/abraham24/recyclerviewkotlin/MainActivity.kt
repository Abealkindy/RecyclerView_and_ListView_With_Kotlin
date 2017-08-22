package com.abraham24.recyclerviewkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_list_view.setOnClickListener {
            startActivity(Intent(applicationContext, ListViewActivity::class.java))
        }
        button_recycler_view.setOnClickListener {
            startActivity(Intent(applicationContext, RecyclerViewActivity::class.java))
        }

    }
}
