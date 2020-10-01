package com.mrwhoknows.util_fun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import com.mrwhoknows.util_fun.util.collapseKeyboardOnOutsideTap

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //    Collapse the keyboard when the user taps outside the input area
    override fun dispatchTouchEvent(motionEvent: MotionEvent): Boolean {
        collapseKeyboardOnOutsideTap(this, motionEvent, currentFocus)
        return super.dispatchTouchEvent(motionEvent)
    }
}