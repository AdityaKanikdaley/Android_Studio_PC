package com.example.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   Button b;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(),b);
                popupMenu.getMenuInflater().inflate(R.menu.options,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()){
                            case R.id.mad:
                                Toast.makeText(getApplicationContext(),"MAD",Toast.LENGTH_LONG).show();
                                return true;
                            case R.id.python:
                                Toast.makeText(getApplicationContext(),"Python",Toast.LENGTH_LONG).show();
                                return true;
                            case R.id.ds:
                                Toast.makeText(getApplicationContext(),"Data Structure",Toast.LENGTH_LONG).show();
                                return true;
                            case R.id.algo:
                                Toast.makeText(getApplicationContext(),"Algorithm",Toast.LENGTH_LONG).show();
                                return true;
                            case R.id.exit:
                                Toast.makeText(getApplicationContext(),"Exit",Toast.LENGTH_LONG).show();
                                return true;
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }
        });
    }
}