package com.userstory.checkrebasegithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val x = 1 + 1
        val y = 1 + 3
        Log.e("TAG1", (x + y).toString())

        val z = x + y
    }
}