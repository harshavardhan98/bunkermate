package com.example.bunker.bunkermate;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class a0005 extends AppCompatActivity implements View.OnClickListener{

    public static int chosen=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a0005);

        final int[] arr=new int[2];

        final RadioButton b1=(RadioButton) findViewById(R.id.rb1);
        final RadioButton b2=(RadioButton) findViewById(R.id.rb2);

        final Button a1=(Button) findViewById(R.id.button);     a1.setOnClickListener(this);
        final Button a2=(Button) findViewById(R.id.button1);     a2.setOnClickListener(this);
        final Button a3=(Button) findViewById(R.id.button2);     a3.setOnClickListener(this);
        final Button a4=(Button) findViewById(R.id.button3);     a4.setOnClickListener(this);
        final Button a5=(Button) findViewById(R.id.button4);     a5.setOnClickListener(this);
        final Button a6=(Button) findViewById(R.id.button5);     a6.setOnClickListener(this);
        final Button a7=(Button) findViewById(R.id.button6);     a7.setOnClickListener(this);
        final Button a8=(Button) findViewById(R.id.button7);     a8.setOnClickListener(this);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setChecked(true);
                b2.setChecked(false);;
                chosen= Color.GREEN;
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setChecked(false);
                b2.setChecked(true);
                chosen= Color.RED;
            }
        });

    }

    @Override
    public void onClick(View v) {
        if(chosen!=0)
        {
            GradientDrawable gd=(GradientDrawable) v.getBackground().mutate();
            gd.setColor(chosen);
        }
    }
}
