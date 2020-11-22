package com.example.week5tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity_gridlayout extends AppCompatActivity {

    Button buttonhome,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPercent,btnPlus,btnMinus,btnMultiply,btnDivision,btnEqual,buttonC;
    EditText ET,ET2;

    float mValueOne, mValueTwo;

    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridlayout);

        //button for moving to MAIN activity
        buttonhome = (Button) findViewById(R.id.buttonhome_grid);
        buttonhome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainActivity();
            }
        });

        //ASSIGN VARIABLES
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnDivision = findViewById(R.id.btnDivision);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnEqual = findViewById(R.id.btnEqual);
        buttonC = (Button) findViewById(R.id.buttonC);

        ET = (EditText) findViewById(R.id.ET);
        ET2 = (EditText) findViewById(R.id.ET2);

        //LISTENER NUM BUTTON ONCLICK FUNCTION
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText(ET.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText(ET.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText(ET.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText(ET.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText(ET.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText(ET.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText(ET.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText(ET.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText(ET.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET.setText(ET.getText() + "9");
            }
        });

            //BUTTON FOR CALCULATION
        btnPlus.setOnClickListener(new View.OnClickListener() {
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

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(ET.getText() + "");
                Subtract = true;
                ET2.setText(mValueOne + " - ");
                ET.setText(null);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(ET.getText() + "");
                Multiplication = true;
                ET2.setText(mValueOne + " * ");
                ET.setText(null);
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(ET.getText() + "");
                Division = true;
                ET2.setText(mValueOne + " / ");
                ET.setText(null);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
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

        buttonC.setOnClickListener(new View.OnClickListener() {
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