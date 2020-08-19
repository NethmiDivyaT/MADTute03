package com.adeasy.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity2 extends AppCompatActivity {
    TextView textView;
    TextView textView1;
    TextView val;
    String message1;
    String message2;
    int n1;
    int n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

       Intent intent = getIntent();

       //text1
        textView = findViewById(R.id.editTextTextPersonName);
        message1 = intent.getStringExtra(MainActivity.NUMBER1);
        //text2
        textView1 = findViewById(R.id.editTextTextPersonName2);
        message2 = intent.getStringExtra(MainActivity.NUMBER2);

       textView.setText(message1);
       textView1.setText(message2);

       n1 = Integer.parseInt(message1);
       n2 = Integer.parseInt(message2);
    }

    //adding
    public void sum(View view){
        val = findViewById(R.id.textView3);
        val.setText(n1 + " + " + n2 + " = " + (n1+n2));
    }

    //substraction
    public void sub(View view){
        val = findViewById(R.id.textView3);
        val.setText(n1 + " - " + n2 + " = " + (n1-n2));
    }

    //division
    public void div(View view){
        val = findViewById(R.id.textView3);
        val.setText(n1 + " / " + n2 + " = " + (n1/n2));
    }

    //multiplication
    public void mul(View view){
        val = findViewById(R.id.textView3);
        val.setText(n1 + " * " + n2 + " = " + (n1*n2));
    }
}