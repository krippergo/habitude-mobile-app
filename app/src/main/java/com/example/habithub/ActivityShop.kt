package com.example.habithub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityShop : AppCompatActivity() {

    lateinit var textContact: TextView
    lateinit var textBack: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)

        initView()
        initListener()
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
            startActivity(Intent(this@ActivityShop, MainActivity::class.java))
            overridePendingTransition(0, 0)
        }
    }
}