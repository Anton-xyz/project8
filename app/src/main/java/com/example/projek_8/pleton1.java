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

public class pleton1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.pleton1, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        List<TopupModel> list = new ArrayList<>();

        list.add(new TopupModel(R.drawable.mlbb, "14490 Diamonds", "Rp 3.668.812"));
        list.add(new TopupModel(R.drawable.mlbb, "16080 Diamonds", "Rp 4.076.632"));
        list.add(new TopupModel(R.drawable.mlbb, "18090 Diamonds", "Rp 4.586.211"));
        list.add(new TopupModel(R.drawable.mlbb, "19320 Diamonds", "Rp 4.891.749"));
        list.add(new TopupModel(R.drawable.mlbb, "20100 Diamonds", "Rp 5.095.791"));
        list.add(new TopupModel(R.drawable.mlbb, "21330 Diamonds", "Rp 5.401.238"));
        list.add(new TopupModel(R.drawable.mlbb, "23340 Diamonds", "Rp 5.910.908"));
        list.add(new TopupModel(R.drawable.mlbb, "24150 Diamonds", "Rp 6.114.687"));
        list.add(new TopupModel(R.drawable.mlbb, "26610 Diamonds", "Rp 6.624.266"));
        list.add(new TopupModel(R.drawable.mlbb, "28170 Diamonds", "Rp 7.133.845"));

        recyclerView.setAdapter(new TopupAdapter(list));

        return view;
    }
}