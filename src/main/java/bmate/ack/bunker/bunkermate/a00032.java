package bmate.ack.bunker.bunkermate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import bmate.bunkermate.R;

public class a00032 extends AppCompatActivity implements View.OnClickListener {
    public GradientDrawable gd;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a00032);

        final SharedPreferences Colors=getSharedPreferences("colors", Context.MODE_PRIVATE);
        final SharedPreferences Subject=getSharedPreferences("subject", Context.MODE_PRIVATE);
        final SharedPreferences Timetable=getSharedPreferences("timetable", Context.MODE_PRIVATE);
        final SharedPreferences TTColor=getSharedPreferences("timetable_color", Context.MODE_PRIVATE);

        String sub="sub";

        final Button b1=(Button) findViewById(R.id.rb1);     b1.setOnClickListener(this);   gd=(GradientDrawable)b1.getBackground().mutate();      gd.setColor(Colors.getInt(sub+1,0));  b1.setText(Subject.getString(sub+1,""));
        final Button b2=(Button) findViewById(R.id.rb2);     b2.setOnClickListener(this);   gd=(GradientDrawable)b2.getBackground().mutate();      gd.setColor(Colors.getInt(sub+2,0));  b2.setText(Subject.getString(sub+2,""));
        final Button b3=(Button) findViewById(R.id.rb3);     b3.setOnClickListener(this);   gd=(GradientDrawable)b3.getBackground().mutate();      gd.setColor(Colors.getInt(sub+3,0));  b3.setText(Subject.getString(sub+3,""));
        final Button b4=(Button) findViewById(R.id.rb4);     b4.setOnClickListener(this);   gd=(GradientDrawable)b4.getBackground().mutate();      gd.setColor(Colors.getInt(sub+4,0));  b4.setText(Subject.getString(sub+4,""));
        final Button b5=(Button) findViewById(R.id.rb5);     b5.setOnClickListener(this);   gd=(GradientDrawable)b5.getBackground().mutate();      gd.setColor(Colors.getInt(sub+5,0));  b5.setText(Subject.getString(sub+5,""));
        final Button b6=(Button) findViewById(R.id.rb6);     b6.setOnClickListener(this);   gd=(GradientDrawable)b6.getBackground().mutate();      gd.setColor(Colors.getInt(sub+6,0));  b6.setText(Subject.getString(sub+6,""));
        final Button b7=(Button) findViewById(R.id.rb7);     b7.setOnClickListener(this);   gd=(GradientDrawable)b7.getBackground().mutate();      gd.setColor(Colors.getInt(sub+7,0));  b7.setText(Subject.getString(sub+7,""));
        final Button b8=(Button) findViewById(R.id.rb8);     b8.setOnClickListener(this);   gd=(GradientDrawable)b8.getBackground().mutate();      gd.setColor(Colors.getInt(sub+8,0));  b8.setText(Subject.getString(sub+8,""));
        final Button b9=(Button) findViewById(R.id.rb9);     b9.setOnClickListener(this);   gd=(GradientDrawable)b9.getBackground().mutate();      gd.setColor(Colors.getInt(sub+9,0));  b9.setText(Subject.getString(sub+9,""));

        String day[]={"Mon","Tue","Wed","Thu","Fri","Sat"};

        final Button a1=(Button) findViewById(R.id.button1);     a1.setOnClickListener(this);   gd=(GradientDrawable)a1.getBackground().mutate();   gd.setColor(TTColor.getInt(day[0]+1,0));    a1.setText(Timetable.getString(day[0]+1,null));
        final Button a2=(Button) findViewById(R.id.button2);     a2.setOnClickListener(this);   gd=(GradientDrawable)a2.getBackground().mutate();   gd.setColor(TTColor.getInt(day[0]+2,0));    a2.setText(Timetable.getString(day[0]+2,null));
        final Button a3=(Button) findViewById(R.id.button3);     a3.setOnClickListener(this);   gd=(GradientDrawable)a3.getBackground().mutate();   gd.setColor(TTColor.getInt(day[0]+3,0));    a3.setText(Timetable.getString(day[0]+3,null));
        final Button a4=(Button) findViewById(R.id.button4);     a4.setOnClickListener(this);   gd=(GradientDrawable)a4.getBackground().mutate();   gd.setColor(TTColor.getInt(day[0]+4,0));    a4.setText(Timetable.getString(day[0]+4,null));
        final Button a5=(Button) findViewById(R.id.button5);     a5.setOnClickListener(this);   gd=(GradientDrawable)a5.getBackground().mutate();   gd.setColor(TTColor.getInt(day[0]+5,0));    a5.setText(Timetable.getString(day[0]+5,null));
        final Button a6=(Button) findViewById(R.id.button6);     a6.setOnClickListener(this);   gd=(GradientDrawable)a6.getBackground().mutate();   gd.setColor(TTColor.getInt(day[0]+6,0));    a6.setText(Timetable.getString(day[0]+6,null));
        final Button a7=(Button) findViewById(R.id.button7);     a7.setOnClickListener(this);   gd=(GradientDrawable)a7.getBackground().mutate();   gd.setColor(TTColor.getInt(day[0]+7,0));    a7.setText(Timetable.getString(day[0]+7,null));
        final Button a8=(Button) findViewById(R.id.button8);     a8.setOnClickListener(this);   gd=(GradientDrawable)a8.getBackground().mutate();   gd.setColor(TTColor.getInt(day[0]+8,0));    a8.setText(Timetable.getString(day[0]+8,null));

        final Button c1=(Button) findViewById(R.id.button9);      c1.setOnClickListener(this);   gd=(GradientDrawable)c1.getBackground().mutate();   gd.setColor(TTColor.getInt(day[1]+1,0));    c1.setText(Timetable.getString(day[1]+1,null));
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
                if(c.isChecked())
                    c.setChecked(false);
                else
                    c.setChecked(true);
            }
        });
    }

    @Override
    public void onClick(View v) { }

    @Override
    public void onBackPressed() {
        Intent i1=new Intent(getApplicationContext(), a0005.class);
        startActivity(i1);
    }
}
