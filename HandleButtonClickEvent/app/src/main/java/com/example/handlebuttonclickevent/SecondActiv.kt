package com.example.handlebuttonclickevent

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActiv : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
val text1=findViewById<TextView>(R.id.text1)


        val bundle:Bundle?=intent.extras
        val msg=bundle!!.getString("user_massage")
        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show()

        text1.text=msg





    }
}