package com.example.sepehr.apptamrin1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Act_Vorod extends AppCompatActivity {

    EditText Name,Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__vorod);
        Name=(EditText)findViewById(R.id.Name_Vorod);
        Pass=(EditText)findViewById(R.id.Pass_Vorod);
    }

    public void okVorod(View ff){
        String _Name=Name.getText().toString().trim();
        String _Pass=Pass.getText().toString().trim();

        if (_Name.length()<3){
            tost("نام کوتاه می باشد");
            return;
        }

        if (_Pass.length()<3){
            tost("رمز عبور کوتاه میباشد");
            return;
        }

        SharedPreferences _shareddddd=getSharedPreferences("file", Context.MODE_PRIVATE);
        String nameee=_shareddddd.getString("name",null);
        String passss=_shareddddd.getString("pass",null);

        if (_Name.equals(nameee)==false){
            tost("نام کاربری اشتباه است");
            return;
        }
        if (_Pass.equals(passss)==false){
            tost("رمز عبور اشتباه است");
            return;
        }

        startActivity(new Intent(Act_Vorod.this,Act_OkVorod.class));


    }

    public void backVorod(View ff){
        finish();
    }

    public void tost(String tost){

        Toast.makeText(this,tost, Toast.LENGTH_SHORT).show();
    }
}
