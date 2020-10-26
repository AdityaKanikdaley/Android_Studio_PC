package com.example.finalassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class registration extends AppCompatActivity {

    EditText t1,t2,t3;
    Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        // realtime DB
        Firebase.setAndroidContext(this);
        final Firebase ref = new Firebase("https://finalassignment-5081.firebaseio.com/FinalAssign");
        t1=(EditText)findViewById(R.id.emp_code);
        t2=(EditText)findViewById(R.id.company);
        t3=(EditText)findViewById(R.id.salary);
        reg=(Button)findViewById(R.id.reg);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message emp = new message("EMP CODE",t1.getText().toString());
                ref.push().setValue(emp);

                message company = new message("COMPANY",t2.getText().toString());
                ref.push().setValue(company);

                message salary = new message("SALARY",t3.getText().toString());
                ref.push().setValue(salary);

                Toast.makeText(getApplicationContext(),"Sent!",Toast.LENGTH_LONG).show();

                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        });

    }// onCreate Ends

}