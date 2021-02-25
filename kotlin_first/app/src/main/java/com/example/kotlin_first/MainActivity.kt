package com.example.kotlin_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView2)
        val editText = findViewById<EditText>(R.id.input_text)
        val button = findViewById<Button>(R.id.button)

        textView.setText("This is changed text")
        editText.setText("welcome")

        val toast = Toast.makeText(applicationContext, editText.text.toString(),Toast.LENGTH_LONG)
        toast.setGravity(Gravity.TOP,0,0)
        toast.show()

        button.setOnClickListener(){
            Toast.makeText(this,"Button Clicked", Toast.LENGTH_LONG).show()
        }

        // alternative
       /* button.setOnClickListener(this)
             override fun onClick(view: TextView){
            }*/

    }
}