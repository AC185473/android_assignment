package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt= findViewById(R.id.topage2);
        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V)
            {
                Intent i=new Intent(MainActivity.this,MainActivity2.class);

                EditText et_name=findViewById(R.id.inputname);
                String outputname=et_name.getText().toString();
                i.putExtra("outputname",outputname);

                EditText et_dob=findViewById(R.id.inputdob);
                String outputdob=et_dob.getText().toString();
                i.putExtra("outputdob",outputdob);

                EditText et_gender=findViewById(R.id.inputgender);
                String outputgender=et_gender.getText().toString();
                i.putExtra("outputgender",outputgender);

                EditText et_email=findViewById(R.id.inputemail);
                String outputemail=et_email.getText().toString();
                i.putExtra("outputemail",outputemail);

                if(TextUtils.isEmpty(outputname)){
                    et_name.setError("Name field required");
                }
                if(TextUtils.isEmpty(outputdob)){
                    et_dob.setError("DOB field required");
                }
                if(TextUtils.isEmpty(outputgender)){
                    et_gender.setError("Gender field required");
                }
                if(TextUtils.isEmpty(outputname)){
                    et_email.setError("Email field required");
                }

                startActivity(i);
            }
        });
    }


}