package com.example.shounakpc.quicklauncher

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondActivityBtn = findViewById<Button>(R.id.secondActivityBtn)
        val googleSearchBtn = findViewById<Button>(R.id.googleBtn)

        secondActivityBtn.setOnClickListener {
            val startIntent = Intent(this, SecondActivity::class.java)
            startIntent.putExtra("viewText", "HELLO WOLRD!")
            startActivity(startIntent)
        }

        googleSearchBtn.setOnClickListener{
            val google = "https://www.google.ca"
            val webaddress = Uri.parse(google)
            val toGoogle = Intent(Intent.ACTION_VIEW, webaddress)
            if (toGoogle.resolveActivity(packageManager) !== null) {
                startActivity(toGoogle)
            }
        }
    }
}
