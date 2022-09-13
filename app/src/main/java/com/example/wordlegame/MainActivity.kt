package com.example.wordlegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.wordlegame.FourLetterWordList.FourLetterWordList.getRandomFourLetterWord

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpleEditText = findViewById<TextView>(R.id.Guess_ch) as EditText
        val strValue = simpleEditText.text.toString()







    }
    private fun checkGuess(guess: String) : String {
        var result = ""
        for (i in 0..3) {
            if (guess[i] == getRandomFourLetterWord()[i]) {
                result += "O"
            }
            else if (guess[i] in getRandomFourLetterWord()) {
                result += "+"
            }
            else {
                result += "X"
            }
        }
        return result
    }
}