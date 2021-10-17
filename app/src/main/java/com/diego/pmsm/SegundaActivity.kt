package com.diego.pmsm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val siguienteActivity: Button = findViewById(R.id.boton_siguiente)
        siguienteActivity.setOnClickListener() {
            val intent = Intent(this, TerceraActivity::class.java)
            startActivity(intent)
        }

        val anteriorActivity: Button = findViewById(R.id.boton_anterior)
        anteriorActivity.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}