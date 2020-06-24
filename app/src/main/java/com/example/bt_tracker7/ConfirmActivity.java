package com.example.bt_tracker7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConfirmActivity extends AppCompatActivity {
    TextView accessDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        //find the ID of the TextView on the layout
        accessDate = (TextView)findViewById(R.id.showBTDate);

        //Extract the extras from Intent
        Bundle transferredDate = getIntent().getExtras();
        //Extract date with the key "BT date"
        String s = transferredDate.getString("BT date");
        //create the confirmation message
        String txt = "Your input body temperature is " + s;
        //show the confirmation message in the TextView
        accessDate.setText(txt);
    }

    public void backToHome(View view) {
        Intent backHome = new Intent(this,MainActivity.class);
        startActivity(backHome);
    }
}
