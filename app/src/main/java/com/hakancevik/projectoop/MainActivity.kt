package com.hakancevik.projectoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myUser = User("Agent Smith", 41)

        Log.d("system.out", myUser.name.toString())
        Log.d("system.out", myUser.age.toString())

        myUser.name = "James T. Kirk"
        myUser.age = 35

        Log.d("system.out", myUser.name.toString())
        Log.d("system.out", myUser.age.toString())


        val frankSinetra = Musician("Frank Sinetra", "Guitar", 57)
        frankSinetra.musicInstrument = "Piano"
        Log.d("system.out", frankSinetra.singSong("opera"))
        Log.d("system.out", frankSinetra.singSong("play"))


    }

}