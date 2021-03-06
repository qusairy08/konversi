package com.example.evaluasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.evaluasi.KonversiRupiah
import com.example.evaluasi.KonversiSuhu
import com.example.evaluasi.R

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "My Android"

        val btnKonRup: Button = findViewById(R.id.btn_rupiah)
        btnKonRup.setOnClickListener(this)

        val btnKonSuhu: Button = findViewById(R.id.btn_suhu)
        btnKonSuhu.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v?.id) {
            R.id.btn_rupiah -> {
                val mRupiah = Intent(this@MainActivity, KonversiRupiah::class.java)
                startActivity(mRupiah)
            }
            R.id.btn_suhu -> {
                val mSuhu = Intent(this@MainActivity, KonversiSuhu::class.java)
                startActivity(mSuhu)
            }
        }
    }
}