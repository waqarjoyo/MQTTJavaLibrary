package com.example.mqttjavalibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.Tostify;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tostify.simpleToast(this, "abc to Waqar Joyo Code : )");

    }
}