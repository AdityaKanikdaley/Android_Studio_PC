package com.example.calculator;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    EditText t1,t2;
    Button b1,b2,b3,b4,b5;
    TextView tv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (EditText) findViewById(R.id.num1);
        t2 = (EditText) findViewById(R.id.num2);
        b1 = (Button) findViewById(R.id.add);
        b2 = (Button) findViewById(R.id.sub);
        b3 = (Button) findViewById(R.id.multi);
        b4 = (Button) findViewById(R.id.modulo);
        b5 = (Button) findViewById(R.id.clear);
        tv = (TextView) findViewById(R.id.result);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(t1.getText().toString().isEmpty() || t2.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Enter valid number!", Toast.LENGTH_SHORT).show();
                }
                else
                    {
                    int a = Integer.parseInt(t1.getText().toString());
                    int b = Integer.parseInt(t2.getText().toString());
                    int sum = a + b;
                    tv.setText("Result= " + Integer.toString(sum));
                    Toast.makeText(getApplicationContext(),"Result = " + sum,Toast.LENGTH_LONG).show();
                    }
            }
        });

       b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(t1.getText().toString().isEmpty() || t2.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Enter valid number!", Toast.LENGTH_SHORT).show();
                }
                else {
                    int a = Integer.parseInt(t1.getText().toString());
                    int b = Integer.parseInt(t2.getText().toString());
                    int sum = a - b;
                    tv.setText("Result= " + Integer.toString(sum));
                    Toast.makeText(getApplicationContext(), "Result = " + sum, Toast.LENGTH_LONG).show();
                     }
            }
        });

       b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(t1.getText().toString().isEmpty() || t2.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Enter valid number!", Toast.LENGTH_SHORT).show();
                }
                else {
                    int a = Integer.parseInt(t1.getText().toString());
                    int b = Integer.parseInt(t2.getText().toString());
                    int sum = a * b;
                    tv.setText("Result= " + Integer.toString(sum));
                    Toast.makeText(getApplicationContext(), "Result = " + sum, Toast.LENGTH_LONG).show();
                     }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(t1.getText().toString().isEmpty() || t2.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Enter valid number!", Toast.LENGTH_SHORT).show();
                }
                else {
                    int a = Integer.parseInt(t1.getText().toString());
                    int b = Integer.parseInt(t2.getText().toString());
                    int sum = a % b;
                    tv.setText("Result= " + Integer.toString(sum));
                    Toast.makeText(getApplicationContext(), "Result = " + sum, Toast.LENGTH_LONG).show();
                     }
            }
        });

        b5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                t1.setText("");
                t2.setText("");
                Toast.makeText(getApplicationContext(), "Cleared! ", Toast.LENGTH_LONG).show();
            }
        });
    }
}