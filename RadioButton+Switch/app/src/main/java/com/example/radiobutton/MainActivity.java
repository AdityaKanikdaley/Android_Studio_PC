package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg1,rg2;
    RadioButton rb1,rb2;
    TextView tv;
    Button button;
    Switch aswitch;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg1=(RadioGroup)findViewById(R.id.radio1);
        rg2=(RadioGroup)findViewById(R.id.radio2);
        tv=(TextView)findViewById(R.id.result);
        button=(Button)findViewById(R.id.answer);
        aswitch=(Switch)findViewById(R.id.switch2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rid1 = rg1.getCheckedRadioButtonId();
                int rid2 = rg2.getCheckedRadioButtonId();
                rb1=(RadioButton)findViewById(rid1);
                rb2=(RadioButton)findViewById(rid2);
                String s1,s2,sfinal;
                s1=rb1.getText().toString();
                s2=rb2.getText().toString();
                sfinal=s1 + " & " + s2;
                tv.setText(sfinal);
                Toast.makeText(getApplicationContext(),sfinal,Toast.LENGTH_LONG).show();
            }
        });

        aswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(getApplicationContext(),"Switch ON",Toast.LENGTH_LONG).show();
                    //code for activating wifi, bluetooth,hotspot,etc
                }
                else{
                    Toast.makeText(getApplicationContext(),"Switch OFF",Toast.LENGTH_LONG).show();
                    //code for activating wifi, bluetooth,hotspot,etc
                }
            }
        });
    }
}