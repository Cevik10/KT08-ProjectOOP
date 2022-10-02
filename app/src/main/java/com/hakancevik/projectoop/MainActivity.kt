package com.hakancevik.projectoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User("Agent Smith", 41)

        Log.d("system.out", user.name.toString())
        Log.d("system.out", user.age.toString())

        user.name = "James T. Kirk"
        user.age = 35

        Log.d("system.out", user.name.toString())
        Log.d("system.out", user.age.toString())


    }

}