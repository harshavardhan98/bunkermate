package com.example.bunker.bunkermate;

import android.content.Intent;
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

    public static int chosen=0;
    public void clickFunction(View v)
    {
        Log.i("info","button pressed");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a0004);

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
                chosen= Color.parseColor("#ffffff");
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