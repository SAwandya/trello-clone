package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnboardActivity01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard01)

        val onboard1_next = findViewById<Button>(R.id.onboard1_next)

        onboard1_next.setOnClickListener{
            startActivity(Intent(this, OnboardActivity02::class.java));
            finish();
        }

        val onboard2_skip = findViewById<Button>(R.id.onboard2_skip)

        onboard2_skip.setOnClickListener{
            startActivity(Intent(this, IntroActivity::class.java))
            finish()
        }

    }
}