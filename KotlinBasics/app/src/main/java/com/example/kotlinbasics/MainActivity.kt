package com.example.kotlinbasics

import android.nfc.Tag
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log
class MainActivity : AppCompatActivity() {
    private  val Tag:String=javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val myvaluone="hi"
        val myvaluetwo:String

        var myvalueone1="Apple"
        var myvalueone2="Orange"

Log.d(Tag,"onCreate: $myvaluone,$myvalueone2,${myvalueone1.length}")
    }
}