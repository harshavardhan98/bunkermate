package com.example.bunker.bunkermate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.ArrayList;

import petrov.kristiyan.colorpicker.ColorPicker;

public class a0003 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a0003);

        final EditText e1,e2,e3,e4,e5,e6,e7,e8,e9;
        final EditText p10;
        final EditText n1,n2;
        final Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
        final SharedPreferences sharedpref,sharedpref1;
        final SharedPreferences.Editor editor,editor1;

        e1=(EditText)findViewById(R.id.sub1);
        e2=(EditText)findViewById(R.id.sub2);
        e3=(EditText)findViewById(R.id.sub3);
        e4=(EditText)findViewById(R.id.sub4);
        e5=(EditText)findViewById(R.id.sub5);
        e6=(EditText)findViewById(R.id.sub6);
        e7=(EditText)findViewById(R.id.sub7);
        e8=(EditText)findViewById(R.id.sub8);
        e9=(EditText)findViewById(R.id.sub9);

        p10=(EditText)findViewById(R.id.overall);

        b1 = (Button) (findViewById(R.id.start));
        b2 = (Button) (findViewById(R.id.next));
        b3 = (Button) (findViewById(R.id.but2));
        b4 = (Button) (findViewById(R.id.but3));
        b5 = (Button) (findViewById(R.id.but4));
        b6 = (Button) (findViewById(R.id.but5));
        b7 = (Button) (findViewById(R.id.but6));
        b8 = (Button) (findViewById(R.id.but7));
        b9 = (Button) (findViewById(R.id.but8));
        b10= (Button) (findViewById(R.id.but9));

        e1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        e2.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        e3.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        e4.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        e5.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        e6.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        e7.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        e8.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        e9.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

        sharedpref=getSharedPreferences("subject", Context.MODE_PRIVATE);
        editor=sharedpref.edit();
        sharedpref1=getSharedPreferences("colors", Context.MODE_PRIVATE);
        editor1=sharedpref1.edit();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean flag=true;
                int j;
                String sub="sub";
                SharedPreferences sharedpref1=getSharedPreferences("colors", Context.MODE_PRIVATE);

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
                if (p10.getText().toString().length() <= 2)
                    flag=false;

                for(j=1;j<=6;j++) {
                        if (Integer.toHexString(sharedpref1.getInt(sub+j, 0)).equals("0"))
                            break;
                }
                if(j<=6)
                    flag=false;*/

                if(flag==true) {
                    ArrayList<String> list=new ArrayList<String>();

                    spliter(e1.getText().toString(),1,list);
                    spliter(e2.getText().toString(),2,list);
                    spliter(e3.getText().toString(),3,list);
                    spliter(e4.getText().toString(),4,list);
                    spliter(e5.getText().toString(),5,list);
                    spliter(e6.getText().toString(),6,list);
                    if(!(e7.getText().toString()).equals(""))
                        spliter(e7.getText().toString(),7,list);
                    if(!(e8.getText().toString()).equals(""))
                        spliter(e8.getText().toString(),8,list);
                    if(!(e9.getText().toString()).equals(""))
                        spliter(e9.getText().toString(),9,list);

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

                    Intent i1 = new Intent(getApplicationContext(), a0004.class);
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

                cp.show();
                cp.setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                            @Override
                            public void onChooseColor(int position, int color) {
                                if(!Integer.toString(color).equals("0")) {
                                    b2.setBackgroundColor(color);
                                    editor1.putInt("sub1", color);
                                    editor1.apply();
                                }
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

                cp.show();
                cp.setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                            @Override
                            public void onChooseColor(int position, int color) {
                                if(!Integer.toString(color).equals("0"))
                                {
                                    b3.setBackgroundColor(color);
                                    editor1.putInt("sub2", color);
                                    editor1.apply();
                                }
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

                cp.show();
                cp.setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                            @Override
                            public void onChooseColor(int position, int color) {
                                if(!Integer.toString(color).equals("0"))
                                {
                                    b4.setBackgroundColor(color);
                                    editor1.putInt("sub3",color);
                                    editor1.apply();
                                }
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

                cp.show();
                cp.setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                            @Override
                            public void onChooseColor(int position, int color) {
                                if(!Integer.toString(color).equals("0")) {
                                    b5.setBackgroundColor(color);
                                    editor1.putInt("sub4", color);
                                    editor1.apply();
                                }
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

                cp.show();
                cp.setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                            @Override
                            public void onChooseColor(int position, int color) {
                                if(!Integer.toString(color).equals("0")) {
                                    b6.setBackgroundColor(color);
                                    editor1.putInt("sub5", color);
                                    editor1.apply();
                                }
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

                cp.show();
                cp.setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                            @Override
                            public void onChooseColor(int position, int color) {
                                if(!Integer.toString(color).equals("0")) {
                                    b7.setBackgroundColor(color);
                                    editor1.putInt("sub6", color);
                                    editor1.apply();
                                }
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

                cp.show();
                cp.setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                            @Override
                            public void onChooseColor(int position, int color) {
                                if(!Integer.toString(color).equals("0")) {
                                    b8.setBackgroundColor(color);
                                    editor1.putInt("sub7", color);
                                    editor1.apply();
                                }
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

                cp.show();
                cp.setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                            @Override
                            public void onChooseColor(int position, int color) {
                                if(!Integer.toString(color).equals("0")) {
                                    b9.setBackgroundColor(color);
                                    editor1.putInt("sub8", color);
                                    editor1.apply();
                                }
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

                cp.show();
                cp.setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                            @Override
                            public void onChooseColor(int position, int color) {
                                if(!Integer.toString(color).equals("0")) {
                                    b10.setBackgroundColor(color);
                                    editor1.putInt("sub9", color);
                                    editor1.apply();
                                }
                            }

                            @Override
                            public void onCancel() {

                            }
                        });
            }
        });
    }
    public void spliter(String str,int i,ArrayList<String> list)
    {
        String sub="sub";
        String got;
        SharedPreferences sharedpref2=getSharedPreferences("shortcut", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor2=sharedpref2.edit();

        if (str.length() > 3) {
            try{
                if (str.contains(" ")) {
                    String s[] = str.split(" ");
                    got=s[0].substring(0, 2)+s[1].charAt(0);
                } else
                    got=str.substring(0, 3);
            }
            catch (Exception e)
            {
                got=str.substring(0, 3);
            }
        }
        else
            got=str;

        for(String temp:list){
            if(got.equals(temp)){
                got=got+1;
            }
        }
        list.add(got);
        editor2.putString(sub + i, got);
        editor2.apply();
    }
}