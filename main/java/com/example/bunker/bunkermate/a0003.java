package com.example.bunker.bunkermate;

import android.content.Intent;
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

        /*final EditText e1,e2,e3,e4,e5,e6,e7,e8;
        final EditText p1,p2,p3,p4,p5,p6,p7,p8,p9;
        final EditText n1,n2;
        e1=(EditText)findViewById(R.id.sub1);
        e2=(EditText)findViewById(R.id.sub2);
        e3=(EditText)findViewById(R.id.sub3);
        e4=(EditText)findViewById(R.id.sub4);
        e5=(EditText)findViewById(R.id.sub5);
        e6=(EditText)findViewById(R.id.sub6);
        e7=(EditText)findViewById(R.id.sub7);
        e8=(EditText)findViewById(R.id.sub8);

        p1=(EditText)findViewById(R.id.percent1);
        p2=(EditText)findViewById(R.id.percent2);
        p3=(EditText)findViewById(R.id.percent3);
        p4=(EditText)findViewById(R.id.percent4);
        p5=(EditText)findViewById(R.id.percent5);
        p6=(EditText)findViewById(R.id.percent6);
        p7=(EditText)findViewById(R.id.percent7);
        p8=(EditText)findViewById(R.id.percent8);
        p9=(EditText)findViewById(R.id.overall);

        n1=(EditText)findViewById(R.id.name);
        n2=(EditText)findViewById(R.id.rollno);*/

        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*boolean flag=true;

                if (e1.getText().toString().length() <= 0)
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
                if (p9.getText().toString().length() <= 2)
                    flag=false;

                if (n1.getText().toString().length() <= 2)
                    flag=false;
                if (n2.getText().toString().length() <= 2)
                    flag=false;

                if(flag==true) {*/
                    Intent i1 = new Intent(getApplicationContext(), a0004.class);
                    startActivity(i1);
                /*}
                else
                    Toast.makeText(getApplicationContext(),"Fill All Fields!",Toast.LENGTH_SHORT).show();*/
            }
        });

        final Button b2 = (Button) (findViewById(R.id.but1));
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
                            }

                            @Override
                            public void onCancel() {

                            }
                        });
            }
        });

        final Button b3 = (Button) (findViewById(R.id.but2));
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
                            }

                            @Override
                            public void onCancel() {

                            }
                        });
            }
        });

        final Button b4 = (Button) (findViewById(R.id.but3));
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
                            }

                            @Override
                            public void onCancel() {

                            }
                        });
            }
        });

        final Button b5 = (Button) (findViewById(R.id.but4));
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
                            }

                            @Override
                            public void onCancel() {

                            }
                        });
            }
        });


        final Button b6 = (Button) (findViewById(R.id.but5));
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
                            }

                            @Override
                            public void onCancel() {

                            }
                        });
            }
        });

        final Button b7 = (Button) (findViewById(R.id.but6));
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
                            }

                            @Override
                            public void onCancel() {

                            }
                        });
            }
        });

        final Button b8 = (Button) (findViewById(R.id.but7));
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
                            }

                            @Override
                            public void onCancel() {

                            }
                        });
            }
        });

        final Button b9 = (Button) (findViewById(R.id.but8));
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
                            }

                            @Override
                            public void onCancel() {

                            }
                        });
            }
        });


        final Button b10 = (Button) (findViewById(R.id.but9));
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
                            }

                            @Override
                            public void onCancel() {

                            }
                        });
            }
        });
    }
}