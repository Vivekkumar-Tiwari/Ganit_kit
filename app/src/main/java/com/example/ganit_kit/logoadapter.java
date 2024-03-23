package com.example.ganit_kit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class logoadapter extends RecyclerView.Adapter<logoadapter.ViewHolder> {

    private final logointerface logointerface5;

    Context context;
    ArrayList<logomodel> arrfeatures;

    logoadapter(Context context, ArrayList<logomodel> arrfeatures, MainActivity2 mainActivity2){
        this.context =context;
        this.arrfeatures = arrfeatures;
        this.logointerface5 = mainActivity2;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.logo,parent,false);
        ViewHolder viewHolder = new ViewHolder(v,logointerface5);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.img1.setImageResource(arrfeatures.get(position).img);
        holder.txt1.setText(arrfeatures.get(position).txt01);
        if (holder.txt2 != null) {
            holder.txt2.setText(arrfeatures.get(position).txt02);
        }
    }

    @Override
    public int getItemCount() {
        return arrfeatures.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView img1;
        TextView txt1, txt2;

        public ViewHolder(View items, logointerface linterface){
            super(items);

            img1 =items.findViewById(R.id.img1);
            txt1 =items.findViewById(R.id.txt1);
            txt2 =items.findViewById(R.id.txt2); // Initialize txt2 here

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(logoadapter.this.logointerface5 != null){
                        int pos =getAdapterPosition();
                        if(pos != RecyclerView.NO_POSITION){
                            logoadapter.this.logointerface5.methodname(pos);
                        }
                    }
                }
            });
        }
    }
}
