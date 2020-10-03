package com.example.intentfragmentcallmenus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


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

            case R.id.external: {
                Intent i = getPackageManager().getLaunchIntentForPackage("com.example.popupmenu");
                startActivity(i);
                Toast.makeText(getApplicationContext(),"External Activity Called !",Toast.LENGTH_LONG).show();
                }
                return true;


            case R.id.anotherAcivity: {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Internal Activity Called !",Toast.LENGTH_LONG).show();
                }
                return true;


            case R.id.frag: {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                BlankFragment blankFragment = new BlankFragment();
                fragmentTransaction.replace(R.id.fragment, blankFragment, null);
                fragmentTransaction.commit();
                Toast.makeText(getApplicationContext(),"New Fragment Called !",Toast.LENGTH_LONG).show();
                }
                return true;


            case R.id.call: {
                String number = "98765";
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                Toast.makeText(getApplicationContext(),"Calling 98765",Toast.LENGTH_LONG).show();
                }
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}