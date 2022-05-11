package com.example.habithub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ConnectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connect)
    }

    fun goToMenu(view: View){
        startActivity(Intent(this@ConnectActivity, MainActivity::class.java))
    }
}