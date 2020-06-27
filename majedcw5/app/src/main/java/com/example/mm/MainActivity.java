package com.example.mm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button grade = findViewById(R.id.button);
        Button sum = findViewById(R.id.button2);

        grade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent grade = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(grade);
            }
        });
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sum = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(sum);
            }
        });

    }
}