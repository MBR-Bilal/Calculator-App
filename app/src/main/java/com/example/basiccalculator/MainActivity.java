package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  EditText editText, editText2;
  TextView result;
  Button button1, button2, button3, button4;

    float result_num;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.result);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(editText.getText().toString().equals("")||editText2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Please Enter the Numbers", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    editText.getText().toString();
                    editText2.getText().toString();
                    double a1= Double.valueOf(editText.getText().toString());
                    double a2= Double.valueOf(editText2.getText().toString());
                    double a3;
                    a3= a1 + a2;
                    result.setText(String.valueOf(a3));
                }

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(editText.getText().toString().equals("")||editText2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Please Enter the Numbers", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    editText.getText().toString();
                    editText2.getText().toString();
                    double a1= Double.valueOf(editText.getText().toString());
                    double a2= Double.valueOf(editText2.getText().toString());
                    double a3;
                    a3= a1 - a2;
                    result.setText(String.valueOf(a3));
                }

            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(editText.getText().toString().equals("")||editText2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Please Enter the Numbers", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    editText.getText().toString();
                    editText2.getText().toString();
                    double a1= Double.valueOf(editText.getText().toString());
                    double a2= Double.valueOf(editText2.getText().toString());
                    double a3;
                    a3= a1 * a2;
                    result.setText(String.valueOf(a3));
                }

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(editText.getText().toString().equals("")||editText2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Please Enter the Numbers", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    editText.getText().toString();
                    editText2.getText().toString();
                    double a1= Double.valueOf(editText.getText().toString());
                    double a2= Double.valueOf(editText2.getText().toString());
                    double a3;
                    a3= a1 / a2;
                    result.setText(String.valueOf(a3));
                }

            }
        });

    }
}
