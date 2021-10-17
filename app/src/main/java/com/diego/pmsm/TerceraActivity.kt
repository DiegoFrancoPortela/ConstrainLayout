package com.diego.pmsm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TerceraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercera)

        val anteriorActivity: Button = findViewById(R.id.boton_anterior3)
        anteriorActivity.setOnClickListener() {
            val intent = Intent(this, SegundaActivity::class.java)
            startActivity(intent)
        }
    }
}