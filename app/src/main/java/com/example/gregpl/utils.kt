package com.example.gregpl

import android.content.Context
import android.widget.Toast
import kotlin.time.Duration

fun Context.showToast(text: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this,text,duration).show()
}