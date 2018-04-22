package com.example.bunker.bunkermate;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class a0005 extends AppCompatActivity implements View.OnClickListener{

    public static int chosen=0;
    int total=0;
    SharedPreferences sharedpref2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a0005);

        GradientDrawable gd;
        SharedPreferences sharedpref,sharedpref1,sharedpref4,sharedpref3,sharedpref5,sharedpref6,sharedprefa9;
        SharedPreferences.Editor editor5,editor6;

        final RadioButton rb1=(RadioButton) findViewById(R.id.rb1);
        final RadioButton rb2=(RadioButton) findViewById(R.id.rb2);

        final Button a1=(Button) findViewById(R.id.button);     a1.setOnClickListener(this);
        final Button a2=(Button) findViewById(R.id.start);     a2.setOnClickListener(this);
        final Button a3=(Button) findViewById(R.id.button2);     a3.setOnClickListener(this);
        final Button a4=(Button) findViewById(R.id.button3);     a4.setOnClickListener(this);
        final Button a5=(Button) findViewById(R.id.button4);     a5.setOnClickListener(this);
        final Button a6=(Button) findViewById(R.id.button5);     a6.setOnClickListener(this);
        final Button a7=(Button) findViewById(R.id.button6);     a7.setOnClickListener(this);
        final Button a8=(Button) findViewById(R.id.button7);     a8.setOnClickListener(this);
        final Button a9=(Button) findViewById(R.id.button50);
        final Button a10=(Button) findViewById(R.id.button13);

        final Button b1 = (Button) (findViewById(R.id.next));
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

        sharedprefa9=getSharedPreferences("avg",Context.MODE_PRIVATE);
        sharedpref1=getSharedPreferences("timetable_color", Context.MODE_PRIVATE);

        Date d=new java.util.Date();
        String date=(d.toString()).substring(0,3);
        t7.setText(date);

        String stemp,kl;
        int dr_temp;
        sharedpref4=getSharedPreferences("timetable", Context.MODE_PRIVATE);
        sharedpref6=getSharedPreferences("sub_dr", Context.MODE_PRIVATE);
        editor6=sharedpref6.edit();

        stemp=sharedpref4.getString(date+0,"");
        dr_temp=sharedpref6.getInt(stemp,0);
        dr_temp=dr_temp+1;
        kl=Integer.toString(dr_temp);
       // Toast.makeText(getApplicationContext(),stemp+" dr ="+kl,Toast.LENGTH_LONG).show();
        editor6.putInt(stemp,dr_temp);
        editor6.commit();

        editor6=sharedpref6.edit();
        stemp=sharedpref4.getString(date+1,"");
        dr_temp=sharedpref6.getInt(stemp,0);
        dr_temp=dr_temp+1;
        kl=Integer.toString(dr_temp);
       // Toast.makeText(getApplicationContext(),stemp+" dr ="+kl,Toast.LENGTH_LONG).show();
        editor6.putInt(stemp,dr_temp);
        editor6.commit();

        editor6=sharedpref6.edit();
        stemp=sharedpref4.getString(date+2,"");
        dr_temp=sharedpref6.getInt(stemp,0);
        dr_temp=dr_temp+1;
        kl=Integer.toString(dr_temp);
       // Toast.makeText(getApplicationContext(),stemp+" dr ="+kl,Toast.LENGTH_LONG).show();
        editor6.putInt(stemp,dr_temp);
        editor6.commit();

        editor6=sharedpref6.edit();
        stemp=sharedpref4.getString(date+3,"");
        dr_temp=sharedpref6.getInt(stemp,0);
        dr_temp=dr_temp+1;
        kl=Integer.toString(dr_temp);
       // Toast.makeText(getApplicationContext(),stemp+" dr ="+kl,Toast.LENGTH_LONG).show();
        editor6.putInt(stemp,dr_temp);
        editor6.commit();

        editor6=sharedpref6.edit();
        stemp=sharedpref4.getString(date+4,"");
        dr_temp=sharedpref6.getInt(stemp,0);
        dr_temp=dr_temp+1;
        kl=Integer.toString(dr_temp);
      //  Toast.makeText(getApplicationContext(),stemp+" dr ="+kl,Toast.LENGTH_LONG).show();
        editor6.putInt(stemp,dr_temp);
        editor6.commit();

        editor6=sharedpref6.edit();
        stemp=sharedpref4.getString(date+5,"");
        dr_temp=sharedpref6.getInt(stemp,0);
        dr_temp=dr_temp+1;
        kl=Integer.toString(dr_temp);
      //  Toast.makeText(getApplicationContext(),stemp+" dr ="+kl,Toast.LENGTH_LONG).show();
        editor6.putInt(stemp,dr_temp);
        editor6.commit();

        editor6=sharedpref6.edit();
        stemp=sharedpref4.getString(date+6,"");
        dr_temp=sharedpref6.getInt(stemp,0);
        dr_temp=dr_temp+1;
        kl=Integer.toString(dr_temp);
   //     Toast.makeText(getApplicationContext(),stemp+" dr ="+kl,Toast.LENGTH_LONG).show();
        editor6.putInt(stemp,dr_temp);
        editor6.commit();

        editor6=sharedpref6.edit();
        stemp=sharedpref4.getString(date+7,"");
        dr_temp=sharedpref6.getInt(stemp,0);
        dr_temp=dr_temp+1;
        kl=Integer.toString(dr_temp);
    //    Toast.makeText(getApplicationContext(),stemp+" dr ="+kl,Toast.LENGTH_LONG).show();
        editor6.putInt(stemp,dr_temp);
        editor6.commit();

        String s;
        SharedPreferences sharedpref7=getSharedPreferences("subject", Context.MODE_PRIVATE);
        s=sharedpref7.getString("sub1","");
        p1.setText(sharedprefa9.getString(s,""));

        s=sharedpref7.getString("sub2","");
        p2.setText(sharedprefa9.getString(s,""));

        s=sharedpref7.getString("sub3","");
        p3.setText(sharedprefa9.getString(s,""));

        s=sharedpref7.getString("sub4","");
        p4.setText(sharedprefa9.getString(s,""));

        s=sharedpref7.getString("sub5","");
        p5.setText(sharedprefa9.getString(s,""));

        s=sharedpref7.getString("sub6","");
        p6.setText(sharedprefa9.getString(s,""));

        a10.setText(sharedprefa9.getString("overall",""));




