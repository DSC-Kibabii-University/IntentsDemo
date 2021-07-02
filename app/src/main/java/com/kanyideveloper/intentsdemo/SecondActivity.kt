package com.kanyideveloper.intentsdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    private lateinit var buttonToThirdActivity: Button
    private lateinit var buttonBackToMainActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        buttonBackToMainActivity = findViewById(R.id.buttonToMainActivity)
        buttonToThirdActivity = findViewById(R.id.buttonToThirdActivity)

        buttonBackToMainActivity.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            //finish() - will destroy the activity
        }

        buttonToThirdActivity.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
            //finish() - will destroy the activity
        }
    }
}