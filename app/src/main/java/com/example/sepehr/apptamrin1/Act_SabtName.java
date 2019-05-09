package com.example.sepehr.apptamrin1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Act_SabtName extends AppCompatActivity {
    EditText name,number,pass;
    RadioButton _Mard,_Zan;
    CheckBox _Chek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__sabt_name);
        name=(EditText)findViewById(R.id.Edt_name_Sabt);
        number=(EditText)findViewById(R.id.Edt_Number_Sabtname);
        pass=(EditText)findViewById(R.id.Edt_pass_Sabtname);
        _Mard=(RadioButton)findViewById(R.id.Radio_Mard);
        _Zan=(RadioButton)findViewById(R.id.Radio_Zan);
        _Chek=(CheckBox)findViewById(R.id.Chekeddd);

    }


    public void okSabtName(View f){
        String _Name=name.getText().toString().trim();
        String _number=number.getText().toString().trim();
        String _pass=pass.getText().toString().trim();

        if (_Name.length()<3){
            tost("نام کوتاه می باشد");
            return;
        }

        if (_number.length()<11){
            tost("شماره موبایل کوتاه می باشد");
            return;

        }

        if (pass.getText().toString().trim().length()<3){
            tost("رمز عبور کوتاه میباشد");
            return;

        }

        if (_Chek.isChecked()==false){
            tost("باید با قوانین موافق باشید");
            return;
        }

        SharedPreferences _sharedpref=getSharedPreferences("file",Context.MODE_PRIVATE);
        SharedPreferences.Editor edit=_sharedpref.edit();
        edit.putString("name",_Name);
        edit.putString("number",_number);
        edit.putString("pass",_pass);
        edit.apply();




        startActivity(new Intent(Act_SabtName.this,Act_Ok_SabtShod.class));



    }

    public void backSabtname(View f){
        finish();
    }

    public void tost(String tost){

        Toast.makeText(this,tost, Toast.LENGTH_SHORT).show();
    }


}
