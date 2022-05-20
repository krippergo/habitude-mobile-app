package com.example.habithub

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivityTwo : AppCompatActivity() {

    lateinit var textContact: TextView
    lateinit var textShop: TextView

    lateinit var buttonOne: Button
    lateinit var buttonTwo: Button
    lateinit var buttonThree: Button
    lateinit var buttonFour: Button
    lateinit var buttonFive: Button
    lateinit var buttonSix: Button
    lateinit var buttonSeven: Button
    lateinit var buttonEight: Button
    lateinit var buttonNine: Button
    lateinit var buttonTen: Button
    lateinit var buttonEleven: Button
    lateinit var buttonTwelve: Button
    lateinit var buttonThirteen: Button
    lateinit var buttonFourteen: Button
    lateinit var buttonFifteen: Button
    lateinit var buttonSixteen: Button
    lateinit var buttonSeventeen: Button
    lateinit var buttonEighteen: Button
    lateinit var buttonNineteen: Button
    lateinit var buttonTwenty: Button
    lateinit var buttonTwentyOne: Button

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

        if(prefs.contains("editTextNameHabit") && prefs.contains("answerOne") && prefs.contains("answerTwo") && prefs.contains("days")) {
            val daysOfHabit = prefs.getInt("days", 21)
            if (daysOfHabit == 20) {
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            } else if (daysOfHabit == 19) {
                buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            } else if (daysOfHabit == 18) {
                buttonThree.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            } else if (daysOfHabit == 17) {
                buttonFour.setBackgroundColor(Color.parseColor("#243191"))
                buttonThree.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            } else if (daysOfHabit == 16) {
                buttonFive.setBackgroundColor(Color.parseColor("#243191"))
                buttonFour.setBackgroundColor(Color.parseColor("#243191"))
                buttonThree.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            } else if (daysOfHabit == 15) {
                buttonSix.setBackgroundColor(Color.parseColor("#243191"))
                buttonFive.setBackgroundColor(Color.parseColor("#243191"))
                buttonFour.setBackgroundColor(Color.parseColor("#243191"))
                buttonThree.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            } else if (daysOfHabit == 14) {
                buttonSeven.setBackgroundColor(Color.parseColor("#243191"))
                buttonSix.setBackgroundColor(Color.parseColor("#243191"))
                buttonFive.setBackgroundColor(Color.parseColor("#243191"))
                buttonFour.setBackgroundColor(Color.parseColor("#243191"))
                buttonThree.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            } else if (daysOfHabit == 13) {
                buttonEight.setBackgroundColor(Color.parseColor("#243191"))
                buttonSeven.setBackgroundColor(Color.parseColor("#243191"))
                buttonSix.setBackgroundColor(Color.parseColor("#243191"))
                buttonFive.setBackgroundColor(Color.parseColor("#243191"))
                buttonFour.setBackgroundColor(Color.parseColor("#243191"))
                buttonThree.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            } else if (daysOfHabit == 12) {
                buttonNine.setBackgroundColor(Color.parseColor("#243191"))
                buttonEight.setBackgroundColor(Color.parseColor("#243191"))
                buttonSeven.setBackgroundColor(Color.parseColor("#243191"))
                buttonSix.setBackgroundColor(Color.parseColor("#243191"))
                buttonFive.setBackgroundColor(Color.parseColor("#243191"))
                buttonFour.setBackgroundColor(Color.parseColor("#243191"))
                buttonThree.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            } else if (daysOfHabit == 11) {
                buttonTen.setBackgroundColor(Color.parseColor("#243191"))
                buttonNine.setBackgroundColor(Color.parseColor("#243191"))
                buttonEight.setBackgroundColor(Color.parseColor("#243191"))
                buttonSeven.setBackgroundColor(Color.parseColor("#243191"))
                buttonSix.setBackgroundColor(Color.parseColor("#243191"))
                buttonFive.setBackgroundColor(Color.parseColor("#243191"))
                buttonFour.setBackgroundColor(Color.parseColor("#243191"))
                buttonThree.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            } else if (daysOfHabit == 10) {
                buttonEleven.setBackgroundColor(Color.parseColor("#243191"))
                buttonTen.setBackgroundColor(Color.parseColor("#243191"))
                buttonNine.setBackgroundColor(Color.parseColor("#243191"))
                buttonEight.setBackgroundColor(Color.parseColor("#243191"))
                buttonSeven.setBackgroundColor(Color.parseColor("#243191"))
                buttonSix.setBackgroundColor(Color.parseColor("#243191"))
                buttonFive.setBackgroundColor(Color.parseColor("#243191"))
                buttonFour.setBackgroundColor(Color.parseColor("#243191"))
                buttonThree.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            } else if (daysOfHabit == 9) {
                buttonTwelve.setBackgroundColor(Color.parseColor("#243191"))
                buttonEleven.setBackgroundColor(Color.parseColor("#243191"))
                buttonTen.setBackgroundColor(Color.parseColor("#243191"))
                buttonNine.setBackgroundColor(Color.parseColor("#243191"))
                buttonEight.setBackgroundColor(Color.parseColor("#243191"))
                buttonSeven.setBackgroundColor(Color.parseColor("#243191"))
                buttonSix.setBackgroundColor(Color.parseColor("#243191"))
                buttonFive.setBackgroundColor(Color.parseColor("#243191"))
                buttonFour.setBackgroundColor(Color.parseColor("#243191"))
                buttonThree.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            } else if (daysOfHabit == 8) {
                buttonThirteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwelve.setBackgroundColor(Color.parseColor("#243191"))
                buttonEleven.setBackgroundColor(Color.parseColor("#243191"))
                buttonTen.setBackgroundColor(Color.parseColor("#243191"))
                buttonNine.setBackgroundColor(Color.parseColor("#243191"))
                buttonEight.setBackgroundColor(Color.parseColor("#243191"))
                buttonSeven.setBackgroundColor(Color.parseColor("#243191"))
                buttonSix.setBackgroundColor(Color.parseColor("#243191"))
                buttonFive.setBackgroundColor(Color.parseColor("#243191"))
                buttonFour.setBackgroundColor(Color.parseColor("#243191"))
                buttonThree.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            } else if (daysOfHabit == 7) {
                buttonFourteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonThirteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwelve.setBackgroundColor(Color.parseColor("#243191"))
                buttonEleven.setBackgroundColor(Color.parseColor("#243191"))
                buttonTen.setBackgroundColor(Color.parseColor("#243191"))
                buttonNine.setBackgroundColor(Color.parseColor("#243191"))
                buttonEight.setBackgroundColor(Color.parseColor("#243191"))
                buttonSeven.setBackgroundColor(Color.parseColor("#243191"))
                buttonSix.setBackgroundColor(Color.parseColor("#243191"))
                buttonFive.setBackgroundColor(Color.parseColor("#243191"))
                buttonFour.setBackgroundColor(Color.parseColor("#243191"))
                buttonThree.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            } else if (daysOfHabit == 6) {
                buttonFifteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonFourteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonThirteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwelve.setBackgroundColor(Color.parseColor("#243191"))
                buttonEleven.setBackgroundColor(Color.parseColor("#243191"))
                buttonTen.setBackgroundColor(Color.parseColor("#243191"))
                buttonNine.setBackgroundColor(Color.parseColor("#243191"))
                buttonEight.setBackgroundColor(Color.parseColor("#243191"))
                buttonSeven.setBackgroundColor(Color.parseColor("#243191"))
                buttonSix.setBackgroundColor(Color.parseColor("#243191"))
                buttonFive.setBackgroundColor(Color.parseColor("#243191"))
                buttonFour.setBackgroundColor(Color.parseColor("#243191"))
                buttonThree.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            } else if (daysOfHabit == 5) {
                buttonSixteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonFifteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonFourteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonThirteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwelve.setBackgroundColor(Color.parseColor("#243191"))
                buttonEleven.setBackgroundColor(Color.parseColor("#243191"))
                buttonTen.setBackgroundColor(Color.parseColor("#243191"))
                buttonNine.setBackgroundColor(Color.parseColor("#243191"))
                buttonEight.setBackgroundColor(Color.parseColor("#243191"))
                buttonSeven.setBackgroundColor(Color.parseColor("#243191"))
                buttonSix.setBackgroundColor(Color.parseColor("#243191"))
                buttonFive.setBackgroundColor(Color.parseColor("#243191"))
                buttonFour.setBackgroundColor(Color.parseColor("#243191"))
                buttonThree.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            } else if (daysOfHabit == 4) {
                buttonSeventeen.setBackgroundColor(Color.parseColor("#243191"))
                buttonSixteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonFifteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonFourteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonThirteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwelve.setBackgroundColor(Color.parseColor("#243191"))
                buttonEleven.setBackgroundColor(Color.parseColor("#243191"))
                buttonTen.setBackgroundColor(Color.parseColor("#243191"))
                buttonNine.setBackgroundColor(Color.parseColor("#243191"))
                buttonEight.setBackgroundColor(Color.parseColor("#243191"))
                buttonSeven.setBackgroundColor(Color.parseColor("#243191"))
                buttonSix.setBackgroundColor(Color.parseColor("#243191"))
                buttonFive.setBackgroundColor(Color.parseColor("#243191"))
                buttonFour.setBackgroundColor(Color.parseColor("#243191"))
                buttonThree.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            } else if (daysOfHabit == 3) {
                buttonEighteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonSeventeen.setBackgroundColor(Color.parseColor("#243191"))
                buttonSixteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonFifteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonFourteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonThirteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwelve.setBackgroundColor(Color.parseColor("#243191"))
                buttonEleven.setBackgroundColor(Color.parseColor("#243191"))
                buttonTen.setBackgroundColor(Color.parseColor("#243191"))
                buttonNine.setBackgroundColor(Color.parseColor("#243191"))
                buttonEight.setBackgroundColor(Color.parseColor("#243191"))
                buttonSeven.setBackgroundColor(Color.parseColor("#243191"))
                buttonSix.setBackgroundColor(Color.parseColor("#243191"))
                buttonFive.setBackgroundColor(Color.parseColor("#243191"))
                buttonFour.setBackgroundColor(Color.parseColor("#243191"))
                buttonThree.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            } else if (daysOfHabit == 2) {
                buttonNineteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonEighteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonSeventeen.setBackgroundColor(Color.parseColor("#243191"))
                buttonSixteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonFifteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonFourteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonThirteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwelve.setBackgroundColor(Color.parseColor("#243191"))
                buttonEleven.setBackgroundColor(Color.parseColor("#243191"))
                buttonTen.setBackgroundColor(Color.parseColor("#243191"))
                buttonNine.setBackgroundColor(Color.parseColor("#243191"))
                buttonEight.setBackgroundColor(Color.parseColor("#243191"))
                buttonSeven.setBackgroundColor(Color.parseColor("#243191"))
                buttonSix.setBackgroundColor(Color.parseColor("#243191"))
                buttonFive.setBackgroundColor(Color.parseColor("#243191"))
                buttonFour.setBackgroundColor(Color.parseColor("#243191"))
                buttonThree.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            } else if (daysOfHabit == 1) {
                buttonTwenty.setBackgroundColor(Color.parseColor("#243191"))
                buttonNineteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonEighteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonSeventeen.setBackgroundColor(Color.parseColor("#243191"))
                buttonSixteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonFifteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonFourteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonThirteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwelve.setBackgroundColor(Color.parseColor("#243191"))
                buttonEleven.setBackgroundColor(Color.parseColor("#243191"))
                buttonTen.setBackgroundColor(Color.parseColor("#243191"))
                buttonNine.setBackgroundColor(Color.parseColor("#243191"))
                buttonEight.setBackgroundColor(Color.parseColor("#243191"))
                buttonSeven.setBackgroundColor(Color.parseColor("#243191"))
                buttonSix.setBackgroundColor(Color.parseColor("#243191"))
                buttonFive.setBackgroundColor(Color.parseColor("#243191"))
                buttonFour.setBackgroundColor(Color.parseColor("#243191"))
                buttonThree.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            } else if (daysOfHabit == 0) {
                buttonTwentyOne.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwenty.setBackgroundColor(Color.parseColor("#243191"))
                buttonNineteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonEighteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonSeventeen.setBackgroundColor(Color.parseColor("#243191"))
                buttonSixteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonFifteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonFourteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonThirteen.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwelve.setBackgroundColor(Color.parseColor("#243191"))
                buttonEleven.setBackgroundColor(Color.parseColor("#243191"))
                buttonTen.setBackgroundColor(Color.parseColor("#243191"))
                buttonNine.setBackgroundColor(Color.parseColor("#243191"))
                buttonEight.setBackgroundColor(Color.parseColor("#243191"))
                buttonSeven.setBackgroundColor(Color.parseColor("#243191"))
                buttonSix.setBackgroundColor(Color.parseColor("#243191"))
                buttonFive.setBackgroundColor(Color.parseColor("#243191"))
                buttonFour.setBackgroundColor(Color.parseColor("#243191"))
                buttonThree.setBackgroundColor(Color.parseColor("#243191"))
                buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                buttonOne.setBackgroundColor(Color.parseColor("#243191"))
            }
        }
    }

    override fun onBackPressed() {
        finishAffinity()
    }

    private fun initView() {
        textContact = findViewById(R.id.NameOfApp)
        textShop = findViewById(R.id.Shop)

        buttonOne = findViewById(R.id.ButtonOne)
        buttonTwo = findViewById(R.id.ButtonTwo)
        buttonThree = findViewById(R.id.ButtonThree)
        buttonFour = findViewById(R.id.ButtonFour)
        buttonFive = findViewById(R.id.ButtonFive)
        buttonSix = findViewById(R.id.ButtonSix)
        buttonSeven = findViewById(R.id.ButtonSeven)
        buttonEight = findViewById(R.id.ButtonEight)
        buttonNine = findViewById(R.id.ButtonNine)
        buttonTen = findViewById(R.id.ButtonTen)
        buttonEleven = findViewById(R.id.ButtonEleven)
        buttonTwelve = findViewById(R.id.ButtonTwelve)
        buttonThirteen = findViewById(R.id.ButtonThirteen)
        buttonFourteen = findViewById(R.id.ButtonFourteen)
        buttonFifteen = findViewById(R.id.ButtonFifteen)
        buttonSixteen = findViewById(R.id.ButtonSixteen)
        buttonSeventeen = findViewById(R.id.ButtonSeventeen)
        buttonEighteen = findViewById(R.id.ButtonEighteen)
        buttonNineteen = findViewById(R.id.ButtonNineteen)
        buttonTwenty = findViewById(R.id.ButtonTwenty)
        buttonTwentyOne = findViewById(R.id.ButtonTwentyOne)
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
        if(prefs.contains("editTextNameHabit") && prefs.contains("answerOne") && prefs.contains("answerTwo") && prefs.contains("days")) {
            buttonOne.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 21) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonOne.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val moneyLast = prefs.getInt("money", 200)
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    createsSimpleDialog()
                }
            }

            buttonTwo.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 20) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonTwo.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    val moneyLast = prefs.getInt("money", 200)
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    createsSimpleDialog()
                }
            }

            buttonThree.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 19) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonThree.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    val moneyLast = prefs.getInt("money", 200)
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    createsSimpleDialog()
                }
            }

            buttonFour.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 18) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonFour.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    val moneyLast = prefs.getInt("money", 200)
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    createsSimpleDialog()
                }
            }

            buttonFive.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 17) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonFive.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    val moneyLast = prefs.getInt("money", 200)
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    createsSimpleDialog()
                }
            }

            buttonSix.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 16) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonSix.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    val moneyLast = prefs.getInt("money", 200)
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    createsSimpleDialog()
                }
            }

            buttonSeven.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 15) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonSeven.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    val moneyLast = prefs.getInt("money", 200)
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    createsSimpleDialog()
                }
            }

            buttonEight.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 14) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonEight.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    val moneyLast = prefs.getInt("money", 200)
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    createsSimpleDialog()
                }
            }

            buttonNine.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 13) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonNine.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    val moneyLast = prefs.getInt("money", 200)
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    createsSimpleDialog()
                }
            }

            buttonTen.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 12) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonTen.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    val moneyLast = prefs.getInt("money", 200)
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    createsSimpleDialog()
                }
            }

            buttonEleven.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 11) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonEleven.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    val moneyLast = prefs.getInt("money", 200)
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    createsSimpleDialog()
                }
            }

            buttonTwelve.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 10) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonTwelve.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    val moneyLast = prefs.getInt("money", 200)
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    createsSimpleDialog()
                }
            }

            buttonThirteen.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 9) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonThirteen.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    val moneyLast = prefs.getInt("money", 200)
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    createsSimpleDialog()
                }
            }

            buttonFourteen.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 8) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonFourteen.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    val moneyLast = prefs.getInt("money", 200)
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    createsSimpleDialog()
                }
            }

            buttonFifteen.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 7) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonFifteen.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    val moneyLast = prefs.getInt("money", 200)
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    createsSimpleDialog()
                }
            }

            buttonSixteen.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 6) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonSixteen.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    val moneyLast = prefs.getInt("money", 200)
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    createsSimpleDialog()
                }
            }

            buttonSeventeen.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 5) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonSeventeen.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    val moneyLast = prefs.getInt("money", 200)
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    createsSimpleDialog()
                }
            }

            buttonEighteen.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 4) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonEighteen.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    val moneyLast = prefs.getInt("money", 200)
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    createsSimpleDialog()
                }
            }

            buttonNineteen.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 3) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonNineteen.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    val moneyLast = prefs.getInt("money", 200)
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    createsSimpleDialog()
                }
            }

            buttonTwenty.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 2) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonTwenty.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    val moneyLast = prefs.getInt("money", 200)
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    createsSimpleDialog()
                }
            }

            buttonTwentyOne.setOnClickListener {
                val daysOfHabit = prefs.getInt("days", 21)
                if (daysOfHabit == 1) {
                    val daysOfHabitLast = daysOfHabit - 1
                    val editor = prefs.edit()
                    editor.putInt("days", daysOfHabitLast).apply()
                    buttonTwentyOne.setBackgroundColor(Color.parseColor("#243191"))
                    val money = prefs.getInt("money", 200)
                    editor.putInt("money", money + 150).apply()
                    val daysOfHabit = prefs.getInt("days", 21)
                    var dayString: String
                    if (daysOfHabit == 1 || daysOfHabit == 21) {
                        dayString = "день"
                    } else if (daysOfHabit == 2 || daysOfHabit == 3 || daysOfHabit == 4) {
                        dayString = "дня"
                    } else {
                        dayString = "дней"
                    }
                    findViewById<TextView>(R.id.daysOfComplete).setText("Дней выполнения: ${21 - daysOfHabit} $dayString")
                    findViewById<TextView>(R.id.daysOfNeedComplete).setText("До конца: $daysOfHabit $dayString")
                    val moneyLast = prefs.getInt("money", 200)
                    findViewById<TextView>(R.id.Money).setText("у тебя $moneyLast хаб-коинов")
                    editor.remove("editTextNameHabit").apply()
                    editor.remove("answerOne").apply()
                    editor.remove("answerTwo").apply()
                    editor.remove("days").apply()
                    createsSimpleDialogEnd()
                }
            }
        }
    }

    private fun createsSimpleDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Поздавляем!")
        builder.setMessage("Ваша награда 150 хаб-коинов!")
        builder.setNegativeButton("ХОРОШО") { dialogInterface, i ->
            builder.setCancelable(false)
        }
        builder.show()
    }

    private fun createsSimpleDialogEnd() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Поздавляем!")
        builder.setMessage("Ваша награда 150 хаб-коинов! Ваша привычка сформирована!")
        builder.setNegativeButton("ХОРОШО") { dialogInterface, i ->
            startActivity(Intent(this@MainActivityTwo, MainActivity::class.java))
            overridePendingTransition(0, 0)
        }
        builder.setOnCancelListener {
            startActivity(Intent(this@MainActivityTwo, MainActivity::class.java))
            overridePendingTransition(0, 0)
        }
        builder.show()
    }
}