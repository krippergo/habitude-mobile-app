package com.example.habithub

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToConnect(view: View){
        startActivity(Intent(this@MainActivity, ConnectActivity::class.java))
    }

    fun start(view: View){
        startActivity(Intent(this@MainActivity, CreateActivity::class.java))
    }

    fun goToShop(view: View){
        startActivity(Intent(this@MainActivity, ActivityShop::class.java))
    }
}