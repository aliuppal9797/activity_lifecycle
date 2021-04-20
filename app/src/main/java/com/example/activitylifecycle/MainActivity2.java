package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC2", "onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALC2", "onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC2", "onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC2", "onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC2", "onDestroy Called");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("ALC2", "onCreate Called");

    }

    public void Move(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}