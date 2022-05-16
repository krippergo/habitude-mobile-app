package com.example.habithub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ConnectActivity : AppCompatActivity() {

    lateinit var textGoToMenu: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connect)

        initView()
        initListener()
    }

    override fun onBackPressed() {
        startActivity(Intent(this@ConnectActivity, MainActivity::class.java))
        overridePendingTransition(0, 0)
    }

    private fun initView() {
        textGoToMenu = findViewById(R.id.TextGoToMenu)
    }

    private fun initListener() {
        textGoToMenu.setOnClickListener {
            startActivity(Intent(this@ConnectActivity, MainActivity::class.java))
            overridePendingTransition(0, 0)
        }
    }
}