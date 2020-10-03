package com.example.sms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import static android.telephony.SmsManager.*;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    EditText phone, sms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.TextView1);
        phone=(EditText)findViewById(R.id.editTextPhone);
        sms=(EditText)findViewById(R.id.editTextTextPersonName);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.SEND_SMS}, PackageManager.PERMISSION_GRANTED);
                if(phone.getText().toString().isEmpty() || sms.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter valid input", Toast.LENGTH_LONG).show();
                }
                else {
                    try {
                        SmsManager smsManager= getDefault();
                        smsManager.sendTextMessage(phone.getText().toString(), null, sms.getText().toString(), null, null );
                        Toast.makeText(getApplicationContext(),"Sent Succesfuly",Toast.LENGTH_LONG).show();
                    }
                    catch (Exception e) {
                        Toast.makeText(getApplicationContext(),"Sending Failed",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}