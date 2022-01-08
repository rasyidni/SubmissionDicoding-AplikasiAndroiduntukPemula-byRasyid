package com.example.astronomicalobject

import AstronomicalObject
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListAstronomicalObjectAdapter(private val listAstronomical: ArrayList<AstronomicalObject>) : RecyclerView.Adapter<ListAstronomicalObjectAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListAstronomicalObjectAdapter.ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_astronomicalobject, parent, false)
        return ListViewHolder(view)
    }

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: AstronomicalObject)
    }

    override fun onBindViewHolder(
        holder: ListAstronomicalObjectAdapter.ListViewHolder,
        position: Int
    ) {
        val astronomical = listAstronomical[position]
        Glide.with(holder.itemView.context)
            .load(astronomical.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = astronomical.name
        holder.tvDetail.text = astronomical.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listAstronomical[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listAstronomical.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}