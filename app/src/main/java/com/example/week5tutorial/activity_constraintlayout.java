package com.example.week5tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity_constraintlayout extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraintlayout);

        //button for moving to MAIN activity
        button = (Button) findViewById(R.id.buttonhome_constraint);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainActivity();
            }
        });
    }

    //method for opening main activity
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}