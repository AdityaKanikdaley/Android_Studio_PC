package com.example.ratingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   RatingBar rb1,rb2;
   TextView tv1,tv2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb1=(RatingBar)findViewById(R.id.ratingBar1);
        rb2=(RatingBar)findViewById(R.id.ratingBar2);
        tv1=(TextView)findViewById(R.id.textView3);
        tv2=(TextView)findViewById(R.id.textView5);

        rb1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
        @Override
          public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                tv1.setText(String.valueOf(v));
            Toast.makeText(getApplicationContext(),String.valueOf(v),Toast.LENGTH_LONG).show();
          }
        });

        rb2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                tv2.setText(String.valueOf(v));
                Toast.makeText(getApplicationContext(), String.valueOf(v), Toast.LENGTH_LONG).show();
            }
        });

    }
}