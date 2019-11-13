package com.example.mixmax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PalindromeActivity extends AppCompatActivity {

    Button btnCalcPal;
    TextView tvNumbers;
    EditText etGetP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        btnCalcPal = findViewById(R.id.btnCalcPal);
        tvNumbers = findViewById(R.id.tvNumbers);
        etGetP = findViewById(R.id.etGetP);

        btnCalcPal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r, sum = 0, temp;
                int n;

                n = Integer.parseInt(etGetP.getText().toString());
                temp = n;

                while(n>0){
                    r = n%10;
                    sum = (sum * 10) + r;
                    n = n/10;
                }

                if(temp == sum){
                    tvNumbers.setText("The input is palindrome type");
                } else {
                    tvNumbers.setText("The input is not palindrome type");
                }
            }
        });
    }
}
