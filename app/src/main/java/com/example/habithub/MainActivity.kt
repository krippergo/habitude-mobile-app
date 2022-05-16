package com.example.habithub

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var textContact: TextView
    lateinit var textShop: TextView
    lateinit var buttonStart: Button

    private lateinit var prefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        prefs = getSharedPreferences("habit", Context.MODE_PRIVATE)
        if(prefs.contains("editTextNameHabit") && prefs.contains("answerOne") && prefs.contains("answerTwo")){
            startActivity(Intent(this@MainActivity, MainActivityTwo::class.java))
            overridePendingTransition(0, 0)
        }

        initView()
        initListener()
    }

    override fun onBackPressed() {
        finishAffinity()
    }

    private fun initView() {
        textContact = findViewById(R.id.NameOfApp)
        textShop = findViewById(R.id.Shop)
        buttonStart = findViewById(R.id.ButtonStart)
    }

    private fun initListener() {
        textContact.setOnClickListener {
            startActivity(Intent(this@MainActivity, ConnectActivity::class.java))
            overridePendingTransition(0, 0)
        }
        textShop.setOnClickListener {
            startActivity(Intent(this@MainActivity, ActivityShop::class.java))
            overridePendingTransition(0, 0)
        }
        buttonStart.setOnClickListener {
            startActivity(Intent(this@MainActivity, CreateActivity::class.java))
            overridePendingTransition(0, 0)
        }
    }
}