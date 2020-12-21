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
        var myName2: String
        var myName3: String
        myName2 = "gwanggyu"
        myName2 = "park"
        val NAME: String = "PGG"
        Log.d("test", "myName ::: $myName myName2 ::: $myName2 name ::: $NAME")


        var myNumbers = "1, 2, 3, 4, 5, 6"
        var thisWeekNumbers = "5, 6, 7, 8, 9, 10"
        if (myNumbers == thisWeekNumbers) {
            Log.d("Lotto", "You win the lottery")
        } else {
            Log.d("Lotto", "You lose the lottery")
        }
        // how to use function "when"
        var num = 10
        when (num) {
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

        when (num) {
            in 2..9 -> {
                Log.d("when", "num is not between 2 and 9")
            }
            in 10..20 -> {
                Log.d("when", "num is between 10 and 20")
            }
        }

        when {
            num == 8 -> {
                Log.d("when", "num is 8")
            }
            num == 9 -> {
                Log.d("when", "num is 9")
            }
            num == 10 -> {
                Log.d("when", "num is 10")
            }
        }

        // how to use array
        var stringArray = Array(10, { item -> "" })
        var dayArray = arrayOf("mon", "tue", "wed", "thu", "fri", "fri", "sat", "sun")
        var intArray = IntArray(10)
        intArray[0] = 100
        intArray[1] = 101
        intArray[2] = 102
        intArray[3] = 103
        intArray[4] = 104

        intArray.set(5, 105)
        intArray.set(6, 106)
        intArray.set(7, 107)
        intArray.set(8, 108)
        intArray.set(9, 109)

        var numArray = intArray[7]
        Log.d("numArray ::: ", "The number of intArray[7] is ${intArray.get(1)}")

        var numArray2 = intArray[8]
        Log.d("numArray :::", "The number of intArray[8] is $numArray2")

        // how to use list of String
        var list = mutableListOf("mon", "tue", "wed")
        Log.d("list", "today is ${list.get(2)}")

        list.add(3, "thu")
        list.add(4, "fri")

        Log.d("list", "today is ${list.get(3)} and tomorrow is ${list.get(4)}")

        // how to use map in kotlin
        var map = mutableMapOf<String, String>()
        map.put("a", "apple")
        map.put("b", "banana")
        map.put("c", "cucumber")

        Log.d("map", "I like ${map.get("a")}")
        Log.d("map", "I like ${map.get("b")}")

        // hot to use if "for" kotlin
        for (index in 1..10) {
            Log.d("For", "let's count number. Now it is ${index}")
        }

        var array = arrayOf("jan", "feb", "mar", "apr", "may", "jun")
        for (i in 0 until array.size) {
            Log.d("For", "This is a name of month : ${array.get(i)}")
        }

        //how to use function in kotlin
        fun square(x: Int): Int {
            return x * x
        }
        Log.d("square", "result is " + square(4))


        fun square2(x: Int, y: Int){
            Log.d("square2", "x+y = ${x + y}")
        }
        square2(4,5)

        fun square3():Int{
            return 5
        }
        Log.d("square3", "result is ${square3()}")


        fun testFunction(name: String, age: Int, weight: Double){
            Log.d("fun", "My name is ${name}.")
            Log.d("fun", "I am ${age} years old.")
            Log.d("fun", "My weight is ${weight}kg.")
        }

        testFunction("gwanggyu", 28, 68.4)
    }

}