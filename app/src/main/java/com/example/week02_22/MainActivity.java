package com.example.week02_22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("OLAY_SIRASI","Oncreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("OLAY_SIRASI","OnSTART");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("OLAY_SIRASI","OnDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("OLAY_SIRASI","OnRESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("OLAY_SIRASI","OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("OLAY_SIRASI","OnSTOP");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("OLAY_SIRASI","OnREstart");
    }
}