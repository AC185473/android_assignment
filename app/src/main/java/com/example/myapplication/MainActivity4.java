package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Bundle extras = getIntent().getExtras();

        String outputname = extras.getString("outputname");
        TextView showname = findViewById(R.id.showname);
        showname.setText(outputname);

        String outputdob = extras.getString("outputdob");
        TextView showdob = findViewById(R.id.showdob);
        showdob.setText(outputdob);

        String outputgender = extras.getString("outputgender");
        TextView showgender = findViewById(R.id.showgender);
        showgender.setText(outputgender);

        String outputemail = extras.getString("outputemail");
        TextView showemail = findViewById(R.id.showemail);
        showemail.setText(outputemail);

        String outputclg = extras.getString("outputclg");
        TextView showclg = findViewById(R.id.showclg);
        showclg.setText(outputclg);

        String outputqual = extras.getString("outputqual");
        TextView showqual = findViewById(R.id.showqual);
        showqual.setText(outputqual);

        String outputpercent = extras.getString("outputpercent");
        TextView showpercent = findViewById(R.id.showpercent);
        showpercent.setText(outputpercent);

        String outputskills = extras.getString("outputskills");
        TextView showskills = findViewById(R.id.showskills);
        showskills.setText(outputskills);

        String outputcert = extras.getString("outputcert");
        TextView showcert = findViewById(R.id.showcert);
        showcert.setText(outputcert);

        Button bt = findViewById(R.id.submit);
        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                Intent i= new Intent(getApplicationContext(),MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                i.putExtra("EXIT",true);
                startActivity(i);

                finishAffinity();
                System.exit(0);
            }
        });

    }

}