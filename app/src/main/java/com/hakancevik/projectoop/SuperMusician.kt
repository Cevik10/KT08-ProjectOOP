package com.hakancevik.projectoop

class SuperMusician(name: String, musicInstrument: String, age: Int) :
    Musician(name, musicInstrument, age) {

    fun dance(): String {
        return "Lets dance everybody!"
    }


}