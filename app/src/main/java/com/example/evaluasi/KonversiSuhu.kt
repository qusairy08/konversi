package com.example.evaluasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class KonversiSuhu : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi_suhu)
        supportActionBar?.title = "Konversi suhu"


        edtCelcius = findViewById(R.id.edt_celcius)
        btnCalculate = findViewById(R.id.btn_calculate)
        tvFahrenheit = findViewById(R.id.tv_Farenheit)
        tvKelvin = findViewById(R.id.tv_Kelvin)
        tvReamur = findViewById(R.id.tv_Reamur)

        btnCalculate.setOnClickListener(this)
    }

    private lateinit var edtCelcius: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvFahrenheit: TextView
    private lateinit var tvKelvin: TextView
    private lateinit var tvReamur: TextView

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_calculate) {
            val inputCelcius = edtCelcius.text.toString().trim()

            var isEmptyFields = false
            if (inputCelcius.isEmpty()) {
                isEmptyFields = true
                edtCelcius.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyFields) {
                val fahrenheit = (9 * inputCelcius.toDouble() / 5) + 32
                val reamur = 4 * inputCelcius.toDouble() / 5
                val kelvin = inputCelcius.toDouble() + 273

                tvFahrenheit.text = (fahrenheit.toString()+" Farenheit")
                tvReamur.text = (reamur.toString()+ " Reamur")
                tvKelvin.text = (kelvin.toString()+ " Kelvin")

            }
        }
    }
}