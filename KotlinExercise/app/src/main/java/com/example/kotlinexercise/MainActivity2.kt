package com.example.kotlinexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        testStringExtension()
        Child().sayHello()
    }

    fun testStringExtension() {
        var original = "Hello"
        var added = "Guys~"
        Log.d("Extension", "full sentence is ${original.plus(added)}")
    }

}

fun String.plus(word: String): String {
    return this + word
}

open class Parent {
    var testStr: String = "hello"
    open fun sayHello() {
        Log.d("inheritance", "${testStr}")
    }
}

class Child : Parent() {
    override fun sayHello() {
        Log.d("inheritance", "no, no, no")
    }
}