package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.OK);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               OpenActivity2();
            }
        });
    }
    public void OpenActivity2()
    {
        EditText x = findViewById(R.id.TInput1);
        EditText y = findViewById(R.id.TInput2);
        String h = x.getText().toString();
        String l = y.getText().toString();


        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("NumOne",h);
        intent.putExtra("NumTwo",l);
        startActivity(intent);
    }

}