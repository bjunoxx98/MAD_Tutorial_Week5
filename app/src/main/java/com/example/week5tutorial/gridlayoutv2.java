package com.example.week5tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class gridlayoutv2 extends AppCompatActivity {

    Button bhome,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bsum,bmin,bmul,bdiv,beql,btnc;
    EditText ET,ET2;

    float mValueOne, mValueTwo;

    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridlayoutv2);

        //button for moving to MAIN activity
        bhome = (Button) findViewById(R.id.bhome);
        bhome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainActivity();
            }
        });

        //ASSIGN VARIABLES
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);

        bsum = findViewById(R.id.bsum);
        bmin = findViewById(R.id.bmin);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        beql = findViewById(R.id.beql);
        btnc = (Button) findViewById(R.id.btnc);

        ET = (EditText) findViewById(R.id.ET);
        ET2 = (EditText) findViewById(R.id.ET2);

        //LISTENER NUM BUTTON ONCLICK FUNCTION
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText(ET.getText() + "0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText(ET.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText(ET.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText(ET.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText(ET.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText(ET.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText(ET.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText(ET.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText(ET.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText(ET.getText() + "9");
            }
        });

        //BUTTON FOR CALCULATION
        bsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ET == null) {
                    ET.setText("");
                    ET2.setText("");
                } else {
                    mValueOne = Float.parseFloat(ET.getText() + "");
                    Addition = true;
                    ET2.setText(mValueOne + " + ");
                    ET.setText(null);

                }
            }
        });

        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(ET.getText() + "");
                Subtract = true;
                ET2.setText(mValueOne + " - ");
                ET.setText(null);
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(ET.getText() + "");
                Multiplication = true;
                ET2.setText(mValueOne + " * ");
                ET.setText(null);
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(ET.getText() + "");
                Division = true;
                ET2.setText(mValueOne + " / ");
                ET.setText(null);
            }
        });

        beql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(ET.getText() + "");

                if (Addition == true) {
                    ET.setText("= " + (mValueOne + mValueTwo) + "");
                    ET2.setText(mValueOne + " + " +mValueTwo);
                    Addition = false;
                }

                if (Subtract == true) {
                    ET.setText("= " + (mValueOne - mValueTwo) + "");
                    ET2.setText(mValueOne + " - " +mValueTwo);
                    Subtract = false;
                }

                if (Multiplication == true) {
                    ET.setText("= " + (mValueOne * mValueTwo) + "");
                    ET2.setText(mValueOne + " * " +mValueTwo);
                    Multiplication = false;
                }

                if (Division == true) {
                    ET.setText("= " + (mValueOne / mValueTwo) + "");
                    ET2.setText(mValueOne + " / " +mValueTwo);
                    Division = false;
                }
            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText("");
                ET2.setText("");
            }
        });

    }

    //method for opening main activity
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}