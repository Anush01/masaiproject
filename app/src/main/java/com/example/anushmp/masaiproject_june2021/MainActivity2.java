package com.example.anushmp.masaiproject_june2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button gotoactivity3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        gotoactivity3 = findViewById(R.id.goToActivity3);

        gotoactivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent takemetoactivity3 = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(takemetoactivity3);
                Log.d("Logs123","going to activity 3 button was clicked");

            }
        });

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Logs123","onStart of Activity 2 fired");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Logs123","onRestart of Activity 2 fired");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Logs123", "onStop of Activity 2 fired");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Logs123","onDestroy of activity 2 fired");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Logs123","onPause of activity 2 fired");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Logs123","onResume of activity 2 fired");
    }
}