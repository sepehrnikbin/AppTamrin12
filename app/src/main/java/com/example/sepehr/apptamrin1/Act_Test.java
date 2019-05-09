package com.example.sepehr.apptamrin1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Act_Test extends AppCompatActivity {
    String[] tx={"ali","amir","hasan","spr","nadia","mamad","melika","lolo","nilo"};

    LinearLayout LinTest;
    int meghdar=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__test);
        LinTest=(LinearLayout)findViewById(R.id.LinearTestApp);



        while (meghdar<=8){
            View _V=View.inflate(this,R.layout.recycle_view,null);
            TextView tx1=(TextView)_V.findViewById(R.id.adadRecycle);
            //TextView tx2=(TextView)_V.findViewById(R.id.nameRecycle);
            tx1.setText(tx[meghdar]);
            // tx2.setText(tx[i]);
            LinTest.addView(_V);
            ++ meghdar ;


        }


        /*for (int i=0;i<tx.length;i++){
            View _V=View.inflate(this,R.layout.recycle_view,null);
            TextView tx1=(TextView)_V.findViewById(R.id.adadRecycle);
            //TextView tx2=(TextView)_V.findViewById(R.id.nameRecycle);
            tx1.setText(tx[i]);
           // tx2.setText(tx[i]);
            LinTest.addView(_V);
        }*/

    }
}
