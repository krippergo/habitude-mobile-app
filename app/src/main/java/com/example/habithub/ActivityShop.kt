package com.example.habithub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityShop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)
    }

    fun goToConnect(view: View){
        startActivity(Intent(this@ActivityShop, ConnectActivity::class.java))
    }

    fun goToMenu(view: View){
        startActivity(Intent(this@ActivityShop, MainActivity::class.java))
    }
}