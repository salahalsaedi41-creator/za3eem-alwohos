package com.zaeem.alwohoosh

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.view.Gravity
import android.graphics.Color

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "زعيم الوحوش شغال! 🔥"
        tv.textSize = 28f
        tv.setTextColor(Color.WHITE)
        tv.setBackgroundColor(Color.BLACK)
        tv.gravity = Gravity.CENTER
        setContentView(tv)
    }
}
