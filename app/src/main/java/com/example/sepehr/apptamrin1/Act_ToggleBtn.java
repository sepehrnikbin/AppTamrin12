package com.example.sepehr.apptamrin1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Act_ToggleBtn extends AppCompatActivity {
    ToggleButton Togl;
    Switch SSS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__toggle_btn);
        Togl=(ToggleButton)findViewById(R.id.Toggle_Button);
        SSS=(Switch)findViewById(R.id.Swich_Button);

        Togl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    Toast.makeText(Act_ToggleBtn.this, "true", Toast.LENGTH_SHORT).show();
                }

                if (isChecked==false){
                    Toast.makeText(Act_ToggleBtn.this, "false", Toast.LENGTH_SHORT).show();
                }

            }
        });

        SSS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    Toast.makeText(Act_ToggleBtn.this, "switch is true", Toast.LENGTH_SHORT).show();
                }

                if (isChecked==false){
                    Toast.makeText(Act_ToggleBtn.this, "switch is false", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
