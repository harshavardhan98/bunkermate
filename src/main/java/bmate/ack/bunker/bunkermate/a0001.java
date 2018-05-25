package bmate.ack.bunker.bunkermate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import bmate.bunkermate.R;

public class a0001 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a0001);

        SharedPreferences Status=getSharedPreferences("status", Context.MODE_PRIVATE);
        final int status=Status.getInt("status",0);

        Button b1=(Button) findViewById(R.id.but1);

        b1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                Intent i1;
                if(status!=100 && status!=200 && status!=300 && status!=201)
                {
                    i1=new Intent(getApplicationContext(), a0002.class);
                    startActivity(i1);
                }
                else if(status==100)
                {
                    i1=new Intent(getApplicationContext(),a0003.class);
                    startActivity(i1);
                }
                else if(status==200)
                {
                    i1=new Intent(getApplicationContext(),a0004.class);
                    startActivity(i1);
                }
                else if(status==201)
                {
                    i1=new Intent(getApplicationContext(),a00041.class);
                    startActivity(i1);
                }
                else if(status==300)
                {
                    i1=new Intent(getApplicationContext(),a0005.class);
                    startActivity(i1);
                }
            }
        });
    }
}
