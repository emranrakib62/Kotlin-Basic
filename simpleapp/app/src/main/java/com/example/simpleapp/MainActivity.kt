package com.example.simpleapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val textview=findViewById<TextView>(R.id.textview)
        val editText=findViewById<EditText>(R.id.editText)
        val button=findViewById<Button>(R.id.button)


        button.setOnClickListener {
            val entername=editText.text.toString()
            val massage="welcome to $entername"
            textview.text=massage
        }
    }
}