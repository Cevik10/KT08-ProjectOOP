package com.hakancevik.projectoop

class Musician(name: String, musicInstrument: String, age: Int) {


    // encapsulation

    var name: String? = name
        private set
        get

    var musicInstrument: String? = musicInstrument

    private var age: Int? = age


    private val bandName: String = "Fly Me To The Moon"

    fun singSong(password: String): String {
        if (password == "opera") {
            return bandName
        } else {
            return "-1"
        }

    }


}