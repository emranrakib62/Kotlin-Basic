package com.example.controlflowpart3

import android.nfc.Tag
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log
class MainActivity : AppCompatActivity() {
    private val Tag: String = javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(Tag, "Oncreate :starts")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

       // for (i in 1..5) {
            // if(i==3){
            //  break;
            //  }

            //if(i==3){
            // continue
            // }
            // Log.d(Tag,"onCreate i=="+i)
            // }

           /*outerloop@for (i in 1..3) {
                for (j in 1..4) {
                    if(i==2 && j==2){
                        break@outerloop
                    }
                    Log.d(Tag, "onCreate i==" + i + "j=" + j)
                }
            }



outerloop@for (i in 1..3) {
    for (j in 1..4) {
        if (i == 2 && j == 3) {
            continue@outerloop
        }
        Log.d(Tag, "onCreate i==" + i + "j=" + j)
    }

}
*/

        var i=1
        while(i<6){
            if(i%2==0){
                i++
                continue
            }


            i++
        }

        Log.d(Tag, "Oncreate :starts")

}

}
