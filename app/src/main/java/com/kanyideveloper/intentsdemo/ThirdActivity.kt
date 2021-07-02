package com.kanyideveloper.intentsdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {

    private lateinit var buttonBackToSecondActivity: Button
    private lateinit var buttonBackToMainActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        buttonBackToMainActivity = findViewById(R.id.buttonBackToMain)
        buttonBackToSecondActivity = findViewById(R.id.buttonBackToSecondActivity)


        buttonBackToMainActivity.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            //finish() - will destroy the activity
        }

        buttonBackToSecondActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            //finish() - will destroy the activity
        }
    }
}