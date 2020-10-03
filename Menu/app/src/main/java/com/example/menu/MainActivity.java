package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.options,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.cse:
                Toast.makeText(getApplicationContext(),"Selection is CSE",Toast.LENGTH_LONG).show();
                return true;
            case R.id.ece:
                Toast.makeText(getApplicationContext(),"Selection is ECE",Toast.LENGTH_LONG).show();
                return true;
            case R.id.mechanical:
                Toast.makeText(getApplicationContext(),"Selection is Mechanical",Toast.LENGTH_LONG).show();
                return true;
            case R.id.civil:
                Toast.makeText(getApplicationContext(),"Selection is Civil",Toast.LENGTH_LONG).show();
                return true;
            case R.id.exit:
                finish();
                //Toast.makeText(getApplicationContext(),"Selection is Exiting",Toast.LENGTH_LONG).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}