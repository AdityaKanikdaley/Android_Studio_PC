package com.example.intent;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {


    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = (Button)findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//************ Intent ************\\
// Explicit
//                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
//                startActivity(intent);

// Implicit
                Intent i = getPackageManager().getLaunchIntentForPackage("com.example.popupmenu");
                startActivity(i);
            }
        });
    }
}