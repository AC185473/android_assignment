package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button bt= findViewById(R.id.topage4);
        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V)
            {
                Intent i= new Intent(MainActivity3.this,MainActivity4.class);
                Bundle extras= getIntent().getExtras();
                i.putExtras(extras);

                EditText et_skills= findViewById(R.id.inputskills);
                String outputskills=et_skills.getText().toString();
                i.putExtra("outputskills",outputskills);

                EditText et_cert= findViewById(R.id.inputcert);
                String outputcert=et_cert.getText().toString();
                i.putExtra("outputcert",outputcert);

                startActivity(i);
            }
        });
    }
}