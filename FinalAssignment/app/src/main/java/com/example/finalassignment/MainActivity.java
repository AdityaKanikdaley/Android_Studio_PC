package com.example.finalassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
            case R.id.insert:
                Intent intent = new Intent(MainActivity.this,registration.class);
                startActivity(intent);
                return true;
            case R.id.view:
                Toast.makeText(getApplicationContext(),"Selection is VIEW",Toast.LENGTH_LONG).show();
                return true;
            case R.id.delete:
                Toast.makeText(getApplicationContext(),"Selection is DELETE",Toast.LENGTH_LONG).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}