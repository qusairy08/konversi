package com.example.evaluasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class KonversiRupiah : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi_rupiah)
        supportActionBar?.title = "Konversi Rupiah"

        edtRupiah = findViewById(R.id.edt_rupiah)
        btnCek = findViewById(R.id.btn_cek)
        tvResult = findViewById(R.id.tv_result)

        btnCek.setOnClickListener(this)
    }
    private lateinit var edtRupiah: EditText
    private lateinit var btnCek: Button
    private lateinit var tvResult: TextView


    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_cek) {
            val inputRupiah =edtRupiah.text.toString().trim()

            var isEmptyFields = false
            if (inputRupiah.isEmpty()){
                isEmptyFields = true
                edtRupiah.error = "Field Tidak Boleh Kosong"
            }

            if (!isEmptyFields){
                val hasil = inputRupiah.toDouble()/15000
                tvResult.text = (hasil.toString() + "$")
            }
        }
    }
}
