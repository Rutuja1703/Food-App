package com.example.restaurtanatfooddelivery.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurtanatfooddelivery.R;
import com.example.restaurtanatfooddelivery.adapters.HomeHoriAdapter;
import com.example.restaurtanatfooddelivery.adapters.HomeVerAdapter;
import com.example.restaurtanatfooddelivery.adapters.UpdateVerticalRes;
import com.example.restaurtanatfooddelivery.databinding.FragmentHomeBinding;
import com.example.restaurtanatfooddelivery.models.HomeHoriModel;
import com.example.restaurtanatfooddelivery.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements UpdateVerticalRes {
    RecyclerView recyclerView;
    HomeHoriAdapter homeHoriAdapter;
    ArrayList<HomeHoriModel>homeHoriModelList;
Context context;
    ///vertical///
    RecyclerView ver_recyclerView;
    HomeVerAdapter homeVerAdapter;
    ArrayList<HomeVerModel>homeVerModelList;


    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        ///vertical//
        ver_recyclerView=root.findViewById(R.id.home_ver_recycler);



        ////horizantal
        recyclerView=root.findViewById(R.id.home_hori_recycler);
        homeHoriModelList=new ArrayList<>();

        homeHoriModelList.add(new HomeHoriModel(R.drawable.pizza,"Pizza"));
        homeHoriModelList.add(new HomeHoriModel(R.drawable.hamburger,"Hamburger"));
        homeHoriModelList.add(new HomeHoriModel(R.drawable.fried_potatoes,"Fries"));
        homeHoriModelList.add(new HomeHoriModel(R.drawable.ice_cream,"Ice-Cream"));
        homeHoriModelList.add(new HomeHoriModel(R.drawable.sandwich,"Sandwich"));

        homeHoriAdapter=new HomeHoriAdapter(this,getActivity(),homeHoriModelList);
        recyclerView.setAdapter(homeHoriAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),recyclerView.HORIZONTAL,false));
        recyclerView.setHasFixedSize(true);
        ///vertical//
        homeVerModelList=new ArrayList<>();



           homeVerAdapter=new HomeVerAdapter(getActivity(), (ArrayList<HomeVerModel>) homeVerModelList);
        ver_recyclerView.setAdapter(homeVerAdapter);
      ver_recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),ver_recyclerView.VERTICAL,false));



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void callBack(int position, ArrayList<HomeVerModel> list) {
        homeVerAdapter=new HomeVerAdapter(getActivity(),list);
        homeVerAdapter.notifyDataSetChanged();
        ver_recyclerView.setAdapter(homeVerAdapter);

    }
}