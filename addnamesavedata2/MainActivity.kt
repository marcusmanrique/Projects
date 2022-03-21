package com.example.addnamesavedata2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myBtn = findViewById<Button>(R.id.myBtn)
        val myTxt = findViewById<TextView>(R.id.MyTextView)
        myTxt.text = "Text is changed on button click..."
        val input = findViewById<EditText>(R.id.name)


        myBtn.setOnClickListener {
            Toast.makeText(this, "Button is clicked", Toast.LENGTH_LONG).show()
            myTxt.text = input.text
        }
    }
}