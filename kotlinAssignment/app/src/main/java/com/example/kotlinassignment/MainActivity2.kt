package com.example.kotlinassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val submit = findViewById<Button>(R.id.submit)
        val back = findViewById<Button>(R.id.back)

        submit.setOnClickListener() {
             val linearLayout = null
             val layout = layoutInflater.inflate(R.layout.custom_tag, linearLayout)
             val myToast = Toast(applicationContext)
             myToast.duration = Toast.LENGTH_LONG
             myToast.setGravity(Gravity.CENTER_VERTICAL,0,0)
             myToast.view = layout
             myToast.show()


        }

        back.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Reverting to 1st Activity", Toast.LENGTH_LONG).show()
        }
    }
}