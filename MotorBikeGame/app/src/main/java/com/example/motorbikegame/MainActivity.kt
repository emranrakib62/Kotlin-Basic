package com.example.motorbikegame



import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var gameView: GameView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gameView = gameView

        buttonLeft.setOnClickListener {
            gameView.getMotorbike().setSpeed(-15) // Move left
        }

        buttonRight.setOnClickListener {
            gameView.getMotorbike().setSpeed(15) // Move right
        }
    }

    override fun onResume() {
        super.onResume()
        gameView.resume()
    }

    override fun onPause() {
        super.onPause()
        gameView.pause()
    }
}
