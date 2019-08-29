package com.ajs.backstackandnotification;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public abstract class BaseActivity extends AppCompatActivity {

    String TAG =this.getClass().getSimpleName();
    int taskId =  this.getTaskId();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ANNV", "onCreate " + TAG + ", taskId = " + taskId);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ANNV", "onStart " + TAG);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ANNV", "onResume " + TAG + " object " + this.toString());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ANNV", "onPause " + TAG);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ANNV", "onStop " + TAG);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ANNV", "onDestroy " + TAG + " object " + this.toString());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("ANNV", "onNewIntent " + TAG + " object " + this.toString());
    }
}
