package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class InviteMemberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_invite_member)

        val back_btn_invite = findViewById<ImageView>(R.id.back_btn_invite)

        back_btn_invite.setOnClickListener{
            startActivity(Intent(this, WorkSpaceActivity::class.java))
            finish()
        }

        val add_member = findViewById<Button>(R.id.add_member)

        add_member.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}