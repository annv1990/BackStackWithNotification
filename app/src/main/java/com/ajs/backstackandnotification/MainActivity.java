package com.ajs.backstackandnotification;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    Button btnCreate;
    Button btnNext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCreate = findViewById(R.id.btnCreate);
        btnNext1 = findViewById(R.id.btnNext1);
        btnCreate.setOnClickListener(this);
        btnNext1.setOnClickListener(this);
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

    @Override
    public void onBackPressed() {
        finish();
    }
}
