package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button button;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A();
            }
        });
    }



    public void A() {
     editText = (EditText) findViewById(R.id.edittext2);
    int number = Integer.parseInt(editText.getText().toString());

        editText = (EditText) findViewById(R.id.edittext1);
        int number1 = Integer.parseInt(editText.getText().toString());
        double number2=(Integer)number1/100;
        int res = number/(number1^2);

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText("" + res);




}}






