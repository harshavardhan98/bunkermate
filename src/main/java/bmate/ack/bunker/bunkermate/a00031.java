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

import java.text.SimpleDateFormat;
import java.util.Date;

import bmate.bunkermate.R;

public class a00031 extends AppCompatActivity implements View.OnClickListener {
    public static int chosen=0;
    public static String chosen1;
    public GradientDrawable gd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a00031);

        final SharedPreferences Colors=getSharedPreferences("colors", Context.MODE_PRIVATE);
        final SharedPreferences Subject=getSharedPreferences("subject", Context.MODE_PRIVATE);
        final SharedPreferences Timetable=getSharedPreferences("timetable", Context.MODE_PRIVATE);
        final SharedPreferences.Editor ETimetable=Timetable.edit();
        final SharedPreferences TTColor=getSharedPreferences("timetable_color", Context.MODE_PRIVATE);

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
        gd=(GradientDrawable)b1.getBackground().mutate();      gd.setColor(Colors.getInt(sub+1,0));  b1.setText(Subject.getString(sub+1,""));
        gd=(GradientDrawable)b2.getBackground().mutate();      gd.setColor(Colors.getInt(sub+2,0));  b2.setText(Subject.getString(sub+2,""));
        gd=(GradientDrawable)b3.getBackground().mutate();      gd.setColor(Colors.getInt(sub+3,0));  b3.setText(Subject.getString(sub+3,""));
        gd=(GradientDrawable)b4.getBackground().mutate();      gd.setColor(Colors.getInt(sub+4,0));  b4.setText(Subject.getString(sub+4,""));
        gd=(GradientDrawable)b5.getBackground().mutate();      gd.setColor(Colors.getInt(sub+5,0));  b5.setText(Subject.getString(sub+5,""));
        gd=(GradientDrawable)b6.getBackground().mutate();      gd.setColor(Colors.getInt(sub+6,0));  b6.setText(Subject.getString(sub+6,""));
        gd=(GradientDrawable)b7.getBackground().mutate();      gd.setColor(Colors.getInt(sub+7,0));  b7.setText(Subject.getString(sub+7,""));
        gd=(GradientDrawable)b8.getBackground().mutate();      gd.setColor(Colors.getInt(sub+8,0));  b8.setText(Subject.getString(sub+8,""));
        gd=(GradientDrawable)b9.getBackground().mutate();      gd.setColor(Colors.getInt(sub+9,0));  b9.setText(Subject.getString(sub+9,""));

        String day[]={"Mon","Tue","Wed","Thu","Fri","Sat"};

        final Button a1=(Button) findViewById(R.id.button1);     a1.setOnClickListener(this);   gd=(GradientDrawable)a1.getBackground().mutate();   gd.setColor(TTColor.getInt(day[0]+1,0));    a1.setText(Timetable.getString(day[0]+1,null));
        final Button a2=(Button) findViewById(R.id.button2);     a2.setOnClickListener(this);   gd=(GradientDrawable)a2.getBackground().mutate();   gd.setColor(TTColor.getInt(day[0]+2,0));    a2.setText(Timetable.getString(day[0]+2,null));
        final Button a3=(Button) findViewById(R.id.button3);     a3.setOnClickListener(this);   gd=(GradientDrawable)a3.getBackground().mutate();   gd.setColor(TTColor.getInt(day[0]+3,0));    a3.setText(Timetable.getString(day[0]+3,null));
        final Button a4=(Button) findViewById(R.id.button4);     a4.setOnClickListener(this);   gd=(GradientDrawable)a4.getBackground().mutate();   gd.setColor(TTColor.getInt(day[0]+4,0));    a4.setText(Timetable.getString(day[0]+4,null));
        final Button a5=(Button) findViewById(R.id.button5);     a5.setOnClickListener(this);   gd=(GradientDrawable)a5.getBackground().mutate();   gd.setColor(TTColor.getInt(day[0]+5,0));    a5.setText(Timetable.getString(day[0]+5,null));
        final Button a6=(Button) findViewById(R.id.button6);     a6.setOnClickListener(this);   gd=(GradientDrawable)a6.getBackground().mutate();   gd.setColor(TTColor.getInt(day[0]+6,0));    a6.setText(Timetable.getString(day[0]+6,null));
        final Button a7=(Button) findViewById(R.id.button7);     a7.setOnClickListener(this);   gd=(GradientDrawable)a7.getBackground().mutate();   gd.setColor(TTColor.getInt(day[0]+7,0));    a7.setText(Timetable.getString(day[0]+7,null));
        final Button a8=(Button) findViewById(R.id.button8);     a8.setOnClickListener(this);   gd=(GradientDrawable)a8.getBackground().mutate();   gd.setColor(TTColor.getInt(day[0]+8,0));    a8.setText(Timetable.getString(day[0]+8,null));

        final Button c1=(Button) findViewById(R.id.button9);     c1.setOnClickListener(this);    gd=(GradientDrawable)c1.getBackground().mutate();   gd.setColor(TTColor.getInt(day[1]+1,0));    c1.setText(Timetable.getString(day[1]+1,null));
        final Button c2=(Button) findViewById(R.id.button10);     c2.setOnClickListener(this);   gd=(GradientDrawable)c2.getBackground().mutate();   gd.setColor(TTColor.getInt(day[1]+2,0));    c2.setText(Timetable.getString(day[1]+2,null));
        final Button c3=(Button) findViewById(R.id.button11);     c3.setOnClickListener(this);   gd=(GradientDrawable)c3.getBackground().mutate();   gd.setColor(TTColor.getInt(day[1]+3,0));    c3.setText(Timetable.getString(day[1]+3,null));
        final Button c4=(Button) findViewById(R.id.button12);     c4.setOnClickListener(this);   gd=(GradientDrawable)c4.getBackground().mutate();   gd.setColor(TTColor.getInt(day[1]+4,0));    c4.setText(Timetable.getString(day[1]+4,null));
        final Button c5=(Button) findViewById(R.id.button13);     c5.setOnClickListener(this);   gd=(GradientDrawable)c5.getBackground().mutate();   gd.setColor(TTColor.getInt(day[1]+5,0));    c5.setText(Timetable.getString(day[1]+5,null));
        final Button c6=(Button) findViewById(R.id.button14);     c6.setOnClickListener(this);   gd=(GradientDrawable)c6.getBackground().mutate();   gd.setColor(TTColor.getInt(day[1]+6,0));    c6.setText(Timetable.getString(day[1]+6,null));
        final Button c7=(Button) findViewById(R.id.button15);     c7.setOnClickListener(this);   gd=(GradientDrawable)c7.getBackground().mutate();   gd.setColor(TTColor.getInt(day[1]+7,0));    c7.setText(Timetable.getString(day[1]+7,null));
        final Button c8=(Button) findViewById(R.id.button16);     c8.setOnClickListener(this);   gd=(GradientDrawable)c8.getBackground().mutate();   gd.setColor(TTColor.getInt(day[1]+8,0));    c8.setText(Timetable.getString(day[1]+8,null));

        final Button d1=(Button) findViewById(R.id.button17);     d1.setOnClickListener(this);   gd=(GradientDrawable)d1.getBackground().mutate();   gd.setColor(TTColor.getInt(day[2]+1,0));    d1.setText(Timetable.getString(day[2]+1,null));
        final Button d2=(Button) findViewById(R.id.button18);     d2.setOnClickListener(this);   gd=(GradientDrawable)d2.getBackground().mutate();   gd.setColor(TTColor.getInt(day[2]+2,0));    d2.setText(Timetable.getString(day[2]+2,null));
        final Button d3=(Button) findViewById(R.id.button19);     d3.setOnClickListener(this);   gd=(GradientDrawable)d3.getBackground().mutate();   gd.setColor(TTColor.getInt(day[2]+3,0));    d3.setText(Timetable.getString(day[2]+3,null));
        final Button d4=(Button) findViewById(R.id.button20);     d4.setOnClickListener(this);   gd=(GradientDrawable)d4.getBackground().mutate();   gd.setColor(TTColor.getInt(day[2]+4,0));    d4.setText(Timetable.getString(day[2]+4,null));
        final Button d5=(Button) findViewById(R.id.button21);     d5.setOnClickListener(this);   gd=(GradientDrawable)d5.getBackground().mutate();   gd.setColor(TTColor.getInt(day[2]+5,0));    d5.setText(Timetable.getString(day[2]+5,null));
        final Button d6=(Button) findViewById(R.id.button22);     d6.setOnClickListener(this);   gd=(GradientDrawable)d6.getBackground().mutate();   gd.setColor(TTColor.getInt(day[2]+6,0));    d6.setText(Timetable.getString(day[2]+6,null));
        final Button d7=(Button) findViewById(R.id.button23);     d7.setOnClickListener(this);   gd=(GradientDrawable)d7.getBackground().mutate();   gd.setColor(TTColor.getInt(day[2]+7,0));    d7.setText(Timetable.getString(day[2]+7,null));
        final Button d8=(Button) findViewById(R.id.button24);     d8.setOnClickListener(this);   gd=(GradientDrawable)d8.getBackground().mutate();   gd.setColor(TTColor.getInt(day[2]+8,0));    d8.setText(Timetable.getString(day[2]+8,null));

        final Button e1=(Button) findViewById(R.id.button25);     e1.setOnClickListener(this);   gd=(GradientDrawable)e1.getBackground().mutate();   gd.setColor(TTColor.getInt(day[3]+1,0));    e1.setText(Timetable.getString(day[3]+1,null));
        final Button e2=(Button) findViewById(R.id.button26);     e2.setOnClickListener(this);   gd=(GradientDrawable)e2.getBackground().mutate();   gd.setColor(TTColor.getInt(day[3]+2,0));    e2.setText(Timetable.getString(day[3]+2,null));
        final Button e3=(Button) findViewById(R.id.button27);     e3.setOnClickListener(this);   gd=(GradientDrawable)e3.getBackground().mutate();   gd.setColor(TTColor.getInt(day[3]+3,0));    e3.setText(Timetable.getString(day[3]+3,null));
        final Button e4=(Button) findViewById(R.id.button28);     e4.setOnClickListener(this);   gd=(GradientDrawable)e4.getBackground().mutate();   gd.setColor(TTColor.getInt(day[3]+4,0));    e4.setText(Timetable.getString(day[3]+4,null));
        final Button e5=(Button) findViewById(R.id.button29);     e5.setOnClickListener(this);   gd=(GradientDrawable)e5.getBackground().mutate();   gd.setColor(TTColor.getInt(day[3]+5,0));    e5.setText(Timetable.getString(day[3]+5,null));
        final Button e6=(Button) findViewById(R.id.button30);     e6.setOnClickListener(this);   gd=(GradientDrawable)e6.getBackground().mutate();   gd.setColor(TTColor.getInt(day[3]+6,0));    e6.setText(Timetable.getString(day[3]+6,null));
        final Button e7=(Button) findViewById(R.id.button31);     e7.setOnClickListener(this);   gd=(GradientDrawable)e7.getBackground().mutate();   gd.setColor(TTColor.getInt(day[3]+7,0));    e7.setText(Timetable.getString(day[3]+7,null));
        final Button e8=(Button) findViewById(R.id.button32);     e8.setOnClickListener(this);   gd=(GradientDrawable)e8.getBackground().mutate();   gd.setColor(TTColor.getInt(day[3]+8,0));    e8.setText(Timetable.getString(day[3]+8,null));

        final Button f1=(Button) findViewById(R.id.button33);     f1.setOnClickListener(this);   gd=(GradientDrawable)f1.getBackground().mutate();   gd.setColor(TTColor.getInt(day[4]+1,0));    f1.setText(Timetable.getString(day[4]+1,null));
        final Button f2=(Button) findViewById(R.id.button34);     f2.setOnClickListener(this);   gd=(GradientDrawable)f2.getBackground().mutate();   gd.setColor(TTColor.getInt(day[4]+2,0));    f2.setText(Timetable.getString(day[4]+2,null));
        final Button f3=(Button) findViewById(R.id.button35);     f3.setOnClickListener(this);   gd=(GradientDrawable)f3.getBackground().mutate();   gd.setColor(TTColor.getInt(day[4]+3,0));    f3.setText(Timetable.getString(day[4]+3,null));
        final Button f4=(Button) findViewById(R.id.button36);     f4.setOnClickListener(this);   gd=(GradientDrawable)f4.getBackground().mutate();   gd.setColor(TTColor.getInt(day[4]+4,0));    f4.setText(Timetable.getString(day[4]+4,null));
        final Button f5=(Button) findViewById(R.id.button37);     f5.setOnClickListener(this);   gd=(GradientDrawable)f5.getBackground().mutate();   gd.setColor(TTColor.getInt(day[4]+5,0));    f5.setText(Timetable.getString(day[4]+5,null));
        final Button f6=(Button) findViewById(R.id.button38);     f6.setOnClickListener(this);   gd=(GradientDrawable)f6.getBackground().mutate();   gd.setColor(TTColor.getInt(day[4]+6,0));    f6.setText(Timetable.getString(day[4]+6,null));
        final Button f7=(Button) findViewById(R.id.button39);     f7.setOnClickListener(this);   gd=(GradientDrawable)f7.getBackground().mutate();   gd.setColor(TTColor.getInt(day[4]+7,0));    f7.setText(Timetable.getString(day[4]+7,null));
        final Button f8=(Button) findViewById(R.id.button40);     f8.setOnClickListener(this);   gd=(GradientDrawable)f8.getBackground().mutate();   gd.setColor(TTColor.getInt(day[4]+8,0));    f8.setText(Timetable.getString(day[4]+8,null));

        final Button g1=(Button) findViewById(R.id.button41);     g1.setOnClickListener(this);   gd=(GradientDrawable)g1.getBackground().mutate();   gd.setColor(TTColor.getInt(day[5]+1,0));    g1.setText(Timetable.getString(day[5]+1,null));
        final Button g2=(Button) findViewById(R.id.button42);     g2.setOnClickListener(this);   gd=(GradientDrawable)g2.getBackground().mutate();   gd.setColor(TTColor.getInt(day[5]+2,0));    g2.setText(Timetable.getString(day[5]+2,null));
        final Button g3=(Button) findViewById(R.id.button43);     g3.setOnClickListener(this);   gd=(GradientDrawable)g3.getBackground().mutate();   gd.setColor(TTColor.getInt(day[5]+3,0));    g3.setText(Timetable.getString(day[5]+3,null));
        final Button g4=(Button) findViewById(R.id.button44);     g4.setOnClickListener(this);   gd=(GradientDrawable)g4.getBackground().mutate();   gd.setColor(TTColor.getInt(day[5]+4,0));    g4.setText(Timetable.getString(day[5]+4,null));
        final Button g5=(Button) findViewById(R.id.button45);     g5.setOnClickListener(this);   gd=(GradientDrawable)g5.getBackground().mutate();   gd.setColor(TTColor.getInt(day[5]+5,0));    g5.setText(Timetable.getString(day[5]+5,null));
        final Button g6=(Button) findViewById(R.id.button46);     g6.setOnClickListener(this);   gd=(GradientDrawable)g6.getBackground().mutate();   gd.setColor(TTColor.getInt(day[5]+6,0));    g6.setText(Timetable.getString(day[5]+6,null));
        final Button g7=(Button) findViewById(R.id.button47);     g7.setOnClickListener(this);   gd=(GradientDrawable)g7.getBackground().mutate();   gd.setColor(TTColor.getInt(day[5]+7,0));    g7.setText(Timetable.getString(day[5]+7,null));
        final Button g8=(Button) findViewById(R.id.button48);     g8.setOnClickListener(this);   gd=(GradientDrawable)g8.getBackground().mutate();   gd.setColor(TTColor.getInt(day[5]+8,0));    g8.setText(Timetable.getString(day[5]+8,null));

        final CheckBox c=(CheckBox)findViewById(R.id.ckbox1);
        if(Timetable.getBoolean("check",false)==true)
            c.setChecked(true);
        else
            c.setChecked(false);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c.isChecked()) {
                    chosen1 = " ";
                    chosen = Color.WHITE;

                    a00031.this.onClick(g1);
                    a00031.this.onClick(g2);
                    a00031.this.onClick(g3);
                    a00031.this.onClick(g4);
                    a00031.this.onClick(g5);
                    a00031.this.onClick(g6);
                    a00031.this.onClick(g7);
                    a00031.this.onClick(g8);
                }
                else
                {
                    SharedPreferences Bunked = getSharedPreferences("bunked", Context.MODE_PRIVATE);
                    SharedPreferences.Editor EBunked = Bunked.edit();

                    SimpleDateFormat sdf = new SimpleDateFormat("ddMME");
                    Date d=new Date();
                    String cur_date=sdf.format(d);
                    for(int i=0;i<=8;i++){
                        EBunked.putInt(cur_date + i, -1);     EBunked.apply();
                    }
                }
            }
        });

        final Button finish=(Button) findViewById(R.id.button49);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c.isChecked())
                    ETimetable.putBoolean("check",true);
                else
                    ETimetable.putBoolean("check",false);
                ETimetable.apply();

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
                chosen=Colors.getInt("sub1",0);
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
                chosen=Colors.getInt("sub2",0);
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
                chosen=Colors.getInt("sub3",0);
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
                chosen=Colors.getInt("sub4",0);
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
                chosen=Colors.getInt("sub5",0);
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
                chosen=Colors.getInt("sub6",0);
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
                chosen=Colors.getInt("sub7",0);
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
                chosen=Colors.getInt("sub8",0);
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
                chosen=Colors.getInt("sub9",0);
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
                chosen1=" ";
            }
        });
    }

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
            String chose=" ", day=" ";
            Button b=(Button)v;
            if(!(c.isChecked() && !chosen1.equals(" ") && (pid==R.id.button41 || pid==R.id.button42 || pid==R.id.button43 || pid==R.id.button44 || pid==R.id.button45 || pid==R.id.button46 || pid==R.id.button47 || pid==R.id.button48))){
                gd=(GradientDrawable)b.getBackground().mutate();   gd.setColor(chosen);
                b.setText(chosen1);

                switch(pid)
                {
                    case R.id.button1:
                        day="Mon1";  chose=Timetable.getString("Mon1",null);   ETimetable.putString("Mon1",chosen1);   ETTColor.putInt("Mon1",chosen);   break;
                    case R.id.button2:
                        day="Mon2";  chose=Timetable.getString("Mon2",null);   ETimetable.putString("Mon2",chosen1);   ETTColor.putInt("Mon2",chosen);   break;
                    case R.id.button3:
                        day="Mon3";  chose=Timetable.getString("Mon3",null);   ETimetable.putString("Mon3",chosen1);   ETTColor.putInt("Mon3",chosen);   break;
                    case R.id.button4:
                        day="Mon4";  chose=Timetable.getString("Mon4",null);   ETimetable.putString("Mon4",chosen1);   ETTColor.putInt("Mon4",chosen);   break;
                    case R.id.button5:
                        day="Mon5";  chose=Timetable.getString("Mon5",null);   ETimetable.putString("Mon5",chosen1);   ETTColor.putInt("Mon5",chosen);   break;
                    case R.id.button6:
                        day="Mon6";  chose=Timetable.getString("Mon6",null);   ETimetable.putString("Mon6",chosen1);   ETTColor.putInt("Mon6",chosen);   break;
                    case R.id.button7:
                        day="Mon7";  chose=Timetable.getString("Mon7",null);   ETimetable.putString("Mon7",chosen1);   ETTColor.putInt("Mon7",chosen);   break;
                    case R.id.button8:
                        day="Mon8";  chose=Timetable.getString("Mon8",null);   ETimetable.putString("Mon8",chosen1);   ETTColor.putInt("Mon8",chosen);   break;

                    case R.id.button9:
                        day="Tue1";  chose=Timetable.getString("Tue1",null);   ETimetable.putString("Tue1",chosen1);   ETTColor.putInt("Tue1",chosen);   break;
                    case R.id.button10:
                        day="Tue2";  chose=Timetable.getString("Tue2",null);   ETimetable.putString("Tue2",chosen1);   ETTColor.putInt("Tue2",chosen);   break;
                    case R.id.button11:
                        day="Tue3";  chose=Timetable.getString("Tue3",null);   ETimetable.putString("Tue3",chosen1);   ETTColor.putInt("Tue3",chosen);   break;
                    case R.id.button12:
                        day="Tue4";  chose=Timetable.getString("Tue4",null);   ETimetable.putString("Tue4",chosen1);   ETTColor.putInt("Tue4",chosen);   break;
                    case R.id.button13:
                        day="Tue5";  chose=Timetable.getString("Tue5",null);   ETimetable.putString("Tue5",chosen1);   ETTColor.putInt("Tue5",chosen);   break;
                    case R.id.button14:
                        day="Tue6";  chose=Timetable.getString("Tue6",null);   ETimetable.putString("Tue6",chosen1);   ETTColor.putInt("Tue6",chosen);   break;
                    case R.id.button15:
                        day="Tue7";  chose=Timetable.getString("Tue7",null);   ETimetable.putString("Tue7",chosen1);   ETTColor.putInt("Tue7",chosen);   break;
                    case R.id.button16:
                        day="Tue8";  chose=Timetable.getString("Tue8",null);   ETimetable.putString("Tue8",chosen1);   ETTColor.putInt("Tue8",chosen);   break;

                    case R.id.button17:
                        day="Wed1";  chose=Timetable.getString("Wed1",null);   ETimetable.putString("Wed1",chosen1);   ETTColor.putInt("Wed1",chosen);   break;
                    case R.id.button18:
                        day="Wed2";  chose=Timetable.getString("Wed2",null);   ETimetable.putString("Wed2",chosen1);   ETTColor.putInt("Wed2",chosen);   break;
                    case R.id.button19:
                        day="Wed3";  chose=Timetable.getString("Wed3",null);   ETimetable.putString("Wed3",chosen1);   ETTColor.putInt("Wed3",chosen);   break;
                    case R.id.button20:
                        day="Wed4";  chose=Timetable.getString("Wed4",null);   ETimetable.putString("Wed4",chosen1);   ETTColor.putInt("Wed4",chosen);   break;
                    case R.id.button21:
                        day="Wed5";  chose=Timetable.getString("Wed5",null);   ETimetable.putString("Wed5",chosen1);   ETTColor.putInt("Wed5",chosen);   break;
                    case R.id.button22:
                        day="Wed6";  chose=Timetable.getString("Wed6",null);   ETimetable.putString("Wed6",chosen1);   ETTColor.putInt("Wed6",chosen);   break;
                    case R.id.button23:
                        day="Wed7";  chose=Timetable.getString("Wed7",null);   ETimetable.putString("Wed7",chosen1);   ETTColor.putInt("Wed7",chosen);   break;
                    case R.id.button24:
                        day="Wed8";  chose=Timetable.getString("Wed8",null);   ETimetable.putString("Wed8",chosen1);   ETTColor.putInt("Wed8",chosen);   break;

                    case R.id.button25:
                        day="Thu1";  chose=Timetable.getString("Thu1",null);   ETimetable.putString("Thu1" , chosen1);   ETTColor.putInt("Thu1", chosen);   break;
                    case R.id.button26:
                        day="Thu2";  chose=Timetable.getString("Thu2",null);   ETimetable.putString("Thu2" , chosen1);   ETTColor.putInt("Thu2", chosen);   break;
                    case R.id.button27:
                        day="Thu3";  chose=Timetable.getString("Thu3",null);   ETimetable.putString("Thu3" , chosen1);   ETTColor.putInt("Thu3", chosen);   break;
                    case R.id.button28:
                        day="Thu4";  chose=Timetable.getString("Thu4",null);   ETimetable.putString("Thu4" , chosen1);   ETTColor.putInt("Thu4", chosen);   break;
                    case R.id.button29:
                        day="Thu5";  chose=Timetable.getString("Thu5",null);   ETimetable.putString("Thu5" , chosen1);   ETTColor.putInt("Thu5", chosen);   break;
                    case R.id.button30:
                        day="Thu6";  chose=Timetable.getString("Thu6",null);   ETimetable.putString("Thu6" , chosen1);   ETTColor.putInt("Thu6", chosen);   break;
                    case R.id.button31:
                        day="Thu7";  chose=Timetable.getString("Thu7",null);   ETimetable.putString("Thu7" , chosen1);   ETTColor.putInt("Thu7", chosen);   break;
                    case R.id.button32:
                        day="Thu8";  chose=Timetable.getString("Thu8",null);   ETimetable.putString("Thu8" , chosen1);   ETTColor.putInt("Thu8", chosen);   break;

                    case R.id.button33:
                        day="Fri1";  chose=Timetable.getString("Fri1",null);   ETimetable.putString("Fri1" , chosen1);   ETTColor.putInt("Fri1" , chosen);   break;
                    case R.id.button34:
                        day="Fri2";  chose=Timetable.getString("Fri2",null);   ETimetable.putString("Fri2" , chosen1);   ETTColor.putInt("Fri2" , chosen);   break;
                    case R.id.button35:
                        day="Fri3";  chose=Timetable.getString("Fri3",null);   ETimetable.putString("Fri3" , chosen1);   ETTColor.putInt("Fri3" , chosen);   break;
                    case R.id.button36:
                        day="Fri4";  chose=Timetable.getString("Fri4",null);   ETimetable.putString("Fri4" , chosen1);   ETTColor.putInt("Fri4" , chosen);   break;
                    case R.id.button37:
                        day="Fri5";  chose=Timetable.getString("Fri5",null);   ETimetable.putString("Fri5" , chosen1);   ETTColor.putInt("Fri5" , chosen);   break;
                    case R.id.button38:
                        day="Fri6";  chose=Timetable.getString("Fri6",null);   ETimetable.putString("Fri6" , chosen1);   ETTColor.putInt("Fri6" , chosen);   break;
                    case R.id.button39:
                        day="Fri7";  chose=Timetable.getString("Fri7",null);   ETimetable.putString("Fri7" , chosen1);   ETTColor.putInt("Fri7" , chosen);   break;
                    case R.id.button40:
                        day="Fri8";  chose=Timetable.getString("Fri8",null);   ETimetable.putString("Fri8" , chosen1);   ETTColor.putInt("Fri8" , chosen);   break;

                    case R.id.button41:
                        day="Sat1";  chose=Timetable.getString("Sat1",null);   ETimetable.putString("Sat1" , chosen1);   ETTColor.putInt("Sat1" , chosen);   break;
                    case R.id.button42:
                        day="Sat2";  chose=Timetable.getString("Sat2",null);   ETimetable.putString("Sat2" , chosen1);   ETTColor.putInt("Sat2" , chosen);   break;
                    case R.id.button43:
                        day="Sat3";  chose=Timetable.getString("Sat3",null);   ETimetable.putString("Sat3" , chosen1);   ETTColor.putInt("Sat3" , chosen);   break;
                    case R.id.button44:
                        day="Sat4";  chose=Timetable.getString("Sat4",null);   ETimetable.putString("Sat4" , chosen1);   ETTColor.putInt("Sat4" , chosen);   break;
                    case R.id.button45:
                        day="Sat5";  chose=Timetable.getString("Sat5",null);   ETimetable.putString("Sat5" , chosen1);   ETTColor.putInt("Sat5" , chosen);   break;
                    case R.id.button46:
                        day="Sat6";  chose=Timetable.getString("Sat6",null);   ETimetable.putString("Sat6" , chosen1);   ETTColor.putInt("Sat6" , chosen);   break;
                    case R.id.button47:
                        day="Sat7";  chose=Timetable.getString("Sat7",null);   ETimetable.putString("Sat7" , chosen1);   ETTColor.putInt("Sat7" , chosen);   break;
                    case R.id.button48:
                        day="Sat8";  chose=Timetable.getString("Sat8",null);   ETimetable.putString("Sat8" , chosen1);   ETTColor.putInt("Sat8" , chosen);   break;
                }
                ETimetable.apply();
                ETTColor.apply();
                modifynd(chose,day);
            }
        }
        else
            Toast.makeText(this, "Please Click any Radio Button!", Toast.LENGTH_SHORT).show();
    }

    public void modifynd(String s1,String day){
        SharedPreferences Bunked = getSharedPreferences("bunked", Context.MODE_PRIVATE);
        SharedPreferences.Editor EBunked = Bunked.edit();
        final CheckBox c=(CheckBox)findViewById(R.id.ckbox1);

        SimpleDateFormat sdf = new SimpleDateFormat("E");
        Date d=new Date();
        String cur_day=sdf.format(d);
        sdf = new SimpleDateFormat("ddMME");
        String cur_date=sdf.format(d);
        String s=chosen1;

        //if s (or) s1=" "   it must be FREE hour

         if(cur_day.equals(day.substring(0,3))) {

            if (s1.equals(" ") && !s.equals(" ")) {
                EBunked.putInt(s + 1, Bunked.getInt(s + 1, 0) + 1);     EBunked.apply();
                EBunked.putInt(s + 2, Bunked.getInt(s + 2, 0) + 1);     EBunked.apply();
                EBunked.putInt(cur_date + day.substring(3), 1);   EBunked.apply();
            }
            else if (!s1.equals(" ") && !s.equals(" ")) {
                EBunked.putInt(s1 + 1, Bunked.getInt(s1 + 1, 0) - 1);   EBunked.apply();
                EBunked.putInt(s1 + 2, Bunked.getInt(s1 + 2, 0) - 1);   EBunked.apply();
                EBunked.putInt(s + 1, Bunked.getInt(s + 1, 0) + 1);     EBunked.apply();
                EBunked.putInt(s + 2, Bunked.getInt(s + 2, 0) + 1);     EBunked.apply();

                if (Bunked.getInt(cur_date + day.substring(3), 0) == 0) {
                    EBunked.putInt(cur_date + day.substring(3), 1);     EBunked.apply();
                    EBunked.putInt(s1 + 1, Bunked.getInt(s1 + 1, 0) + 1);   EBunked.apply();
                }
            }
            else if (!s1.equals(" ") && s.equals(" ")) {
                if (Bunked.getInt(cur_date + day.substring(3), 0) == 1) {
                    EBunked.putInt(s1 + 1, Bunked.getInt(s1 + 1, 0) - 1);   EBunked.apply();
                }
                EBunked.putInt(s1 + 2, Bunked.getInt(s1 + 2, 0) - 1);   EBunked.apply();
                EBunked.putInt(cur_date + day.substring(3), -1);    EBunked.apply();
            }
        }
    }


    @Override
    public void onBackPressed() {
        final AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Your Changes will be lost, Click Save to Continue").setPositiveButton("SAVE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                final SharedPreferences Timetable=getSharedPreferences("timetable", Context.MODE_PRIVATE);
                final SharedPreferences.Editor ETimetable=Timetable.edit();
                final CheckBox c=(CheckBox)findViewById(R.id.ckbox1);

                if(c.isChecked())
                    ETimetable.putBoolean("check",true);
                else
                    ETimetable.putBoolean("check",false);
                ETimetable.apply();

                Intent i1 = new Intent(getApplicationContext(), a0005.class);
                startActivity(i1);
            }
        }).setTitle("Alert!").create();
        alert.show();
    }
}
