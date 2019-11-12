package com.example.mobile_assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText firstName, lastName, birthday, address, email, phone;
    String Date;
    String tag = "Screen Change: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
        firstName = (EditText) findViewById(R.id.firstName);
        lastName = (EditText) findViewById(R.id.lastName);
        birthday = (EditText) findViewById(R.id.birthday);
        address = (EditText) findViewById(R.id.address);
        email = (EditText) findViewById(R.id.email);
        phone = (EditText) findViewById(R.id.phone);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(getBaseContext(), "landscape", Toast.LENGTH_SHORT).show();
            time();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(getBaseContext(), "portrait", Toast.LENGTH_SHORT).show();
            time();
        }
    }
    public void time(){
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        Date = s.format(new Date());
        Log.d(tag, tag + Date);
    }

}
