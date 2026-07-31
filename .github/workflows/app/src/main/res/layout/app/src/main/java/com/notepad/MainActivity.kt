package com.notepad

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // আমাদের বানানো প্রিমিয়াম ডিজাইনের লেআউটটা এখানে সেট করা হলো
        setContentView(R.layout.activity_main)

        // ডিজাইনের জিনিসগুলো কোডের সাথে লিঙ্ক করা
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val fabAdd: FloatingActionButton = findViewById(R.id.fabAdd)

        // লিস্টের স্টাইল সেট করা
        recyclerView.layoutManager = LinearLayoutManager(this)

        // প্লাস (+) বাটনে ক্লিক করলে যা হবে
        fabAdd.setOnClickListener {
            Toast.makeText(this, "নতুন নোট বা খরচের হিসাব এখানে যোগ হবে!", Toast.LENGTH_SHORT).show()
        }
    }
}