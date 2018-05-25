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
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import bmate.bunkermate.R;

public class a0005 extends AppCompatActivity implements View.OnClickListener{

    SimpleDateFormat sdf=new SimpleDateFormat("E");
    Date d=new Date();
    String day=sdf.format(d);
    String cur_date=date(d,0);

    public static int backButtonCount=0,diff=0;
    public GradientDrawable gd;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a0005);

        final CheckBox holi = (CheckBox) findViewById(R.id.holiday);
        Button legend1=(Button)findViewById(R.id.legend1);
        gd=(GradientDrawable)legend1.getBackground().mutate();      gd.setColor(Color.GRAY);

        final SharedPreferences Status=getSharedPreferences("status", Context.MODE_PRIVATE);
        final SharedPreferences.Editor EStatus=Status.edit();
        SharedPreferences Timetable = getSharedPreferences("timetable", Context.MODE_PRIVATE);

        View v = getLayoutInflater().inflate(R.layout.activity_dialog, null);
        final CheckBox c = v.findViewById(R.id.dont);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c.isChecked())
                    EStatus.putBoolean("status5", true);
                else
                    EStatus.putBoolean("status5", false);
                EStatus.apply();
            }
        });

        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setMessage("Click the Corresponding Cells in the Table to Bunk and UnBunk").setPositiveButton("SURE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).setView(v).setTitle("Welcome Buddy!");

        if(Status.getBoolean("status5", false)==false){
            AlertDialog dialog=alert.create();
            dialog.show();
        }

        /**************************************************************************************/

        Boolean f1=false;
        if(Timetable.getBoolean("check",false)==true)
        {
            if(day.equals("Sat"))
                f1=true;
        }
        if(day.equals("Sun"))
            f1=true;

        if(Status.getBoolean(cur_date,false)==true || f1==true)
            holi.setChecked(true);
        else
            holi.setChecked(false);

        holi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (diff <= 0) {
                    SharedPreferences Timetable = getSharedPreferences("timetable", Context.MODE_PRIVATE);
                    SharedPreferences Bunked = getSharedPreferences("bunked", Context.MODE_PRIVATE);
                    SharedPreferences.Editor EBunked = Bunked.edit();
                    String s,s1;

                    Boolean f1=false;
                    if(Timetable.getBoolean("check",false)==true)
                    {
                        if(day.equals("Sat"))
                            f1=true;
                    }
                    if(day.equals("Sun"))
                        f1=true;

                    if(f1==true)
                        holi.setChecked(true);
                    else{
                        if (holi.isChecked()) {
                            for (int i = 1; i <= 8; i++) {
                                s1 = Timetable.getString(day + i, null);

                                if (!s1.equals(" ")) {
                                    if (Bunked.getInt(cur_date + i, 0) == 1) {
                                        EBunked.putInt(s1 + 1, Bunked.getInt(s1 + 1, 0) - 1);   EBunked.apply();
                                    }
                                    EBunked.putInt(s1 + 2, Bunked.getInt(s1 + 2, 0) - 1);   EBunked.apply();
                                }
                                EBunked.putInt(cur_date + i, -1);     EBunked.apply();
                            }
                            EStatus.putBoolean(cur_date, true);    EStatus.apply();
                        }
                        else{
                            for (int i = 1; i <= 8; i++) {
                                s=Timetable.getString(day + i,null);

                                if (!s.equals(" ")) {
                                    EBunked.putInt(s + 1, Bunked.getInt(s + 1, 0) + 1);     EBunked.apply();
                                    EBunked.putInt(s + 2, Bunked.getInt(s + 2, 0) + 1);     EBunked.apply();
                                    EBunked.putInt(cur_date + i, 1);     EBunked.apply();
                                }
                            }
                            EStatus.putBoolean(cur_date, false);    EStatus.apply();
                        }
                    }

                    setTimeTableColors();
                    setPercent();
                }
            }
        });

        /**************************************************************************************/

        updateOnce();
        setButtonColors();
        setText();
        setPercent();

        if(diff>0)
            setDefaultColors();
        else
            setTimeTableColors();
    }

    /**************************************************************************************/

    public void setTimeTableColors(){
        final Button a1 = (Button) findViewById(R.id.button1);  a1.setOnClickListener(this);
        final Button a2 = (Button) findViewById(R.id.button2);  a2.setOnClickListener(this);
        final Button a3 = (Button) findViewById(R.id.button3);  a3.setOnClickListener(this);
        final Button a4 = (Button) findViewById(R.id.button4);  a4.setOnClickListener(this);
        final Button a5 = (Button) findViewById(R.id.button5);  a5.setOnClickListener(this);
        final Button a6 = (Button) findViewById(R.id.button6);  a6.setOnClickListener(this);
        final Button a7 = (Button) findViewById(R.id.button7);  a7.setOnClickListener(this);
        final Button a8 = (Button) findViewById(R.id.button8);  a8.setOnClickListener(this);

        SharedPreferences TimeTable = getSharedPreferences("timetable", Context.MODE_PRIVATE);
        SharedPreferences TTColor=getSharedPreferences("timetable_color", Context.MODE_PRIVATE);
        SharedPreferences Bunked = getSharedPreferences("bunked", Context.MODE_PRIVATE);
        final CheckBox holi = (CheckBox) findViewById(R.id.holiday);

        int status;

        status=Bunked.getInt(cur_date+1,0);     gd = (GradientDrawable) a1.getBackground().mutate();
        if(holi.isChecked()){   gd.setColor(Color.WHITE);   a1.setText(" "); }
        else if(status==0)   gd.setColor(Color.GRAY);
        else            gd.setColor(TTColor.getInt(day + 1, 0));

        status=Bunked.getInt(cur_date+2,0);     gd = (GradientDrawable) a2.getBackground().mutate();
        if(holi.isChecked()){   gd.setColor(Color.WHITE);   a2.setText(" "); }
        else if(status==0)   gd.setColor(Color.GRAY);
        else            gd.setColor(TTColor.getInt(day + 2, 0));

        status=Bunked.getInt(cur_date+3,0);     gd = (GradientDrawable) a3.getBackground().mutate();
        if(holi.isChecked()){   gd.setColor(Color.WHITE);   a3.setText(" "); }
        else if(status==0)   gd.setColor(Color.GRAY);
        else            gd.setColor(TTColor.getInt(day + 3, 0));

        status=Bunked.getInt(cur_date+4,0);     gd = (GradientDrawable) a4.getBackground().mutate();
        if(holi.isChecked()){   gd.setColor(Color.WHITE);   a4.setText(" "); }
        else if(status==0)   gd.setColor(Color.GRAY);
        else            gd.setColor(TTColor.getInt(day + 4, 0));

        status=Bunked.getInt(cur_date+5,0);     gd = (GradientDrawable) a5.getBackground().mutate();
        if(holi.isChecked()){   gd.setColor(Color.WHITE);   a5.setText(" "); }
        else if(status==0)   gd.setColor(Color.GRAY);
        else            gd.setColor(TTColor.getInt(day + 5, 0));

        status=Bunked.getInt(cur_date+6,0);     gd = (GradientDrawable) a6.getBackground().mutate();
        if(holi.isChecked()){   gd.setColor(Color.WHITE);   a6.setText(" "); }
        else if(status==0)   gd.setColor(Color.GRAY);
        else            gd.setColor(TTColor.getInt(day + 6, 0));

        status=Bunked.getInt(cur_date+7,0);     gd = (GradientDrawable) a7.getBackground().mutate();
        if(holi.isChecked()){   gd.setColor(Color.WHITE);   a7.setText(" "); }
        else if(status==0)   gd.setColor(Color.GRAY);
        else            gd.setColor(TTColor.getInt(day + 7, 0));

        status=Bunked.getInt(cur_date+8,0);     gd = (GradientDrawable) a8.getBackground().mutate();
        if(holi.isChecked()){   gd.setColor(Color.WHITE);   a8.setText(" "); }
        else if(status==0)   gd.setColor(Color.GRAY);
        else            gd.setColor(TTColor.getInt(day + 8, 0));

        if(!holi.isChecked()) {
            a1.setText(TimeTable.getString(day + 1, ""));
            a2.setText(TimeTable.getString(day + 2, ""));
            a3.setText(TimeTable.getString(day + 3, ""));
            a4.setText(TimeTable.getString(day + 4, ""));
            a5.setText(TimeTable.getString(day + 5, ""));
            a6.setText(TimeTable.getString(day + 6, ""));
            a7.setText(TimeTable.getString(day + 7, ""));
            a8.setText(TimeTable.getString(day + 8, ""));
        }
    }

    /**************************************************************************************/

    public void setDefaultColors(){
        SharedPreferences Bunked = getSharedPreferences("bunked", Context.MODE_PRIVATE);
        SharedPreferences.Editor EBunked = Bunked.edit();

        final Button a1 = (Button) findViewById(R.id.button1);  a1.setOnClickListener(this);
        final Button a2 = (Button) findViewById(R.id.button2);  a2.setOnClickListener(this);
        final Button a3 = (Button) findViewById(R.id.button3);  a3.setOnClickListener(this);
        final Button a4 = (Button) findViewById(R.id.button4);  a4.setOnClickListener(this);
        final Button a5 = (Button) findViewById(R.id.button5);  a5.setOnClickListener(this);
        final Button a6 = (Button) findViewById(R.id.button6);  a6.setOnClickListener(this);
        final Button a7 = (Button) findViewById(R.id.button7);  a7.setOnClickListener(this);
        final Button a8 = (Button) findViewById(R.id.button8);  a8.setOnClickListener(this);

        gd = (GradientDrawable) a1.getBackground().mutate();    gd.setColor(Color.WHITE);   a1.setText(" ");
        gd = (GradientDrawable) a2.getBackground().mutate();    gd.setColor(Color.WHITE);   a2.setText(" ");
        gd = (GradientDrawable) a3.getBackground().mutate();    gd.setColor(Color.WHITE);   a3.setText(" ");
        gd = (GradientDrawable) a4.getBackground().mutate();    gd.setColor(Color.WHITE);   a4.setText(" ");
        gd = (GradientDrawable) a5.getBackground().mutate();    gd.setColor(Color.WHITE);   a5.setText(" ");
        gd = (GradientDrawable) a6.getBackground().mutate();    gd.setColor(Color.WHITE);   a6.setText(" ");
        gd = (GradientDrawable) a7.getBackground().mutate();    gd.setColor(Color.WHITE);   a7.setText(" ");
        gd = (GradientDrawable) a8.getBackground().mutate();    gd.setColor(Color.WHITE);   a8.setText(" ");
    }

    /**************************************************************************************/

    public void setButtonColors(){
        final Button b1 = (Button) (findViewById(R.id.but1));
        final Button b2 = (Button) (findViewById(R.id.but2));
        final Button b3 = (Button) (findViewById(R.id.but3));
        final Button b4 = (Button) (findViewById(R.id.but4));
        final Button b5 = (Button) (findViewById(R.id.but5));
        final Button b6 = (Button) (findViewById(R.id.but6));

        String s = "sub";
        SharedPreferences Colors = getSharedPreferences("colors", Context.MODE_PRIVATE);

        gd = (GradientDrawable) b1.getBackground().mutate();    gd.setColor(Colors.getInt(s+1, 0));
        gd = (GradientDrawable) b2.getBackground().mutate();    gd.setColor(Colors.getInt(s+2, 0));
        gd = (GradientDrawable) b3.getBackground().mutate();    gd.setColor(Colors.getInt(s+3, 0));
        gd = (GradientDrawable) b4.getBackground().mutate();    gd.setColor(Colors.getInt(s+4, 0));
        gd = (GradientDrawable) b5.getBackground().mutate();    gd.setColor(Colors.getInt(s+5, 0));
        gd = (GradientDrawable) b6.getBackground().mutate();    gd.setColor(Colors.getInt(s+6, 0));
    }

    /**************************************************************************************/

    public void setText(){
        final TextView t1 = (TextView) findViewById(R.id.sub1);
        final TextView t2 = (TextView) findViewById(R.id.sub2);
        final TextView t3 = (TextView) findViewById(R.id.sub3);
        final TextView t4 = (TextView) findViewById(R.id.sub4);
        final TextView t5 = (TextView) findViewById(R.id.sub5);
        final TextView t6 = (TextView) findViewById(R.id.sub6);
        final TextView t7 = (TextView) findViewById(R.id.day);

        String s = "sub";
        SharedPreferences Subject = getSharedPreferences("subject", Context.MODE_PRIVATE);

        t1.setText(Subject.getString(s+1, null));
        t2.setText(Subject.getString(s+2, null));
        t3.setText(Subject.getString(s+3, null));
        t4.setText(Subject.getString(s+4, null));
        t5.setText(Subject.getString(s+5, null));
        t6.setText(Subject.getString(s+6, null));
        t7.setText(day);
    }

    /**************************************************************************************/
    //  s+3 = Overall Percentage of each Subject

    public void setPercent(){
        final TextView p1 = (TextView) findViewById(R.id.percent1);
        final TextView p2 = (TextView) findViewById(R.id.percent2);
        final TextView p3 = (TextView) findViewById(R.id.percent3);
        final TextView p4 = (TextView) findViewById(R.id.percent4);
        final TextView p5 = (TextView) findViewById(R.id.percent5);
        final TextView p6 = (TextView) findViewById(R.id.percent6);
        final Button b=(Button) findViewById(R.id.overall);
        final Button b1=(Button)findViewById(R.id.safe);

        String s;
        SharedPreferences Subject = getSharedPreferences("subject", Context.MODE_PRIVATE);
        SharedPreferences Bunked = getSharedPreferences("bunked", Context.MODE_PRIVATE);
        SharedPreferences.Editor EBunked = Bunked.edit();

        int num=0,den=0;
        double temp_total;
        for(int i=1;i<=9;i++) {
            s = Subject.getString("sub"+i, "");
            int temp_nr=Bunked.getInt(s + 1,0);
            int temp_dr=Bunked.getInt(s + 2,0);
            if(diff<=0 && temp_dr!=0)
            {
                num+=temp_nr;
                den+=temp_dr;
                temp_total = (temp_nr / (float) temp_dr) * 100;
                if(temp_total > 100.0)
                    temp_total = 100.0;
                DecimalFormat formater = new DecimalFormat("#.##");
                EBunked.putString(s + 3, formater.format(temp_total) + "%");
            }
            else
                EBunked.putString(s + 3, "0%");
            EBunked.apply();
        }
        if(diff<=0 && den!=0) {
            Float ma=Subject.getFloat("ma",0);
            int sb= (int) ((num-(ma*den))/ma);
            if(sb>=0)
                b1.setText(Integer.toString(sb));
            else
                b1.setText("0");

            temp_total = (num / (float) den) * 100;
            if(temp_total > 100.0)
                temp_total = 100.0;

            DecimalFormat formater = new DecimalFormat("#.##");
            EBunked.putString("overall", formater.format(temp_total) + "%");
            b.setText(formater.format(temp_total) + "%");
        }
        else
        {
            EBunked.putString("overall", "0%");
            b.setText("0%");   
        }
        EBunked.apply();

        s = Subject.getString("sub1", "");      p1.setText(Bunked.getString(s+3, ""));
        s = Subject.getString("sub2", "");      p2.setText(Bunked.getString(s+3, ""));
        s = Subject.getString("sub3", "");      p3.setText(Bunked.getString(s+3, ""));
        s = Subject.getString("sub4", "");      p4.setText(Bunked.getString(s+3, ""));
        s = Subject.getString("sub5", "");      p5.setText(Bunked.getString(s+3, ""));
        s = Subject.getString("sub6", "");      p6.setText(Bunked.getString(s+3, ""));
    }

    /**************************************************************************************/
    //Updates Denominator[ONLY ONCE A DAY] Daily and for Previous Starting Date if Missed to open(NOT FOR FUTURE START DATE)
    //Updates Previous Starting Date by assuming FULL ATTENDANCE during that interval-time
    //Updates Status Bits  1=Unbunk and 0=Bunk and -1=FREE
    
    public void updateOnce(){
        int i=-1;
        String start_date,back_date;
        Boolean dates;

        SharedPreferences Bunked = getSharedPreferences("bunked", Context.MODE_PRIVATE);

        start_date=Bunked.getString("start_date",null);
        back_date=cur_date;
        dates=Bunked.getBoolean(cur_date,false);

        sdf=new SimpleDateFormat("ddMME");
        try {
            Date d1 = sdf.parse(start_date);
            Date d = sdf.parse(cur_date);
            diff = (int) ((d1.getTime() - d.getTime()) / (1000 * 60 * 60 * 24));
            if (diff > 0) 
                Toast.makeText(this, Integer.toString(diff) + " day(s) to Go Buddy!", Toast.LENGTH_SHORT).show();
            else if (diff <= 0 && dates == false) {
                while (dates == false && !start_date.equals(back_date)) {
                    updation(back_date);
                    back_date = date(d, i--);
                    dates = Bunked.getBoolean(back_date, false);
                }
                if (dates == false)
                    updation(back_date);
                
                /**************************************************************************************/
                //Since diff < 0, Show Assumptions in AlertDialog
                
                if(diff < 0)
                {
                    final SharedPreferences Status=getSharedPreferences("status", Context.MODE_PRIVATE);
                    final SharedPreferences.Editor EStatus=Status.edit();

                    AlertDialog.Builder alert = new AlertDialog.Builder(this);

                    alert.setMessage("1. The App makes an Assumption that you have ATTENDED All the Classes from START_DATE to TODAY." + "\n" + "2. Also, You can Click MODIFY BUNK to Update the PAST Changes").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    }).setTitle("Assumptions!");

                    if(Status.getBoolean("status51", false)==false){
                        AlertDialog dialog=alert.create();
                        dialog.show();
                        EStatus.putBoolean("status51",true);
                        EStatus.apply();
                    }
                }
                prevUpdateOnce();
            }
        }
        catch(ParseException e) {   }
    }

    /**************************************************************************************/
    // Single-Day Updation called by updateonce through WHILE-LOOP
    // s+1=numerator and s+2=denominator
    //Updating Status-Bit too 0=BUNK and 1=UNBUNK and -1=FREE

    public void updation(String back_date)
    {
        SharedPreferences TimeTable = getSharedPreferences("timetable", Context.MODE_PRIVATE);
        SharedPreferences Bunked = getSharedPreferences("bunked", Context.MODE_PRIVATE);
        SharedPreferences.Editor EBunked = Bunked.edit();

        Boolean f=false;
        String s, days=back_date.substring(4);
        if(TimeTable.getBoolean("check",false)==true)
        {
            if(days.equals("Sat"))
                f=true;
        }
        if(days.equals("Sun"))
            f=true;

        for(int i=1;i<=8;i++) {
            if(f==false) {
                EBunked.putBoolean(back_date,true);
                EBunked.apply();

                s = TimeTable.getString(days + i, "");
                if (!s.equals(" ")) {
                    EBunked.putInt(s + 1, Bunked.getInt(s + 1, 0) + 1);
                    EBunked.putInt(s + 2, Bunked.getInt(s + 2, 0) + 1);
                    EBunked.putInt(back_date + i, 1);
                } else
                    EBunked.putInt(back_date + i, -1);
            }
            else
                EBunked.putInt(back_date + i, -1);
            EBunked.apply();
        }
    }

    /**************************************************************************************/

    public void prevUpdateOnce() {
        int i=-1;
        String start_date,back_date;
        Boolean dates;

        SharedPreferences Bunked = getSharedPreferences("bunked", Context.MODE_PRIVATE);
        SharedPreferences PrevTimeTable = getSharedPreferences("prevtimetable", Context.MODE_PRIVATE);

        try {
            sdf=new SimpleDateFormat("ddMME");
            start_date=Bunked.getString("start_date",null);

            if(!cur_date.equals(start_date)){
                Date d2 = sdf.parse(cur_date);
                back_date = date(d2, i--);

                Date d1 = sdf.parse(start_date);
                d2 = sdf.parse(back_date);
                diff = (int) ((d1.getTime() - d2.getTime()) / (1000 * 60 * 60 * 24));
                dates=PrevTimeTable.getBoolean(back_date,false);

                while (dates == false && !start_date.equals(back_date)) {
                    prevUpdation(back_date);
                    back_date = date(d2, i--);
                    dates=PrevTimeTable.getBoolean(back_date,false);
                }
                if (dates == false)
                    prevUpdation(back_date);
            }
        }
        catch (ParseException e){ }
    }

    /**************************************************************************************/

    public void prevUpdation(String back_date){
        SharedPreferences Timetable=getSharedPreferences("timetable", Context.MODE_PRIVATE);
        SharedPreferences TTColor=getSharedPreferences("timetable_color", Context.MODE_PRIVATE);
        SharedPreferences PrevTimeTable = getSharedPreferences("prevtimetable", Context.MODE_PRIVATE);
        SharedPreferences.Editor EPrevTimeTable = PrevTimeTable.edit();
        SharedPreferences PrevTTColor = getSharedPreferences("prevttcolor", Context.MODE_PRIVATE);
        SharedPreferences.Editor EPrevTTColor = PrevTTColor.edit();

        EPrevTimeTable.putBoolean(back_date,true);
        EPrevTimeTable.apply();

        String key_day=back_date.substring(4);
        for(int i=1;i<=8;i++) {
            EPrevTimeTable.putString(key_day + i, Timetable.getString(key_day + i,null));   EPrevTimeTable.apply();
            EPrevTTColor.putInt(key_day + i, TTColor.getInt(key_day + i,0));    EPrevTTColor.apply();
        }
    }

    /**************************************************************************************/
    // if i==0  returns ddMME for a given Date(d)
    // else     returns ddMME for Previous Date(back) i.e returns Yesterday date

    public String date(Date d,int i){
        sdf = new SimpleDateFormat("ddMME");
        if(i==0)
            return sdf.format(d);
        else {
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DAY_OF_MONTH, i);
            Date back = cal.getTime();
            return sdf.format(back);
        }
    }

    /**************************************************************************************/
    //If one of 8 Buttons(Hours) were Clicked....

    @Override
    public void onClick(View v){
        SharedPreferences TimeTable = getSharedPreferences("timetable", Context.MODE_PRIVATE);
        SharedPreferences Bunked = getSharedPreferences("bunked", MODE_PRIVATE);
        SharedPreferences.Editor EBunked = Bunked.edit();
        SharedPreferences TTColor = getSharedPreferences("timetable_color", Context.MODE_PRIVATE);
        final CheckBox holi = (CheckBox) findViewById(R.id.holiday);

        Boolean f=false;
        if(TimeTable.getBoolean("check",false)==true)
        {
            if(day.equals("Sat"))
                f=true;
        }
        if(day.equals("Sun"))
            f=true;

        if(f==true)
            Toast.makeText(this, "Today is Holiday Buddy" + "\n" + "I hope you are Testing my Intelligence" + "\n" + "Anyway Carry On", Toast.LENGTH_LONG).show();
        else if(holi.isChecked())
            Toast.makeText(this, "UNCHECK Holiday Checkbox Buddy", Toast.LENGTH_SHORT).show();
        else if(diff<=0) {
            int temp_status=-1, pid = v.getId();
            gd = (GradientDrawable) v.getBackground().mutate();
            Button b1 = (Button) v;
            String sub = b1.getText().toString();

            switch (pid) {
                case R.id.button1:
                    temp_status = Bunked.getInt(cur_date + 1, 0);
                    if (temp_status == 1) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) - 1);     EBunked.putInt(cur_date + 1, 0);    gd.setColor(Color.GRAY);
                    } else if (temp_status == 0) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) + 1);     EBunked.putInt(cur_date + 1, 1);    gd.setColor(TTColor.getInt(day + 1, 0));
                    }
                    EBunked.apply();
                    break;
                case R.id.button2:
                    temp_status = Bunked.getInt(cur_date + 2, 0);
                    if (temp_status == 1) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) - 1);     EBunked.putInt(cur_date + 2, 0);    gd.setColor(Color.GRAY);
                    } else if (temp_status == 0) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) + 1);     EBunked.putInt(cur_date + 2, 1);    gd.setColor(TTColor.getInt(day + 2, 0));
                    }
                    EBunked.apply();
                    break;
                case R.id.button3:
                    temp_status = Bunked.getInt(cur_date + 3, 0);
                    if (temp_status == 1) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) - 1);     EBunked.putInt(cur_date + 3, 0);    gd.setColor(Color.GRAY);
                    } else if (temp_status == 0) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) + 1);     EBunked.putInt(cur_date + 3, 1);    gd.setColor(TTColor.getInt(day + 3, 0));
                    }
                    EBunked.apply();
                    break;
                case R.id.button4:
                    temp_status = Bunked.getInt(cur_date + 4, 0);
                    if (temp_status == 1) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) - 1);     EBunked.putInt(cur_date + 4, 0);    gd.setColor(Color.GRAY);
                    } else if (temp_status == 0) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) + 1);     EBunked.putInt(cur_date + 4, 1);    gd.setColor(TTColor.getInt(day + 4, 0));
                    }
                    EBunked.apply();
                    break;
                case R.id.button5:
                    temp_status = Bunked.getInt(cur_date + 5, 0);
                    if (temp_status == 1) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) - 1);     EBunked.putInt(cur_date + 5, 0);    gd.setColor(Color.GRAY);
                    } else if (temp_status == 0) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) + 1);     EBunked.putInt(cur_date + 5, 1);    gd.setColor(TTColor.getInt(day + 5, 0));
                    }
                    EBunked.apply();
                    break;
                case R.id.button6:
                    temp_status = Bunked.getInt(cur_date + 6, 0);
                    if (temp_status == 1) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) - 1);     EBunked.putInt(cur_date + 6, 0);    gd.setColor(Color.GRAY);
                    } else if (temp_status == 0) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) + 1);     EBunked.putInt(cur_date + 6, 1);    gd.setColor(TTColor.getInt(day + 6, 0));
                    }
                    EBunked.apply();
                    break;
                case R.id.button7:
                    temp_status = Bunked.getInt(cur_date + 7, 0);
                    if (temp_status == 1) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) - 1);     EBunked.putInt(cur_date + 7, 0);    gd.setColor(Color.GRAY);
                    } else if (temp_status == 0) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) + 1);     EBunked.putInt(cur_date + 7, 1);    gd.setColor(TTColor.getInt(day + 7, 0));
                    }
                    EBunked.apply();
                    break;
                case R.id.button8:
                    temp_status = Bunked.getInt(cur_date + 8, 0);
                    if (temp_status == 1) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) - 1);     EBunked.putInt(cur_date + 8, 0);    gd.setColor(Color.GRAY);
                    } else if (temp_status == 0) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) + 1);     EBunked.putInt(cur_date + 8, 1);    gd.setColor(TTColor.getInt(day + 8, 0));
                    }
                    EBunked.apply();
                    break;
            }
            if(temp_status==-1)
                Toast.makeText(this, "So Funny man you are..." + "\n" + "How can you BUNK Free Hours Buddy?", Toast.LENGTH_SHORT).show();
            else
                setPercent();
        }
        else 
            Toast.makeText(this, "Sorry! Start-Date is " + Integer.toString(diff)+ " day(s) to go", Toast.LENGTH_SHORT).show();
    }

    /**************************************************************************************/
    //Options Menu

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        Intent i1;
        switch (item.getItemId())
        {
            case R.id.pop1:
                i1 = new Intent(getApplicationContext(), a00032.class);
                startActivity(i1);
                break;
            case R.id.pop2:
                i1 = new Intent(getApplicationContext(), a00031.class);
                startActivity(i1);
                break;
            case R.id.pop3:
                AlertDialog.Builder alert = new AlertDialog.Builder(this);

                alert.setMessage("Modifying the START-DATE will LOSE all your Bunked & UnBunked Data"+"\n"+"Do you want to proceed?").setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i1 = new Intent(getApplicationContext(), a00041.class);
                        startActivity(i1);
                    }
                }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setTitle("Warning!").create();
                alert.show();
                break;
            case R.id.pop4:
                if(diff<=0) {
                    i1 = new Intent(getApplicationContext(), a00051.class);
                    startActivity(i1);
                }
                else
                {
                    alert = new AlertDialog.Builder(this);
                    alert.setMessage("You haven't Attended More than 1 Day Buddy!").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                        }
                    }).setTitle("Warning!").create();
                    alert.show();
                }
                break;
            case R.id.pop5:
                //i1 = new Intent(getApplicationContext(), a0006.class);
                //startActivity(i1);
                break;
            case R.id.pop6:
                i1 = new Intent(Intent.ACTION_MAIN);
                i1.addCategory(Intent.CATEGORY_HOME);
                i1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i1);
                break;
        }
        return super.onOptionsItemSelected(item);
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