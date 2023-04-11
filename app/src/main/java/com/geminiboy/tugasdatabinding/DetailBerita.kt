package com.geminiboy.tugasdatabinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.geminiboy.tugasdatabinding.databinding.ActivityDetailBeritaBinding

class DetailBerita : AppCompatActivity() {

    lateinit var binding : ActivityDetailBeritaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBeritaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getDetail = intent.getSerializableExtra("detailBerita") as ListBerita
        binding.imgDetail.setImageResource(getDetail.img)
        binding.namaDetail.text=(getDetail.nama)
        binding.tvKategori.text=(getDetail.kategori)

    }
}