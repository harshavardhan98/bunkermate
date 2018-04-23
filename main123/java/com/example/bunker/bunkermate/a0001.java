package com.example.bunker.bunkermate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class a0001 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a0001);

        Button b1=(Button) findViewById(R.id.but1);

        SharedPreferences sharedpref9=getSharedPreferences("status", Context.MODE_PRIVATE);
        final int status=sharedpref9.getInt("status",0);

        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }*/
        Date date=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("a");
        if((sdf.format(date)).equals("AM"))
            Toast.makeText(a0001.this, "Good Morning Buddy!", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(a0001.this, "Good Evening Buddy!", Toast.LENGTH_SHORT).show();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1;
                if(status!=100)
                {
                    i1=new Intent(getApplicationContext(),a0002.class);
                    startActivity(i1);
                }
                else
                {
                    i1=new Intent(getApplicationContext(),a0005.class);
                    startActivity(i1);
                }
            }
        });
    }
}
