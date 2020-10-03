package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button,submit;

  //  FragmentManager fragmentManager = getSupportFragmentManager();
  //  FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        submit = (Button)findViewById(R.id.button1);

      //  final FragmentManager fragmentManager = getSupportFragmentManager();
       // final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                BlankFragment blankFragment = new BlankFragment();
                fragmentTransaction.replace(R.id.fragment,blankFragment,null);
                fragmentTransaction.commit();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                BlankFragment2  blank2 = new BlankFragment2();
                fragmentTransaction.replace(R.id.fragment,blank2,null);
                fragmentTransaction.commit();
            }
        });
    }
}
