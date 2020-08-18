package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LayoutInflater li = getLayoutInflater();

        View layout = li.inflate(R.layout.customtoast1, (ViewGroup)
                findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();


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