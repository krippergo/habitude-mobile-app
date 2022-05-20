package com.example.habithub

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityShop : AppCompatActivity() {

    lateinit var textContact: TextView
    lateinit var textBack: TextView

    lateinit var buttonOne: Button
    lateinit var buttonTwo: Button
    lateinit var buttonThree: Button

    private lateinit var prefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)

        prefs = getSharedPreferences("habit", Context.MODE_PRIVATE)
        if(prefs.contains("money")){
            val money = prefs.getInt("money", 200)
            findViewById<TextView>(R.id.Money).setText("у тебя $money хаб-коинов")
        } else {
            val editor = prefs.edit()
            editor.putInt("money", 200).apply()
            val money = prefs.getInt("money", 200)
            findViewById<TextView>(R.id.Money).setText("у тебя $money хаб-коинов")
        }

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

        buttonOne = findViewById(R.id.ButtonPhoneOne)
        buttonTwo = findViewById(R.id.ButtonPhoneTwo)
        buttonThree = findViewById(R.id.ButtonPhoneThree)
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
        buttonOne.setOnClickListener {
            if(prefs.getInt("money", 200) >= 400){
                val editor = prefs.edit()

                var money = prefs.getInt("money", 200) - 400
                editor.putInt("money", money).apply()

                var moneyNow = prefs.getInt("money", 200)

                findViewById<TextView>(R.id.Money).setText("у тебя $moneyNow хаб-коинов")

                createsSimpleDialogCool()
            } else {
                createsSimpleDialog()
            }
        }

        buttonTwo.setOnClickListener {
            if(prefs.getInt("money", 200) >= 250){
                val editor = prefs.edit()

                var money = prefs.getInt("money", 200) - 250
                editor.putInt("money", money).apply()

                var moneyNow = prefs.getInt("money", 200)

                findViewById<TextView>(R.id.Money).setText("у тебя $moneyNow хаб-коинов")

                createsSimpleDialogCool()
            } else {
                createsSimpleDialog()
            }
        }
        buttonThree.setOnClickListener {
            if(prefs.getInt("money", 200) >= 500){
                val editor = prefs.edit()

                var money = prefs.getInt("money", 200) - 500
                editor.putInt("money", money).apply()

                var moneyNow = prefs.getInt("money", 200)

                findViewById<TextView>(R.id.Money).setText("у тебя $moneyNow хаб-коинов")

                createsSimpleDialogCool()
            } else {
                createsSimpleDialog()
            }
        }
    }

    private fun createsSimpleDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Ошибка!")
        builder.setMessage("Вам не хватает хаб-коинов.")
        builder.setNegativeButton("ХОРОШО") { dialogInterface, i ->
            builder.setCancelable(false)
        }
        builder.show()
    }

    private fun createsSimpleDialogCool() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Успешно!")
        builder.setMessage("Можно играть!")
        builder.setNegativeButton("ХОРОШО") { dialogInterface, i ->
            builder.setCancelable(false)
        }
        builder.show()
    }
}