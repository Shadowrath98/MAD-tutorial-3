package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private String nOne;
    private String nTwo;
    int num1;
    int num2;
    private Button ADD;
    private Button MUL;
    private Button DIV;
    private Button DED;
    EditText l;
    EditText m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ADD = findViewById(R.id.add);
        MUL = findViewById(R.id.mult);
        DIV = findViewById(R.id.div);
        DED = findViewById(R.id.ded);

        Intent intent = getIntent();
        nOne = intent.getStringExtra("NumOne");
        nTwo = intent.getStringExtra("NumTwo");

        TextView l= findViewById(R.id.TInput1);
        TextView m = findViewById(R.id.TInput2);
        final TextView f = findViewById(R.id.Answer);

        l.setText(nOne);
        m.setText(nTwo);

        num1 = Integer.parseInt(nOne);
        num2 = Integer.parseInt(nTwo);

        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ans = num1 + num2;
                f.setText(Integer.toString(ans));
            }
        });

        MUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ans = num1*num2;
                f.setText(Integer.toString(ans));
            }
        });

        DIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    double ans = num1/num2;
                    f.setText(Double.toString(ans));
            }
        });

        DED.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ans = num1-num2;
                f.setText(Integer.toString(ans));
            }
        });




    }
}