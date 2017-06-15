package com.example.janesoo.calculator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by JaneSoo on 09-Jun-17.
 */

public class MainActivity extends AppCompatActivity {

    TextView show;
    Button one, two, three, four, five, six, seven, eight, nine, ten, zero, equal, plus, multiply, minus,divide;
    int firstInt, secondInt, sign=0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_calculator);

        show = (TextView) findViewById(R.id.view);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multi);
        divide = (Button) findViewById(R.id.devide);
        equal = (Button) findViewById(R.id.equal);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                show.setText("1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText("2");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              firstInt = Integer.parseInt(show.getText().toString());
                sign =1;
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstInt = Integer.parseInt(show.getText().toString());
                sign=2;
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstInt = Integer.parseInt(show.getText().toString());
                sign=3;
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstInt = Integer.parseInt(show.getText().toString());
                sign=4;
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result;
                secondInt = Integer.parseInt(show.getText().toString());
                if(sign==1){
                    result = firstInt+secondInt;
                }
                else if(sign==2){
                    result = firstInt-secondInt;
                }
                else if(sign==3){
                    result = firstInt*secondInt;
                }
                else {
                    result = firstInt/secondInt;
                }
                show.setText(result+"");

            }
        });


    }
}
