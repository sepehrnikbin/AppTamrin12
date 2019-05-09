package com.example.sepehr.apptamrin1;

import android.content.ContentValues;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class Act_RecycleView extends AppCompatActivity {
    RecyclerView Rec;
    String[] names={"sepehr","nadia","erfan","nilofar","melika","reza","maryam","arash","hosin","ali","ahmad","kimia","sahar"};
    String[] shomare={"1","2","3","4","5","6","7","8","9","10","11","12","13"};

    //Adapter_RecycleView _adapter=new Adapter_RecycleView();

    Adapter_RecycleView _adapter=new Adapter_RecycleView();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__recycle_view);
        try {
            ArrayList<ContentValues> array=new ArrayList<>();
            Rec=(RecyclerView)findViewById(R.id.RecView);
            LinearLayoutManager _Linerlayou=new LinearLayoutManager(this);
            Rec.setLayoutManager(_Linerlayou);
            Rec.setHasFixedSize(true);
            Rec.setAdapter(_adapter);
            _adapter.etelaat(this,array);

            for (int i=0 ; i<13 ; i++){
                ContentValues contentValues=new ContentValues();
                contentValues.put("nameeeesss",names[i]);
                contentValues.put("adaddd",shomare[i]);
                array.add(contentValues);
            }

        }catch (Exception e){
            Toast.makeText(this,e.getMessage(), Toast.LENGTH_SHORT).show();
        }





    }


}
