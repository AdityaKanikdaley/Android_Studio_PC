package com.example.alertmessage;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb;
    Button b;
    LinearLayout ll1,ll2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg=(RadioGroup)findViewById(R.id.radio1);
        b=(Button)findViewById(R.id.button1);
        ll1=(LinearLayout)findViewById(R.id.ll1);
        ll2=(LinearLayout)findViewById(R.id.ll2);

        ll1.setVisibility(View.VISIBLE);
        ll2.setVisibility(View.GONE);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=rg.getCheckedRadioButtonId();
                rb=(RadioButton)findViewById(id);

                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("You selected " + rb.getText().toString() + " Do you want to continue?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                     //  Toast.makeText(getApplicationContext(),rb.getText().toString(),Toast.LENGTH_LONG).show();
                        ll1.setVisibility(View.GONE);
                        ll2.setVisibility(View.VISIBLE);
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        builder.setCancelable(true);
                       // finish();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.setTitle("Aditya's Alert");
                alertDialog.show();
            }
        });

    }
}