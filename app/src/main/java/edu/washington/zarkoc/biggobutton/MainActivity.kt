package edu.washington.zarkoc.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        var width = displayMetrics.widthPixels
        var height = displayMetrics.heightPixels

        val pushButton = findViewById<Button>(R.id.button)
        pushButton.layoutParams = LinearLayout.LayoutParams(width, height)
        var clickCount = 0
        pushButton.setOnClickListener {
            clickCount += 1
            if (clickCount == 1) {
                pushButton.text = "You have pushed me 1 time!"
            } else {
                pushButton.text = "You have pushed me ${clickCount} times!"
            }
        }
    }
}