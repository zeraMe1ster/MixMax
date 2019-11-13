package com.example.mixmax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnArea, btnPalindrome,btnReverse,btnSwipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnArea = findViewById(R.id.btnArea);
        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnReverse = findViewById(R.id.btnReverse);
        btnSwipe = findViewById(R.id.btnSwipe);

        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RadiusActivity.class);
                startActivity(intent);
            }
        });

        btnPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PalindromeActivity.class);
                startActivity(intent);

            }
        });
    }
}
