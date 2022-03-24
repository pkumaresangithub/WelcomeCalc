package com.example.welcomecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button add, sub,mul,div;
    EditText num1, num2;
    TextView total;
    String NUM1, NUM2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.substract);
        mul = findViewById(R.id.multiply);
        div = findViewById(R.id.divide);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        total = findViewById(R.id.total);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NUM1 = num1.getText().toString();
                NUM2 = num2.getText().toString();

                int a = Integer.parseInt(NUM1);
                int b = Integer.parseInt(NUM2);
                int c = a+b;
            total.setText("Answer is "+Integer.toString(c));
                Toast.makeText(getApplicationContext(),"Answer is "+Integer.toString(c),Toast.LENGTH_LONG).show();
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NUM1 = num1.getText().toString();
                NUM2 = num2.getText().toString();

                int a = Integer.parseInt(NUM1);
                int b = Integer.parseInt(NUM2);
                int d= a-b;
                total.setText("Answer is "+Integer.toString(d));
                Toast.makeText(getApplicationContext(),"Answer is "+Integer.toString(d),Toast.LENGTH_LONG).show();

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NUM1 = num1.getText().toString();
                NUM2 = num2.getText().toString();

                int a = Integer.parseInt(NUM1);
                int b = Integer.parseInt(NUM2);
                int e= a*b;
                total.setText("Answer is "+Integer.toString(e));
                Toast.makeText(getApplicationContext(),"Answer is "+Integer.toString(e),Toast.LENGTH_LONG).show();

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NUM1 = num1.getText().toString();
                NUM2 = num2.getText().toString();

                int a = Integer.parseInt(NUM1);
                int b = Integer.parseInt(NUM2);
                int f= a*b;
                total.setText("Answer is "+Integer.toString(f));
                Toast.makeText(getApplicationContext(),"Answer is "+Integer.toString(f),Toast.LENGTH_LONG).show();

            }
        });

    }
}