package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val card = findViewById<CardView>(R.id.card)

        card.setOnClickListener{
            startActivity(Intent(this, ToDoActivity::class.java))
            finish()
        }

        val plus_button = findViewById<ImageView>(R.id.plus_button)

        plus_button.setOnClickListener{
            startActivity(Intent(this, CreateBoardActivity::class.java))
            finish()
        }

        val dot_three = findViewById<ImageView>(R.id.dot_three)

        dot_three.setOnClickListener{
            startActivity(Intent(this, WorkSpaceActivity::class.java))
            finish()
        }

        val profile = findViewById<ImageView>(R.id.profile)

        profile.setOnClickListener{
            startActivity(Intent(this, ProfileActivity::class.java))
            finish()
        }

    }
}