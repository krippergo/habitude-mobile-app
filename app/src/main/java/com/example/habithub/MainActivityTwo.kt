package com.example.habithub

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivityTwo : AppCompatActivity() {

    lateinit var textContact: TextView
    lateinit var textShop: TextView

    private lateinit var prefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_two)

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

        if(prefs.contains("editTextNameHabit") && prefs.contains("answerOne") && prefs.contains("answerTwo") && prefs.contains("days")){
            val nameHabit = prefs.getString("editTextNameHabit", "Название")
            findViewById<TextView>(R.id.nameOfHabit).setText(nameHabit)

            val daysOfHabit = prefs.getInt("days", 21)
            var dayString:String
            if(daysOfHabit == 1 || daysOfHabit == 21) {
                dayString = "день"
            } else if(daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                dayString = "дня"
            } else {
                dayString = "дней"
            }

            findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")

            findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")

            val answerOneSelect = prefs.getString("answerOne", "Ответ на вопрос")
            findViewById<TextView>(R.id.AnswerOneSelect).setText(answerOneSelect)

            val answerTwoSelect = prefs.getString("answerTwo", "Ответ на вопрос")
            findViewById<TextView>(R.id.AnswerTwoSelect).setText(answerTwoSelect)
        } else {
            startActivity(Intent(this@MainActivityTwo, MainActivity::class.java))
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
    }

    private fun initListener() {
        textContact.setOnClickListener {
            startActivity(Intent(this@MainActivityTwo, ConnectActivity::class.java))
            overridePendingTransition(0, 0)
        }
        textShop.setOnClickListener {
            startActivity(Intent(this@MainActivityTwo, ActivityShop::class.java))
            overridePendingTransition(0, 0)
        }
    }
}