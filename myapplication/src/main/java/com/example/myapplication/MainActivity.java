package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    ImageView logo1;
    TextView textLayout;
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);
        logo1=(ImageView) findViewById(R.id.logo1);
        textLayout = (TextView) findViewById(R.id.textLayout);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        View.OnClickListener btnLog1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logo1.setImageResource(R.drawable.logo);
            }
        };

        button1.setOnClickListener(btnLog1);

        View.OnClickListener btnLogo2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logo1.setImageResource(R.drawable.logo_mns2);
            }
        };
        button2.setOnClickListener(btnLogo2);
    }



}
