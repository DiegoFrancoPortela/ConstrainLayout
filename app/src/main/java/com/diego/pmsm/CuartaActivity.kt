package com.diego.pmsm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CuartaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuarta)

        val anteriorActivity: Button = findViewById(R.id.boton_anterior4)
        anteriorActivity.setOnClickListener() {
            val intent = Intent(this, TerceraActivity::class.java)
            startActivity(intent)
        }
    }
}