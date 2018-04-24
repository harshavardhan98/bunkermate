package com.example.bunker.bunkermate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class a00022 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a00022);

        ImageButton b1=(ImageButton)findViewById(R.id.back2);
        final EditText et=(EditText)findViewById(R.id.editText2);
        Button b2=(Button)findViewById(R.id.button1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(getApplicationContext(),a00021.class);
                startActivity(i1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et.getText().toString().length()==10)
                {
                    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                    try {
                        Date date = sdf.parse(et.getText().toString());
                        Intent i1 = new Intent(getApplicationContext(), a0003.class);
                        startActivity(i1);
                    } catch (ParseException e) {
                        Toast.makeText(a00022.this, "Format: DD/MM/YYYY", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                    Toast.makeText(a00022.this, "Format: DD/MM/YYYY", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
