package com.example.habithub

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ConnectActivity : AppCompatActivity() {

    lateinit var textGoToMenu: TextView

    private lateinit var prefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connect)

        prefs = getSharedPreferences("habit", Context.MODE_PRIVATE)

        initView()
        initListener()
    }

    override fun onBackPressed() {
        if(prefs.contains("editTextNameHabit") && prefs.contains("answerOne") && prefs.contains("answerTwo") && prefs.contains("days")){
            startActivity(Intent(this@ConnectActivity, MainActivityTwo::class.java))
            overridePendingTransition(0, 0)
        } else {
            startActivity(Intent(this@ConnectActivity, MainActivity::class.java))
            overridePendingTransition(0, 0)
        }
    }

    private fun initView() {
        textGoToMenu = findViewById(R.id.TextGoToMenu)
    }

    private fun initListener() {
        textGoToMenu.setOnClickListener {
            if(prefs.contains("editTextNameHabit") && prefs.contains("answerOne") && prefs.contains("answerTwo") && prefs.contains("days")){
                startActivity(Intent(this@ConnectActivity, MainActivityTwo::class.java))
                overridePendingTransition(0, 0)
            } else {
                startActivity(Intent(this@ConnectActivity, MainActivity::class.java))
                overridePendingTransition(0, 0)
            }
        }
    }
}