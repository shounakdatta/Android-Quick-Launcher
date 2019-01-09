package com.example.shounakpc.quicklauncher

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        if (intent.hasExtra("viewText")) {
            val textView = findViewById<TextView>(R.id.textView)
            val getExtraString = intent.extras.get("viewText")
            textView.text = getExtraString.toString()
        }
    }
}
