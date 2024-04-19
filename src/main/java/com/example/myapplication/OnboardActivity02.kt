package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnboardActivity02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard02)

        val onboard2_next = findViewById<Button>(R.id.onboard2_next)

        onboard2_next.setOnClickListener{
            startActivity(Intent(this, OnboardActivity03::class.java))
            finish()
        }

        val onboard2_skip = findViewById<Button>(R.id.onboard2_skip)

        onboard2_skip.setOnClickListener{
            startActivity(Intent(this, IntroActivity::class.java))
            finish()
        }

    }
}