/*

        Toast.makeText(getApplicationContext(),"printing for individual subs",Toast.LENGTH_LONG).show();
        String s;
        SharedPreferences sharedpref7=getSharedPreferences("subject", Context.MODE_PRIVATE);
        s=sharedpref7.getString("sub1","");
        dr_temp=sharedpref6.getInt(s,0);
        stemp=Integer.toString(dr_temp);
        Toast.makeText(getApplicationContext(),s+" dr ="+stemp,Toast.LENGTH_LONG).show();


        s=sharedpref7.getString("sub2","");
        dr_temp=sharedpref6.getInt(s,0);
        stemp=Integer.toString(dr_temp);
        Toast.makeText(getApplicationContext(),s+" dr ="+stemp,Toast.LENGTH_LONG).show();

        s=sharedpref7.getString("sub3","");
        dr_temp=sharedpref6.getInt(s,0);
        stemp=Integer.toString(dr_temp);
        Toast.makeText(getApplicationContext(),s+" dr ="+stemp,Toast.LENGTH_LONG).show();

        s=sharedpref7.getString("sub4","");
        dr_temp=sharedpref6.getInt(s,0);
        stemp=Integer.toString(dr_temp);
        Toast.makeText(getApplicationContext(),s+" dr ="+stemp,Toast.LENGTH_LONG).show();

        s=sharedpref7.getString("sub5","");
        dr_temp=sharedpref6.getInt(s,0);
        stemp=Integer.toString(dr_temp);
        Toast.makeText(getApplicationContext(),s+" dr ="+stemp,Toast.LENGTH_LONG).show();

        s=sharedpref7.getString("sub6","");
        dr_temp=sharedpref6.getInt(s,0);
        stemp=Integer.toString(dr_temp);
        Toast.makeText(getApplicationContext(),s+" dr ="+stemp,Toast.LENGTH_LONG).show();

        s=sharedpref7.getString("sub7","");
        dr_temp=sharedpref6.getInt(s,0);
        stemp=Integer.toString(dr_temp);
        Toast.makeText(getApplicationContext(),s+" dr ="+stemp,Toast.LENGTH_LONG).show();

        s=sharedpref7.getString("sub8","");
        dr_temp=sharedpref6.getInt(s,0);
        stemp=Integer.toString(dr_temp);
        Toast.makeText(getApplicationContext(),s+" dr ="+stemp,Toast.LENGTH_LONG).show();
*/
        a1.setText(sharedpref4.getString(date+0,""));
        gd=(GradientDrawable) a1.getBackground().mutate();      gd.setColor(sharedpref1.getInt(date+0,0));
        a2.setText(sharedpref4.getString(date+1,""));
        gd=(GradientDrawable) a2.getBackground().mutate();      gd.setColor(sharedpref1.getInt(date+1,0));
        a3.setText(sharedpref4.getString(date+2,""));
        gd=(GradientDrawable) a3.getBackground().mutate();      gd.setColor(sharedpref1.getInt(date+2,0));
        a4.setText(sharedpref4.getString(date+3,""));
        gd=(GradientDrawable) a4.getBackground().mutate();      gd.setColor(sharedpref1.getInt(date+3,0));
        a5.setText(sharedpref4.getString(date+4,""));
        gd=(GradientDrawable) a5.getBackground().mutate();      gd.setColor(sharedpref1.getInt(date+4,0));
        a6.setText(sharedpref4.getString(date+5,""));
        gd=(GradientDrawable) a6.getBackground().mutate();      gd.setColor(sharedpref1.getInt(date+5,0));
        a7.setText(sharedpref4.getString(date+6,""));
        gd=(GradientDrawable) a7.getBackground().mutate();      gd.setColor(sharedpref1.getInt(date+6,0));
        a8.setText(sharedpref4.getString(date+7,""));
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

        sharedpref2=getSharedPreferences("data",MODE_PRIVATE);

        int total_nr=sharedpref2.getInt("total_nr",0);
        int total_dr=sharedpref2.getInt("total_dr",0);

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
                sharedpref2=getSharedPreferences("data",MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedpref2.edit();
                int total_nr=sharedpref2.getInt("total_nr",0);
                int total_dr=sharedpref2.getInt("total_dr",0);

                total_nr=total_nr+(8-total);
                float avg=((total_nr*100)/(float)total_dr);
                avg=100-avg;
                String s = Float.toString(avg);
                a10.setText(s);

                editor.putInt("total_nr",total_nr);
                editor.putInt("total_dr",total_dr);
                editor.apply();

                SharedPreferences sharedpref5,sharedpref6,sharedpref7,sharedpref9;
                sharedpref5=getSharedPreferences("sub_nr", Context.MODE_PRIVATE);
                sharedpref6=getSharedPreferences("sub_dr", Context.MODE_PRIVATE);
                sharedpref7=getSharedPreferences("subject", Context.MODE_PRIVATE);
                sharedpref9=getSharedPreferences("avg", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor5=sharedpref5.edit();
                SharedPreferences.Editor editor6=sharedpref6.edit();
                SharedPreferences.Editor editor9=sharedpref9.edit();
                String kl,s1;

                editor9.putString("overall",s);
                s=sharedpref7.getString("sub1","");
                s1=s;
                total_nr=sharedpref5.getInt(s,0);
                total_dr=sharedpref6.getInt(s,0);
                kl=Integer.toString(total_dr);
                kl=kl+Integer.toString(total_nr);
                if(total_dr!=0) {
                   // Toast.makeText(getApplicationContext(), "sub1: dr nr" + kl, Toast.LENGTH_LONG).show();
                    avg = (total_nr * 100) / total_dr;
                    avg=100-avg;
                     s = Float.toString(avg);
                     s=s+"%";
                    editor9.putString(s1,s);
                   // Toast.makeText(getApplicationContext(), "sub1: avg=" + s, Toast.LENGTH_LONG).show();
                    p1.setText(s);
                }
                else
                    p1.setText("null");


                s=sharedpref7.getString("sub2","");
                s1=s;
                total_nr=sharedpref5.getInt(s,0);
                total_dr=sharedpref6.getInt(s,0);
                if(total_dr!=0) {
                    kl = Integer.toString(total_dr);
                    kl = kl + Integer.toString(total_nr);
                   // Toast.makeText(getApplicationContext(), "sub2: dr nr" + kl, Toast.LENGTH_LONG).show();
                    avg = (total_nr * 100) / total_dr;
                    avg=100-avg;
                    s = Float.toString(avg);
                    s=s+"%";
                    editor9.putString(s1,s);
                   // Toast.makeText(getApplicationContext(), "sub2: avg=" + s, Toast.LENGTH_LONG).show();
                    p2.setText(s);
                }
                else
                    p2.setText("100");



                s=sharedpref7.getString("sub3","");
                s1=s;
                total_nr=sharedpref5.getInt(s,0);
                total_dr=sharedpref6.getInt(s,0);
                if(total_dr!=0) {
                    avg = (total_nr * 100) / total_dr;
                    avg=100-avg;
                    s = Float.toString(avg);
                    s=s+"%";
                    editor9.putString(s1,s);
                    p3.setText(s);
                }
                else
                    p3.setText("100");


                s=sharedpref7.getString("sub4","");
                s1=s;
                total_nr=sharedpref5.getInt(s,0);
                total_dr=sharedpref6.getInt(s,0);
                if(total_dr!=0) {
                    avg = (total_nr * 100) / total_dr;
                    avg=100-avg;
                    s = Float.toString(avg);
                    s=s+"%";
                    editor9.putString(s1,s);
                    p4.setText(s);
                }
                else
                    p4.setText("100");

                s=sharedpref7.getString("sub5","");
                s1=s;
                total_nr=sharedpref5.getInt(s,0);
                total_dr=sharedpref6.getInt(s,0);
                if(total_dr!=0) {
                    avg = (total_nr * 100) / total_dr;
                    avg=100-avg;
                    s = Float.toString(avg);
                    s=s+"%";
                    editor9.putString(s1,s);
                    p5.setText(s);
                }
                else
                    p5.setText("100");

                s=sharedpref7.getString("sub6","");
                s1=s;
                total_nr=sharedpref5.getInt(s,0);
                total_dr=sharedpref6.getInt(s,0);
                if(total_dr!=0) {
                    avg = (total_nr * 100) / total_dr;
                    avg=100-avg;
                    s = Float.toString(avg);
                    s=s+"%";
                    editor9.putString(s1,s);
                    p6.setText(s);
                }
                else
                    p6.setText("100");

            }
        });
    }

    @Override
    public void onClick(View v) {
        if(chosen!=0)
        {
            GradientDrawable gd=(GradientDrawable) v.getBackground().mutate();
            gd.setColor(chosen);

            Button b1=(Button) v;
            String b_tmp=b1.getText().toString();

            SharedPreferences sharedpref5=getSharedPreferences("sub_nr",MODE_PRIVATE);
            SharedPreferences.Editor editor5=sharedpref5.edit();
            int b_nr=sharedpref5.getInt(b_tmp,0);
            b_nr=b_nr+1;
             String kl=Integer.toString(b_nr);
            Toast.makeText(getApplicationContext(),b_tmp+" nr ="+kl,Toast.LENGTH_LONG).show();
            editor5.putInt(b_tmp,b_nr);
            editor5.apply();
            total=total+1;
        }
    }
}
