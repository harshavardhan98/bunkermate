package com.example.bunker.bunkermate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class a0004 extends AppCompatActivity implements View.OnClickListener {

    int total_dr=8;
    int total_nr=0;
    public static int chosen=0;
    public static String chosen1;

    public void clickFunction(View v)
    {
        Log.i("info","button pressed");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a0004);

        SharedPreferences sharedpref5=getSharedPreferences("data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor5=sharedpref5.edit();
        editor5.putInt("total_nr",total_nr);
        editor5.putInt("total_dr",total_dr);
        editor5.apply();

        SharedPreferences sharedpref=getSharedPreferences("sub_nr",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedpref.edit();
        SharedPreferences sharedpref6=getSharedPreferences("sub_dr",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor6=sharedpref6.edit();
        SharedPreferences sharedpref7=getSharedPreferences("shortcut", Context.MODE_PRIVATE);
        SharedPreferences sharedpref9=getSharedPreferences("avg",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor9=sharedpref9.edit();

        String stp="100%";
        String s=sharedpref7.getString("sub1","");
        editor.putInt(s,0);
        editor6.putInt(s,0);
        editor9.putString(s,stp);

        s=sharedpref7.getString("sub2","");
        editor.putInt(s,0);
        editor6.putInt(s,0);
        editor9.putString(s,stp);
        
        s=sharedpref7.getString("sub3","");
        editor.putInt(s,0);
        editor6.putInt(s,0);
        editor9.putString(s,stp);
        
        s=sharedpref7.getString("sub4","");
        editor.putInt(s,0);
        editor6.putInt(s,0);
        editor9.putString(s,stp);
        
        s=sharedpref7.getString("sub5","");
        editor.putInt(s,0);
        editor6.putInt(s,0);
        editor9.putString(s,stp);
        
        s=sharedpref7.getString("sub6","");
        editor.putInt(s,0);
        editor6.putInt(s,0);
        editor9.putString(s,stp);
        
        s=sharedpref7.getString("sub7","");
        editor.putInt(s,0);
        editor6.putInt(s,0);
        editor9.putString(s,stp);
        
        s=sharedpref7.getString("sub8","");
        editor.putInt(s,0);
        editor6.putInt(s,0);
        editor9.putString(s,stp);

        s=sharedpref7.getString("sub9","");
        editor.putInt(s,0);
        editor6.putInt(s,0);
        editor9.putString(s,stp);

        editor9.putString("overall",stp);

        editor.apply();
        editor6.apply();
        editor9.apply();

        final RadioButton b1=(RadioButton) findViewById(R.id.rb1);
        final RadioButton b2=(RadioButton) findViewById(R.id.rb2);
        final RadioButton b3=(RadioButton) findViewById(R.id.rb3);
        final RadioButton b4=(RadioButton) findViewById(R.id.rb4);
        final RadioButton b5=(RadioButton) findViewById(R.id.rb5);
        final RadioButton b6=(RadioButton) findViewById(R.id.rb6);
        final RadioButton b7=(RadioButton) findViewById(R.id.rb7);
        final RadioButton b8=(RadioButton) findViewById(R.id.rb8);
        final RadioButton b9=(RadioButton) findViewById(R.id.rb9);
        final RadioButton b10=(RadioButton) findViewById(R.id.rb10);

        SharedPreferences sharedpref1=getSharedPreferences("colors", Context.MODE_PRIVATE);
        SharedPreferences sharedpref2=getSharedPreferences("shortcut", Context.MODE_PRIVATE);
        String date="sub";

        b1.setBackgroundColor(sharedpref1.getInt(date+1,0));  b1.setText(sharedpref2.getString(date+1,""));
        b2.setBackgroundColor(sharedpref1.getInt(date+2,0));  b2.setText(sharedpref2.getString(date+2,""));
        b3.setBackgroundColor(sharedpref1.getInt(date+3,0));  b3.setText(sharedpref2.getString(date+3,""));
        b4.setBackgroundColor(sharedpref1.getInt(date+4,0));  b4.setText(sharedpref2.getString(date+4,""));
        b5.setBackgroundColor(sharedpref1.getInt(date+5,0));  b5.setText(sharedpref2.getString(date+5,""));
        b6.setBackgroundColor(sharedpref1.getInt(date+6,0));  b6.setText(sharedpref2.getString(date+6,""));
        b7.setBackgroundColor(sharedpref1.getInt(date+7,0));  b7.setText(sharedpref2.getString(date+7,""));
        b8.setBackgroundColor(sharedpref1.getInt(date+8,0));  b8.setText(sharedpref2.getString(date+8,""));
        b9.setBackgroundColor(sharedpref1.getInt(date+9,0));  b9.setText(sharedpref2.getString(date+9,""));

        final Button a1=(Button) findViewById(R.id.button);     a1.setOnClickListener(this);
        final Button a2=(Button) findViewById(R.id.start);     a2.setOnClickListener(this);
        final Button a3=(Button) findViewById(R.id.button2);     a3.setOnClickListener(this);
        final Button a4=(Button) findViewById(R.id.button3);     a4.setOnClickListener(this);
        final Button a5=(Button) findViewById(R.id.button4);     a5.setOnClickListener(this);
        final Button a6=(Button) findViewById(R.id.button5);     a6.setOnClickListener(this);
        final Button a7=(Button) findViewById(R.id.button6);     a7.setOnClickListener(this);
        final Button a8=(Button) findViewById(R.id.button7);     a8.setOnClickListener(this);

        final Button c1=(Button) findViewById(R.id.button8);     c1.setOnClickListener(this);
        final Button c2=(Button) findViewById(R.id.button9);     c2.setOnClickListener(this);
        final Button c3=(Button) findViewById(R.id.button10);     c3.setOnClickListener(this);
        final Button c4=(Button) findViewById(R.id.button11);     c4.setOnClickListener(this);
        final Button c5=(Button) findViewById(R.id.button12);     c5.setOnClickListener(this);
        final Button c6=(Button) findViewById(R.id.button14);     c6.setOnClickListener(this);
        final Button c7=(Button) findViewById(R.id.button15);     c7.setOnClickListener(this);
        final Button c8=(Button) findViewById(R.id.button16);     c8.setOnClickListener(this);

        final Button d1=(Button) findViewById(R.id.button17);     d1.setOnClickListener(this);
        final Button d2=(Button) findViewById(R.id.button18);     d2.setOnClickListener(this);
        final Button d3=(Button) findViewById(R.id.button19);     d3.setOnClickListener(this);
        final Button d4=(Button) findViewById(R.id.button20);     d4.setOnClickListener(this);
        final Button d5=(Button) findViewById(R.id.button21);     d5.setOnClickListener(this);
        final Button d6=(Button) findViewById(R.id.button22);     d6.setOnClickListener(this);
        final Button d7=(Button) findViewById(R.id.button23);     d7.setOnClickListener(this);
        final Button d8=(Button) findViewById(R.id.button24);     d8.setOnClickListener(this);

        final Button e1=(Button) findViewById(R.id.button25);     e1.setOnClickListener(this);
        final Button e2=(Button) findViewById(R.id.button26);     e2.setOnClickListener(this);
        final Button e3=(Button) findViewById(R.id.button27);     e3.setOnClickListener(this);
        final Button e4=(Button) findViewById(R.id.button28);     e4.setOnClickListener(this);
        final Button e5=(Button) findViewById(R.id.button29);     e5.setOnClickListener(this);
        final Button e6=(Button) findViewById(R.id.button30);     e6.setOnClickListener(this);
        final Button e7=(Button) findViewById(R.id.button31);     e7.setOnClickListener(this);
        final Button e8=(Button) findViewById(R.id.button32);     e8.setOnClickListener(this);

        final Button f1=(Button) findViewById(R.id.button33);     f1.setOnClickListener(this);
        final Button f2=(Button) findViewById(R.id.button34);     f2.setOnClickListener(this);
        final Button f3=(Button) findViewById(R.id.button35);     f3.setOnClickListener(this);
        final Button f4=(Button) findViewById(R.id.button36);     f4.setOnClickListener(this);
        final Button f5=(Button) findViewById(R.id.button37);     f5.setOnClickListener(this);
        final Button f6=(Button) findViewById(R.id.button38);     f6.setOnClickListener(this);
        final Button f7=(Button) findViewById(R.id.button39);     f7.setOnClickListener(this);
        final Button f8=(Button) findViewById(R.id.button40);     f8.setOnClickListener(this);

        final Button g1=(Button) findViewById(R.id.button42);     g1.setOnClickListener(this);
        final Button g2=(Button) findViewById(R.id.button43);     g2.setOnClickListener(this);
        final Button g3=(Button) findViewById(R.id.button44);     g3.setOnClickListener(this);
        final Button g4=(Button) findViewById(R.id.button45);     g4.setOnClickListener(this);
        final Button g5=(Button) findViewById(R.id.button46);     g5.setOnClickListener(this);
        final Button g6=(Button) findViewById(R.id.button47);     g6.setOnClickListener(this);
        final Button g7=(Button) findViewById(R.id.button48);     g7.setOnClickListener(this);
        final Button g8=(Button) findViewById(R.id.button49);     g8.setOnClickListener(this);

        final Button finish=(Button) findViewById(R.id.button41);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i1 = new Intent(getApplicationContext(), a0005.class);
                    SharedPreferences sharedpref99=getSharedPreferences("status", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor99=sharedpref99.edit();
                    editor99.putInt("status",100);
                    editor99.apply();
                    startActivity(i1);
            }
        });
        
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setChecked(true);
                b2.setChecked(false);
                b3.setChecked(false);
                b4.setChecked(false);
                b5.setChecked(false);
                b6.setChecked(false);
                b7.setChecked(false);
                b8.setChecked(false);
                b9.setChecked(false);
                b10.setChecked(false);
                SharedPreferences sharedpref1=getSharedPreferences("colors", Context.MODE_PRIVATE);
                chosen=sharedpref1.getInt("sub1",0);
                chosen1=b1.getText().toString();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setChecked(false);
                b2.setChecked(true);
                b3.setChecked(false);
                b4.setChecked(false);
                b5.setChecked(false);
                b6.setChecked(false);
                b7.setChecked(false);
                b8.setChecked(false);
                b9.setChecked(false);
                b10.setChecked(false);
                SharedPreferences sharedpref1=getSharedPreferences("colors", Context.MODE_PRIVATE);
                chosen=sharedpref1.getInt("sub2",0);
                chosen1=b2.getText().toString();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setChecked(false);
                b2.setChecked(false);
                b3.setChecked(true);
                b4.setChecked(false);
                b5.setChecked(false);
                b6.setChecked(false);
                b7.setChecked(false);
                b8.setChecked(false);
                b9.setChecked(false);
                b10.setChecked(false);
                SharedPreferences sharedpref1=getSharedPreferences("colors", Context.MODE_PRIVATE);
                chosen=sharedpref1.getInt("sub3",0);
                chosen1=b3.getText().toString();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setChecked(false);
                b2.setChecked(false);
                b3.setChecked(false);
                b4.setChecked(true);
                b5.setChecked(false);
                b6.setChecked(false);
                b7.setChecked(false);
                b8.setChecked(false);
                b9.setChecked(false);
                b10.setChecked(false);
                SharedPreferences sharedpref1=getSharedPreferences("colors", Context.MODE_PRIVATE);
                chosen=sharedpref1.getInt("sub4",0);
                chosen1=b4.getText().toString();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setChecked(false);
                b2.setChecked(false);
                b3.setChecked(false);
                b4.setChecked(false);
                b5.setChecked(true);
                b6.setChecked(false);
                b7.setChecked(false);
                b8.setChecked(false);
                b9.setChecked(false);
                b10.setChecked(false);
                SharedPreferences sharedpref1=getSharedPreferences("colors", Context.MODE_PRIVATE);
                chosen=sharedpref1.getInt("sub5",0);
                chosen1=b5.getText().toString();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setChecked(false);
                b2.setChecked(false);
                b3.setChecked(false);
                b4.setChecked(false);
                b5.setChecked(false);
                b6.setChecked(true);
                b7.setChecked(false);
                b8.setChecked(false);
                b9.setChecked(false);
                b10.setChecked(false);
                SharedPreferences sharedpref1=getSharedPreferences("colors", Context.MODE_PRIVATE);
                chosen=sharedpref1.getInt("sub6",0);
                chosen1=b6.getText().toString();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setChecked(false);
                b2.setChecked(false);
                b3.setChecked(false);
                b4.setChecked(false);
                b5.setChecked(false);
                b6.setChecked(false);
                b7.setChecked(true);
                b8.setChecked(false);
                b9.setChecked(false);
                b10.setChecked(false);
                SharedPreferences sharedpref1=getSharedPreferences("colors", Context.MODE_PRIVATE);
                chosen=sharedpref1.getInt("sub7",0);
                chosen1=b7.getText().toString();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setChecked(false);
                b2.setChecked(false);
                b3.setChecked(false);
                b4.setChecked(false);
                b5.setChecked(false);
                b6.setChecked(false);
                b7.setChecked(false);
                b8.setChecked(true);
                b9.setChecked(false);
                b10.setChecked(false);
                SharedPreferences sharedpref1=getSharedPreferences("colors", Context.MODE_PRIVATE);
                chosen=sharedpref1.getInt("sub8",0);
                chosen1=b8.getText().toString();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setChecked(false);
                b2.setChecked(false);
                b3.setChecked(false);
                b4.setChecked(false);
                b5.setChecked(false);
                b6.setChecked(false);
                b7.setChecked(false);
                b8.setChecked(false);
                b9.setChecked(true);
                b10.setChecked(false);
                SharedPreferences sharedpref1=getSharedPreferences("colors", Context.MODE_PRIVATE);
                chosen=sharedpref1.getInt("sub9",0);
                chosen1=b9.getText().toString();
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setChecked(false);
                b2.setChecked(false);
                b3.setChecked(false);
                b4.setChecked(false);
                b5.setChecked(false);
                b6.setChecked(false);
                b7.setChecked(false);
                b8.setChecked(false);
                b9.setChecked(false);
                b10.setChecked(true);
                chosen= Color.WHITE;
                chosen1="";
            }
        });
    }

    @Override
    public void onClick(View v) {
        if(chosen!=0)
        {
            GradientDrawable gd=(GradientDrawable) v.getBackground().mutate();
            gd.setColor(chosen);
            Button b=(Button)v;
            b.setText(chosen1);
        }

        SharedPreferences sharedpref=getSharedPreferences("timetable", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedpref.edit();
        SharedPreferences sharedpref1=getSharedPreferences("timetable_color", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor1=sharedpref1.edit();
        int pid=v.getId();

        switch (pid)
        {
            case R.id.button:
                editor.putString("Mon0",chosen1);   editor1.putInt("Mon0",chosen);   break;
            case R.id.start:
                editor.putString("Mon1",chosen1);   editor1.putInt("Mon1",chosen);   break;
            case R.id.button2:
                editor.putString("Mon2",chosen1);   editor1.putInt("Mon2",chosen);   break;
            case R.id.button3:
                editor.putString("Mon3",chosen1);   editor1.putInt("Mon3",chosen);   break;
            case R.id.button4:
                editor.putString("Mon4",chosen1);   editor1.putInt("Mon4",chosen);   break;
            case R.id.button5:
                editor.putString("Mon5",chosen1);   editor1.putInt("Mon5",chosen);   break;
            case R.id.button6:
                editor.putString("Mon6",chosen1);   editor1.putInt("Mon6",chosen);   break;
            case R.id.button7:
                editor.putString("Mon7",chosen1);   editor1.putInt("Mon7",chosen);   break;

            case R.id.button8:
                editor.putString("Tue0",chosen1);   editor1.putInt("Tue0",chosen);   break;
            case R.id.button9:
                editor.putString("Tue1",chosen1);   editor1.putInt("Tue1",chosen);   break;
            case R.id.button10:
                editor.putString("Tue2",chosen1);   editor1.putInt("Tue2",chosen);   break;
            case R.id.button11:
                editor.putString("Tue3",chosen1);   editor1.putInt("Tue3",chosen);   break;
            case R.id.button12:
                editor.putString("Tue4",chosen1);   editor1.putInt("Tue4",chosen);   break;
            case R.id.button14:
                editor.putString("Tue5",chosen1);   editor1.putInt("Tue5",chosen);   break;
            case R.id.button15:
                editor.putString("Tue6",chosen1);   editor1.putInt("Tue6",chosen);   break;
            case R.id.button16:
                editor.putString("Tue7",chosen1);   editor1.putInt("Tue7",chosen);   break;

            case R.id.button17:
                editor.putString("Wed0",chosen1);   editor1.putInt("Wed0",chosen);   break;
            case R.id.button18:
                editor.putString("Wed1",chosen1);   editor1.putInt("Wed1",chosen);   break;
            case R.id.button19:
                editor.putString("Wed2",chosen1);   editor1.putInt("Wed2",chosen);   break;
            case R.id.button20:
                editor.putString("Wed3",chosen1);   editor1.putInt("Wed3",chosen);   break;
            case R.id.button21:
                editor.putString("Wed4",chosen1);   editor1.putInt("Wed4",chosen);   break;
            case R.id.button22:
                editor.putString("Wed5",chosen1);   editor1.putInt("Wed5",chosen);   break;
            case R.id.button23:
                editor.putString("Wed6",chosen1);   editor1.putInt("Wed6",chosen);   break;
            case R.id.button24:
                editor.putString("Wed7",chosen1);   editor1.putInt("Wed7",chosen);   break;

            case R.id.button25:
                editor.putString("Thu0" , chosen1);   editor1.putInt("Thu0", chosen);   break;
            case R.id.button26:
                editor.putString("Thu1" , chosen1);   editor1.putInt("Thu1", chosen);   break;
            case R.id.button27:
                editor.putString("Thu2" , chosen1);   editor1.putInt("Thu2", chosen);   break;
            case R.id.button28:
                editor.putString("Thu3" , chosen1);   editor1.putInt("Thu3", chosen);   break;
            case R.id.button29:
                editor.putString("Thu4" , chosen1);   editor1.putInt("Thu4", chosen);   break;
            case R.id.button30:
                editor.putString("Thu5" , chosen1);   editor1.putInt("Thu5", chosen);   break;
            case R.id.button31:
                editor.putString("Thu6" , chosen1);   editor1.putInt("Thu6", chosen);   break;
            case R.id.button32:
                editor.putString("Thu7" , chosen1);   editor1.putInt("Thu7", chosen);   break;

            case R.id.button33:
                editor.putString("Fri0" , chosen1);   editor1.putInt("Fri0" , chosen);   break;
            case R.id.button34:
                editor.putString("Fri1" , chosen1);   editor1.putInt("Fri1" , chosen);   break;
            case R.id.button35:
                editor.putString("Fri2" , chosen1);   editor1.putInt("Fri2" , chosen);   break;
            case R.id.button36:
                editor.putString("Fri3" , chosen1);   editor1.putInt("Fri3" , chosen);   break;
            case R.id.button37:
                editor.putString("Fri4" , chosen1);   editor1.putInt("Fri4" , chosen);   break;
            case R.id.button38:
                editor.putString("Fri5" , chosen1);   editor1.putInt("Fri5" , chosen);   break;
            case R.id.button39:
                editor.putString("Fri6" , chosen1);   editor1.putInt("Fri6" , chosen);   break;
            case R.id.button40:
                editor.putString("Fri7" , chosen1);   editor1.putInt("Fri7" , chosen);   break;

            case R.id.button42:
                editor.putString("Sat0", chosen1);   editor1.putInt("Sat0", chosen);
                editor.putString("Sun0", chosen1);   editor1.putInt("Sun0", chosen);   break;
            case R.id.button43:
                editor.putString("Sat1", chosen1);   editor1.putInt("Sat1", chosen);
                editor.putString("Sun1", chosen1);   editor1.putInt("Sun1", chosen);   break;
            case R.id.button44:
                editor.putString("Sat2", chosen1);   editor1.putInt("Sat2", chosen);
                editor.putString("Sun2", chosen1);   editor1.putInt("Sun2", chosen);   break;
            case R.id.button45:
                editor.putString("Sat3", chosen1);   editor1.putInt("Sat3", chosen);
                editor.putString("Sun3", chosen1);   editor1.putInt("Sun3", chosen);   break;
            case R.id.button46:
                editor.putString("Sat4", chosen1);   editor1.putInt("Sat4", chosen);
                editor.putString("Sun4", chosen1);   editor1.putInt("Sun4", chosen);   break;
            case R.id.button47:
                editor.putString("Sat5", chosen1);   editor1.putInt("Sat5", chosen);
                editor.putString("Sun5", chosen1);   editor1.putInt("Sun5", chosen);   break;
            case R.id.button48:
                editor.putString("Sat6", chosen1);   editor1.putInt("Sat6", chosen);
                editor.putString("Sun6", chosen1);   editor1.putInt("Sun6", chosen);   break;
            case R.id.button49:
                editor.putString("Sat7", chosen1);   editor1.putInt("Sat7", chosen);
                editor.putString("Sun7", chosen1);   editor1.putInt("Sun7", chosen);   break;
        }

        editor.apply();
        editor1.apply();
    }
}