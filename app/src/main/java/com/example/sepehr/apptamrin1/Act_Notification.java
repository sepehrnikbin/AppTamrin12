package com.example.sepehr.apptamrin1;

import android.app.FragmentManager;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class Act_Notification extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__notification);


    }

    public void Notif (View _V){
        NotificationManager _managenotif=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        NotificationCompat.Builder _Notif=new NotificationCompat.Builder(this);
        _Notif.setContentTitle("اپلیکیشن سپهر");
        _Notif.setContentText(" به اپلیکیشن سپهر خوش آمدید");
        _Notif.setSmallIcon(R.drawable.ic_phone);
        _managenotif.notify(0,_Notif.build());


    }
}
