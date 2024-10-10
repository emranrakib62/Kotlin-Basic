package com.example.functioninkotlin

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private  val Tag:String=javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var result1=sum(20,30)



        Log.d(Tag,"onCreate: sum of 20 and 30 result is:$result1")

        var inta=50
        var intb=96
        Log.d(Tag,"onCreate: sum of $inta and $intb is: $(sum(inta,intb)")


        sumAnd(63,89)
        sumAnd2(500,889)

Log.d(Tag,"onCreate: max of 50 and 20 is: $(max(600,80))")


        Log.d(Tag,"onCreate: ends")
    }

    fun sum(a:Int,b:Int):Int{
       return a+b
    }


    fun sumAnd(x:Int,y:Int):Unit{
        var sum=x+y;
     Log.d(Tag,"sumAnd: sum of $x and $y is: $sum")
    }

    fun sumAnd2(x:Int,y:Int):Unit{
        var sum=x+y;
        Log.d(Tag,"sumAnd2: sum of $x and $y is: $sum")
    }

    fun max(a:Int,b:Int):Int=if(a>b)
        a else b




}