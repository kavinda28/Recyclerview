package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class mtadapter extends RecyclerView.Adapter<mtadapter.MyViewHolder> {

    Context context;
    ArrayList<info_class> info_classArrayList;

    public mtadapter(Context context, ArrayList<info_class> info_classArrayList) {
        this.context = context;
        this.info_classArrayList = info_classArrayList;
    }

    @NonNull
    @Override
    public mtadapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View v= LayoutInflater.from(context).inflate(R.layout.list_item_recycleview,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull mtadapter.MyViewHolder holder, int position) {
             info_class info_class=info_classArrayList.get(position);
             holder.tvheading.setText(info_class.headimg);
             holder.textsshow.setText(info_class.text);
    }

    @Override
    public int getItemCount() {
        return info_classArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
       TextView tvheading,textsshow;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
             tvheading=itemView.findViewById(R.id.tvHeading);
            textsshow=itemView.findViewById(R.id.showtext);

        }
    }
}
