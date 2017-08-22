package com.abraham24.recyclerviewkotlin

import android.app.Activity
import android.content.Intent
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by KOCHOR on 8/22/2017.
 */
class CustomRecyclerAdapter : RecyclerView.Adapter<CustomRecyclerAdapter.ViewHolder> {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {

        var view = LayoutInflater.from(act).inflate(R.layout.wadah, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

        holder?.text_list?.text = nama?.get(position)
        holder?.image_list?.setImageResource(gambar?.get(position)!!)
        holder?.card_list?.setOnClickListener {
            var intent = Intent(act?.applicationContext, DetailRecycler::class.java)
            intent.putExtra("nama", nama?.get(position))
                    .putExtra("gambar", gambar?.get(position))
            act?.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {

        return nama?.size!!
    }

    var act: Activity? = null
    var nama: Array<String>? = null
    var gambar: Array<Int>? = null

    constructor(recyclerViewActivity: RecyclerViewActivity, namaArray: Array<String>, gambarArray: Array<Int>) {
        act = recyclerViewActivity
        nama = namaArray
        gambar = gambarArray
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var text_list: TextView? = itemView?.findViewById(R.id.text_wadah)
        var image_list: ImageView? = itemView?.findViewById(R.id.image_wadah)
        var card_list : CardView? = itemView?.findViewById(R.id.card_view_wadah)
    }


}