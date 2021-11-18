package com.example.restaurtanatfooddelivery.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurtanatfooddelivery.R;
import com.example.restaurtanatfooddelivery.models.HomeHoriModel;
import com.example.restaurtanatfooddelivery.models.HomeVerModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class HomeHoriAdapter extends RecyclerView.Adapter<HomeHoriAdapter.ViewHolder> {
   UpdateVerticalRes updateVerticalRes;
   Activity activity;
    ArrayList<HomeHoriModel>list;

    boolean check=true;
    boolean select=true;
    int row_index=-1;



    public HomeHoriAdapter(UpdateVerticalRes updateVerticalRes,Activity activity, ArrayList<HomeHoriModel> list) {
        this.updateVerticalRes = updateVerticalRes;
        this.activity = activity;
        this.list = list;

    }



    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizantal_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {
        final HomeHoriModel model = list.get(position);
        holder.foodName.setText(model.getName());
        holder.foodImg.setImageResource(model.getImage());

        if (check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Pizza1", "10:00 - 23:00", "4.5", "Min - $150"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza2", "10:00 - 23:00", "4.5", "Min - $250"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza2", "10:00 - 23:00", "4.5", "Min - $100"));

            updateVerticalRes.callBack(position, homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (position == 0) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Pizza1", "10:00 - 23:00", "4.5", "Min - $150"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza2", "10:00 - 23:00", "4.5", "Min - $250"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza2", "10:00 - 23:00", "4.5", "Min - $100"));
                        updateVerticalRes.callBack(position, homeVerModels);
                    } else if (position == 1) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.burger1, "Burger1", "10:00 - 23:00", "4.5", "Min - $150"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger2, "Burger2", "10:00 - 23:00", "4.5", "Min - $250"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger4, "Burger3", "10:00 - 23:00", "4.5", "Min - $100"));
                        updateVerticalRes.callBack(position, homeVerModels);
                    } else if (position == 2) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.fries1, "Fries1", "10:00 - 23:00", "4.5", "Min - $150"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries2, "Fries2", "10:00 - 23:00", "4.5", "Min - $250"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries3, "Fries3", "10:00 - 23:00", "4.5", "Min - $100"));
                        updateVerticalRes.callBack(position, homeVerModels);
                    } else if (position == 3) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream1, "icecream1", "10:00 - 23:00", "4.5", "Min - $150"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream2, "icecream2", "10:00 - 23:00", "4.5", "Min - $250"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream3, "icecream3", "10:00 - 23:00", "4.5", "Min - $100"));
                        updateVerticalRes.callBack(position, homeVerModels);
                    }
                    else if (position == 4) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich1, "Sandwich1", "10:00 - 23:00", "4.5", "Min - $150"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich2, "Sandwich2", "10:00 - 23:00", "4.5", "Min - $250"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich3, "Sandwich3", "10:00 - 23:00", "4.5", "Min - $100"));
                        updateVerticalRes.callBack(position, homeVerModels);
                    }

                }
            });
            if (select) {
                if (position == 0) {
                    holder.cardView.setCardBackgroundColor(R.drawable.btn_bg);
                }

            }else if (row_index==position){
                holder.cardView.setCardBackgroundColor(R.drawable.btn_bg);
            }
            else{
                holder.cardView.setCardBackgroundColor(R.drawable.change_bg);
            }


        }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView foodImg;
        TextView  foodName;
        CardView cardView;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            foodImg=itemView.findViewById(R.id.food_img);
            foodName=itemView.findViewById(R.id.food_name);
          cardView=itemView.findViewById(R.id.foodcard_item);
        }
    }
}
