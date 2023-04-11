package com.geminiboy.tugasdatabinding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.geminiboy.tugasdatabinding.databinding.ItemBeritaBinding

class BeritaAdapter(var listBerita: ArrayList<ListBerita>) : RecyclerView.Adapter<BeritaAdapter.ViewHolder>() {

    var onClik : ((ListBerita)-> Unit)? = null

    class ViewHolder(var binding : ItemBeritaBinding) : RecyclerView.ViewHolder(binding.root){
        fun bindBerita(itemDate : ListBerita){
            binding.berita = itemDate
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeritaAdapter.ViewHolder {
        var view = ItemBeritaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: BeritaAdapter.ViewHolder, position: Int) {
        var dataBerita = listBerita[position]
        holder.bindBerita(listBerita[position])
        holder.binding.cardView.setOnClickListener {
            onClik?.invoke(listBerita[position])
        }
    }

    override fun getItemCount(): Int {
        return  listBerita.size
    }
}