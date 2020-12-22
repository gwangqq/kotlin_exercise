package com.example.kotlinexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        Kotlin()

        Kotlin2("hello")

        var kotlin3 = Kotlin3()
        kotlin3.printOne()
        kotlin3.one = "changed jake"
        kotlin3.printOne()

        Kotlin4.printOne()
        Kotlin4.one = "changed gwanggyu"
        Kotlin4.printOne()

        var dataUser = DataUser("gwanggyu park", 29)
        var newUser = dataUser.copy()
        newUser.name = "jake park"
        Log.d("class", "original dataUser is ${dataUser}")
        Log.d("class", "copied dataUser is ${newUser}")

    }
}

class Kotlin() {
    init {
        Log.d("class", "Kotlin class is made")
    }
}

class Kotlin2 {
    constructor(value: String) {
        Log.d("class", "Kotlin2 class is made. ::: ${value}")
    }
}

class Kotlin3 {
    var one: String = "jake"
    fun printOne() {
        Log.d("class", "Kotlin3 class is made. ::: ${one}")
    }
}

class Kotlin4 {
    companion object {
        var one: String = "gwanggyu"
        fun printOne() {
            Log.d("class", "Kotlin3 class is made. ::: ${one}")
        }
    }
}

data class DataUser(var name : String, var age : Int)