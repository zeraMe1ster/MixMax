package com.example.mixmax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Swipe extends AppCompatActivity {

    EditText etFirstNum, etSecondNum;
    TextView tvResultB,tvResultA;
    Button btnPlacement,btnSwitchPlace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);

        etFirstNum = findViewById(R.id.etFirstNum);
        etSecondNum = findViewById(R.id.etSecondNum);
        tvResultA = findViewById(R.id.tvResultA);
        tvResultB = findViewById(R.id.tvResultB);
        btnPlacement = findViewById(R.id.btnPlacement);
        btnSwitchPlace = findViewById(R.id.btnSwitchPlace);

        btnPlacement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b;

                a = Integer.parseInt(etFirstNum.getText().toString());
                b = Integer.parseInt(etSecondNum.getText().toString());

                tvResultB.setText(Integer.toString(a));
                tvResultA.setText(Integer.toString(b));
            }
        });

        btnSwitchPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x,y;
                x = Integer.parseInt(tvResultA.getText().toString());
                y = Integer.parseInt(tvResultB.getText().toString());

                x = x + y;
                y =  x - y;
                x = x - y;

                tvResultB.setText(Integer.toString(y));


                tvResultA.setText(Integer.toString(x));


            }
        });
    }
}
