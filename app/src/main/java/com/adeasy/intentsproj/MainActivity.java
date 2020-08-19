package com.adeasy.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String NUMBER1 = "com.adeasy.intentsproj.message1" ;
    public static final String NUMBER2 = "com.adeasy.intentsproj.message2";;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void sendNumbers(View view){
        Intent intent = new Intent(this, SecondActivity2.class);

        //Number1
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String message = editText.getText().toString();
        intent.putExtra(NUMBER1, message);

        //Number2
        EditText editText1 = (EditText) findViewById(R.id.editTextTextPersonName2);
        String message1 = editText.getText().toString();
        intent.putExtra(NUMBER2, message1);

        //Toast mesage
       /* Context context = getApplicationContext();
        CharSequence message3 = "You just click the Ok button";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();*/

       LayoutInflater li = getLayoutInflater();
       View layout = li.inflate(R.layout.customtoast, (ViewGroup)
       findViewById(R.id.custom_toast_layout));

       Toast toast = new Toast(getApplicationContext());
       toast.setDuration(Toast.LENGTH_SHORT);
       toast.setGravity(Gravity.CENTER_VERTICAL,0, 0);
       toast.setView(layout);
       toast.show();
        startActivity(intent);



    }
}