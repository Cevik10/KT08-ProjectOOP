package com.hakancevik.projectoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // constructor
        val myUser = User("Agent Smith", 41)

        Log.d("system.out", myUser.name.toString())
        Log.d("system.out", myUser.age.toString())

        myUser.name = "James T. Kirk"
        myUser.age = 35

        Log.d("system.out", myUser.name.toString())
        Log.d("system.out", myUser.age.toString())


        // encapsulation
        val frankSinatra = Musician("Frank Sinatra", "Guitar", 57)
        frankSinatra.musicInstrument = "Piano"
        Log.d("system.out", frankSinatra.singSong("opera"))
        Log.d("system.out", frankSinatra.singSong("play"))


        // Inheritance
        val engelbert = SuperMusician("Engel Humperdinck", "Trumpet", 86)

        Log.d("system.out", engelbert.dance())
        Log.d("system.out", engelbert.singSong("opera"))
        Log.d("system.out", engelbert.name.toString())


        // Polymorphism

        // Static Polymorphism (overloading)
        val myMath = Mathematics()
        Log.d("system.out", myMath.sum().toString())
        Log.d("system.out", myMath.sum(17321, 2443).toString())
        Log.d("system.out", myMath.sum(12354, 342, 46898).toString())

        // Dynamic Polymorphism (overriding)




    }

}