package com.example.businesscardapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameTextView = findViewById<TextView>(R.id.nameTextView)
        val jobTitleTextView = findViewById<TextView>(R.id.jobTitleTextView)
        val emailTextView = findViewById<TextView>(R.id.emailTextView)

        // Set your information
        nameTextView.text = "Dejah Ecckles"
        jobTitleTextView.text = "Customer Service Representive"
        emailTextView.text = "dejah.ecckles@gmail.com"
    }
}
