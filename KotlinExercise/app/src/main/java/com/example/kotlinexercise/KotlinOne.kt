package com.example.kotlinexercise

import android.util.Log

class KotlinOne(value : String) {
    init {
        Log.d("class", "Parameter from constructor is ${value}.")
    }

}