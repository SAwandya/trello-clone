package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnboardActivity03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard03)

        val onboard3_next = findViewById<Button>(R.id.onboard3_next)

        onboard3_next.setOnClickListener{
            startActivity(Intent(this, IntroActivity::class.java))
            finish()
        }

        val onboard2_skip = findViewById<Button>(R.id.onboard2_skip)

        onboard2_skip.setOnClickListener{
            startActivity(Intent(this, IntroActivity::class.java))
            finish()
        }
    }
}