package com.example.firebase1_db;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    ImageView image, photo, update;
    ListView lv;
    message msg;
    private final int PICK_IMAGE_REQUEST = 22;
    ArrayList<String> msglist;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.listView);
        photo=(ImageView)findViewById(R.id.photo);
        update=(ImageView)findViewById(R.id.update);

        msg=new message();
        msglist=new ArrayList<String>();
        adapter=new ArrayAdapter<String>(this,R.layout.list,R.id.textView2,msglist);

        // retrieving data
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference("chat");

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot Snapshot) {
                for(DataSnapshot ds:Snapshot.getChildren()){

                    msg= ds.getValue(message.class);
                    msglist.add(msg.getName() + "\n" + msg.getMessage());
                }lv.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        // on pressing btnSelect SelectImage() is called
        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,pc_up.class);
                startActivity(intent);
            }
        });

        // on pressing update, update&delete will be called
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,delete.class);
                startActivity(i);
            }
        });

        // realtime DB
        Firebase.setAndroidContext(this);
        final Firebase ref = new Firebase("https://fir-1-db.firebaseio.com/chat");

        editText=(EditText)findViewById(R.id.editText);
        image=(ImageView)findViewById(R.id.send);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    message message = new message("Aditya",editText.getText().toString());
                    ref.push().setValue(message);
                    Toast.makeText(getApplicationContext(),"Sent!",Toast.LENGTH_LONG).show();
                    editText.setText("");
            }
        });


    } // onCreate ENDS

}