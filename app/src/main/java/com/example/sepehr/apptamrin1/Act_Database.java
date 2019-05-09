package com.example.sepehr.apptamrin1;

import android.content.ContentValues;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Act_Database extends AppCompatActivity {
    EditText nameM, countM, EdSearchData;
    TextView AllCountM, TxtDatabase,Iddd;
    LinearLayout Linear;
    DatabaseClass _data = new DatabaseClass();
    Button Btn_Update,Btn_Delete;
    DrawerLayout DrwD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__database);
        nameM = (EditText) findViewById(R.id.NameData);
        countM = (EditText) findViewById(R.id.CountData);
        EdSearchData = (EditText) findViewById(R.id.Edt_SearchData);
        AllCountM = (TextView) findViewById(R.id.AllCountM);
        TxtDatabase = (TextView) findViewById(R.id.TxtDatabase);
        Iddd = (TextView) findViewById(R.id.IDData);
        Linear = (LinearLayout) findViewById(R.id.LineDatabase);
        Btn_Update = (Button) findViewById(R.id.UpdateData);
        Btn_Delete = (Button) findViewById(R.id.DeleteData);
        DrwD=(DrawerLayout)findViewById(R.id.DrDarabase) ;
        shomaresh();

        _data.CreateDatabase(this);
        VaredKardan("","","");

        EdSearchData.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String search="";
                //String serchhast="";
                if (s.toString().trim().length()!=0){
                     search=" WHERE name LIKE '%"+s.toString().trim()+"%' ";
                    //serchhast =" WHERE count LIKE '%"+s.toString().trim()+"%' ";
                    //_data._Aray(Act_Database.this,search);
                }
                VaredKardan(search,"","");



            }


            @Override
            public void afterTextChanged(Editable s) {

            }
        });



    }


    public void VaredKardan(String serch,String _order,String order2) {
        ArrayList<ContentValues> arayList=_data._Aray(this,serch,_order,order2);
        Linear.removeAllViews();
        nameM.setText("");
        countM.setText("");
        Btn_Delete.setEnabled(false);
        shomaresh();
        Btn_Update.setEnabled(false);

        for (ContentValues contentValues:arayList){
            View _V=View.inflate(Act_Database.this,R.layout.databaselayout,null);
            TextView TxnameM=(TextView)_V.findViewById(R.id.NNNNN);
            TextView TxcountM=(TextView)_V.findViewById(R.id.CCCCC);
            TxnameM.setText(contentValues.getAsString("name"));
            TxcountM.setText(contentValues.getAsString("count"));
            Linear.addView(_V);
            _V.setTag(contentValues);
            _V.setOnClickListener(Onclik);




        }



    }

    View.OnClickListener Onclik=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ContentValues _contentvalues=(ContentValues)v.getTag();
            Btn_Delete.setEnabled(true);
            Btn_Update.setEnabled(true);
            nameM.setText(_contentvalues.getAsString("name"));
            countM.setText(_contentvalues.getAsString("count"));
            Iddd.setText(_contentvalues.getAsString("id"));
        }
    };




    public void SabtData(View f) {
        String _namee = nameM.getText().toString().trim();
        int _countttt = Integer.parseInt(countM.getText().toString().trim());
        _data.InsertData(this, _namee, _countttt);
        VaredKardan("","","");

    }


    public void updateData(View f) {
        String nam=nameM.getText().toString().trim();
        int cont=Integer.parseInt(countM.getText().toString().trim());
        String _ID=Iddd.getText().toString().trim();
        _data.UpdateData(this,nam,cont,_ID);
        VaredKardan("","","");


    }

    public void DeleteData(View f) {
        String _id=Iddd.getText().toString().trim();
        _data.DeleteData(this,_id);
        VaredKardan("","","");

    }


    public void backdatabase(View f) {
        if (TxtDatabase.getVisibility()==View.VISIBLE){
            finish();
        }
        if (TxtDatabase.getVisibility()==View.GONE){
            EdSearchData.setVisibility(View.GONE);
            TxtDatabase.setVisibility(View.VISIBLE);
        }


    }

    public void searchDatabase(View f) {
        TxtDatabase.setVisibility(View.GONE);
        EdSearchData.setVisibility(View.VISIBLE);

    }


    public void shomaresh(){
        try {
            int shomarande=_data._Shomaresh(this);
            AllCountM.setText("تعداد کل محصولات :");
            AllCountM.append(String.valueOf(shomarande));

        }catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }


    }

    public void horof_Tartib(View v){
        String horof=" ORDER BY name ASC";
        VaredKardan("",horof,"");

    }

     public void adad_Tartib(View v){
         String adad=" ORDER BY count DESC";
         VaredKardan("","",adad);

     }



}
