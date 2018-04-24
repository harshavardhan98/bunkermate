package com.example.bunker.bunkermate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class a00021 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a00021);

        ImageButton b1=(ImageButton)findViewById(R.id.but1);
        ImageButton b2=(ImageButton)findViewById(R.id.back);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(getApplicationContext(),a00022.class);
                startActivity(i1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(getApplicationContext(),a0002.class);
                startActivity(i1);
            }
        });
    }
}
