package com.zaeemalwohoosh.app

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.view.Gravity
import android.graphics.Color

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this)
        textView.text = "مرحبا بك في زعيم الوحوش!\nالتطبيق يشتغل! ✅"
        textView.textSize = 26f
        textView.setTextColor(Color.WHITE)
        textView.setBackgroundColor(Color.BLACK)
        textView.gravity = Gravity.CENTER
        textView.setPadding(50, 300, 50, 50)
        setContentView(textView)
    }
}
