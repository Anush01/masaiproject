package com.example.anushmp.masaiproject_june2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //changed this.

    private Button goToActivity2; // A button is an object and a variable and a class?

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Logs123","onCreate of MainActivity fired!");

        goToActivity2 = findViewById(R.id.goToActivity2);

        goToActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent takemetoActivity2 = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(takemetoActivity2);
                Log.d("Logs123","going to activity 2 button was clicked");

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Logs123","onStart of Activity 1 fired");

    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Logs123","onPause of Activity 1 fired");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Logs123","onResume of Activity 1 fired");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Logs123","onStop of Activity 1 fired");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Logs123","onDestroy of Activity 1 fired");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Logs123", "onRestart of Activity 1 fired");
    }
}