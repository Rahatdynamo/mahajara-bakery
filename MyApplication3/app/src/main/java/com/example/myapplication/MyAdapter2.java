package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.MyViewHolder> {
    ArrayList<itemModel> object1;
    private ItemClickListener2 mClickListener;


    public MyAdapter2(ArrayList<itemModel> object){
        this.object1=object;

    }
    public void setOnClickListener(ItemClickListener2 listener){
        mClickListener=listener;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView name1;
        private TextView price1;
        private TextView weight1;
        private TextView btn2;


        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            name1=itemView.findViewById(R.id.item_de_name);
            price1=itemView.findViewById(R.id.item_de_price);
            weight1=itemView.findViewById(R.id.item_de_weight);
            btn2=itemView.findViewById(R.id.item_de_bt);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mClickListener!=null){
                        int pos=getAdapterPosition();
                        if(pos!=RecyclerView.NO_POSITION){
                            String price=object1.get(pos).getPrice();
                            mClickListener.onItemClick(price);
                        }
                    }
                }
            });



        }


    }

    @NonNull
    @Override
    public MyAdapter2.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View v=inflater.inflate(R.layout.item_design,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter2.MyViewHolder holder, int position) {
      holder.name1.setText(object1.get(position).getName());
        holder.price1.setText("$"+object1.get(position).getPrice());
        holder.weight1.setText(object1.get(position).getWeight());





    }

    @Override
    public int getItemCount() {
        return object1.size();
    }
    public void setData(ArrayList<itemModel> data) {
        this.object1 = data;
        notifyDataSetChanged();
    }
    public String getItem(int position) {
        return object1.get(position).getPrice();
    }



}
