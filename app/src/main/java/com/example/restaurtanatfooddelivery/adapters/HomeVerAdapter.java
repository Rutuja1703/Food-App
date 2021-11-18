package com.example.restaurtanatfooddelivery.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurtanatfooddelivery.R;
import com.example.restaurtanatfooddelivery.models.HomeVerModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class HomeVerAdapter  extends RecyclerView.Adapter<HomeVerAdapter.MyviewHolder> {
    Context context;
    ArrayList<HomeVerModel>list;

    public HomeVerAdapter(Context context, ArrayList<HomeVerModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @NotNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_ver_item,parent,false);

        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyviewHolder holder, int position) {
       final HomeVerModel homeVerModel=list.get(position);
        holder.verImg.setImageResource(homeVerModel.getImage());
        holder.ver_foodname.setText(homeVerModel.getName());
        holder.ver_Price.setText(homeVerModel.getPrice());
        holder.ver_Timing.setText(homeVerModel.getTiming());
        holder.ver_Rating.setText(homeVerModel.getRating());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder{
        ImageView verImg;
        TextView ver_foodname,ver_Timing,ver_Price,ver_Rating;
        public MyviewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            verImg=itemView.findViewById(R.id.verfood_img);
            ver_foodname=itemView.findViewById(R.id.ver_name);
            ver_Timing=itemView.findViewById(R.id.ver_timing);
            ver_Price=itemView.findViewById(R.id.ver_price);
            ver_Rating=itemView.findViewById(R.id.ver_ratingnum);
        }
    }
}
