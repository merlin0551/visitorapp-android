package com.example.visitorappclg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddvisitorActivity extends AppCompatActivity {


    EditText et1,et2,et3,et4;
    Button b1,b2;
    String s1,s2,s3,s4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addvisitor);


        et1=(EditText) findViewById(R.id.fname);
        et2=(EditText) findViewById(R.id.lname);
        et3=(EditText) findViewById(R.id.purpose);
        et4=(EditText) findViewById(R.id.whomtomeet);
        b1=(Button) findViewById(R.id.submit);
        b2=(Button) findViewById(R.id.menubck);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s1=et1.getText().toString();
                s2=et2.getText().toString();
                s3=et3.getText().toString();
                s4=et4.getText().toString();
                Toast.makeText(getApplicationContext(), s1+""+s2+""+s3+""+s4 , Toast.LENGTH_SHORT).show();
            }
        });

    }
}