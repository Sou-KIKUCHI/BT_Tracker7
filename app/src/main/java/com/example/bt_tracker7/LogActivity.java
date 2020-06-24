package com.example.bt_tracker7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LogActivity extends AppCompatActivity {

    EditText userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        //get the ID of the EditText on the layout
        userInput = (EditText)findViewById(R.id.LogInputData);
    }

    public void confirmBT(View view) {
        Intent toConfirm = new Intent(this, ConfirmActivity.class);
        //append user input to the toConfirm Intent
        //the 2nd argument means: get user input from the EditText View,
        //and convert the text to a string
        toConfirm.putExtra("BT date", userInput.getText().toString());
        //start ConfirmActivity
        startActivity(toConfirm);
    }
}