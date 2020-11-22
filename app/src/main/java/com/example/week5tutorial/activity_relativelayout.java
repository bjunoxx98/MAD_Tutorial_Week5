package com.example.week5tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class activity_relativelayout extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.week5tutorial.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relativelayout);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        EditText editText = (EditText) findViewById(R.id.edittext1);
        String message = editText.getText().toString();

        //declare variabless
        Context context = getApplicationContext();
        CharSequence text;
        int duration = Toast.LENGTH_LONG;

        startActivity(intent);  //back to MainActivity page

        text = "Welcome back, "+message+"!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}