package com.example.fragmentinetraction

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1=findViewById<View>(R.id.btnOpen) as Button

        btn1.setOnClickListener { view ->
            startActivity(Intent(this, Home::class.java))
        }
    }
}