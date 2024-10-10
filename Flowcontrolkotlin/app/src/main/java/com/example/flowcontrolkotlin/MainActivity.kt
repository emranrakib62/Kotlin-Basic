package com.example.flowcontrolkotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
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


        var  listener:View.OnClickListener=View.OnClickListener { view ->
            var textView:TextView=findViewById(R.id.textView)as TextView

           if (view.id == R.id.button9) {
                textView.text = "you clicked:" + (view as Button).text
            } else if(view.id == R.id.button10){
                textView.text = "you are won the match"
            }else if(view.id == R.id.button10){
                textView.text = "wrong button"
            }else{
                textView.text="you are lost"

            }
        }

        var button9=findViewById(R.id.button9)as Button
        var button10=findViewById(R.id.button10)as Button
        var button11=findViewById(R.id.button11)as Button
        var button12=findViewById(R.id.button12)as Button

        button9.setOnClickListener { listener }
        button10.setOnClickListener { listener }
        button11.setOnClickListener { listener }
        button12.setOnClickListener { listener }

    }
}