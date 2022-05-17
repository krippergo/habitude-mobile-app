package com.example.habithub

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityShop : AppCompatActivity() {

    lateinit var textContact: TextView
    lateinit var textBack: TextView

    private lateinit var prefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)

        prefs = getSharedPreferences("habit", Context.MODE_PRIVATE)

        initView()
        initListener()
    }

    override fun onBackPressed() {
        if(prefs.contains("editTextNameHabit") && prefs.contains("answerOne") && prefs.contains("answerTwo") && prefs.contains("days")){
            startActivity(Intent(this@ActivityShop, MainActivityTwo::class.java))
            overridePendingTransition(0, 0)
        } else {
            startActivity(Intent(this@ActivityShop, MainActivity::class.java))
            overridePendingTransition(0, 0)
        }
    }

    private fun initView() {
        textContact = findViewById(R.id.NameOfApp)
        textBack = findViewById(R.id.Back)
    }

    private fun initListener() {
        textContact.setOnClickListener {
            startActivity(Intent(this@ActivityShop, ConnectActivity::class.java))
            overridePendingTransition(0, 0)
        }
        textBack.setOnClickListener {
            if(prefs.contains("editTextNameHabit") && prefs.contains("answerOne") && prefs.contains("answerTwo") && prefs.contains("days")){
                startActivity(Intent(this@ActivityShop, MainActivityTwo::class.java))
                overridePendingTransition(0, 0)
            } else {
                startActivity(Intent(this@ActivityShop, MainActivity::class.java))
                overridePendingTransition(0, 0)
            }
        }
    }
}