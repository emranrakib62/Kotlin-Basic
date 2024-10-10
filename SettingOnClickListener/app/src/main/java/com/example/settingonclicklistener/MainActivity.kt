package com.example.settingonclicklistener

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random as Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button:Button=findViewById(R.id.button)
        button.setOnClickListener {
            rollDice()
        }


    }

    private fun rollDice() {


       val randomInt= Random.nextInt(6) +1
       val drawableResources= when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
           else -> R.drawable.dice_6

        }


val diceImage:ImageView=findViewById(R.id.dice)
        diceImage.setImageResource(drawableResources)
    }
}