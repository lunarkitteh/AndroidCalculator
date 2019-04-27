package com.example.calista.calculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;
    Button num0;
    Button clear;
    Button division;
    Button addition;
    Button subtraction;
    Button decimal;
    Button equal;
    Button multiplication;
    TextView result;
    boolean multiplyIt,subtractIt,divideIt,addIt;
    float x; // firstNum
    float y; // secondNum
    float z; // result


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clear = findViewById(R.id.clearButton);
        num1 = findViewById(R.id.button3);
        num2 = findViewById(R.id.button4);
        num3 = findViewById(R.id.button5);
        num4 = findViewById(R.id.button6);
        num5 = findViewById(R.id.button7);
        num6 = findViewById(R.id.button8);
        num7 = findViewById(R.id.button9);
        num8 = findViewById(R.id.button10);
        num9 = findViewById(R.id.button11);
        num0 = findViewById(R.id.button12);
        division = findViewById(R.id.button13);
        addition = findViewById(R.id.button16);
        subtraction = findViewById(R.id.button17);
        decimal = findViewById(R.id.button14);
        equal = findViewById(R.id.button18);
        multiplication = findViewById(R.id.button15);
        result = findViewById(R.id.textView3);


        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"0");
            }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+".");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(null);
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = Float.valueOf(String.valueOf(result.getText()));
                result.setText(null);
                divideIt = true;
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = Float.valueOf(String.valueOf(result.getText()));
                result.setText(null);
                multiplyIt = true;
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = Float.valueOf(String.valueOf(result.getText()));
                result.setText(null);
                subtractIt = true;
            }
        });
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = Float.valueOf(String.valueOf(result.getText()));
                result.setText(null);
                addIt = true;
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                y = Float.valueOf(String.valueOf(result.getText()));
                if(addIt=true){
                    z = x+y;
                    addIt=false;
                }
                else if(subtractIt=true){
                    z = x-y;
                    subtractIt=false;
                }
                else if(divideIt=true){
                    z = x/y;
                   divideIt=false;
                }
                else if(multiplyIt=true){
                    z = x*y;
                    multiplyIt=false;
                }
                String.format("%.2f",z);
                result.setText(String.valueOf(z));
            }
        });

    }
}
