package com.example.sepehr.apptamrin1;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Act_Menu extends AppCompatActivity {
    TextView Txmenu;
    ImageView Menuuu;
    int ima=R.drawable.ic_menu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__menu);
        Txmenu=(TextView)findViewById(R.id.TxMenU);
        Menuuu=(ImageView) findViewById(R.id.menumainAppbar);
        registerForContextMenu(Txmenu);
        registerForContextMenu(Menuuu);


        

    }



    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.main_menu,menu);
        menu.setHeaderTitle("Menu");
        menu.setHeaderIcon(ima);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.one){
            Toast.makeText(this, "entekhab shoma:"+ item.getTitle(), Toast.LENGTH_SHORT).show();
        }

        if (item.getItemId()==R.id.two){
            Toast.makeText(this, "entekhab shoma:"+ item.getTitle(), Toast.LENGTH_SHORT).show();
        }

        if (item.getItemId()==R.id.three){
            Toast.makeText(this, "entekhab shoma:"+ item.getTitle(), Toast.LENGTH_SHORT).show();
        }

        return super.onContextItemSelected(item);
    }


}
