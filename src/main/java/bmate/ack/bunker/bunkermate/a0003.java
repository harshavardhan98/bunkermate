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
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import bmate.bunkermate.R;

public class a0003 extends AppCompatActivity implements View.OnClickListener {

    public static int chosen=0,backButtonCount=0;
    public static String chosen1;
    public GradientDrawable gd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a0003);

        final SharedPreferences Colors=getSharedPreferences("colors", Context.MODE_PRIVATE);
        final SharedPreferences Subject=getSharedPreferences("subject", Context.MODE_PRIVATE);
        final SharedPreferences Timetable=getSharedPreferences("timetable", Context.MODE_PRIVATE);
        final SharedPreferences.Editor ETimetable=Timetable.edit();
        final SharedPreferences TTColor=getSharedPreferences("timetable_color", Context.MODE_PRIVATE);
        final SharedPreferences.Editor ETTColor=TTColor.edit();

        final AlertDialog.Builder alert=new AlertDialog.Builder(this);

        alert.setMessage("First, Click the Radio Button").setPositiveButton("NEXT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                alert.setMessage("And then Click the Corresponding Cells in Table").setPositiveButton("FINISH", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setTitle("Time-Table Integration").create();
                alert.show();
            }
        }).setTitle("Time-Table Integration").create();
        alert.show();

        /**************************************************************************************/

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

        String sub="sub";
        b1.setBackgroundColor(Colors.getInt(sub+1,0));  b1.setText(Subject.getString(sub+1,""));
        b2.setBackgroundColor(Colors.getInt(sub+2,0));  b2.setText(Subject.getString(sub+2,""));
        b3.setBackgroundColor(Colors.getInt(sub+3,0));  b3.setText(Subject.getString(sub+3,""));
        b4.setBackgroundColor(Colors.getInt(sub+4,0));  b4.setText(Subject.getString(sub+4,""));
        b5.setBackgroundColor(Colors.getInt(sub+5,0));  b5.setText(Subject.getString(sub+5,""));
        b6.setBackgroundColor(Colors.getInt(sub+6,0));  b6.setText(Subject.getString(sub+6,""));
        b7.setBackgroundColor(Colors.getInt(sub+7,0));  b7.setText(Subject.getString(sub+7,""));
        b8.setBackgroundColor(Colors.getInt(sub+8,0));  b8.setText(Subject.getString(sub+8,""));
        b9.setBackgroundColor(Colors.getInt(sub+9,0));  b9.setText(Subject.getString(sub+9,""));

        final Button a1=(Button) findViewById(R.id.button1);     a1.setOnClickListener(this);
        final Button a2=(Button) findViewById(R.id.button2);     a2.setOnClickListener(this);
        final Button a3=(Button) findViewById(R.id.button3);     a3.setOnClickListener(this);
        final Button a4=(Button) findViewById(R.id.button4);     a4.setOnClickListener(this);
        final Button a5=(Button) findViewById(R.id.button5);     a5.setOnClickListener(this);
        final Button a6=(Button) findViewById(R.id.button6);     a6.setOnClickListener(this);
        final Button a7=(Button) findViewById(R.id.button7);     a7.setOnClickListener(this);
        final Button a8=(Button) findViewById(R.id.button8);     a8.setOnClickListener(this);

        final Button c1=(Button) findViewById(R.id.button9);     c1.setOnClickListener(this);
        final Button c2=(Button) findViewById(R.id.button10);     c2.setOnClickListener(this);
        final Button c3=(Button) findViewById(R.id.button11);     c3.setOnClickListener(this);
        final Button c4=(Button) findViewById(R.id.button12);     c4.setOnClickListener(this);
        final Button c5=(Button) findViewById(R.id.button13);     c5.setOnClickListener(this);
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

        final Button g1=(Button) findViewById(R.id.button41);     g1.setOnClickListener(this);
        final Button g2=(Button) findViewById(R.id.button42);     g2.setOnClickListener(this);
        final Button g3=(Button) findViewById(R.id.button43);     g3.setOnClickListener(this);
        final Button g4=(Button) findViewById(R.id.button44);     g4.setOnClickListener(this);
        final Button g5=(Button) findViewById(R.id.button45);     g5.setOnClickListener(this);
        final Button g6=(Button) findViewById(R.id.button46);     g6.setOnClickListener(this);
        final Button g7=(Button) findViewById(R.id.button47);     g7.setOnClickListener(this);
        final Button g8=(Button) findViewById(R.id.button48);     g8.setOnClickListener(this);

        /**************************************************************************************/
        //When Saturday Checkbox is Checked...

        final CheckBox c=(CheckBox)findViewById(R.id.ckbox1);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c.isChecked()) {
                    gd=(GradientDrawable) g1.getBackground().mutate();  gd.setColor(Color.WHITE);   g1.setText(" ");
                    gd=(GradientDrawable) g2.getBackground().mutate();  gd.setColor(Color.WHITE);   g2.setText(" ");
                    gd=(GradientDrawable) g3.getBackground().mutate();  gd.setColor(Color.WHITE);   g3.setText(" ");
                    gd=(GradientDrawable) g4.getBackground().mutate();  gd.setColor(Color.WHITE);   g4.setText(" ");
                    gd=(GradientDrawable) g5.getBackground().mutate();  gd.setColor(Color.WHITE);   g5.setText(" ");
                    gd=(GradientDrawable) g6.getBackground().mutate();  gd.setColor(Color.WHITE);   g6.setText(" ");
                    gd=(GradientDrawable) g7.getBackground().mutate();  gd.setColor(Color.WHITE);   g7.setText(" ");
                    gd=(GradientDrawable) g8.getBackground().mutate();  gd.setColor(Color.WHITE);   g8.setText(" ");
                    for(int i=1;i<=8;i++)
                    {
                        ETimetable.putString("Sat"+i, " ");   ETTColor.putInt("Sat"+i, Color.WHITE);    ETimetable.apply();     ETTColor.apply();
                    }
                }
            }
        });

        /**************************************************************************************/
        //When FINISH button is Clicked...

        final Button finish=(Button) findViewById(R.id.button49);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(c.isChecked())
                ETimetable.putBoolean("check",true);
            else
                ETimetable.putBoolean("check",false);
            ETimetable.apply();

            SharedPreferences Status=getSharedPreferences("status", Context.MODE_PRIVATE);
            SharedPreferences.Editor EStatus=Status.edit();
            EStatus.putInt("status",200);
            EStatus.apply();

            Intent i1 = new Intent(getApplicationContext(), a0004.class);
            startActivity(i1);
            }
        });

        /**************************************************************************************/
        //When Radio Button(Subject) is Clicked...

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
                chosen=Colors.getInt("sub1",0);
                chosen1=b1.getText().toString();
            }
        });

        /**************************************************************************************/

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
                chosen=Colors.getInt("sub2",0);
                chosen1=b2.getText().toString();
            }
        });

        /**************************************************************************************/

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
                chosen=Colors.getInt("sub3",0);
                chosen1=b3.getText().toString();
            }
        });

        /**************************************************************************************/

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
                chosen=Colors.getInt("sub4",0);
                chosen1=b4.getText().toString();
            }
        });

        /**************************************************************************************/

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
                chosen=Colors.getInt("sub5",0);
                chosen1=b5.getText().toString();
            }
        });

        /**************************************************************************************/

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
                chosen=Colors.getInt("sub6",0);
                chosen1=b6.getText().toString();
            }
        });

        /**************************************************************************************/

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
                chosen=Colors.getInt("sub7",0);
                chosen1=b7.getText().toString();
            }
        });

        /**************************************************************************************/

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
                chosen=Colors.getInt("sub8",0);
                chosen1=b8.getText().toString();
            }
        });

        /**************************************************************************************/

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
                chosen=Colors.getInt("sub9",0);
                chosen1=b9.getText().toString();
            }
        });

        /**************************************************************************************/
        //When FREE button is Clicked...

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
                chosen1=" ";
            }
        });
    }

    /**************************************************************************************/

    @Override
    public void onClick(View v) {
        if(chosen!=0)
        {
            SharedPreferences Timetable=getSharedPreferences("timetable", Context.MODE_PRIVATE);
            SharedPreferences.Editor ETimetable=Timetable.edit();
            SharedPreferences TTColor=getSharedPreferences("timetable_color", Context.MODE_PRIVATE);
            SharedPreferences.Editor ETTColor=TTColor.edit();
            final CheckBox c=(CheckBox)findViewById(R.id.ckbox1);

            int pid=v.getId();

            /**************************************************************************************/
            //Checking Whether the Saturday Checkbox is Clicked and any one of the Saturday Entries is Clicked...

            if(!(c.isChecked() && (pid==R.id.button41 || pid==R.id.button42 || pid==R.id.button43 || pid==R.id.button44 || pid==R.id.button45 || pid==R.id.button46 || pid==R.id.button47 || pid==R.id.button48)))
            {
                gd=(GradientDrawable) v.getBackground().mutate();
                gd.setColor(chosen);
                Button b=(Button)v;
                b.setText(chosen1);

                switch(pid)
                {
                    case R.id.button1:
                        ETimetable.putString("Mon1",chosen1);   ETTColor.putInt("Mon1",chosen);   break;
                    case R.id.button2:
                        ETimetable.putString("Mon2",chosen1);   ETTColor.putInt("Mon2",chosen);   break;
                    case R.id.button3:
                        ETimetable.putString("Mon3",chosen1);   ETTColor.putInt("Mon3",chosen);   break;
                    case R.id.button4:
                        ETimetable.putString("Mon4",chosen1);   ETTColor.putInt("Mon4",chosen);   break;
                    case R.id.button5:
                        ETimetable.putString("Mon5",chosen1);   ETTColor.putInt("Mon5",chosen);   break;
                    case R.id.button6:
                        ETimetable.putString("Mon6",chosen1);   ETTColor.putInt("Mon6",chosen);   break;
                    case R.id.button7:
                        ETimetable.putString("Mon7",chosen1);   ETTColor.putInt("Mon7",chosen);   break;
                    case R.id.button8:
                        ETimetable.putString("Mon8",chosen1);   ETTColor.putInt("Mon8",chosen);   break;

                    case R.id.button9:
                        ETimetable.putString("Tue1",chosen1);   ETTColor.putInt("Tue1",chosen);   break;
                    case R.id.button10:
                        ETimetable.putString("Tue2",chosen1);   ETTColor.putInt("Tue2",chosen);   break;
                    case R.id.button11:
                        ETimetable.putString("Tue3",chosen1);   ETTColor.putInt("Tue3",chosen);   break;
                    case R.id.button12:
                        ETimetable.putString("Tue4",chosen1);   ETTColor.putInt("Tue4",chosen);   break;
                    case R.id.button13:
                        ETimetable.putString("Tue5",chosen1);   ETTColor.putInt("Tue5",chosen);   break;
                    case R.id.button14:
                        ETimetable.putString("Tue6",chosen1);   ETTColor.putInt("Tue6",chosen);   break;
                    case R.id.button15:
                        ETimetable.putString("Tue7",chosen1);   ETTColor.putInt("Tue7",chosen);   break;
                    case R.id.button16:
                        ETimetable.putString("Tue8",chosen1);   ETTColor.putInt("Tue8",chosen);   break;

                    case R.id.button17:
                        ETimetable.putString("Wed1",chosen1);   ETTColor.putInt("Wed1",chosen);   break;
                    case R.id.button18:
                        ETimetable.putString("Wed2",chosen1);   ETTColor.putInt("Wed2",chosen);   break;
                    case R.id.button19:
                        ETimetable.putString("Wed3",chosen1);   ETTColor.putInt("Wed3",chosen);   break;
                    case R.id.button20:
                        ETimetable.putString("Wed4",chosen1);   ETTColor.putInt("Wed4",chosen);   break;
                    case R.id.button21:
                        ETimetable.putString("Wed5",chosen1);   ETTColor.putInt("Wed5",chosen);   break;
                    case R.id.button22:
                        ETimetable.putString("Wed6",chosen1);   ETTColor.putInt("Wed6",chosen);   break;
                    case R.id.button23:
                        ETimetable.putString("Wed7",chosen1);   ETTColor.putInt("Wed7",chosen);   break;
                    case R.id.button24:
                        ETimetable.putString("Wed8",chosen1);   ETTColor.putInt("Wed8",chosen);   break;

                    case R.id.button25:
                        ETimetable.putString("Thu1" , chosen1);   ETTColor.putInt("Thu1", chosen);   break;
                    case R.id.button26:
                        ETimetable.putString("Thu2" , chosen1);   ETTColor.putInt("Thu2", chosen);   break;
                    case R.id.button27:
                        ETimetable.putString("Thu3" , chosen1);   ETTColor.putInt("Thu3", chosen);   break;
                    case R.id.button28:
                        ETimetable.putString("Thu4" , chosen1);   ETTColor.putInt("Thu4", chosen);   break;
                    case R.id.button29:
                        ETimetable.putString("Thu5" , chosen1);   ETTColor.putInt("Thu5", chosen);   break;
                    case R.id.button30:
                        ETimetable.putString("Thu6" , chosen1);   ETTColor.putInt("Thu6", chosen);   break;
                    case R.id.button31:
                        ETimetable.putString("Thu7" , chosen1);   ETTColor.putInt("Thu7", chosen);   break;
                    case R.id.button32:
                        ETimetable.putString("Thu8" , chosen1);   ETTColor.putInt("Thu8", chosen);   break;

                    case R.id.button33:
                        ETimetable.putString("Fri1" , chosen1);   ETTColor.putInt("Fri1" , chosen);   break;
                    case R.id.button34:
                        ETimetable.putString("Fri2" , chosen1);   ETTColor.putInt("Fri2" , chosen);   break;
                    case R.id.button35:
                        ETimetable.putString("Fri3" , chosen1);   ETTColor.putInt("Fri3" , chosen);   break;
                    case R.id.button36:
                        ETimetable.putString("Fri4" , chosen1);   ETTColor.putInt("Fri4" , chosen);   break;
                    case R.id.button37:
                        ETimetable.putString("Fri5" , chosen1);   ETTColor.putInt("Fri5" , chosen);   break;
                    case R.id.button38:
                        ETimetable.putString("Fri6" , chosen1);   ETTColor.putInt("Fri6" , chosen);   break;
                    case R.id.button39:
                        ETimetable.putString("Fri7" , chosen1);   ETTColor.putInt("Fri7" , chosen);   break;
                    case R.id.button40:
                        ETimetable.putString("Fri8" , chosen1);   ETTColor.putInt("Fri8" , chosen);   break;

                    case R.id.button41:
                        ETimetable.putString("Sat1" , chosen1);   ETTColor.putInt("Sat1" , chosen);   break;
                    case R.id.button42:
                        ETimetable.putString("Sat2" , chosen1);   ETTColor.putInt("Sat2" , chosen);   break;
                    case R.id.button43:
                        ETimetable.putString("Sat3" , chosen1);   ETTColor.putInt("Sat3" , chosen);   break;
                    case R.id.button44:
                        ETimetable.putString("Sat4" , chosen1);   ETTColor.putInt("Sat4" , chosen);   break;
                    case R.id.button45:
                        ETimetable.putString("Sat5" , chosen1);   ETTColor.putInt("Sat5" , chosen);   break;
                    case R.id.button46:
                        ETimetable.putString("Sat6" , chosen1);   ETTColor.putInt("Sat6" , chosen);   break;
                    case R.id.button47:
                        ETimetable.putString("Sat7" , chosen1);   ETTColor.putInt("Sat7" , chosen);   break;
                    case R.id.button48:
                        ETimetable.putString("Sat8" , chosen1);   ETTColor.putInt("Sat8" , chosen);   break;
                }
                ETimetable.apply();
                ETTColor.apply();
            }
        }
        else
            Toast.makeText(this, "Please Click any Radio Button!", Toast.LENGTH_SHORT).show();
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