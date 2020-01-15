package com.example.viman.onlinequizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class third extends AppCompatActivity {
    Button b1;
    TextView t1;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        b1=(Button)findViewById(R.id.button3);
        t1=(TextView)findViewById(R.id.textView3);
        r1=(RadioButton)findViewById(R.id.radioButton9);
        r2=(RadioButton)findViewById(R.id.radioButton10);
        r3=(RadioButton)findViewById(R.id.radioButton11);
        r4=(RadioButton)findViewById(R.id.radioButton12);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r2.isChecked())
                {
                    ++MainActivity.score;
                }
                else
                {
                    --MainActivity.score;
                }
                Intent i=new Intent(third.this,fourth.class);
                startActivity(i);
                finish();
            }
        });

    }
}
