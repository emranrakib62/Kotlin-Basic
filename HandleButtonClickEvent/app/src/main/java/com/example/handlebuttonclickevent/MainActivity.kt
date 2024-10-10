package com.example.handlebuttonclickevent

import android.annotation.SuppressLint
import android.content.Intent
import android.health.connect.datatypes.units.Length
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val button=findViewById<Button>(R.id.button)
        val buttonsend=findViewById<Button>(R.id.buttonsend)
        var editTextText=findViewById<EditText>(R.id.editTextText)
        var button2=findViewById<Button>(R.id.button2)
        var button3=findViewById<Button>(R.id.button3)


        button.setOnClickListener {
        Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()
        }
        Log.i("Mainactivity","Button was clicked")


        buttonsend.setOnClickListener {
            Toast.makeText(this,"second button cclicked",Toast.LENGTH_SHORT).show()
            var message:String=editTextText.text.toString()
            val intent= Intent(this,SecondActiv::class.java)
            intent.putExtra("user_massage",message)
            startActivity(intent)
        }



        button2.setOnClickListener {
        var message:String=editTextText.text.toString()
        val intent=Intent()
         intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.type="Text/plain"
            startActivity(Intent.createChooser(intent,"share to:"))

}


button3.setOnClickListener {
val intent=Intent(this,Hobisactivity::class.java)
    startActivity(intent)


}



    }
}