package com.example.listviewusingarray

import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.nfc.Tag
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import com.google.android.material.tabs.TabLayout.Tab

class MainActivity : AppCompatActivity() {

    private  val  TAG:String=javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var  countries= mutableListOf<String>("Bangladesh","india","pakistan","nepal","bhutan")

        val listview=findViewById<ListView>(R.id.listview)
        val adapter=ArrayAdapter<String>(applicationContext,android.R.layout.simple_list_item_1,countries)
        listview.adapter=adapter

        var edittext=findViewById<EditText>(R.id.editText)

findViewById<Button>(R.id.button).setOnClickListener {
    var countryvalue=edittext.text.toString()

if(countryvalue.isNullOrBlank()){
        adapter.add(countryvalue)
    adapter.notifyDataSetChanged()
    edittext.setText("")
    }
}


    }
}