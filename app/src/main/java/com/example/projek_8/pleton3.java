package com.example.projek_8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class pleton3 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.pleton3, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        List<TopupModel> list = new ArrayList<>();

        list.add(new TopupModel(R.drawable.valorant, "10700 VP", "Rp 1.064.820"));
        list.add(new TopupModel(R.drawable.valorant, "11000 VP", "Rp 1.083.229"));
        list.add(new TopupModel(R.drawable.valorant, "11475 VP", "Rp 1.119.079"));
        list.add(new TopupModel(R.drawable.valorant, "12000 VP", "Rp 1.173.338"));
        list.add(new TopupModel(R.drawable.valorant, "13050 VP", "Rp 1.281.854"));
        list.add(new TopupModel(R.drawable.valorant, "14650 VP", "Rp 1.441.722"));
        list.add(new TopupModel(R.drawable.valorant, "16700 VP", "Rp 1.658.756"));
        list.add(new TopupModel(R.drawable.valorant, "18400 VP", "Rp 1.823.468"));
        list.add(new TopupModel(R.drawable.valorant, "20000 VP", "Rp 1.983.336"));
        list.add(new TopupModel(R.drawable.valorant, "22000 VP", "Rp 2.129.640"));

        recyclerView.setAdapter(new TopupAdapter(list));

        return view;
    }
}