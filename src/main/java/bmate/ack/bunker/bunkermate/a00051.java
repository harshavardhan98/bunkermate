package bmate.ack.bunker.bunkermate;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import bmate.bunkermate.R;

public class a00051 extends AppCompatActivity implements View.OnClickListener {

    public static String key_date,key_day;
    public GradientDrawable gd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a00051);

        final CheckBox holi = (CheckBox) findViewById(R.id.holiday);
        ImageButton calendar=(ImageButton) findViewById(R.id.setdate);
        final DatePickerDialog.OnDateSetListener mdateSetListener;
        final TextView dat=(TextView) findViewById(R.id.date);
        final TextView mon=(TextView) findViewById(R.id.month);

        final SharedPreferences Status=getSharedPreferences("status", Context.MODE_PRIVATE);
        final SharedPreferences.Editor EStatus=Status.edit();
        SharedPreferences Timetable = getSharedPreferences("timetable", Context.MODE_PRIVATE);

        /************************************************************************************/

        final AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setMessage("First, Click the Date-Picker Calendar").setPositiveButton("NEXT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                alert.setMessage("And then Click the Corresponding Cells in the Table to Bunk and UnBunk").setPositiveButton("FINISH", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setTitle("Modify Bunk").create();
                alert.show();
            }
        }).setTitle("Modify Bunk").create();
        alert.show();

        /************************************************************************************/

        SimpleDateFormat sdf=new SimpleDateFormat("MMM");
        final Date d=new Date();
        mon.setText(sdf.format(d));
        sdf=new SimpleDateFormat("dd");
        dat.setText(sdf.format(d));

        sdf = new SimpleDateFormat("ddMME");
        key_date=sdf.format(d);
        sdf = new SimpleDateFormat("E");
        key_day=sdf.format(d);

        /************************************************************************************/

        Boolean f1=false;
        if(Timetable.getBoolean("check",false)==true)
        {
            if(key_day.equals("Sat"))
                f1=true;
        }
        if(key_day.equals("Sun"))
            f1=true;

        if(Status.getBoolean(key_date,false)==true || f1==true)
            holi.setChecked(true);
        else
            holi.setChecked(false);

        holi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences Timetable = getSharedPreferences("timetable", Context.MODE_PRIVATE);
                SharedPreferences Bunked = getSharedPreferences("bunked", Context.MODE_PRIVATE);
                SharedPreferences.Editor EBunked = Bunked.edit();
                String s,s1;

                Boolean f1=false;
                if(Timetable.getBoolean("check",false)==true)
                {
                    if(key_day.equals("Sat"))
                        f1=true;
                }
                if(key_day.equals("Sun"))
                    f1=true;

                if(f1==true)
                    holi.setChecked(true);
                else{
                    if (holi.isChecked()) {
                        for (int i = 1; i <= 8; i++) {
                            s1 = Timetable.getString(key_day + i, null);

                            if (!s1.equals(" ")) {
                                if (Bunked.getInt(key_date + i, 0) == 1) {
                                    EBunked.putInt(s1 + 1, Bunked.getInt(s1 + 1, 0) - 1);   EBunked.apply();
                                }
                                EBunked.putInt(s1 + 2, Bunked.getInt(s1 + 2, 0) - 1);   EBunked.apply();
                            }
                            EBunked.putInt(key_date + i, -1);     EBunked.apply();
                        }
                        EStatus.putBoolean(key_date, true);    EStatus.apply();
                    }
                    else{
                        for (int i = 1; i <= 8; i++) {
                            s=Timetable.getString(key_day + i,null);

                            if (!s.equals(" ")) {
                                EBunked.putInt(s + 1, Bunked.getInt(s + 1, 0) + 1);     EBunked.apply();
                                EBunked.putInt(s + 2, Bunked.getInt(s + 2, 0) + 1);     EBunked.apply();
                                EBunked.putInt(key_date + i, 1);     EBunked.apply();
                            }
                        }
                        EStatus.putBoolean(key_date, false);    EStatus.apply();
                    }
                }

                setTimeTableColors();
                setPercent();
            }
        });

        /************************************************************************************/

        setButtonColors();
        setText();
        setPercent();
        setTimeTableColors();

        /************************************************************************************/
        //When DatePickerDialog is Clicked...

        mdateSetListener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int date) {
                final TextView t = (TextView) findViewById(R.id.day);
                month=month+1;

                String dd = (date < 10) ? "0" + Integer.toString(date) : Integer.toString(date);
                String mm = (month < 10) ? "0" + Integer.toString(month) : Integer.toString(month);

                String days[]={null,"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
                String months[]={null,"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

                Calendar local=Calendar.getInstance(TimeZone.getDefault());
                local.set(year,month-1,date);
                int day=local.get(Calendar.DAY_OF_WEEK);

                key_date=dd+mm+days[day];
                key_day=days[day];

                if(Status.getBoolean(key_date,false)==true)
                    holi.setChecked(true);
                else
                    holi.setChecked(false);

                dat.setText(dd);
                mon.setText(months[month]);
                t.setText(key_day);
                setTimeTableColors();
            }
        };

        /************************************************************************************/
        //When Calendar is Clicked...

        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences Bunked=getSharedPreferences("bunked",Context.MODE_PRIVATE);
                String sd=Bunked.getString("start_date",null);

                Calendar cal=Calendar.getInstance();
                int day=cal.get(Calendar.DAY_OF_MONTH);
                int month=cal.get(Calendar.MONTH);
                int year=cal.get(Calendar.YEAR);

                DatePickerDialog dialog=new DatePickerDialog(a00051.this,android.R.style.Theme_DeviceDefault_Light_Panel, mdateSetListener, year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));

                try{
                    dialog.getDatePicker().setMaxDate(cal.getTimeInMillis());

                    String str=sd.substring(0,2)+"-"+sd.substring(2,4)+"-"+Integer.toString(year);
                    SimpleDateFormat sdf=new SimpleDateFormat("dd-M-yyyy");
                    cal.setTime(sdf.parse(str));
                    dialog.getDatePicker().setMinDate(cal.getTimeInMillis());
                }
                catch (ParseException e){ }

                dialog.show();
            }
        });
    }

    /************************************************************************************/

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

    /************************************************************************************/

    public void setText(){
        final TextView t1 = (TextView) findViewById(R.id.sub1);
        final TextView t2 = (TextView) findViewById(R.id.sub2);
        final TextView t3 = (TextView) findViewById(R.id.sub3);
        final TextView t4 = (TextView) findViewById(R.id.sub4);
        final TextView t5 = (TextView) findViewById(R.id.sub5);
        final TextView t6 = (TextView) findViewById(R.id.sub6);
        final TextView t = (TextView) findViewById(R.id.day);       t.setText(key_day);

        String s = "sub";
        SharedPreferences Subject = getSharedPreferences("subject", Context.MODE_PRIVATE);

        t1.setText(Subject.getString(s+1, null));
        t2.setText(Subject.getString(s+2, null));
        t3.setText(Subject.getString(s+3, null));
        t4.setText(Subject.getString(s+4, null));
        t5.setText(Subject.getString(s+5, null));
        t6.setText(Subject.getString(s+6, null));
    }

    /************************************************************************************/
    //  s+3 = Overall Percentage of each Subject

    public void setPercent(){
        final TextView p1 = (TextView) findViewById(R.id.percent1);
        final TextView p2 = (TextView) findViewById(R.id.percent2);
        final TextView p3 = (TextView) findViewById(R.id.percent3);
        final TextView p4 = (TextView) findViewById(R.id.percent4);
        final TextView p5 = (TextView) findViewById(R.id.percent5);
        final TextView p6 = (TextView) findViewById(R.id.percent6);

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
            if(temp_dr!=0)
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
        if(den!=0) {
            temp_total = (num / (float) den) * 100;
            if(temp_total > 100.0)
                temp_total = 100.0;
            DecimalFormat formater = new DecimalFormat("#.##");
            EBunked.putString("overall", formater.format(temp_total) + "%");
        }
        else
            EBunked.putString("overall", "0%");
        EBunked.apply();

        s = Subject.getString("sub1", "");      p1.setText(Bunked.getString(s+3, ""));
        s = Subject.getString("sub2", "");      p2.setText(Bunked.getString(s+3, ""));
        s = Subject.getString("sub3", "");      p3.setText(Bunked.getString(s+3, ""));
        s = Subject.getString("sub4", "");      p4.setText(Bunked.getString(s+3, ""));
        s = Subject.getString("sub5", "");      p5.setText(Bunked.getString(s+3, ""));
        s = Subject.getString("sub6", "");      p6.setText(Bunked.getString(s+3, ""));
    }

    /************************************************************************************/

    public void setTimeTableColors(){
        SharedPreferences TimeTable = getSharedPreferences("timetable", Context.MODE_PRIVATE);
        SharedPreferences TTColor=getSharedPreferences("timetable_color", Context.MODE_PRIVATE);
        SharedPreferences PrevTimeTable = getSharedPreferences("prevtimetable", Context.MODE_PRIVATE);
        SharedPreferences PrevTTColor = getSharedPreferences("prevttcolor", Context.MODE_PRIVATE);

        SimpleDateFormat sdf = new SimpleDateFormat("ddMME");
        Date d=new Date();
        String cur_date=sdf.format(d);

        if(key_date.equals(cur_date))
            setTimeTableColorsShared(TimeTable,TTColor);
        else
            setTimeTableColorsShared(PrevTimeTable,PrevTTColor);
    }

    public void setTimeTableColorsShared(SharedPreferences TT,SharedPreferences TTC){
        final Button a1 = (Button) findViewById(R.id.button1);  a1.setOnClickListener(this);
        final Button a2 = (Button) findViewById(R.id.button2);  a2.setOnClickListener(this);
        final Button a3 = (Button) findViewById(R.id.button3);  a3.setOnClickListener(this);
        final Button a4 = (Button) findViewById(R.id.button4);  a4.setOnClickListener(this);
        final Button a5 = (Button) findViewById(R.id.button5);  a5.setOnClickListener(this);
        final Button a6 = (Button) findViewById(R.id.button6);  a6.setOnClickListener(this);
        final Button a7 = (Button) findViewById(R.id.button7);  a7.setOnClickListener(this);
        final Button a8 = (Button) findViewById(R.id.button8);  a8.setOnClickListener(this);
        final CheckBox holi = (CheckBox) findViewById(R.id.holiday);

        SharedPreferences Bunked = getSharedPreferences("bunked", Context.MODE_PRIVATE);
        int status;

        status=Bunked.getInt(key_date+1,0);     gd = (GradientDrawable) a1.getBackground().mutate();
        if(holi.isChecked()){   gd.setColor(Color.WHITE);   a1.setText(" "); }
        else if(status==0)   gd.setColor(Color.GRAY);
        else            gd.setColor(TTC.getInt(key_day + 1, 0));

        status=Bunked.getInt(key_date+2,0);     gd = (GradientDrawable) a2.getBackground().mutate();
        if(holi.isChecked()){   gd.setColor(Color.WHITE);   a2.setText(" "); }
        else if(status==0)   gd.setColor(Color.GRAY);
        else            gd.setColor(TTC.getInt(key_day + 2, 0));

        status=Bunked.getInt(key_date+3,0);     gd = (GradientDrawable) a3.getBackground().mutate();
        if(holi.isChecked()){   gd.setColor(Color.WHITE);   a3.setText(" "); }
        else if(status==0)   gd.setColor(Color.GRAY);
        else            gd.setColor(TTC.getInt(key_day + 3, 0));

        status=Bunked.getInt(key_date+4,0);     gd = (GradientDrawable) a4.getBackground().mutate();
        if(holi.isChecked()){   gd.setColor(Color.WHITE);   a4.setText(" "); }
        else if(status==0)   gd.setColor(Color.GRAY);
        else            gd.setColor(TTC.getInt(key_day + 4, 0));

        status=Bunked.getInt(key_date+5,0);     gd = (GradientDrawable) a5.getBackground().mutate();
        if(holi.isChecked()){   gd.setColor(Color.WHITE);   a5.setText(" "); }
        else if(status==0)   gd.setColor(Color.GRAY);
        else            gd.setColor(TTC.getInt(key_day + 5, 0));

        status=Bunked.getInt(key_date+6,0);     gd = (GradientDrawable) a6.getBackground().mutate();
        if(holi.isChecked()){   gd.setColor(Color.WHITE);   a6.setText(" "); }
        else if(status==0)   gd.setColor(Color.GRAY);
        else            gd.setColor(TTC.getInt(key_day + 6, 0));

        status=Bunked.getInt(key_date+7,0);     gd = (GradientDrawable) a7.getBackground().mutate();
        if(holi.isChecked()){   gd.setColor(Color.WHITE);   a7.setText(" "); }
        else if(status==0)   gd.setColor(Color.GRAY);
        else            gd.setColor(TTC.getInt(key_day + 7, 0));

        status=Bunked.getInt(key_date+8,0);     gd = (GradientDrawable) a8.getBackground().mutate();
        if(holi.isChecked()){   gd.setColor(Color.WHITE);   a8.setText(" "); }
        else if(status==0)   gd.setColor(Color.GRAY);
        else            gd.setColor(TTC.getInt(key_day+ 8, 0));

        if(!holi.isChecked()) {
            a1.setText(TT.getString(key_day + 1, ""));
            a2.setText(TT.getString(key_day + 2, ""));
            a3.setText(TT.getString(key_day + 3, ""));
            a4.setText(TT.getString(key_day + 4, ""));
            a5.setText(TT.getString(key_day + 5, ""));
            a6.setText(TT.getString(key_day + 6, ""));
            a7.setText(TT.getString(key_day + 7, ""));
            a8.setText(TT.getString(key_day + 8, ""));
        }
    }

    /************************************************************************************/
    //If one of 8 Buttons(Hours) were Clicked....

    @Override
    public void onClick(View v) {
        SharedPreferences TimeTable = getSharedPreferences("timetable", Context.MODE_PRIVATE);
        SharedPreferences Bunked = getSharedPreferences("bunked", MODE_PRIVATE);
        SharedPreferences.Editor EBunked = Bunked.edit();
        SharedPreferences TTColor = getSharedPreferences("timetable_color", Context.MODE_PRIVATE);
        final CheckBox holi = (CheckBox) findViewById(R.id.holiday);

        Boolean f=false;
        if(TimeTable.getBoolean("check",false)==true)
        {
            if(key_day.equals("Sat"))
                f=true;
        }
        if(key_day.equals("Sun"))
            f=true;

        if(f==true)
            Toast.makeText(this, "It's Holiday Buddy" + "\n" + "I hope you are Testing my Intelligence" + "\n" + "Anyway Carry On", Toast.LENGTH_LONG).show();
        else if(!holi.isChecked()){
            int temp_status=-1, pid = v.getId();
            gd = (GradientDrawable) v.getBackground().mutate();
            Button b1 = (Button) v;
            String sub = b1.getText().toString();

            switch (pid) {
                case R.id.button1:
                    temp_status = Bunked.getInt(key_date + 1, 0);
                    if (temp_status == 1) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) - 1);     EBunked.putInt(key_date + 1, 0);    gd.setColor(Color.GRAY);
                    } else if (temp_status == 0) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) + 1);     EBunked.putInt(key_date + 1, 1);    gd.setColor(TTColor.getInt(key_day + 1, 0));
                    }
                    EBunked.apply();
                    break;
                case R.id.button2:
                    temp_status = Bunked.getInt(key_date + 2, 0);
                    if (temp_status == 1) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) - 1);     EBunked.putInt(key_date + 2, 0);    gd.setColor(Color.GRAY);
                    } else if (temp_status == 0) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) + 1);     EBunked.putInt(key_date + 2, 1);    gd.setColor(TTColor.getInt(key_day + 2, 0));
                    }
                    EBunked.apply();
                    break;
                case R.id.button3:
                    temp_status = Bunked.getInt(key_date + 3, 0);
                    if (temp_status == 1) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) - 1);     EBunked.putInt(key_date + 3, 0);    gd.setColor(Color.GRAY);
                    } else if (temp_status == 0) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) + 1);     EBunked.putInt(key_date + 3, 1);    gd.setColor(TTColor.getInt(key_day + 3, 0));
                    }
                    EBunked.apply();
                    break;
                case R.id.button4:
                    temp_status = Bunked.getInt(key_date + 4, 0);
                    if (temp_status == 1) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) - 1);     EBunked.putInt(key_date + 4, 0);    gd.setColor(Color.GRAY);
                    } else if (temp_status == 0) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) + 1);     EBunked.putInt(key_date + 4, 1);    gd.setColor(TTColor.getInt(key_day + 4, 0));
                    }
                    EBunked.apply();
                    break;
                case R.id.button5:
                    temp_status = Bunked.getInt(key_date + 5, 0);
                    if (temp_status == 1) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) - 1);     EBunked.putInt(key_date + 5, 0);    gd.setColor(Color.GRAY);
                    } else if (temp_status == 0) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) + 1);     EBunked.putInt(key_date + 5, 1);    gd.setColor(TTColor.getInt(key_day + 5, 0));
                    }
                    EBunked.apply();
                    break;
                case R.id.button6:
                    temp_status = Bunked.getInt(key_date + 6, 0);
                    if (temp_status == 1) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) - 1);     EBunked.putInt(key_date + 6, 0);    gd.setColor(Color.GRAY);
                    } else if (temp_status == 0) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) + 1);     EBunked.putInt(key_date + 6, 1);    gd.setColor(TTColor.getInt(key_day + 6, 0));
                    }
                    EBunked.apply();
                    break;
                case R.id.button7:
                    temp_status = Bunked.getInt(key_date + 7, 0);
                    if (temp_status == 1) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) - 1);     EBunked.putInt(key_date + 7, 0);    gd.setColor(Color.GRAY);
                    } else if (temp_status == 0) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) + 1);     EBunked.putInt(key_date + 7, 1);    gd.setColor(TTColor.getInt(key_day + 7, 0));
                    }
                    EBunked.apply();
                    break;
                case R.id.button8:
                    temp_status = Bunked.getInt(key_date + 8, 0);
                    if (temp_status == 1) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) - 1);     EBunked.putInt(key_date + 8, 0);    gd.setColor(Color.GRAY);
                    } else if (temp_status == 0) {
                        EBunked.putInt(sub + 1, Bunked.getInt(sub + 1, 0) + 1);     EBunked.putInt(key_date + 8, 1);    gd.setColor(TTColor.getInt(key_day + 8, 0));
                    }
                    EBunked.apply();
                    break;
            }
            if(temp_status==-1)
                Toast.makeText(this, "So Funny man you are..." + "\n" + "How can you BUNK Free Hours Buddy?", Toast.LENGTH_SHORT).show();
            else
                setPercent();
        }
    }

    /************************************************************************************/

    @Override
    public void onBackPressed()
    {
        Intent i1=new Intent(getApplicationContext(), a0005.class);
        startActivity(i1);
    }
}