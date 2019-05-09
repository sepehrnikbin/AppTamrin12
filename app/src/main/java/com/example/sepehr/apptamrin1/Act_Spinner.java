package com.example.sepehr.apptamrin1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Act_Spinner extends AppCompatActivity {
    Spinner Sp;
    String[] Strr={"ali","sepehr","nadia","maman","baba","melika","erfan","hosin","ahmad","gholam","akbar","asghar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__spinner);
        Sp=(Spinner)findViewById(R.id.Spinnerrr);

        ArrayAdapter<String> Strinadapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,Strr);
        Strinadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Sp.setAdapter(Strinadapter);

     Sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
             Toast.makeText(Act_Spinner.this, "entekhab shoma:"+Strr[position] , Toast.LENGTH_SHORT).show();

         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {

         }
     });
    }
}
