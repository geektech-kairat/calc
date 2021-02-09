package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected int el1;
    protected int el2;
    protected int num1;
    protected int num2;
    protected EditText editText1;
    protected EditText editText2;
    protected TextView textView;

    protected Button button1, button2, button3, button4;
    protected int res;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.add1);
        editText2 = (EditText) findViewById(R.id.add2);
        textView = (TextView)findViewById(R.id.result);
        num1 = Integer.parseInt(editText1.getText().toString());
        num2 = Integer.parseInt(editText2.getText().toString());




        button1 = (Button) findViewById(R.id.plus);
        button2 = (Button) findViewById(R.id.minus);
        button3 = (Button) findViewById(R.id.dev);
        button3 = (Button) findViewById(R.id.multi);
        one();
    }


    public void one() {
        button1.setOnClickListener(v -> {

            res = num1 + num2;
            textView.setText(Integer.toString(res));

        });
        button2.setOnClickListener(v1 -> {
            res = num1 - num2;
            textView.setText(Integer.toString(res));
        });
        button3.setOnClickListener(v1 -> {
            res = num1 / num2;
            textView.setText(Integer.toString(res));
        });

        button4.setOnClickListener(v1 -> {
            res = num1 * num2;
            textView.setText(Integer.toString(res));
        });
    }
}