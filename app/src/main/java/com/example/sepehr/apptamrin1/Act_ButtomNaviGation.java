package com.example.sepehr.apptamrin1;

import android.app.FragmentManager;
import android.support.annotation.NonNull;
import android.support.design.internal.NavigationMenu;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Act_ButtomNaviGation extends AppCompatActivity {

    BottomNavigationView Navi;
    Fragment Frag;
    LinearLayout Line;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__buttom_navi_gation);
        Navi=(BottomNavigationView)findViewById(R.id.NavigationOne1111);
        Line=(LinearLayout)findViewById(R.id.LinerearFragment);


        Voice(new Fragment_Setting());



        Navi.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setChecked(true);

                if (item.getItemId()==R.id.seting){
                    Voice(new Fragment_Setting());

                }
                if (item.getItemId()==R.id.Profile){
                    Voice(new Fragment_Profile());

                }
                if (item.getItemId()==R.id.Search){
                    Voice(new Fragment_Search());


                }


                return false;
            }
        });
    }

    public void Voice(Fragment _Frag){
        android.support.v4.app.FragmentManager _Fragmentmanager=getSupportFragmentManager();
        FragmentTransaction _Trans=_Fragmentmanager.beginTransaction();
        _Trans.replace(R.id.LinerearFragment,_Frag);
        _Trans.commit();
    }


}
