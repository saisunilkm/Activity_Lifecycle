package com.thoughtfocus.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecoundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);
        Toast.makeText(this, "Page Created", Toast.LENGTH_SHORT).show();
        Log.i("Secound_Activity","onCreated");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "App got Started", Toast.LENGTH_SHORT).show();
        Log.i("Secound_Activity","Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "App onResume", Toast.LENGTH_SHORT).show();
        Log.i("Secound_Activity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "App onPaused", Toast.LENGTH_SHORT).show();
        Log.i("Secound_Activity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "App got Stopped", Toast.LENGTH_SHORT).show();
        Log.i("Secound_Activity","onStoped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "App Restarted", Toast.LENGTH_SHORT).show();
        Log.i("Secound_Activity","Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "App got Destroyed", Toast.LENGTH_SHORT).show();
        Log.i("Secound_Activity","Destroyed");
    }

}