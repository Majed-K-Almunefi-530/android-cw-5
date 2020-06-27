package com.example.mm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final EditText num1 = findViewById(R.id.num1);
        final EditText num2 = findViewById(R.id.num2);
        final TextView results = findViewById(R.id.result);
        Button addition = findViewById(R.id.add);
        Button reset = findViewById(R.id.reset);
        Button sub = findViewById(R.id.minus);


        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // variables

                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());


                //result equation

                double result = n1 + n2;

                results.setText(" "+result);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                double result = n1 - n2;
                results.setText(" "+result);

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(" ");
                num1.setText(" ");
                results.setText(" ");

            }

        });
    }
}