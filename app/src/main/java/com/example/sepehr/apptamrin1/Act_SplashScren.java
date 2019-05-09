package com.example.sepehr.apptamrin1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Act_SplashScren extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__splash_scren);

      new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {
              Intent fd=new Intent(Act_SplashScren.this,Act_MainActivity.class);
              startActivity(fd);
              finish();

          }
      },1400);


    }
}
