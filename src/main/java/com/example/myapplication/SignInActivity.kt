package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)


        val btn_sign_up = findViewById<Button>(R.id.btn_sign_in)

        btn_sign_up.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

    }


}