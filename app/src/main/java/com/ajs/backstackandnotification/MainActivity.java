package com.ajs.backstackandnotification;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    Button btnCreate;
    Button btnNext1;
    Button btnNext2;
    Button btnNext3;
    Button btnNext4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCreate = findViewById(R.id.btnCreate);
        btnNext1 = findViewById(R.id.btnNext1);
        btnCreate.setOnClickListener(this);
        btnNext1.setOnClickListener(this);
        btnNext2 = findViewById(R.id.btnNext2);
        btnNext2.setOnClickListener(this);
        btnNext3 = findViewById(R.id.btnNext3);
        btnNext3.setOnClickListener(this);
        btnNext4 = findViewById(R.id.btnNext4);
        btnNext4.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCreate:
                buildNotification();
                break;
            case R.id.btnNext1 : {
                startOneActivity();
                break;
            }
            case R.id.btnNext2 : {
                startTwoActivity();
                break;
            }
            case R.id.btnNext3 : {
                startThreeActivity();
                break;
            }
            case R.id.btnNext4 : {
                startFourActivity();
                break;
            }
        }
    }

    public void buildNotification(){
        NotificationUtils.createNotification(this);
    }

    public void startOneActivity(){
        Intent i = new Intent(this, OneActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(i);
    }

    public void startTwoActivity(){
        Intent i = new Intent(this, TwoActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(i);
    }

    public void startThreeActivity(){
        Intent i = new Intent(this, ThreeActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }

    public void startFourActivity(){
        Intent i = new Intent(this, FourActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
