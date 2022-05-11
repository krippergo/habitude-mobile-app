package com.example.habithub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CreateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)
    }

    fun goToConnect(view: View){
        startActivity(Intent(this@CreateActivity, ConnectActivity::class.java))
    }

    fun backMenu(view: View){
        startActivity(Intent(this@CreateActivity, MainActivity::class.java))
    }

    fun url(view: View){
        val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.wikium.ru/formirovanie-privychek.html"))
        startActivity(i)
    }
}