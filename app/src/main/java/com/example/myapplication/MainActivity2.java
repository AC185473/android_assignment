package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button bt= findViewById(R.id.topage3);
        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V)
            {
                Intent i=new Intent(MainActivity2.this,MainActivity3.class);
                Bundle extras= getIntent().getExtras();
                i.putExtras(extras);

                EditText et_clg= findViewById(R.id.inputclg);
                String outputclg=et_clg.getText().toString();
                i.putExtra("outputclg",outputclg);

                EditText et_qual= findViewById(R.id.inputqualification);
                String outputqual=et_qual.getText().toString();
                i.putExtra("outputqual",outputqual);

                EditText et_percent= findViewById(R.id.inputpercentage);
                String outputpercent=et_percent.getText().toString();
                i.putExtra("outputpercent",outputpercent);




                startActivity(i);
            }
        });
    }
}