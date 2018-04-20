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
import android.widget.Toast;

public class a0004 extends AppCompatActivity implements View.OnClickListener {

    int total_dr=8;
    int total_nr=0;
    RadioButton chosen_btn;
    public static int chosen=0;
    int chosen_color;

    public void clickFunction(View v)
    {
        Log.i("info","button pressed");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a0004);

        SharedPreferences sharedpref=getSharedPreferences("data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedpref.edit();
        editor.putInt("total_nr",total_nr);
        editor.putInt("total_dr",total_dr);
        editor.apply();

        Bundle b=getIntent().getExtras();
        final int[] arr=b.getIntArray("key");
        final String[] subb=b.getStringArray("key1");


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

        b1.setBackgroundColor(arr[0]);  b1.setText(subb[0]);
        b2.setBackgroundColor(arr[1]);  b2.setText(subb[1]);
        b3.setBackgroundColor(arr[2]);  b3.setText(subb[2]);
        b4.setBackgroundColor(arr[3]);  b4.setText(subb[3]);
        b5.setBackgroundColor(arr[4]);  b5.setText(subb[4]);
        b6.setBackgroundColor(arr[5]);  b6.setText(subb[5]);
        b7.setBackgroundColor(arr[6]);  b7.setText(subb[6]);
        b8.setBackgroundColor(arr[7]);  b8.setText(subb[7]);
        b9.setBackgroundColor(arr[8]);  b9.setText(subb[8]);

        final Button a1=(Button) findViewById(R.id.button);     a1.setOnClickListener(this);
        final Button a2=(Button) findViewById(R.id.button1);     a2.setOnClickListener(this);
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
                chosen=arr[0];
                chosen_btn=b1;
                chosen_color=0;
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
                chosen=arr[1];
                chosen_btn=b2;
                chosen_color=1;
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
                chosen=arr[2];
                chosen_btn=b3;
                chosen_color=2;
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
                chosen=arr[3];
                chosen_btn=b4;
                chosen_color=3;
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
                chosen=arr[4];
                chosen_btn=b5;
                chosen_color=4;
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
                chosen=arr[5];
                chosen_btn=b6;
                chosen_color=5;
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
                chosen=arr[6];
                chosen_btn=b7;
                chosen_color=6;
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
                chosen=arr[7];
                chosen_btn=b8;
                chosen_color=7;
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
                chosen=arr[8];
                chosen_btn=b9;
                chosen_color=1;
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
                chosen_btn=b10;
                chosen= Color.WHITE;
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

        SharedPreferences sharedpref=getSharedPreferences("timetable", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedpref.edit();

        SharedPreferences sharedpref1=getSharedPreferences("timetable_color", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor1=sharedpref1.edit();

        int pid=v.getId();

        if(pid==R.id.button)
        {
            editor.putString("Mon0",chosen_btn.getText().toString());
            editor1.putInt("Mon0",chosen);
        }


        if(pid==R.id.button1)
        {
            editor.putString("Mon1",chosen_btn.getText().toString());
            editor1.putInt("Mon1",chosen);
        }


        if(pid==R.id.button2)
        {
            editor.putString("Mon2",chosen_btn.getText().toString());
            editor1.putInt("Mon2",chosen);
        }


        if(pid==R.id.button3)
        {
            editor.putString("Mon3",chosen_btn.getText().toString());
            editor1.putInt("Mon3",chosen);
        }


        if(pid==R.id.button4)
        {
            editor.putString("Mon4",chosen_btn.getText().toString());
            editor1.putInt("Mon4",chosen);
        }


        if(pid==R.id.button5)
        {
            editor.putString("Mon5",chosen_btn.getText().toString());
            editor1.putInt("Mon5",chosen);
        }


        if(pid==R.id.button6)
        {
            editor.putString("Mon6",chosen_btn.getText().toString());
            editor1.putInt("Mon6",chosen);
        }


        if(pid==R.id.button7)
        {
            editor.putString("Mon7",chosen_btn.getText().toString());
            editor1.putInt("Mon7",chosen);
        }

        if(pid==R.id.button8)
        {
            editor.putString("Tue0",chosen_btn.getText().toString());
            editor1.putInt("Tue0",chosen);
        }

        if(pid==R.id.button9)
        {
            editor.putString("Tue1",chosen_btn.getText().toString());
            editor1.putInt("Tue1",chosen);
        }

        if(pid==R.id.button10)
        {
            editor.putString("Tue2",chosen_btn.getText().toString());
            editor1.putInt("Tue2",chosen);
        }

        if(pid==R.id.button11)
        {
            editor.putString("Tue3",chosen_btn.getText().toString());
            editor1.putInt("Tue3",chosen);
        }

        if(pid==R.id.button12)
        {
            editor.putString("Tue4",chosen_btn.getText().toString());
            editor1.putInt("Tue4",chosen);
        }

        if(pid==R.id.button14)
        {
            editor.putString("Tue5",chosen_btn.getText().toString());
            editor1.putInt("Tue5",chosen);
        }

        if(pid==R.id.button15)
        {
            editor.putString("Tue6",chosen_btn.getText().toString());
            editor1.putInt("Tue6",chosen);
        }

        if(pid==R.id.button16)
        {
            editor.putString("Tue7",chosen_btn.getText().toString());
            editor1.putInt("Tue7",chosen);
        }

        if(pid==R.id.button17)
        {
            editor.putString("Wed0",chosen_btn.getText().toString());
            editor1.putInt("Wed0",chosen);
        }

        if(pid==R.id.button18)
        {
            editor.putString("Wed1",chosen_btn.getText().toString());
            editor1.putInt("Wed1",chosen);
        }

        if(pid==R.id.button19)
        {
            editor.putString("Wed2",chosen_btn.getText().toString());
            editor1.putInt("Wed2",chosen);
        }

        if(pid==R.id.button20)
        {
            editor.putString("Wed3",chosen_btn.getText().toString());
            editor1.putInt("Wed3",chosen);
        }

        if(pid==R.id.button21)
        {
            editor.putString("Wed4",chosen_btn.getText().toString());
            editor1.putInt("Wed4",chosen);
        }

        if(pid==R.id.button22)
        {
            editor.putString("Wed5",chosen_btn.getText().toString());
            editor1.putInt("Wed5",chosen);
        }

        if(pid==R.id.button23)
        {
            editor.putString("Wed6",chosen_btn.getText().toString());
            editor1.putInt("Wed6",chosen);
        }

        if(pid==R.id.button24)
        {
            editor.putString("Wed7",chosen_btn.getText().toString());
            editor1.putInt("Wed7",chosen);
        }

        if(pid==R.id.button25) {
            editor.putString("Thu0" , chosen_btn.getText().toString());
            editor1.putInt("Thu0", chosen);
        }
        if(pid==R.id.button26)
        {
            editor.putString("Thu1",chosen_btn.getText().toString());
            editor1.putInt("Thu1",chosen);
        }

        if(pid==R.id.button27)
        {
            editor.putString("Thu2",chosen_btn.getText().toString());
            editor1.putInt("Thu2",chosen);
        }


        if(pid==R.id.button28)
        {
            editor.putString("Thu3",chosen_btn.getText().toString());
            editor1.putInt("Thu3",chosen);
        }

        if(pid==R.id.button29)
        {
            editor.putString("Thu4",chosen_btn.getText().toString());
            editor1.putInt("Thu4",chosen);
        }

        if(pid==R.id.button30)
        {
            editor.putString("Thu5",chosen_btn.getText().toString());
            editor1.putInt("Thu5",chosen);
        }

        if(pid==R.id.button31)
        {
            editor.putString("Thu6",chosen_btn.getText().toString());
            editor1.putInt("Thu6",chosen);
        }

        if(pid==R.id.button32)
        {
            editor.putString("Thu7",chosen_btn.getText().toString());
            editor1.putInt("Thu7",chosen);
        }

        if(pid==R.id.button33) {
            editor.putString("Fri0" , chosen_btn.getText().toString());
            editor1.putInt("Fri0" , chosen);
        }

        if(pid==R.id.button34) {
            editor.putString("Fri1", chosen_btn.getText().toString());
            editor1.putInt("Fri1", chosen);
        }

        if(pid==R.id.button35) {
            editor.putString("Fri2"  , chosen_btn.getText().toString());
            editor1.putInt("Fri2" , chosen);
        }

        if(pid==R.id.button36) {
            editor.putString("Fri3", chosen_btn.getText().toString());
            editor1.putInt("Fri3" , chosen);
        }

        if(pid==R.id.button37) {
            editor.putString("Fri4", chosen_btn.getText().toString());
            editor1.putInt("Fri4", chosen);
        }

        if(pid==R.id.button38) {
            editor.putString("Fri5", chosen_btn.getText().toString());
            editor1.putInt("Fri5", chosen);
        }

        if(pid==R.id.button39) {
            editor.putString("Fri6", chosen_btn.getText().toString());
            editor1.putInt("Fri6", chosen);
        }

        if(pid==R.id.button40) {
            editor.putString("Fri7", chosen_btn.getText().toString());
            editor1.putInt("Fri7", chosen);
        }


        if(pid==R.id.button42) {
            editor.putString("Sat0", chosen_btn.getText().toString());
            editor1.putInt("Sat0", chosen);
        }

        if(pid==R.id.button43) {
            editor.putString("Sat1", chosen_btn.getText().toString());
            editor1.putInt("Sat1", chosen);
        }

        if(pid==R.id.button44) {
            editor.putString("Sat2", chosen_btn.getText().toString());
            editor1.putInt("Sat2", chosen);
        }

        if(pid==R.id.button45) {
            editor.putString("Sat3", chosen_btn.getText().toString());
            editor1.putInt("Sat3", chosen);
        }

        if(pid==R.id.button46) {
            editor.putString("Sat4", chosen_btn.getText().toString());
            editor1.putInt("Sat4", chosen);
        }

        if(pid==R.id.button47) {
            editor.putString("Sat5", chosen_btn.getText().toString());
            editor1.putInt("Sat5", chosen);
        }

        if(pid==R.id.button48) {
            editor.putString("Sat6", chosen_btn.getText().toString());
            editor1.putInt("Sat6", chosen);
        }

        if(pid==R.id.button49) {
            editor.putString("Sat7", chosen_btn.getText().toString());
            editor1.putInt("Sat7", chosen);
        }

        editor.apply();
        editor1.apply();
    }
}