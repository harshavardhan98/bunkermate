package bmate.ack.bunker.bunkermate;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import bmate.bunkermate.R;
import petrov.kristiyan.colorpicker.ColorPicker;

public class a0002 extends AppCompatActivity {

    GradientDrawable gd;
    public static int backButtonCount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a0002);

        final EditText e1, e2, e3, e4, e5, e6, e7, e8, e9, e10;
        final Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
        final SharedPreferences Colors = getSharedPreferences("colors", Context.MODE_PRIVATE);
        final SharedPreferences.Editor EColors = Colors.edit();

        e1 = (EditText) findViewById(R.id.sub1);    e1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        e2 = (EditText) findViewById(R.id.sub2);    e2.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        e3 = (EditText) findViewById(R.id.sub3);    e3.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        e4 = (EditText) findViewById(R.id.sub4);    e4.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        e5 = (EditText) findViewById(R.id.sub5);    e5.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        e6 = (EditText) findViewById(R.id.sub6);    e6.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        e7 = (EditText) findViewById(R.id.sub7);    e7.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        e8 = (EditText) findViewById(R.id.sub8);    e8.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        e9 = (EditText) findViewById(R.id.sub9);    e9.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        e10 = (EditText) findViewById(R.id.overall);

        b1 = (Button) (findViewById(R.id.but1));
        b2 = (Button) (findViewById(R.id.but2));
        b3 = (Button) (findViewById(R.id.but3));
        b4 = (Button) (findViewById(R.id.but4));
        b5 = (Button) (findViewById(R.id.but5));
        b6 = (Button) (findViewById(R.id.but6));
        b7 = (Button) (findViewById(R.id.but7));
        b8 = (Button) (findViewById(R.id.but8));
        b9 = (Button) (findViewById(R.id.but9));
        b10 = (Button) (findViewById(R.id.button1));

        /**************************************************************************************/

        final AlertDialog.Builder alert=new AlertDialog.Builder(this);
        alert.setMessage("Enter the Subject-Name").setPositiveButton("NEXT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                alert.setMessage("Choose the Colour for each Subject").setPositiveButton("NEXT", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        alert.setMessage("Enter the Required Overall Percentage").setPositiveButton("FINISH", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).setTitle("Welcome Buddy!").create();
                        alert.show();
                    }
                }).setTitle("Welcome Buddy!").create();
                alert.show();
            }
        }).setTitle("Welcome Buddy!").create();
        alert.show();

        /**************************************************************************************/
        //When Color button(1-9) is Clicked...

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ColorPicker cp = new ColorPicker(a0002.this);
                cp.show();
                cp.setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                    @Override
                    public void onChooseColor(int position, int color) {
                        if (!Integer.toString(color).equals("0")) {
                            gd=(GradientDrawable) b1.getBackground().mutate();      gd.setColor(color);
                            EColors.putInt("sub1", color);
                            EColors.apply();
                        }
                    }

                    @Override
                    public void onCancel() {

                    }
                });
            }
        });

        /**************************************************************************************/

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ColorPicker cp = new ColorPicker(a0002.this);
                cp.show();
                cp.setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                    @Override
                    public void onChooseColor(int position, int color) {
                        if (!Integer.toString(color).equals("0")) {
                            gd=(GradientDrawable) b2.getBackground().mutate();      gd.setColor(color);
                            EColors.putInt("sub2", color);
                            EColors.apply();
                        }
                    }

                    @Override
                    public void onCancel() {

                    }
                });
            }
        });

        /**************************************************************************************/

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ColorPicker cp = new ColorPicker(a0002.this);

                cp.show();
                cp.setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                    @Override
                    public void onChooseColor(int position, int color) {
                        if (!Integer.toString(color).equals("0")) {
                            gd=(GradientDrawable) b3.getBackground().mutate();      gd.setColor(color);
                            EColors.putInt("sub3", color);
                            EColors.apply();
                        }
                    }

                    @Override
                    public void onCancel() {

                    }
                });
            }
        });

        /**************************************************************************************/

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ColorPicker cp = new ColorPicker(a0002.this);

                cp.show();
                cp.setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                    @Override
                    public void onChooseColor(int position, int color) {
                        if (!Integer.toString(color).equals("0")) {
                            gd=(GradientDrawable) b4.getBackground().mutate();      gd.setColor(color);
                            EColors.putInt("sub4", color);
                            EColors.apply();
                        }
                    }

                    @Override
                    public void onCancel() {

                    }
                });
            }
        });

        /**************************************************************************************/

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ColorPicker cp = new ColorPicker(a0002.this);

                cp.show();
                cp.setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                    @Override
                    public void onChooseColor(int position, int color) {
                        if (!Integer.toString(color).equals("0")) {
                            gd=(GradientDrawable) b5.getBackground().mutate();      gd.setColor(color);
                            EColors.putInt("sub5", color);
                            EColors.apply();
                        }
                    }

                    @Override
                    public void onCancel() {

                    }
                });
            }
        });

        /**************************************************************************************/

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ColorPicker cp = new ColorPicker(a0002.this);

                cp.show();
                cp.setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                    @Override
                    public void onChooseColor(int position, int color) {
                        if (!Integer.toString(color).equals("0")) {
                            gd=(GradientDrawable) b6.getBackground().mutate();      gd.setColor(color);
                            EColors.putInt("sub6", color);
                            EColors.apply();
                        }
                    }

                    @Override
                    public void onCancel() {

                    }
                });
            }
        });

        /**************************************************************************************/

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ColorPicker cp = new ColorPicker(a0002.this);

                cp.show();
                cp.setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                    @Override
                    public void onChooseColor(int position, int color) {
                        if (!Integer.toString(color).equals("0")) {
                            gd=(GradientDrawable) b7.getBackground().mutate();      gd.setColor(color);
                            EColors.putInt("sub7", color);
                            EColors.apply();
                        }
                    }

                    @Override
                    public void onCancel() {

                    }
                });
            }
        });

        /**************************************************************************************/

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ColorPicker cp = new ColorPicker(a0002.this);

                cp.show();
                cp.setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                    @Override
                    public void onChooseColor(int position, int color) {
                        if (!Integer.toString(color).equals("0")) {
                            gd=(GradientDrawable) b8.getBackground().mutate();      gd.setColor(color);
                            EColors.putInt("sub8", color);
                            EColors.apply();
                        }
                    }

                    @Override
                    public void onCancel() {

                    }
                });
            }
        });

        /**************************************************************************************/

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ColorPicker cp = new ColorPicker(a0002.this);

                cp.show();
                cp.setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                    @Override
                    public void onChooseColor(int position, int color) {
                        if (!Integer.toString(color).equals("0")) {
                            gd=(GradientDrawable) b9.getBackground().mutate();      gd.setColor(color);
                            EColors.putInt("sub9", color);
                            EColors.apply();
                        }
                    }

                    @Override
                    public void onCancel() {

                    }
                });
            }
        });

        /**************************************************************************************/
        //When NEXT button is Clicked...
        //Assuming 6 Subjects and 6 Colors and Overall Percentage is Mandatory
        //If the above condition is TRUE, Initialize TimeTable Colors to WHITE

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences Subject = getSharedPreferences("subject", Context.MODE_PRIVATE);
                SharedPreferences.Editor ESubject = Subject.edit();
                boolean flag = true;
                int j;

                if (e1.getText().toString().length() <= 0)      flag=false;
                if (e2.getText().toString().length() <= 0)      flag=false;
                if (e3.getText().toString().length() <= 0)      flag=false;
                if (e4.getText().toString().length() <= 0)      flag=false;
                if (e5.getText().toString().length() <= 0)      flag=false;
                if (e6.getText().toString().length() <= 0)      flag=false;
                if (e10.getText().toString().length() <= 2)     flag=false;

                for(j=1;j<=6;j++) {
                    if (Integer.toHexString(Colors.getInt("sub"+j, 0)).equals("0"))
                        break;
                }
                if(j<=6)
                    flag=false;

                if (flag == true) {
                    ArrayList<String> list = new ArrayList<String>();

                    spliter(e1.getText().toString(), 1, list);
                    spliter(e2.getText().toString(), 2, list);
                    if (e3.getText().toString().length() > 0)
                    spliter(e3.getText().toString(), 3, list);
                    if (e4.getText().toString().length() > 0)
                    spliter(e4.getText().toString(), 4, list);
                    if (e5.getText().toString().length() > 0)
                    spliter(e5.getText().toString(), 5, list);
                    if (e6.getText().toString().length() > 0)
                    spliter(e6.getText().toString(), 6, list);
                    if (e7.getText().toString().length() > 0)
                        spliter(e7.getText().toString(), 7, list);
                    if (e8.getText().toString().length() > 0)
                        spliter(e8.getText().toString(), 8, list);
                    if (e9.getText().toString().length() > 0)
                        spliter(e9.getText().toString(), 9, list);

                    SharedPreferences Status=getSharedPreferences("status", Context.MODE_PRIVATE);
                    SharedPreferences.Editor EStatus=Status.edit();
                    EStatus.putInt("status",100);
                    EStatus.apply();

                    initialize();
                    String val=e10.getEditableText().toString();
                    Float ma=Float.parseFloat(val.substring(0,val.length()-2));
                    ESubject.putFloat("ma",ma/100);    ESubject.apply();

                    Intent i1 = new Intent(getApplicationContext(), a0003.class);
                    startActivity(i1);
                } else
                    Toast.makeText(getApplicationContext(), "Fill All Fields!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**************************************************************************************/
    //Assign a Unique Name to Each Subject

    public void spliter(String str, int i, ArrayList<String> list) {
        String got;
        SharedPreferences Subject = getSharedPreferences("subject", Context.MODE_PRIVATE);
        SharedPreferences.Editor ESubject = Subject.edit();

        if (str.length() > 3) {
            try {
                if (str.contains(" ")) {
                    String s[] = str.split(" ");
                    got = s[0].substring(0, 2) + s[1].charAt(0);
                } else
                    got = str.substring(0, 3);
            } catch (Exception e) {
                got = str.substring(0, 3);
            }
        } else
            got = str;

        for (String temp : list) {
            if (got.equals(temp)) {
                got = got + 1;
            }
        }
        list.add(got);
        ESubject.putString("sub" + i, got);
        ESubject.apply();
    }

    /**************************************************************************************/
    //Initialize TimeTable Colors to WHITE Because No-one tend to give FREE Hours Separately

    public void initialize()
    {
        int chosen= Color.WHITE;
        String chosen1=" ";
        String sub[]={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        SharedPreferences Timetable=getSharedPreferences("timetable", Context.MODE_PRIVATE);
        SharedPreferences.Editor ETimetable=Timetable.edit();
        SharedPreferences TTColor=getSharedPreferences("timetable_color", Context.MODE_PRIVATE);
        SharedPreferences.Editor ETTColor=TTColor.edit();

        for(int j=0;j<7;j++) {
            for (int i = 1; i <= 8; i++) {
                ETimetable.putString(sub[j] + i,chosen1);
                ETTColor.putInt(sub[j] + i, chosen);
            }
        }
        ETimetable.apply();
        ETTColor.apply();
    }

    /**************************************************************************************/

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
}