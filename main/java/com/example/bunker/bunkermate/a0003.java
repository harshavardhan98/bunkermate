package com.example.bunker.bunkermate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import petrov.kristiyan.colorpicker.ColorPicker;

public class a0003 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a0003);

        final int arr[]=new int[9];
        final String subb[]=new String[9];

        Spinner sp = findViewById(R.id.dept);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.department, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Spinner sp1 = findViewById(R.id.year);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.year, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(adapter1);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final EditText e1,e2,e3,e4,e5,e6,e7,e8,e9;
        final EditText p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
        final EditText n1,n2;
        final Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
        final SharedPreferences sharedpref,sharedpref1,sharedpref2;
        final SharedPreferences.Editor editor,editor1,editor2;

        e1=(EditText)findViewById(R.id.sub1);
        e2=(EditText)findViewById(R.id.sub2);
        e3=(EditText)findViewById(R.id.sub3);
        e4=(EditText)findViewById(R.id.sub4);
        e5=(EditText)findViewById(R.id.sub5);
        e6=(EditText)findViewById(R.id.sub6);
        e7=(EditText)findViewById(R.id.sub7);
        e8=(EditText)findViewById(R.id.sub8);
        e9=(EditText)findViewById(R.id.sub9);

        p1=(EditText)findViewById(R.id.percent1);
        p2=(EditText)findViewById(R.id.percent2);
        p3=(EditText)findViewById(R.id.percent3);
        p4=(EditText)findViewById(R.id.percent4);
        p5=(EditText)findViewById(R.id.percent5);
        p6=(EditText)findViewById(R.id.percent6);
        p7=(EditText)findViewById(R.id.percent7);
        p8=(EditText)findViewById(R.id.percent8);
        p9=(EditText)findViewById(R.id.percent9);
        p10=(EditText)findViewById(R.id.overall);

        n1=(EditText)findViewById(R.id.name);
        n2=(EditText)findViewById(R.id.rollno);

        b1 = (Button) (findViewById(R.id.button1));
        b2 = (Button) (findViewById(R.id.but1));
        b3 = (Button) (findViewById(R.id.but2));
        b4 = (Button) (findViewById(R.id.but3));
        b5 = (Button) (findViewById(R.id.but4));
        b6 = (Button) (findViewById(R.id.but5));
        b7 = (Button) (findViewById(R.id.but6));
        b8 = (Button) (findViewById(R.id.but7));
        b9 = (Button) (findViewById(R.id.but8));
        b10= (Button) (findViewById(R.id.but9));

        sharedpref1=getSharedPreferences("colors", Context.MODE_PRIVATE);
        editor1=sharedpref1.edit();
        sharedpref=getSharedPreferences("subject", Context.MODE_PRIVATE);
        editor=sharedpref.edit();
        sharedpref2=getSharedPreferences("percent", Context.MODE_PRIVATE);
        editor2=sharedpref2.edit();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean flag=true;

                /*if (e1.getText().toString().length() <= 0)
                  flag=false;
                if (e2.getText().toString().length() <= 0)
                  flag=false;
                if (e3.getText().toString().length() <= 0)
                  flag=false;
                if (e4.getText().toString().length() <= 0)
                  flag=false;
                if (e5.getText().toString().length() <= 0)
                    flag=false;
                if (e6.getText().toString().length() <= 0)
                    flag=false;
                if (e7.getText().toString().length() <= 0)
                    flag=false;
                if (e8.getText().toString().length() <= 0)
                    flag=false;

                if (p1.getText().toString().length() <= 2)
                    flag=false;
                if (p2.getText().toString().length() <= 2)
                    flag=false;
                if (p3.getText().toString().length() <= 2)
                    flag=false;
                if (p4.getText().toString().length() <= 2)
                    flag=false;
                if (p5.getText().toString().length() <= 2)
                    flag=false;
                if (p6.getText().toString().length() <= 2)
                    flag=false;
                if (p7.getText().toString().length() <= 2)
                    flag=false;
                if (p8.getText().toString().length() <= 2)
                    flag=false;
                if (p10.getText().toString().length() <= 2)
                    flag=false;

                if (n1.getText().toString().length() <= 2)
                    flag=false;
                if (n2.getText().toString().length() <= 2)
                    flag=false;*/

                if(flag==true) {
                    //Toast.makeText(this, e1.getText().toString(), Toast.LENGTH_SHORT).show();
                    editor.putString("sub1",e1.getText().toString());
                    editor.putString("sub2",e2.getText().toString());
                    editor.putString("sub3",e3.getText().toString());
                    editor.putString("sub4",e4.getText().toString());
                    editor.putString("sub5",e5.getText().toString());
                    editor.putString("sub6",e6.getText().toString());
                    editor.putString("sub7",e7.getText().toString());
                    editor.putString("sub8",e8.getText().toString());
                    editor.putString("sub9",e9.getText().toString());
                    editor.apply();

                    editor2.putString("per1",p1.getText().toString());
                    editor2.putString("per2",p2.getText().toString());
                    editor2.putString("per3",p3.getText().toString());
                    editor2.putString("per4",p4.getText().toString());
                    editor2.putString("per5",p5.getText().toString());
                    editor2.putString("per6",p6.getText().toString());
                    editor2.putString("per7",p7.getText().toString());
                    editor2.putString("per8",p8.getText().toString());
                    editor2.putString("per9",p9.getText().toString());
                    editor2.putString("over",p10.getText().toString());
                    editor2.apply();

                    Intent i1 = new Intent(getApplicationContext(), a0004.class);
                    Bundle b=new Bundle();
                    b.putIntArray("key",arr);
                    subb[0]=e1.getText().toString();
                    subb[1]=e2.getText().toString();
                    subb[2]=e3.getText().toString();
                    subb[3]=e4.getText().toString();
                    subb[4]=e5.getText().toString();
                    subb[5]=e6.getText().toString();
                    subb[6]=e7.getText().toString();
                    subb[6]=e8.getText().toString();
                    subb[7]=e9.getText().toString();

                    b.putStringArray("key1",subb);
                    i1.putExtras(b);
                    startActivity(i1);
                }
                else
                    Toast.makeText(getApplicationContext(),"Fill All Fields!",Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ColorPicker cp = new ColorPicker(a0003.this);
                ArrayList<String> c = new ArrayList<>();

                c.add("#ffdb00");
                c.add("#00ff19");
                c.add("#e81f3f");
                c.add("#11aac4");
                c.add("#ff00ff");
                c.add("#001bff");
                c.add("#ff00a2");
                c.add("#a200ff");
                c.add("#ff9700");
                c.add("#f97c4d");

                cp.show();

                cp.setColors(c)
                        .setColumns(5)
                        .setRoundColorButton(true)
                        .setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                            @Override
                            public void onChooseColor(int position, int color) {

                                b2.setBackgroundColor(color);
                                arr[0]=color;
                                editor1.putInt("sub1",color);
                                editor1.apply();
                            }

                            @Override
                            public void onCancel() {

                            }
                        });
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ColorPicker cp = new ColorPicker(a0003.this);
                ArrayList<String> c = new ArrayList<>();

                c.add("#ffdb00");
                c.add("#00ff19");
                c.add("#e81f3f");
                c.add("#11aac4");
                c.add("#ff00ff");
                c.add("#001bff");
                c.add("#ff00a2");
                c.add("#a200ff");
                c.add("#ff9700");
                c.add("#f97c4d");

                cp.show();

                cp.setColors(c)
                        .setColumns(5)
                        .setRoundColorButton(true)
                        .setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                            @Override
                            public void onChooseColor(int position, int color) {

                                b3.setBackgroundColor(color);
                                arr[1]=color;
                                editor1.putInt("sub2",color);
                                editor1.apply();
                            }

                            @Override
                            public void onCancel() {

                            }
                        });
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ColorPicker cp = new ColorPicker(a0003.this);
                ArrayList<String> c = new ArrayList<>();

                c.add("#ffdb00");
                c.add("#00ff19");
                c.add("#e81f3f");
                c.add("#11aac4");
                c.add("#ff00ff");
                c.add("#001bff");
                c.add("#ff00a2");
                c.add("#a200ff");
                c.add("#ff9700");
                c.add("#f97c4d");

                cp.show();

                cp.setColors(c)
                        .setColumns(5)
                        .setRoundColorButton(true)
                        .setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                            @Override
                            public void onChooseColor(int position, int color) {

                                b4.setBackgroundColor(color);
                                arr[2]=color;
                                editor1.putInt("sub3",color);
                                editor1.apply();
                            }

                            @Override
                            public void onCancel() {

                            }
                        });
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ColorPicker cp = new ColorPicker(a0003.this);
                ArrayList<String> c = new ArrayList<>();

                c.add("#ffdb00");
                c.add("#00ff19");
                c.add("#e81f3f");
                c.add("#11aac4");
                c.add("#ff00ff");
                c.add("#001bff");
                c.add("#ff00a2");
                c.add("#a200ff");
                c.add("#ff9700");
                c.add("#f97c4d");

                cp.show();

                cp.setColors(c)
                        .setColumns(5)
                        .setRoundColorButton(true)
                        .setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                            @Override
                            public void onChooseColor(int position, int color) {

                                b5.setBackgroundColor(color);
                                arr[3]=color;
                                editor1.putInt("sub4",color);
                                editor1.apply();
                            }

                            @Override
                            public void onCancel() {

                            }
                        });
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ColorPicker cp = new ColorPicker(a0003.this);
                ArrayList<String> c = new ArrayList<>();

                c.add("#ffdb00");
                c.add("#00ff19");
                c.add("#e81f3f");
                c.add("#11aac4");
                c.add("#ff00ff");
                c.add("#001bff");
                c.add("#ff00a2");
                c.add("#a200ff");
                c.add("#ff9700");
                c.add("#f97c4d");

                cp.show();

                cp.setColors(c)
                        .setColumns(5)
                        .setRoundColorButton(true)
                        .setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                            @Override
                            public void onChooseColor(int position, int color) {

                                b6.setBackgroundColor(color);
                                arr[4]=color;
                                editor1.putInt("sub5",color);
                                editor1.apply();
                            }

                            @Override
                            public void onCancel() {

                            }
                        });
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ColorPicker cp = new ColorPicker(a0003.this);
                ArrayList<String> c = new ArrayList<>();

                c.add("#ffdb00");
                c.add("#00ff19");
                c.add("#e81f3f");
                c.add("#11aac4");
                c.add("#ff00ff");
                c.add("#001bff");
                c.add("#ff00a2");
                c.add("#a200ff");
                c.add("#ff9700");
                c.add("#f97c4d");

                cp.show();

                cp.setColors(c)
                        .setColumns(5)
                        .setRoundColorButton(true)
                        .setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                            @Override
                            public void onChooseColor(int position, int color) {

                                b7.setBackgroundColor(color);
                                arr[5]=color;
                                editor1.putInt("sub6",color);
                                editor1.apply();
                            }

                            @Override
                            public void onCancel() {

                            }
                        });
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ColorPicker cp = new ColorPicker(a0003.this);
                ArrayList<String> c = new ArrayList<>();

                c.add("#ffdb00");
                c.add("#00ff19");
                c.add("#e81f3f");
                c.add("#11aac4");
                c.add("#ff00ff");
                c.add("#001bff");
                c.add("#ff00a2");
                c.add("#a200ff");
                c.add("#ff9700");
                c.add("#f97c4d");

                cp.show();

                cp.setColors(c)
                        .setColumns(5)
                        .setRoundColorButton(true)
                        .setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                            @Override
                            public void onChooseColor(int position, int color) {

                                b8.setBackgroundColor(color);
                                arr[6]=color;
                                editor1.putInt("sub7",color);
                                editor1.apply();
                            }

                            @Override
                            public void onCancel() {

                            }
                        });
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ColorPicker cp = new ColorPicker(a0003.this);
                ArrayList<String> c = new ArrayList<>();

                c.add("#ffdb00");
                c.add("#00ff19");
                c.add("#e81f3f");
                c.add("#11aac4");
                c.add("#ff00ff");
                c.add("#001bff");
                c.add("#ff00a2");
                c.add("#a200ff");
                c.add("#ff9700");
                c.add("#f97c4d");

                cp.show();

                cp.setColors(c)
                        .setColumns(5)
                        .setRoundColorButton(true)
                        .setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                            @Override
                            public void onChooseColor(int position, int color) {

                                b9.setBackgroundColor(color);
                                arr[7]=color;
                                editor1.putInt("sub8",color);
                                editor1.apply();
                            }

                            @Override
                            public void onCancel() {

                            }
                        });
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ColorPicker cp = new ColorPicker(a0003.this);
                ArrayList<String> c = new ArrayList<>();

                c.add("#ffdb00");
                c.add("#00ff19");
                c.add("#e81f3f");
                c.add("#11aac4");
                c.add("#ff00ff");
                c.add("#001bff");
                c.add("#ff00a2");
                c.add("#a200ff");
                c.add("#ff9700");
                c.add("#f97c4d");

                cp.show();

                cp.setColors(c)
                        .setColumns(5)
                        .setRoundColorButton(true)
                        .setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                            @Override
                            public void onChooseColor(int position, int color) {

                                b10.setBackgroundColor(color);
                                arr[8]=color;
                                editor1.putInt("sub9",color);
                                editor1.apply();
                            }

                            @Override
                            public void onCancel() {

                            }
                        });
            }
        });
    }
}