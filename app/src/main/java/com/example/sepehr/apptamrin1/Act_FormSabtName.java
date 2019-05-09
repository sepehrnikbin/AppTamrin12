package com.example.sepehr.apptamrin1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Act_FormSabtName extends AppCompatActivity {
    TextView Tx_title;
    EditText Et_title;
    ImageView back;
    Button vorod,sabtname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__form_sabt_name);
        Tx_title=(TextView)findViewById(R.id.Txt_Title_Form);
        Et_title=(EditText)findViewById(R.id.Edt_Title_Form);
        back=(ImageView)findViewById(R.id.Back_Form);
        vorod=(Button)findViewById(R.id.Btn_Vorod);
        sabtname=(Button)findViewById(R.id.Btn_Sabtname);
        proje();


        back.setOnClickListener(Back);
    }

    public void Sabtname(View v){
        startActivity(new Intent(Act_FormSabtName.this,Act_SabtName.class));
    }

    public void Vorod(View v){
        startActivity(new Intent(Act_FormSabtName.this,Act_Vorod.class));
    }

    View.OnClickListener Back=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (Tx_title.getVisibility()==View.GONE){
                Et_title.setVisibility(View.GONE);
                Tx_title.setVisibility(View.VISIBLE);
                return;
            }


            if (Tx_title.getVisibility()==View.VISIBLE){
                finish();

            }



        }
    };

    public void Serch_Form(View _V){
        Tx_title.setVisibility(View.GONE);
        Et_title.setVisibility(View.VISIBLE);
    }


    public void proje(){

        SharedPreferences _shared=getSharedPreferences("file", Context.MODE_PRIVATE);
        String name=_shared.getString("name",null);
        if (name==null){
           vorod.setEnabled(false);
        }
        else {
            vorod.setEnabled(true);
        }


    }



}
