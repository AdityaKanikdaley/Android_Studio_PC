package com.example.gesturecontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    CheckBox c1,c2,c3,c4;
    Button b1;
    TextView tv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1=(CheckBox)findViewById(R.id.c1);
        c2=(CheckBox)findViewById(R.id.c2);
        c3=(CheckBox)findViewById(R.id.c3);
        c4=(CheckBox)findViewById(R.id.c4);

        b1=(Button)findViewById(R.id.b1);

        tv=(TextView)findViewById(R.id.result);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s="";
                if(c1.isChecked()){
                    s=s+"  " +c1.getText().toString();
                    //tv.setText(c1.getText().toString());
                    Toast.makeText(getApplicationContext(),c1.getText().toString(),Toast.LENGTH_LONG).show();
                }
                if(c2.isChecked()){
                    s=s+"  " +c2.getText().toString();
                   // tv.setText(c2.getText().toString());
                    Toast.makeText(getApplicationContext(),c2.getText().toString(),Toast.LENGTH_LONG).show();
                }
                if(c3.isChecked()){
                    s=s+"  " +c3.getText().toString();
                   // tv.setText(c3.getText().toString());
                    Toast.makeText(getApplicationContext(),c3.getText().toString(),Toast.LENGTH_LONG).show();
                }
                if(c4.isChecked()){
                    s=s+"  " +c4.getText().toString();
                   // tv.setText(c4.getText().toString());
                    Toast.makeText(getApplicationContext(),c4.getText().toString(),Toast.LENGTH_LONG).show();
                }
                tv.setText(s);
            }
        });



    }
}