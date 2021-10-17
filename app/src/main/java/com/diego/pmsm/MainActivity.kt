package com.diego.pmsm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cambioLayoutButton: Button = findViewById(R.id.cambio_Interfaz)
        cambioLayoutButton.setOnClickListener() {
            val intent = Intent(this, SegundaActivity::class.java)
            startActivity(intent)
        }
    }
}