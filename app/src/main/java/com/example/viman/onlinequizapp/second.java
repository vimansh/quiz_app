package com.example.viman.onlinequizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class second extends AppCompatActivity {
    Button b1;
    TextView t1;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b1=(Button)findViewById(R.id.button2);
        t1=(TextView)findViewById(R.id.textView2);
        r1=(RadioButton)findViewById(R.id.radioButton5);
        r2=(RadioButton)findViewById(R.id.radioButton6);
        r3=(RadioButton)findViewById(R.id.radioButton7);
        r4=(RadioButton)findViewById(R.id.radioButton8);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r4.isChecked())
                {
                    ++MainActivity.score;
                }
                else
                {
                    --MainActivity.score;
                }

                Intent i=new Intent(second.this,third.class);
                startActivity(i);
                finish();

            }
        });


    }
}
