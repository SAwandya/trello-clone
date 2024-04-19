package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WorkSpaceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work_space)

        val close_btn_work = findViewById<ImageView>(R.id.close_btn_work)

        close_btn_work.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        val invite_btn = findViewById<Button>(R.id.invite_btn)

        invite_btn.setOnClickListener{
            startActivity(Intent(this, InviteMemberActivity::class.java))
            finish()
        }

    }
}