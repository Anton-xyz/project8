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

public class pleton2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.pleton2, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        List<TopupModel> list = new ArrayList<>();

        list.add(new TopupModel(R.drawable.pubg, "4030 UC", "Rp 831.637"));
        list.add(new TopupModel(R.drawable.pubg, "4175 UC", "Rp 863.216"));
        list.add(new TopupModel(R.drawable.pubg, "4510 UC", "Rp 941.625"));
        list.add(new TopupModel(R.drawable.pubg, "4835 UC", "Rp 1.020.035"));
        list.add(new TopupModel(R.drawable.pubg, "5170 UC", "Rp 1.098.443"));
        list.add(new TopupModel(R.drawable.pubg, "5650 UC", "Rp 1.177.209"));
        list.add(new TopupModel(R.drawable.pubg, "5975 UC", "Rp 1.255.619"));
        list.add(new TopupModel(R.drawable.pubg, "6310 UC", "Rp 1.334.028"));
        list.add(new TopupModel(R.drawable.pubg, "6635 UC", "Rp 1.412.437"));
        list.add(new TopupModel(R.drawable.pubg, "6970 UC", "Rp 1.490.846"));

        recyclerView.setAdapter(new TopupAdapter(list));

        return view;
    }
}