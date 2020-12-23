package com.example.kotlinexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        // 

        // String extension
        testStringExtension()
    }

    // String extension test
    fun testStringExtension() {
        var original = "Hello"
        var added = "Guys~"
        Log.d("Extension", "full sentence is ${original.plus(added)}")
    }

}

fun String.plus(word: String): String {
    return this + word
}

// Extension Test
open class Parent{
    var greeting : String = "hello"
    fun sayHello(){
        Log.d("extension(Parent)", "${greeting}")
    }
}

class Child : Parent(){
    fun myHello(){
        greeting = "Hi"
        Log.d("extension(Child)", "${greeting}")
    }
}

// Method Override Exercise
open class BaseClass {
    open fun opened(){
        Log.d("override", "This is BaseClass")
    }
    fun notOpened(){

    }
}

class ChildClass : BaseClass(){
    override fun opened() {
        Log.d("override", "This is ChildClass")
    }

}

open class BaseClass2{
    open var opened : String = "I am"
}

class ChildClass2 : BaseClass2(){
    override var opened: String = "you are"
}



