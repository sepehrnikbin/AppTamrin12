package com.example.sepehr.apptamrin1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Act_ListView extends AppCompatActivity {
    ListView List;
    String[] Str={"sepehr","Ali","Amir","Erfan","Nadia","Melika","Hosine","Ahmad","Reza","Maryam","Nilofar","Mitra"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__list_view);
        List=(ListView)findViewById(R.id.LisetViewOne);
        ArrayAdapter<String> arraayy=new ArrayAdapter<String>(Act_ListView.this,android.R.layout.simple_list_item_1,Str);
        List.setAdapter(arraayy);



        List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(Act_ListView.this, "انتخاب شما:"+Str[position], Toast.LENGTH_SHORT).show();


            }
        });


    }
}
