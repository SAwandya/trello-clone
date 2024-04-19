package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ToDoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_do)

        val close_btn_todo = findViewById<ImageView>(R.id.close_btn_todo)

        close_btn_todo.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        val sub_card = findViewById<LinearLayout>(R.id.sub_card)

        sub_card.setOnClickListener{
            startActivity(Intent(this, CardActivityPage::class.java))
            finish()
        }
    }
}