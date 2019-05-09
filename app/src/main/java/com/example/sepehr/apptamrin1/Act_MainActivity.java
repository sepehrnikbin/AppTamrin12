package com.example.sepehr.apptamrin1;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

public class Act_MainActivity extends AppCompatActivity {
    DrawerLayout Drw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__main);
        Drw = (DrawerLayout) findViewById(R.id.Navi_View);


    }

    public void Ic_menu(View _V) {
        Drw.openDrawer(Gravity.LEFT);
    }

    public void form(View _V) {
        startActivity(new Intent(Act_MainActivity.this, Act_FormSabtName.class));
    }

    public void database(View _V) {
        startActivity(new Intent(Act_MainActivity.this, Act_Database.class));
    }


    public void recycleview(View _V) {
        startActivity(new Intent(Act_MainActivity.this, Act_RecycleView.class));
    }

    public void listview(View _V) {
        startActivity(new Intent(Act_MainActivity.this, Act_ListView.class));
    }

    public void navigatinbtn(View _V) {
        startActivity(new Intent(Act_MainActivity.this, Act_ButtomNaviGation.class));
    }

    public void menu(View _V) {
        startActivity(new Intent(Act_MainActivity.this, Act_Menu.class));
    }

    public void notification(View _V) {
        startActivity(new Intent(Act_MainActivity.this, Act_Notification.class));
    }


    public void dialog(View _V) {
        startActivity(new Intent(Act_MainActivity.this, Act_Dialog.class));
    }
    public void toggleBtn(View _V) {
        startActivity(new Intent(Act_MainActivity.this, Act_ToggleBtn.class));
    }
    public void spinner(View _V) {
        startActivity(new Intent(Act_MainActivity.this, Act_Spinner.class));
    }

    public void All_Moror(View _V) {
        startActivity(new Intent(Act_MainActivity.this, ALL_MororOne.class));
    }

    public void Test(View _V) {
        startActivity(new Intent(Act_MainActivity.this, Act_Test.class));
    }


}
