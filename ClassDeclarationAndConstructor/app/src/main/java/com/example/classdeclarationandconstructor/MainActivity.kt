package com.example.classdeclarationandconstructor

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
       Log.d(Tag,"onCreate: starts")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var source=person("Russel")
       var myobject=Myclass()
        Log.d(Tag,"onCreate: ends")
    }
}

class  Myclass constructor():Any(){

}

class person public  constructor(name: String):Any(){

}
class person public  constructor(name: String){

}

class Person constructor(name:String){

}

class Person(name:String){

}

class person(name:String)

