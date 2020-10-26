package com.example.kotlinsecond

import android.content.Intent
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

        button.setOnClickListener(){
           /* val linearLayout = null
            val layout = layoutInflater.inflate(R.layout.custom_tag, linearLayout)
            val myToast = Toast(applicationContext)
            myToast.duration = Toast.LENGTH_LONG
            myToast.setGravity(Gravity.CENTER_VERTICAL,0,0)
            myToast.view = layout
            myToast.show()*/

            intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)

        }
    }
}