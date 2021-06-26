package com.example.anushmp.masaiproject_june2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Log.d("Logs123","Arrived at activty 3 onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Logs123","onStart Activity 3");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Logs123", "onPause Activity 3");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Logs123", "onResume Activity 3");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("Logs123","onStop activity 3");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Logs123","onDestroy Activity 3");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Logs123", "onRestart Activity 3");
    }
}