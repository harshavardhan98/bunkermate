package bmate.ack.bunker.bunkermate;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.TimeZone;

import bmate.bunkermate.R;

public class a00041 extends AppCompatActivity {
    public static int backButtonCount=0;
    public String modified_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a00041);

        final SharedPreferences Status=getSharedPreferences("status", Context.MODE_PRIVATE);
        final SharedPreferences.Editor EStatus=Status.edit();

        /**************************************************************************************/
        //Changing the Status bit

        EStatus.putInt("status",201);
        EStatus.apply();

        /**************************************************************************************/
        //AlertDialog

        View v = getLayoutInflater().inflate(R.layout.activity_dialog, null);
        final CheckBox c = v.findViewById(R.id.dont);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c.isChecked())
                    EStatus.putBoolean("status41", true);
                else
                    EStatus.putBoolean("status41", false);
                EStatus.apply();
            }
        });

        AlertDialog.Builder alert=new AlertDialog.Builder(this);

        alert.setMessage("Pick the Start Date of Attendance").setPositiveButton("Continue", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).setView(v).setTitle("It's time to Start Buddy!");

        if(Status.getBoolean("status41", false)==false){
            AlertDialog dialog=alert.create();
            dialog.show();
        }

        /**************************************************************************************/
        //When Save Button is Clicked...

        Button b=(Button)findViewById(R.id.but1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences Bunked=getSharedPreferences("bunked",Context.MODE_PRIVATE);

                DatePicker dp=(DatePicker)findViewById(R.id.datePicker);
                int date=dp.getDayOfMonth();
                int month=dp.getMonth()+1;

                String dd = (date < 10) ? "0" + Integer.toString(date) : Integer.toString(date);
                String mm = (month < 10) ? "0" + Integer.toString(month) : Integer.toString(month);

                String days[]={null,"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};

                Calendar local=Calendar.getInstance(TimeZone.getDefault());
                local.set(dp.getYear(),dp.getMonth(),dp.getDayOfMonth());
                int day=local.get(Calendar.DAY_OF_WEEK);
                modified_start=dd+mm+days[day];

                refresh();

                EStatus.putInt("status",300);
                EStatus.apply();

                Intent i1 = new Intent(getApplicationContext(), a0005.class);
                startActivity(i1);
            }
        });
    }

    /**************************************************************************************/
    // s+1=numerator and s+2=denominator

     public void refresh(){
        SharedPreferences Bunked=getSharedPreferences("bunked",Context.MODE_PRIVATE);
        SharedPreferences.Editor EBunked=Bunked.edit();
        EBunked.clear();
        EBunked.commit();

        SharedPreferences PrevTimeTable = getSharedPreferences("prevtimetable", Context.MODE_PRIVATE);
        SharedPreferences.Editor EPrevTimeTable = PrevTimeTable.edit();
        EPrevTimeTable.clear();
        EPrevTimeTable.commit();

        SharedPreferences PrevTTColor = getSharedPreferences("prevttcolor", Context.MODE_PRIVATE);
        SharedPreferences.Editor EPrevTTColor = PrevTTColor.edit();
        EPrevTTColor.clear();
        EPrevTTColor.commit();

        SharedPreferences Status=getSharedPreferences("status", Context.MODE_PRIVATE);
        SharedPreferences.Editor EStatus=Status.edit();

        //deleting the status bits status5 and status51
        EStatus.remove("status5");
        EStatus.remove("status51");
        EStatus.commit();

        SharedPreferences Subject=getSharedPreferences("subject", Context.MODE_PRIVATE);
        Bunked=getSharedPreferences("bunked",Context.MODE_PRIVATE);
        EBunked=Bunked.edit();
        String s;

        s=Subject.getString("sub1","");     EBunked.putInt(s+1,0);     EBunked.putInt(s+2,0);
        s=Subject.getString("sub2","");     EBunked.putInt(s+1,0);     EBunked.putInt(s+2,0);
        s=Subject.getString("sub3","");     EBunked.putInt(s+1,0);     EBunked.putInt(s+2,0);
        s=Subject.getString("sub4","");     EBunked.putInt(s+1,0);     EBunked.putInt(s+2,0);
        s=Subject.getString("sub5","");     EBunked.putInt(s+1,0);     EBunked.putInt(s+2,0);
        s=Subject.getString("sub6","");     EBunked.putInt(s+1,0);     EBunked.putInt(s+2,0);
        s=Subject.getString("sub7","");     EBunked.putInt(s+1,0);     EBunked.putInt(s+2,0);
        s=Subject.getString("sub8","");     EBunked.putInt(s+1,0);     EBunked.putInt(s+2,0);
        s=Subject.getString("sub9","");     EBunked.putInt(s+1,0);     EBunked.putInt(s+2,0);
        EBunked.apply();

        EBunked.putString("start_date",modified_start);     EBunked.apply();
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
