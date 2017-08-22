package com.abraham24.recyclerviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_recycler.*

class DetailRecycler : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_recycler)

        var tangkap = intent.getStringExtra("nama")
        var tangkaplagi = intent.getIntExtra("gambar", 0)

        text_detail.text = tangkap
        image_detail.setImageResource(tangkaplagi)
    }
}
