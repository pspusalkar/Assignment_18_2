package com.example.poojajoshi.assignment_18_2;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // set the receiver
        MySMSReceiver.bindListener(new SmsListener() {
            @Override
            public void messageReceived(String messageText) {
                // show the message text in toast;
                Toast.makeText(getApplicationContext(), messageText, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
