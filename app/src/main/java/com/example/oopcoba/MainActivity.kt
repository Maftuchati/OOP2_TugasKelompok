package com.example.oopcoba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Customer.setOnClickListener{
            val intent = Intent(this,CustomerActivity::class.java)
            startActivity(intent)
        }

        btn_Tanaman.setOnClickListener{
            val intent = Intent(this, TanamanActivity::class.java)
            startActivity(intent)
        }
    }
}