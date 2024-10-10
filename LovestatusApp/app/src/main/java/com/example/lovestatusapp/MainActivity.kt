package com.example.lovestatusapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var  countries: Array<String> = arrayOf("\n\n1. সবাই তো খুশি চায় আর আমি তো প্রতিটা খুশিতে তোমাকে চাই",
            "2. আমি আমার প্রিয় মানুষটার প্রতি আসক্ত।",
            "3. যে থাকার সে এমনিতেই থাকবে ধরে রাখার প্রয়োজন নেই।",
            "4. আমি হাজার ভিড়ে শুধু তোমাকেই চাই।",
            "5. আমি তোমার শূন্য থেকে শেষ অব্দি থাকতে চাই প্রিয়.!!",
            "6. আমি সত্যি খুব ভাগ্যবান যে \nতোমার মত একজনকে পেয়েছি.!!",
            "7. তোমার হাসিতে আমার সুখ, তুমি আমার মন খারাপের ঔষধ",
        "8. চোখের দেখায় নয়, মনের দেখায় ভালোবাসি।\n কাছে থাকো কিংবা দূরে তোমাকেই ভালবাসি।",
        "9. হু বাধা বিপত্তি অতিক্রম করে তোমাকে পেতে চাই, যেই তুমিতে আমি ছাড়া অন্য কেউ নাই",
        "10. যে মানুষ যত বেশি গম্ভীর, সে মানুষ তত বেশি রাগী। তবে তার মধ্যে ভালোবাসাও থাকে বেশি",
        "11. বুঝলে প্রিয়! তুমি আমার জীবনের সবচেয়ে বিশেষ ও অপূর্ব ব্যক্তি।",
            "12. তুমি আমার কাছে কতটা নিখুঁত, তা কেউ কখনো জানবে না",
            "12. তুমি আমার কাছে কতটা নিখুঁত, তা কেউ কখনো জানবে না",
            "12. তুমি আমার কাছে কতটা নিখুঁত, তা কেউ কখনো জানবে না",
            "12. তুমি আমার কাছে কতটা নিখুঁত, তা কেউ কখনো জানবে না",
            "13. খুঁজে দেখো হ্রদয় মাঝে,\n" +
                    "আমি আছি স্বপ্নের সাঁজে,\n" +
                    "তোমার ওই চোখের তারায়,\n" +
                    "হাজারও স্বপ্ন এসে দাঁড়ায়,\n" +
                    "সুখের সেই স্বপ্নের মাঝে,\n" +
                    "পাবে সারাজীবন তুমি আমায় ।",
            "14. \uD83E\uDD40\uD83C\uDF41,’\uD834\uDD1E⋆⃝ \uD83E\uDD70 বুঝলে প্রিয়! তুমি আমার জীবনের সবচেয়ে বিশেষ ও অপূর্ব ব্যক্তি।“`<<-)♥\uFE0F✨\uD83E\uDE84\uD83C\uDF8B\uD83C\uDF88")

        val listview=findViewById<ListView>(R.id.listview)
        val adapter=
            ArrayAdapter<String>(applicationContext,android.R.layout.simple_list_item_1,countries)
        listview.adapter=adapter
    }
}