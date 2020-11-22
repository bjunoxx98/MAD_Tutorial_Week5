package com.example.week5tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button for moving to 1ST activity
        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity1();
            }
        });

        //button for moving to 2ND activity
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity2();
            }
        });

        //button for moving to 3RD activity
        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity3();
            }
        });

    }

    //method for opening other activity
    public void openActivity1(){
        Intent intent = new Intent(this, activity_relativelayout.class);
        startActivity(intent);
    }

    public void openActivity2(){
        Intent intent = new Intent(this, activity_constraintlayout.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this, gridlayoutv2.class);
        startActivity(intent);
    }
}