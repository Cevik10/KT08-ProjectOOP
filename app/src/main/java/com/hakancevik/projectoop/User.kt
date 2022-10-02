package com.hakancevik.projectoop

import android.util.Log

class User {

    // Property
    var name: String? = null
    var age: Int? = null

    // constructor and init

    constructor(name: String, age: Int) {

        this.name = name
        this.age = age

        Log.d("system.out","constructor called")

    }

    init {
        Log.d("system.out","Init called")
    }


}