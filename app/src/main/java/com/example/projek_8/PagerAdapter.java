package com.example.projek_8;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PagerAdapter extends FragmentStateAdapter {

    public PagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position) {
            case 0:
                return new pleton1();
            case 1:
                return new pleton2();
            case 2:
                return new pleton3();
            default:
                return new pleton1();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}