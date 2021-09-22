package com.example.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    lateinit var addButton: Button
    lateinit var subButton: Button
    lateinit var myCounter: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myCounter = findViewById(R.id.textView)
        addButton = findViewById(R.id.Add)
        subButton = findViewById(R.id.Subtraction)

        addButton.setOnClickListener(View.OnClickListener {
            Add()
        })

        subButton.setOnClickListener((View.OnClickListener {
            Subtraction()
        }))
    }

    fun Add() {
        myCounter.text = (myCounter.text.toString().toInt() + 1).toString()
    }

    fun Subtraction() {
        myCounter.text = (myCounter.text.toString().toInt() - 1).toString()

    }
}