package com.example.kotlinexercise

import android.graphics.LinearGradient
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // practice variables

        var myName = "jake"
        var myName2 : String
        var myName3 : String
        myName2 = "gwanggyu"
        myName2 = "park"
        val NAME : String = "PGG"
        Log.d("test", "myName ::: $myName myName2 ::: $myName2 name ::: $NAME")


        var myNumbers = "1, 2, 3, 4, 5, 6"
        var thisWeekNumbers = "5, 6, 7, 8, 9, 10"
        if (myNumbers == thisWeekNumbers){
            Log.d("Lotto", "You win the lottery")
        } else {
            Log.d("Lotto", "You lose the lottery")
        }

        var num = 10
        when(num){
            8 -> {
                Log.d("when", "num is not 8")
            }
            9 -> {
                Log.d("when", "num is not 9")
            }
            10 -> {
                Log.d("when", "num is 10")
            }
        }

    }
}