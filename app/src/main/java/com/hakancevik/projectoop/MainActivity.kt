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
        val engelbert = SuperMusician("Engel H.", "Trumpet", 86)

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


        // abstract class & interface
        val testUser = User("Test", 14)
        Log.d("system.out", testUser.giveInfo())
        //val personTest = Person()  classifier 'Person' does not have a companion object

        val myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = true
        myPiano.roomName
        myPiano.info()


        // Lambda expressions

        val testString = { myString: String -> print(myString) }
        print(testString("Agile10"))

        val multiplyLambda = { a: Int, b: Int -> a * b }
        print(multiplyLambda(34, 543))

        val multiplyLambda2: (Int, Int) -> Int = { a, b -> a * b }
        print(multiplyLambda2(34, 543))


        // asynchronous
        // callback function, listener function, completion function

        fun downloadMusicians(url: String, completion: (Musician) -> Unit) {

            val kirkHammett = Musician("Kirk", "Guitar", 57)
            completion(kirkHammett)

        }


        downloadMusicians("metallica.com") { musician ->
            print(musician.name)
        }


    }

}