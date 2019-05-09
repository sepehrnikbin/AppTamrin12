package com.example.sepehr.apptamrin1;

import android.content.ContentValues;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class Adapter_RecycleView extends RecyclerView.Adapter<Adapter_RecycleView._Hoder> {
    Context Ctx;
    ArrayList<ContentValues> allinfo;


    public void etelaat ( Context Ctxxx ,ArrayList<ContentValues> information){
       this.allinfo=information;
        Ctx=Ctxxx;
        //Nokte mohemmmm******::::hamishe method hayi ke b clas digar vasl mikoni bayad contex dashte bashand va agar mikhahi az zarfe method ha estefade konid
        //bayad contex sarasari mesl Ctx k inja tarif kardim tarif konid va contex zarf ra b on vasl konid
    }


    @Override
    public _Hoder onCreateViewHolder(ViewGroup parent, int viewType) {

        View _V=LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view,parent,false);
        //_Hoder hold=new _Hoder(_V);

        return new _Hoder(_V);
    }

    @Override
    public void onBindViewHolder(_Hoder holder, final int position) {
        ContentValues contentValues=(ContentValues)allinfo.get(position);
        holder.names.setText(contentValues.getAsString("nameeeesss"));
        holder.shomare.setText(contentValues.getAsString("adaddd"));


        holder.shomare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Ctx, "shoma ro " + position + "clik kardid", Toast.LENGTH_SHORT).show();
            }
        });

        holder.names.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Ctx, "shoma ro "+position+"clik kardid", Toast.LENGTH_SHORT).show();
            }
        });




    }

    @Override
    public int getItemCount() {
        return allinfo.size();
    }

    public class _Hoder extends RecyclerView.ViewHolder {
        TextView names,shomare;
        RelativeLayout Rel;

        public _Hoder(View itemView) {
            super(itemView);
            names=(TextView)itemView.findViewById(R.id.nameRecycle);
            shomare=(TextView)itemView.findViewById(R.id.adadRecycle);
            Rel=(RelativeLayout)itemView.findViewById(R.id.Relativv);
        }
    }

}
