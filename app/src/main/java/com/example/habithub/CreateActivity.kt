package com.example.habithub

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.content.SharedPreferences

class CreateActivity : AppCompatActivity() {

    lateinit var textContact: TextView
    lateinit var goOfUrl: TextView
    lateinit var goToMenu: Button
    lateinit var buttonCreate: Button

    lateinit var editTextNameHabit: EditText
    lateinit var answerOneInput: EditText
    lateinit var answerTwoInput: EditText

    private lateinit var prefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)

        prefs = getSharedPreferences("habit", Context.MODE_PRIVATE)

        initView()
        initListener()
    }

    override fun onBackPressed() {
        startActivity(Intent(this@CreateActivity, MainActivity::class.java))
        overridePendingTransition(0, 0)
    }

    private fun initView() {
        textContact = findViewById(R.id.NameOfApp)
        goToMenu = findViewById(R.id.ButtonBack)
        buttonCreate = findViewById(R.id.ButtonCreate)
        goOfUrl = findViewById(R.id.url)

        editTextNameHabit = findViewById(R.id.NameOfHabitInput)
        answerOneInput = findViewById(R.id.AnswerOneInput)
        answerTwoInput = findViewById(R.id.AnswerTwoInput)
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
            val nameHabit = "${editTextNameHabit.text}"
            val answerOne = "${answerOneInput.text}"
            val answerTwo = "${answerTwoInput.text}"

            if (nameHabit.trim().length>0) {
                if (answerOne.trim().length>0) {
                    if (answerTwo.trim().length>0) {
                        val editor = prefs.edit()
                        editor.putString("editTextNameHabit", nameHabit).apply()
                        editor.putString("answerOne", answerOne).apply()
                        editor.putString("answerTwo", answerTwo).apply()
                        editor.putInt("days", 21).apply()

                        startActivity(Intent(this@CreateActivity, MainActivityTwo::class.java))
                        overridePendingTransition(0, 0)
                    } else {
                        createsSimpleDialog()
                    }
                } else {
                    createsSimpleDialog()
                }
            } else {
                createsSimpleDialog()
            }
        }
        goOfUrl.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.wikium.ru/formirovanie-privychek.html"))
            startActivity(i)
        }
    }

    private fun createsSimpleDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Ошибка!")
        builder.setMessage("Заполните все поля.")
        builder.setNegativeButton("ХОРОШО") { dialogInterface, i ->
            builder.setCancelable(false)
        }
        builder.show()
    }
}