package com.example.sepehr.apptamrin1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import java.util.ArrayList;



public class DatabaseClass {

    SQLiteDatabase Sql;
    String sqlname="sqlname";

    public void CreateDatabase(Context Ctx){
        try {
            Sql=Ctx.openOrCreateDatabase(sqlname,Context.MODE_PRIVATE,null);
            Sql.execSQL("CREATE TABLE IF NOT EXISTS tableone (ID_Auto INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,count INTEGER); ");
            Sql.close();
            Toast.makeText(Ctx, "Create Database", Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            Toast.makeText(Ctx, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }

    public void InsertData(Context Ctx,String _nameee,int _counttt){
        try {
            Sql=Ctx.openOrCreateDatabase(sqlname,Context.MODE_PRIVATE,null);
            Sql.execSQL("INSERT INTO tableone(name,count) VALUES ('"+_nameee+"',"+_counttt+") ");
            Sql.close();
            Toast.makeText(Ctx, "Inserted", Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            Toast.makeText(Ctx, e.getMessage(), Toast.LENGTH_SHORT).show();
        }


    }

    ArrayList<ContentValues> _Aray(Context Ctx,String search,String _orderrr1,String _order22){

        ArrayList _arayyyyy=new ArrayList();
        Sql=Ctx.openOrCreateDatabase(sqlname,Context.MODE_PRIVATE,null);
        Cursor _cursor=Sql.rawQuery("SELECT * FROM tableone" + search +_orderrr1 +_order22 ,null);

        if (_cursor.moveToFirst()){
            do {
                ContentValues _kontent=new ContentValues();
                _kontent.put("id",_cursor.getInt(0));
                _kontent.put("name",_cursor.getString(1));
                _kontent.put("count",_cursor.getInt(2));
                _arayyyyy.add(_kontent);

            }while (_cursor.moveToNext());
        }





        return _arayyyyy;
    }



    public void DeleteData(Context Ctx,String _Id){
        try {
            Sql=Ctx.openOrCreateDatabase(sqlname,Context.MODE_PRIVATE,null);
            Sql.execSQL("DELETE FROM tableone WHERE ID_Auto='"+_Id+"' ");
            Sql.close();
            Toast.makeText(Ctx, "Deleted", Toast.LENGTH_SHORT).show();

        }catch (Exception e){
            Toast.makeText(Ctx, e.getMessage(), Toast.LENGTH_SHORT).show();
        }


    }


    public void UpdateData(Context Ctx,String nam,int cont,String idde){

        try {
            Sql=Ctx.openOrCreateDatabase(sqlname,Context.MODE_PRIVATE,null);
            Sql.execSQL("UPDATE tableone SET name='"+nam+"',count="+cont+" WHERE ID_Auto='"+idde+"' ");
            Sql.close();
            Toast.makeText(Ctx, "Updated", Toast.LENGTH_SHORT).show();

        }catch (Exception e){
            Toast.makeText(Ctx, e.getMessage(), Toast.LENGTH_SHORT).show();
        }



    }


    int _Shomaresh(Context Ctx){

        int shomaresh=0;

        try {
            Sql=Ctx.openOrCreateDatabase(sqlname,Context.MODE_PRIVATE,null);
            Cursor _cor=Sql.rawQuery("SELECT COUNT(*) FROM tableone",null);

            if (_cor.moveToFirst()){
                do {
                    shomaresh=_cor.getInt(0);

                }while (_cor.moveToNext());
            }

        }catch (Exception e){
            Toast.makeText(Ctx, e.getMessage(), Toast.LENGTH_SHORT).show();
        }



        return shomaresh;
    }





}
