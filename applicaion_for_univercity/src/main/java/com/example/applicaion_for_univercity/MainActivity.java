package com.example.applicaion_for_univercity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView logo1;
    Button ok;
    Button cancel;
    TextView label;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rlayout);
        logo1=(ImageView) findViewById(R.id.logo1);
        ok=(Button) findViewById(R.id.ok);
        cancel=(Button) findViewById(R.id.cancel);


        View.OnClickListener btnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logo1.setImageResource(R.drawable.logo);
            }
        };

        ok.setOnClickListener(btnOk);

        View.OnClickListener btnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logo1.setImageResource(R.drawable.logo_mns2);
            }
        };
        cancel.setOnClickListener(btnCancel);
    }

}
