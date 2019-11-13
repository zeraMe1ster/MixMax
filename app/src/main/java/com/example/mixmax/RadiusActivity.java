package com.example.mixmax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RadiusActivity extends AppCompatActivity {

    EditText etGetR;
    Button btnCalc;
    TextView tvResult;
    public static final double Pi = 3.14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radius);

        etGetR = findViewById(R.id.etGetR);
        btnCalc = findViewById(R.id.btnCalc);
        tvResult = findViewById(R.id.tvResult);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double r, result;
                r = Double.parseDouble(etGetR.getText().toString());

                result = Pi * (r * r);

                tvResult.setText(Double.toString(result));


            }
        });
    }
}
