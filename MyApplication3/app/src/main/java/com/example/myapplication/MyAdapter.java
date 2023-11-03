package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.jar.Attributes;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    LayoutInflater inflater;
    String[] Names;

    int[] Sweet;
    private ItemClickListener mClickListener;

    public MyAdapter(Context context, String[] names, int[] Sweet,ItemClickListener clickListener) {
        inflater = LayoutInflater.from(context);
        this.Names = names;
        this.Sweet = Sweet;
        this.context=context;
        this.mClickListener = clickListener;



    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.cake_design, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.textView.setText(Names[position]);
        holder.imageView.setImageResource(Sweet[position]);
    }

    @Override
    public int getItemCount() {
        return Names.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {
        private TextView textView;
        private ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.cd_textView);
            imageView = itemView.findViewById(R.id.Cd_imageView);
            itemView.setOnClickListener(this);

        }
        @Override
        public void onClick(View view) {
            if (mClickListener != null) {
                mClickListener.onItemClick(getAdapterPosition());
            }
        }

    }
}

