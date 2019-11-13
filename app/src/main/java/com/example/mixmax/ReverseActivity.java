package com.example.mixmax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReverseActivity extends AppCompatActivity {
    Button btnReverso;
    TextView tvDisplayCorrectNumber;
    EditText etGetReverseNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse);

        btnReverso = findViewById(R.id.btnReverso);
        tvDisplayCorrectNumber = findViewById(R.id.tvDisplayCorrectNumber);
        etGetReverseNumber = findViewById(R.id.etGetReverseNumber);

        btnReverso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num, reversed = 0;

                num = Integer.parseInt(etGetReverseNumber.getText().toString());

                while(num != 0) {
                    int digit = num % 10;
                    reversed = reversed * 10 + digit;
                    num /= 10;
                }

                tvDisplayCorrectNumber.setText(Integer.toString(reversed));
            }
        });

    }
}
