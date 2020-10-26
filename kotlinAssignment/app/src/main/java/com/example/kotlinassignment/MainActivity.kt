package com.example.kotlinassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView2)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener(){
            intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            Toast.makeText(this,"Going to 2nd Activity", Toast.LENGTH_LONG).show()
        }
    }
}