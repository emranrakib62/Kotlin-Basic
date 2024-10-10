package com.example.controlflowpart2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
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
        var result=""
        /*for(index in 0..10){
            result +=index.toString()+"\n"
        }

        for(index in 10 downTo 0){
            result +=index.toString()+"\n"
        }




        for(index in 0..10 step 2){
            result +=index.toString()+"\n"
        }

        for(index in 10 downTo 0 step 3){
            result +=index.toString()+"\n"
        }


        for(index in 0 until 10 step 3){
            result +=index.toString()+"\n"
        }

         */

val number= intArrayOf(1,2,3,4,5,6,7,8,9,10)
        val cityname= arrayOf("Dhaka","kolkata","Rajshahi")
        val countries= listOf<String>("bangladesh","india","srilanka")

     //   for(index in 0..9){
      //      result +=number[index].toString()+"\n"
     //   }



   // for(num in number){
       // result +=num.toString()+"\n"
    //}

      // for(index in number.indices){
         //  result +=number[index].toString()+"\n"
     //  }


       // for((index,value) in number.withIndex()){
        //    result +="$index:$value\n"
        //}


//for(country in countries){
  //  result +=country+"\n"
//}

        var index=10;
       // while(index>0){
         //   result +=index.toString()+"\n"
       //     index--;
      //  }

do{
    result +=index.toString()+"\n"
    index++
}while (index<10)




        var tvresult=findViewById<TextView>(R.id.tvresult)

        tvresult.text=result
    }
}