package com.example.habithub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class CreateActivity : AppCompatActivity() {

    lateinit var textContact: TextView
    lateinit var goOfUrl: TextView
    lateinit var goToMenu: Button
    lateinit var buttonCreate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)

        initView()
        initListener()
    }

    private fun initView() {
        textContact = findViewById(R.id.NameOfApp)
        goToMenu = findViewById(R.id.ButtonBack)
        buttonCreate = findViewById(R.id.ButtonCreate)
        goOfUrl = findViewById(R.id.url)
    }

    private fun initListener() {
        textContact.setOnClickListener {
            startActivity(Intent(this@CreateActivity, ConnectActivity::class.java))
            overridePendingTransition(0, 0)
        }
        goToMenu.setOnClickListener {
            startActivity(Intent(this@CreateActivity, MainActivity::class.java))
            overridePendingTransition(0, 0)
        }
        buttonCreate.setOnClickListener {
            val editTextNameHabit = findViewById<EditText>(R.id.NameOfHabitInput)
            val textNameHabit = editTextNameHabit.text
            Toast.makeText(this,"Ваш текст $textNameHabit.", Toast.LENGTH_SHORT).show()
        }
        goOfUrl.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.wikium.ru/formirovanie-privychek.html"))
            startActivity(i)
        }
    }
}