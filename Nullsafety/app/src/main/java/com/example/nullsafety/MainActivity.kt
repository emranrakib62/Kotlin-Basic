package com.example.nullsafety

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat

import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val Tag:String=javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)





      /*var nonNullname="Russel"
      var  nullablename:String? = "Russel"
        nullablename=null
        var nonNullNamevar2="jhon"
        nonNullname=nullablename?:nonNullNamevar2

       var countryName:String?=null
        countryName="Bangladesh"
        Log.d(Tag,"onCreate:  "+countryName?.toUpperCase())
*/



       var intvalue=535353
       var strvalue=intvalue as? String

       Log.d(Tag,"onCreate :"+strvalue?.toUpperCase())





    }
}