package com.thoughtfocus.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        Toast.makeText(this, "App is Created", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity", "onCreate");
    }

    public void doSomething(View view) {
        Intent i1 = new Intent (this,SecoundActivity.class);
        startActivity(i1);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "App got Started", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "App onResume", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "App onPaused", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "App got Stopped", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onStoped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "App Restarted", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "App got Destroyed", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","Destroyed");
    }

}