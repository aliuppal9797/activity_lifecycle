package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC3", "onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALC3", "onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC3", "onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC3", "onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC3", "onDestroy Called");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("ALC3", "onCreate Called");
    }
}