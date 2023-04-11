package com.geminiboy.tugasdatabinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.geminiboy.tugasdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lisStudentData = arrayListOf(
            ListBerita("Titik Kumpul Tawuran", "Kamis, 30 Mar 2023 01:03 WIB", "News", R.drawable.img1),
            ListBerita("Polisi Bekuk 5 Pelaku Curanmor ", "Kamis, 30 Mar 2023 00:32 WIB", "News", R.drawable.img2),
            ListBerita("Debat Panas soal Anggota DPR ", "Rabu, 29 Mar 2023 23:10 WIB", "Politik", R.drawable.img3),
            ListBerita("Harga naik", "Rabu, 22 Mar 2023 10:00 WIB", "News", R.drawable.img4),
            ListBerita("Update Rencana Mercedes-Benz", "29/03/2023, 16:21 WIB", "Otomotif", R.drawable.img5)

            )

        val adapterStudent = BeritaAdapter(lisStudentData)

        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvBerita.layoutManager = lm
        binding.rvBerita.adapter = adapterStudent

        adapterStudent.onClik = {
            var pindah = Intent(this, DetailBerita::class.java)
            pindah.putExtra("detailBerita", it)
            startActivity(pindah)
        }
    }
}