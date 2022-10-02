package com.hakancevik.projectoop

import android.util.Log

class Piano : HouseDecor,Instrument{

    var brand : String? = null
    var digital : Boolean? = null

    override var roomName: String
        get() = "Kitchen"
        set(value) {}

    override fun info() {
        print("This is a Piano")
        Log.d("system.out","This is a Piano")
    }

}