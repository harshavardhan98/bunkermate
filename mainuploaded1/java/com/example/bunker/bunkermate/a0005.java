package com.example.bunker.bunkermate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.*;

import java.text.DecimalFormat;
import java.util.Date;

public class a0005 extends AppCompatActivity implements View.OnClickListener{
    Date d=new java.util.Date();
    String date=(d.toString()).substring(0,3);

    public static int chosen,check=0,backButtonCount=0;
    public GradientDrawable gd;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a0005);

        String s,sub;
        SharedPreferences sharedpref, sharedpref3, sharedpref4,sharedpref7,sharedpref8, sharedprefa9;

        final RadioButton rb1 = (RadioButton) findViewById(R.id.rb1);
        final RadioButton rb2 = (RadioButton) findViewById(R.id.rb2);

        final Button a1 = (Button) findViewById(R.id.button);   a1.setOnClickListener(this);
        final Button a2 = (Button) findViewById(R.id.button1);  a2.setOnClickListener(this);
        final Button a3 = (Button) findViewById(R.id.button2);  a3.setOnClickListener(this);
        final Button a4 = (Button) findViewById(R.id.button3);  a4.setOnClickListener(this);
        final Button a5 = (Button) findViewById(R.id.button4);  a5.setOnClickListener(this);
        final Button a6 = (Button) findViewById(R.id.button5);  a6.setOnClickListener(this);
        final Button a7 = (Button) findViewById(R.id.button6);  a7.setOnClickListener(this);
        final Button a8 = (Button) findViewById(R.id.button7);  a8.setOnClickListener(this);

        final Button b1 = (Button) (findViewById(R.id.but1));
        final Button b2 = (Button) (findViewById(R.id.but2));
        final Button b3 = (Button) (findViewById(R.id.but3));
        final Button b4 = (Button) (findViewById(R.id.but4));
        final Button b5 = (Button) (findViewById(R.id.but5));
        final Button b6 = (Button) (findViewById(R.id.but6));

        final TextView t1 = (TextView) findViewById(R.id.sub1);
        final TextView t2 = (TextView) findViewById(R.id.sub2);
        final TextView t3 = (TextView) findViewById(R.id.sub3);
        final TextView t4 = (TextView) findViewById(R.id.sub4);
        final TextView t5 = (TextView) findViewById(R.id.sub5);
        final TextView t6 = (TextView) findViewById(R.id.sub6);
        final TextView t7 = (TextView) findViewById(R.id.day);

        final TextView p1 = (TextView) findViewById(R.id.percent1);
        final TextView p2 = (TextView) findViewById(R.id.percent2);
        final TextView p3 = (TextView) findViewById(R.id.percent3);
        final TextView p4 = (TextView) findViewById(R.id.percent4);
        final TextView p5 = (TextView) findViewById(R.id.percent5);
        final TextView p6 = (TextView) findViewById(R.id.percent6);

        final SharedPreferences sharedpref13 = getSharedPreferences("refresh_color", MODE_PRIVATE);
        final SharedPreferences.Editor editor13 = sharedpref13.edit();

        final CheckBox c=(CheckBox)findViewById(R.id.check1);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c.isChecked()) {
                    SharedPreferences sharedpref4, sharedpref6, sharedpref12;
                    SharedPreferences.Editor editor6, editor12;

                    gd = (GradientDrawable) a1.getBackground().mutate();
                    gd.setColor(Color.BLACK);
                    editor13.putInt("but" + 0, Color.BLACK);
                    gd = (GradientDrawable) a2.getBackground().mutate();
                    gd.setColor(Color.BLACK);
                    editor13.putInt("but" + 1, Color.BLACK);
                    gd = (GradientDrawable) a3.getBackground().mutate();
                    gd.setColor(Color.BLACK);
                    editor13.putInt("but" + 2, Color.BLACK);
                    gd = (GradientDrawable) a4.getBackground().mutate();
                    gd.setColor(Color.BLACK);
                    editor13.putInt("but" + 3, Color.BLACK);
                    gd = (GradientDrawable) a5.getBackground().mutate();
                    gd.setColor(Color.BLACK);
                    editor13.putInt("but" + 4, Color.BLACK);
                    gd = (GradientDrawable) a6.getBackground().mutate();
                    gd.setColor(Color.BLACK);
                    editor13.putInt("but" + 5, Color.BLACK);
                    gd = (GradientDrawable) a7.getBackground().mutate();
                    gd.setColor(Color.BLACK);
                    editor13.putInt("but" + 6, Color.BLACK);
                    gd = (GradientDrawable) a8.getBackground().mutate();
                    gd.setColor(Color.BLACK);
                    editor13.putInt("but" + 7, Color.BLACK);

                    String stemp;

                    sharedpref12 = getSharedPreferences("data", MODE_PRIVATE);
                    editor12 = sharedpref12.edit();
                    editor12.putInt("total_dr", sharedpref12.getInt("total_dr", 0) - 8);
                    editor12.apply();

                    sharedpref4 = getSharedPreferences("timetable", Context.MODE_PRIVATE);
                    sharedpref6 = getSharedPreferences("sub_dr", Context.MODE_PRIVATE);
                    editor6 = sharedpref6.edit();

                    stemp = sharedpref4.getString(date + 0, "");
                    editor6.putInt(stemp, sharedpref6.getInt(stemp, 0) - 1);
                    editor6.apply();

                    editor6 = sharedpref6.edit();
                    stemp = sharedpref4.getString(date + 1, "");
                    editor6.putInt(stemp, sharedpref6.getInt(stemp, 0) - 1);
                    editor6.apply();

                    editor6 = sharedpref6.edit();
                    stemp = sharedpref4.getString(date + 2, "");
                    editor6.putInt(stemp, sharedpref6.getInt(stemp, 0) - 1);
                    editor6.apply();

                    editor6 = sharedpref6.edit();
                    stemp = sharedpref4.getString(date + 3, "");
                    editor6.putInt(stemp, sharedpref6.getInt(stemp, 0) - 1);
                    editor6.apply();

                    editor6 = sharedpref6.edit();
                    stemp = sharedpref4.getString(date + 4, "");
                    editor6.putInt(stemp, sharedpref6.getInt(stemp, 0) - 1);
                    editor6.apply();

                    editor6 = sharedpref6.edit();
                    stemp = sharedpref4.getString(date + 5, "");
                    editor6.putInt(stemp, sharedpref6.getInt(stemp, 0) - 1);
                    editor6.apply();

                    editor6 = sharedpref6.edit();
                    stemp = sharedpref4.getString(date + 6, "");
                    editor6.putInt(stemp, sharedpref6.getInt(stemp, 0) - 1);
                    editor6.apply();

                    editor6 = sharedpref6.edit();
                    stemp = sharedpref4.getString(date + 7, "");
                    editor6.putInt(stemp, sharedpref6.getInt(stemp, 0) - 1);
                    editor6.apply();

                    rb1.setChecked(false);
                    rb2.setChecked(false);
                }
                else
                {
                    if (date.equals("Sun"))
                        c.setChecked(true);
                    else {
                        SharedPreferences sharedpref11 = getSharedPreferences("update_once", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor11 = sharedpref11.edit();
                        editor11.putInt("Mon", 10);
                        editor11.putInt("Tue", 20);
                        editor11.putInt("Wed", 30);
                        editor11.putInt("Thu", 40);
                        editor11.putInt("Fri", 50);
                        editor11.putInt("Sat", 60);
                        editor11.putInt("Sun", 70);
                        editor11.apply();

                        update_dr_once(date);
                        print_percent();
                        setColors();
                    }
                }
            }
        });

        t7.setText(date);
        update_dr_once(date);
        print_percent();
        setColors();

        sharedpref7 = getSharedPreferences("shortcut", Context.MODE_PRIVATE);
        sharedprefa9 = getSharedPreferences("avg", Context.MODE_PRIVATE);

        s = sharedpref7.getString("sub1", "");
        p1.setText(sharedprefa9.getString(s, ""));
        s = sharedpref7.getString("sub2", "");
        p2.setText(sharedprefa9.getString(s, ""));
        s = sharedpref7.getString("sub3", "");
        p3.setText(sharedprefa9.getString(s, ""));
        s = sharedpref7.getString("sub4", "");
        p4.setText(sharedprefa9.getString(s, ""));
        s = sharedpref7.getString("sub5", "");
        p5.setText(sharedprefa9.getString(s, ""));
        s = sharedpref7.getString("sub6", "");
        p6.setText(sharedprefa9.getString(s, ""));

        sharedpref3 = getSharedPreferences("colors", Context.MODE_PRIVATE);
        sub = "sub";

        gd = (GradientDrawable) b1.getBackground().mutate();
        gd.setColor(sharedpref3.getInt(sub + 1, 0));
        gd = (GradientDrawable) b2.getBackground().mutate();
        gd.setColor(sharedpref3.getInt(sub + 2, 0));
        gd = (GradientDrawable) b3.getBackground().mutate();
        gd.setColor(sharedpref3.getInt(sub + 3, 0));
        gd = (GradientDrawable) b4.getBackground().mutate();
        gd.setColor(sharedpref3.getInt(sub + 4, 0));
        gd = (GradientDrawable) b5.getBackground().mutate();
        gd.setColor(sharedpref3.getInt(sub + 5, 0));
        gd = (GradientDrawable) b6.getBackground().mutate();
        gd.setColor(sharedpref3.getInt(sub + 6, 0));

        sharedpref = getSharedPreferences("shortcut", Context.MODE_PRIVATE);

        t1.setText(sharedpref.getString(sub + 1, null));
        t2.setText(sharedpref.getString(sub + 2, null));
        t3.setText(sharedpref.getString(sub + 3, null));
        t4.setText(sharedpref.getString(sub + 4, null));
        t5.setText(sharedpref.getString(sub + 5, null));
        t6.setText(sharedpref.getString(sub + 6, null));

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!c.isChecked()) {
                    rb1.setChecked(true);
                    rb2.setChecked(false);
                    check = 1;
                    chosen = Color.WHITE;
                }
                else
                {
                    rb1.setChecked(false);
                    rb2.setChecked(false);
                    check = 0;
                }
            }
        });

        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!c.isChecked()) {
                    rb1.setChecked(false);
                    rb2.setChecked(true);
                    check = 2;
                    chosen = Color.GRAY;
                }
                else
                {
                    rb1.setChecked(false);
                    rb2.setChecked(false);
                    check = 0;
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        int pid;

        if (check == 0)
            pid = 0;
        else
        {
            pid = v.getId();
            if(check==1)
            {
                switch (pid) {
                    case R.id.button:
                        on_click_ck1(0, v);
                        break;
                    case R.id.button1:
                        on_click_ck1(1, v);
                        break;
                    case R.id.button2:
                        on_click_ck1(2, v);
                        break;
                    case R.id.button3:
                        on_click_ck1(3, v);
                        break;
                    case R.id.button4:
                        on_click_ck1(4, v);
                        break;
                    case R.id.button5:
                        on_click_ck1(5, v);
                        break;
                    case R.id.button6:
                        on_click_ck1(6, v);
                        break;
                    case R.id.button7:
                        on_click_ck1(7, v);
                        break;
                }
            }
            else if(check==2)
            {
                switch (pid) {
                    case R.id.button:
                        on_click_ck2(0, v);
                        break;
                    case R.id.button1:
                        on_click_ck2(1, v);
                        break;
                    case R.id.button2:
                        on_click_ck2(2, v);
                        break;
                    case R.id.button3:
                        on_click_ck2(3, v);
                        break;
                    case R.id.button4:
                        on_click_ck2(4, v);
                        break;
                    case R.id.button5:
                        on_click_ck2(5, v);
                        break;
                    case R.id.button6:
                        on_click_ck2(6, v);
                        break;
                    case R.id.button7:
                        on_click_ck2(7, v);
                        break;
                }
            }
        }
    }

    public void on_click_ck1(int i,View v) {
        SharedPreferences sharedpref3 = getSharedPreferences("timetable_color", Context.MODE_PRIVATE);
        SharedPreferences sharedpref5 = getSharedPreferences("sub_nr", MODE_PRIVATE);
        SharedPreferences sharedpref6 = getSharedPreferences("sub_dr", MODE_PRIVATE);
        SharedPreferences sharedpref8 = getSharedPreferences("avg", MODE_PRIVATE);
        SharedPreferences sharedpref9 = getSharedPreferences("bunked_colors", MODE_PRIVATE);
        SharedPreferences sharedpref10 = getSharedPreferences("first_tap", Context.MODE_PRIVATE);
        SharedPreferences sharedpref12 = getSharedPreferences("data", MODE_PRIVATE);
        SharedPreferences sharedpref13 = getSharedPreferences("refresh_color", MODE_PRIVATE);
        SharedPreferences.Editor editor5 = sharedpref5.edit();
        SharedPreferences.Editor editor6 = sharedpref6.edit();
        SharedPreferences.Editor editor8 = sharedpref8.edit();
        SharedPreferences.Editor editor9 = sharedpref9.edit();
        SharedPreferences.Editor editor10 = sharedpref10.edit();
        SharedPreferences.Editor editor12 = sharedpref12.edit();
        SharedPreferences.Editor editor13 = sharedpref13.edit();

        int b_nr, b_dr;
        String b_tmp;
        Boolean firstTap;
        Button b1;

        firstTap = sharedpref10.getBoolean("but"+i, false);
        if (firstTap == true && sharedpref13.getInt("but" + i, 0)!=Color.GRAY ) {
            firstTap = false;
            editor10.putBoolean("but"+i, firstTap);

            editor12.putInt("total_dr", sharedpref12.getInt("total_dr", 0)-1);

            gd = (GradientDrawable) v.getBackground().mutate();
            gd.setColor(chosen);
            editor13.putInt("but"+i,chosen);

            b1 = (Button) v;
            b1.setTextColor(Color.WHITE);
            b_tmp = b1.getText().toString();
            b_nr = sharedpref5.getInt(b_tmp, 0);
            b_dr = sharedpref6.getInt(b_tmp, 0);
            if (b_dr > 1) {
                b_dr=b_dr-1;
                float avg = 100-((b_nr * 100) / (float) b_dr);
                DecimalFormat formater = new DecimalFormat("#.##");
                editor8.putString(b_tmp, formater.format(avg) + "%");
                editor6.putInt(b_tmp, b_dr);
                editor9.putInt("but"+i, 1);
            }
            else
            {
                b_dr=b_dr-1;
                editor8.putString(b_tmp, "100.0%");
                editor6.putInt(b_tmp, b_dr);
                editor9.putInt("but"+i, 1);
            }
        }
        else if(sharedpref13.getInt("but" + i, 0)!=Color.GRAY ) {
            firstTap = true;
            editor10.putBoolean("but"+i, firstTap);

            editor12.putInt("total_dr", sharedpref12.getInt("total_dr", 0)+1);

            gd = (GradientDrawable) v.getBackground().mutate();
            gd.setColor(sharedpref3.getInt(date + i, 0));
            editor13.putInt("but"+i,sharedpref3.getInt(date + i, 0));

            b1 = (Button) v;
            b_tmp = b1.getText().toString();
            b_nr = sharedpref5.getInt(b_tmp, 0);
            b_dr = sharedpref6.getInt(b_tmp, 0);

            b1.setTextColor(Color.BLACK);
            b_dr = b_dr + 1;
            float avg = 100-((b_nr * 100) / (float) b_dr);
            DecimalFormat formater = new DecimalFormat("#.##");
            editor8.putString(b_tmp, formater.format(avg) + "%");
            editor6.putInt(b_tmp, b_dr);
            editor9.putInt("but" + i, 0);
        }
        editor5.apply();
        editor6.apply();
        editor8.apply();
        editor9.apply();
        editor10.apply();
        editor12.apply();
        editor13.apply();
        print_percent();
    }

    public void on_click_ck2(int i,View v) {
        SharedPreferences sharedpref3 = getSharedPreferences("timetable_color", Context.MODE_PRIVATE);
        SharedPreferences sharedpref5 = getSharedPreferences("sub_nr", MODE_PRIVATE);
        SharedPreferences sharedpref6 = getSharedPreferences("sub_dr", MODE_PRIVATE);
        SharedPreferences sharedpref8 = getSharedPreferences("avg", MODE_PRIVATE);
        SharedPreferences sharedpref9 = getSharedPreferences("bunked_colors", MODE_PRIVATE);
        SharedPreferences sharedpref10 = getSharedPreferences("first_tap2", Context.MODE_PRIVATE);
        SharedPreferences sharedpref12 = getSharedPreferences("data", MODE_PRIVATE);
        SharedPreferences sharedpref13 = getSharedPreferences("refresh_color", MODE_PRIVATE);
        SharedPreferences.Editor editor5 = sharedpref5.edit();
        SharedPreferences.Editor editor6 = sharedpref6.edit();
        SharedPreferences.Editor editor8 = sharedpref8.edit();
        SharedPreferences.Editor editor9 = sharedpref9.edit();
        SharedPreferences.Editor editor10 = sharedpref10.edit();
        SharedPreferences.Editor editor12 = sharedpref12.edit();
        SharedPreferences.Editor editor13 = sharedpref13.edit();

        int b_nr, b_dr;
        String b_tmp;
        Boolean firstTap;
        Button b1;

        firstTap = sharedpref10.getBoolean("but"+i, false);
        if (firstTap == true && sharedpref13.getInt("but" + i, 0)!=Color.WHITE ) {
            firstTap = false;
            editor10.putBoolean("but"+i, firstTap);

            editor12.putInt("total_nr", sharedpref12.getInt("total_nr", 0)+1);

            gd = (GradientDrawable) v.getBackground().mutate();
            gd.setColor(chosen);
            editor13.putInt("but"+i,chosen);

            b1 = (Button) v;
            b_tmp = b1.getText().toString();
            b_nr = sharedpref5.getInt(b_tmp, 0);
            b_dr = sharedpref6.getInt(b_tmp, 0);
            if (b_dr != 0) {
                b_nr = b_nr + 1;
                float avg = 100-((b_nr * 100) / (float) b_dr);
                DecimalFormat formater = new DecimalFormat("#.##");
                editor8.putString(b_tmp, formater.format(avg) + "%");
                editor5.putInt(b_tmp, b_nr);
                editor9.putInt("but"+i, 1);
            }
        }
        else if(sharedpref13.getInt("but" + i, 0)!=Color.WHITE ) {
            firstTap = true;
            editor10.putBoolean("but"+i, firstTap);

            editor12.putInt("total_nr", sharedpref12.getInt("total_nr", 0)-1);

            gd = (GradientDrawable) v.getBackground().mutate();
            gd.setColor(sharedpref3.getInt(date + i, 0));
            editor13.putInt("but"+i,sharedpref3.getInt(date + i, 0));

            b1 = (Button) v;
            b_tmp = b1.getText().toString();
            b_nr = sharedpref5.getInt(b_tmp, 0);
            b_dr = sharedpref6.getInt(b_tmp, 0);
            if (b_dr != 0) {
                b_nr = b_nr - 1;
                float avg = 100-((b_nr * 100) / (float) b_dr);
                DecimalFormat formater = new DecimalFormat("#.##");
                editor8.putString(b_tmp, formater.format(avg) + "%");
                editor5.putInt(b_tmp, b_nr);
                editor9.putInt("but" + i, 0);
            }
        }
        editor5.apply();
        editor6.apply();
        editor8.apply();
        editor9.apply();
        editor10.apply();
        editor12.apply();
        editor13.apply();
        print_percent();
    }

    public void update_dr_once(String date)
    {
        SharedPreferences sharedpref3,sharedpref4,sharedpref6,sharedpref11,sharedpref12;
        SharedPreferences.Editor editor3,editor6,editor11,editor12;
        final CheckBox c=(CheckBox)findViewById(R.id.check1);
        Boolean flag=false;

        sharedpref11=getSharedPreferences("update_once", Context.MODE_PRIVATE);
        editor11=sharedpref11.edit();

        int k=sharedpref11.getInt(date,0);
        if(k==10 && date.equals("Mon"))
        {
            flag=true;
            editor11.putInt("Sun",70);
            editor11.putInt(date,k+10);
        }
        else if(k==20 && date.equals("Tue"))
        {
            flag=true;
            editor11.putInt("Mon",10);
            editor11.putInt(date,k+10);
        }
        else if(k==30 && date.equals("Wed"))
        {
            flag=true;
            editor11.putInt("Tue",20);
            editor11.putInt(date,k+10);
        }
        else if(k==40 && date.equals("Thu"))
        {
            flag=true;
            editor11.putInt("Wed",30);
            editor11.putInt(date,k+10);
        }
        else if(k==50 && date.equals("Fri"))
        {
            flag=true;
            editor11.putInt("Thu",40);
            editor11.putInt(date,k+10);
        }
        else if(k==60 && date.equals("Sat"))
        {
            flag=true;
            editor11.putInt("Fri",50);
            editor11.putInt(date,k+10);
        }
        else if(k==70 && date.equals("Sun"))
        {
            flag=true;
            editor11.putInt("Sat",60);
            editor11.putInt(date,k+10);
        }
        editor11.apply();

        if(flag==true) {
            String stemp;

            sharedpref12=getSharedPreferences("data",MODE_PRIVATE);
            editor12=sharedpref12.edit();
            editor12.putInt("total_dr",sharedpref12.getInt("total_dr",0)+8);
            editor12.apply();

            sharedpref4 = getSharedPreferences("timetable", Context.MODE_PRIVATE);
            sharedpref6 = getSharedPreferences("sub_dr", Context.MODE_PRIVATE);
            editor6 = sharedpref6.edit();

            stemp = sharedpref4.getString(date + 0, "");
            editor6.putInt(stemp, sharedpref6.getInt(stemp, 0)+1);
            editor6.apply();

            editor6 = sharedpref6.edit();
            stemp = sharedpref4.getString(date + 1, "");
            editor6.putInt(stemp, sharedpref6.getInt(stemp, 0)+1);
            editor6.apply();

            editor6 = sharedpref6.edit();
            stemp = sharedpref4.getString(date + 2, "");
            editor6.putInt(stemp, sharedpref6.getInt(stemp, 0)+1);
            editor6.apply();

            editor6 = sharedpref6.edit();
            stemp = sharedpref4.getString(date + 3, "");
            editor6.putInt(stemp, sharedpref6.getInt(stemp, 0)+1);
            editor6.apply();

            editor6 = sharedpref6.edit();
            stemp = sharedpref4.getString(date + 4, "");
            editor6.putInt(stemp, sharedpref6.getInt(stemp, 0)+1);
            editor6.apply();

            editor6 = sharedpref6.edit();
            stemp = sharedpref4.getString(date + 5, "");
            editor6.putInt(stemp, sharedpref6.getInt(stemp, 0)+1);
            editor6.apply();

            editor6 = sharedpref6.edit();
            stemp = sharedpref4.getString(date + 6, "");
            editor6.putInt(stemp, sharedpref6.getInt(stemp, 0)+1);
            editor6.apply();

            editor6 = sharedpref6.edit();
            stemp = sharedpref4.getString(date + 7, "");
            editor6.putInt(stemp, sharedpref6.getInt(stemp, 0)+1);
            editor6.apply();

            sharedpref3=getSharedPreferences("refresh_color",MODE_PRIVATE);
            editor3=sharedpref3.edit();
            sharedpref6=getSharedPreferences("timetable_color",MODE_PRIVATE);
            for(int i=0;i<8;i++) {
                if(!date.equals("Sun"))
                    editor3.putInt("but" + i, sharedpref6.getInt(date + i, 0));
                else {
                    editor3.putInt("but"+i,Color.BLACK);
                    c.setChecked(true);
                }
            }
            editor3.apply();
        }
    }

    public void print_percent()
    {
        final TextView p1=(TextView) findViewById(R.id.percent1);
        final TextView p2=(TextView) findViewById(R.id.percent2);
        final TextView p3=(TextView) findViewById(R.id.percent3);
        final TextView p4=(TextView) findViewById(R.id.percent4);
        final TextView p5=(TextView) findViewById(R.id.percent5);
        final TextView p6=(TextView) findViewById(R.id.percent6);
        final Button a10=(Button) findViewById(R.id.button13);

        SharedPreferences sharedpref,sharedpref7,sharedpref12;
        sharedpref7=getSharedPreferences("avg",MODE_PRIVATE);
        sharedpref=getSharedPreferences("shortcut",MODE_PRIVATE);
        sharedpref12=getSharedPreferences("data",MODE_PRIVATE);
        String s,s1;

        s=sharedpref.getString("sub1","");
        s1=sharedpref7.getString(s,"");
        p1.setText(s1);

        s=sharedpref.getString("sub2","");
        s1=sharedpref7.getString(s,"");
        p2.setText(s1);

        s=sharedpref.getString("sub3","");
        s1=sharedpref7.getString(s,"");
        p3.setText(s1);

        s=sharedpref.getString("sub4","");
        s1=sharedpref7.getString(s,"");
        p4.setText(s1);

        s=sharedpref.getString("sub5","");
        s1=sharedpref7.getString(s,"");
        p5.setText(s1);

        s=sharedpref.getString("sub6","");
        s1=sharedpref7.getString(s,"");
        p6.setText(s1);

        SharedPreferences.Editor editor12=sharedpref12.edit();
        int total_nr=sharedpref12.getInt("total_nr",0);
        int total_dr=sharedpref12.getInt("total_dr",0);
        float avg= (total_nr*100/total_dr);
        avg=100-avg;
        a10.setText((Float.toString(avg))+"%");
        editor12.putString("overall",Float.toString(avg)+"%");
        editor12.apply();
    }

    @Override
    public void onBackPressed()
    {
        if(backButtonCount >= 1)
        {
            backButtonCount=0;
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Press Once Again to Exit", Toast.LENGTH_SHORT).show();
            backButtonCount++;
        }
    }

    public void setColors()
    {
        final Button a1 = (Button) findViewById(R.id.button);
        final Button a2 = (Button) findViewById(R.id.button1);
        final Button a3 = (Button) findViewById(R.id.button2);
        final Button a4 = (Button) findViewById(R.id.button3);
        final Button a5 = (Button) findViewById(R.id.button4);
        final Button a6 = (Button) findViewById(R.id.button5);
        final Button a7 = (Button) findViewById(R.id.button6);
        final Button a8 = (Button) findViewById(R.id.button7);

        SharedPreferences sharedpref4 = getSharedPreferences("timetable", Context.MODE_PRIVATE);
        SharedPreferences sharedpref8 = getSharedPreferences("refresh_color", MODE_PRIVATE);

        String sub = "but";
        a1.setText(sharedpref4.getString(date + 0, ""));
        gd = (GradientDrawable) a1.getBackground().mutate();
        gd.setColor(sharedpref8.getInt(sub + 0, 0));

        a2.setText(sharedpref4.getString(date + 1, ""));
        gd = (GradientDrawable) a2.getBackground().mutate();
        gd.setColor(sharedpref8.getInt(sub + 1, 0));

        a3.setText(sharedpref4.getString(date + 2, ""));
        gd = (GradientDrawable) a3.getBackground().mutate();
        gd.setColor(sharedpref8.getInt(sub + 2, 0));

        a4.setText(sharedpref4.getString(date + 3, ""));
        gd = (GradientDrawable) a4.getBackground().mutate();
        gd.setColor(sharedpref8.getInt(sub + 3, 0));

        a5.setText(sharedpref4.getString(date + 4, ""));
        gd = (GradientDrawable) a5.getBackground().mutate();
        gd.setColor(sharedpref8.getInt(sub + 4, 0));

        a6.setText(sharedpref4.getString(date + 5, ""));
        gd = (GradientDrawable) a6.getBackground().mutate();
        gd.setColor(sharedpref8.getInt(sub + 5, 0));

        a7.setText(sharedpref4.getString(date + 6, ""));
        gd = (GradientDrawable) a7.getBackground().mutate();
        gd.setColor(sharedpref8.getInt(sub + 6, 0));

        a8.setText(sharedpref4.getString(date + 7, ""));
        gd = (GradientDrawable) a8.getBackground().mutate();
        gd.setColor(sharedpref8.getInt(sub + 7, 0));
    }
}