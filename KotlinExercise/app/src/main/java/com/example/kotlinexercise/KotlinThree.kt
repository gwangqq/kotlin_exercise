package com.example.kotlinexercise

import android.util.Log

class KotlinThree {
    companion object{
        var one: String = "Class test"
        fun printOne(){
            Log.d("class", "This is how to use class in kotlin and ${one} is the variables in Kotlin class.")
        }
    }
}