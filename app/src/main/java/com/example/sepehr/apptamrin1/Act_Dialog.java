package com.example.sepehr.apptamrin1;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Act_Dialog extends AppCompatActivity {
    ImageView Img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__dialog);
        Img=(ImageView)findViewById(R.id.DialogAks);
        Img.setTag(R.drawable.ic_person);

        final Dialog dialog=new Dialog(this);
        dialog.setContentView(R.layout.layout_dialog);
        dialog.setTitle("دیالوگ");
        ImageView Immm=(ImageView)dialog.findViewById(R.id.ImgDialog);
        Button BtnYes=(Button)dialog.findViewById(R.id.YesDialog);
        Button BtnNo=(Button)dialog.findViewById(R.id.NoDialog);
        Immm.setImageResource((int) Img.getTag());


        Img.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dialog.show();

                return false;
            }
        });




        BtnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img.setVisibility(View.GONE);
                dialog.dismiss();
            }
        });

        BtnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });



    }
}
