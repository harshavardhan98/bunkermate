package com.example.bunker.bunkermate;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class a0005 extends AppCompatActivity implements View.OnClickListener{

    public static int chosen=0;
    int total=0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a0005);

        GradientDrawable gd;
        SharedPreferences sharedpref,sharedpref1,sharedpref2,sharedpref3;

        final RadioButton rb1=(RadioButton) findViewById(R.id.rb1);
        final RadioButton rb2=(RadioButton) findViewById(R.id.rb2);

        final Button a1=(Button) findViewById(R.id.button);     a1.setOnClickListener(this);
        final Button a2=(Button) findViewById(R.id.button1);     a2.setOnClickListener(this);
        final Button a3=(Button) findViewById(R.id.button2);     a3.setOnClickListener(this);
        final Button a4=(Button) findViewById(R.id.button3);     a4.setOnClickListener(this);
        final Button a5=(Button) findViewById(R.id.button4);     a5.setOnClickListener(this);
        final Button a6=(Button) findViewById(R.id.button5);     a6.setOnClickListener(this);
        final Button a7=(Button) findViewById(R.id.button6);     a7.setOnClickListener(this);
        final Button a8=(Button) findViewById(R.id.button7);     a8.setOnClickListener(this);
        final Button a9=(Button) findViewById(R.id.button50);

        final Button b1 = (Button) (findViewById(R.id.but1));
        final Button b2 = (Button) (findViewById(R.id.but2));
        final Button b3 = (Button) (findViewById(R.id.but3));
        final Button b4 = (Button) (findViewById(R.id.but4));
        final Button b5 = (Button) (findViewById(R.id.but5));
        final Button b6 = (Button) (findViewById(R.id.but6));

        final TextView t1=(TextView) findViewById(R.id.sub1);
        final TextView t2=(TextView) findViewById(R.id.sub2);
        final TextView t3=(TextView) findViewById(R.id.sub3);
        final TextView t4=(TextView) findViewById(R.id.sub4);
        final TextView t5=(TextView) findViewById(R.id.sub5);
        final TextView t6=(TextView) findViewById(R.id.sub6);
        final TextView t7=(TextView) findViewById(R.id.day);

        final TextView p1=(TextView) findViewById(R.id.percent1);
        final TextView p2=(TextView) findViewById(R.id.percent2);
        final TextView p3=(TextView) findViewById(R.id.percent3);
        final TextView p4=(TextView) findViewById(R.id.percent4);
        final TextView p5=(TextView) findViewById(R.id.percent5);
        final TextView p6=(TextView) findViewById(R.id.percent6);

        sharedpref1=getSharedPreferences("timetable_color", Context.MODE_PRIVATE);
        Date d=new java.util.Date();
        String date=(d.toString()).substring(0,3);

        t7.setText(date);
        gd=(GradientDrawable) a1.getBackground().mutate();      gd.setColor(sharedpref1.getInt(date+0,0));
        gd=(GradientDrawable) a2.getBackground().mutate();      gd.setColor(sharedpref1.getInt(date+1,0));
        gd=(GradientDrawable) a3.getBackground().mutate();      gd.setColor(sharedpref1.getInt(date+2,0));
        gd=(GradientDrawable) a4.getBackground().mutate();      gd.setColor(sharedpref1.getInt(date+3,0));
        gd=(GradientDrawable) a5.getBackground().mutate();      gd.setColor(sharedpref1.getInt(date+4,0));
        gd=(GradientDrawable) a6.getBackground().mutate();      gd.setColor(sharedpref1.getInt(date+5,0));
        gd=(GradientDrawable) a7.getBackground().mutate();      gd.setColor(sharedpref1.getInt(date+6,0));
        gd=(GradientDrawable) a8.getBackground().mutate();      gd.setColor(sharedpref1.getInt(date+7,0));

        sharedpref3=getSharedPreferences("colors", Context.MODE_PRIVATE);
        date="sub";
        gd=(GradientDrawable) b1.getBackground().mutate();      gd.setColor(sharedpref3.getInt(date+1,0));
        gd=(GradientDrawable) b2.getBackground().mutate();      gd.setColor(sharedpref3.getInt(date+2,0));
        gd=(GradientDrawable) b3.getBackground().mutate();      gd.setColor(sharedpref3.getInt(date+3,0));
        gd=(GradientDrawable) b4.getBackground().mutate();      gd.setColor(sharedpref3.getInt(date+4,0));
        gd=(GradientDrawable) b5.getBackground().mutate();      gd.setColor(sharedpref3.getInt(date+5,0));
        gd=(GradientDrawable) b6.getBackground().mutate();      gd.setColor(sharedpref3.getInt(date+6,0));

        sharedpref=getSharedPreferences("subject", Context.MODE_PRIVATE);

        t1.setText(sharedpref.getString(date+1,null));
        t2.setText(sharedpref.getString(date+2,null));
        t3.setText(sharedpref.getString(date+3,null));
        t4.setText(sharedpref.getString(date+4,null));
        t5.setText(sharedpref.getString(date+5,null));
        t6.setText(sharedpref.getString(date+6,null));

        String total_nr=sharedpref1.getInt("total_nr",0);
        int total_dr=sharedpref1.getInt("total_dr",0);

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb1.setChecked(true);
                rb2.setChecked(false);
                chosen= Color.GREEN;
            }

        });

        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb1.setChecked(false);
                rb2.setChecked(true);
                chosen= Color.RED;
            }
        });

        a9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sharedpref1=getSharedPreferences("data",MODE_PRIVATE);
                int total_nr=sharedpref1.getInt("total_nr",0);
                int total_dr=sharedpref1.getInt("total_dr",0);
                total_nr=total_nr+(8-total);
                //float avg=((total_nr*100)/total_dr);
                //String s = Float.toString(avg);

                //a1.setText(s);
                //Toast.makeText(a0005.this, "computed check your attendance!", Toast.LENGTH_SHORT).show();
                Toast.makeText(a0005.this, Integer.toString(total_nr), Toast.LENGTH_SHORT).show();

                sharedpref=getSharedPreferences("data", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedpref.edit();
                editor.putInt("total_nr",total_nr);
                editor.putInt("total_dr",total_dr);
                editor.apply();
            }
        });
    }

    @Override
    public void onClick(View v) {
        if(chosen!=0)
        {
            GradientDrawable gd=(GradientDrawable) v.getBackground().mutate();
            gd.setColor(chosen);
            total=total+1;
        }
    }
}
