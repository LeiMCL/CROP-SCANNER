package com.example.cropscanner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.cropscanner.fragments.FruitsFragment;
import com.example.cropscanner.fragments.VegetablesFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {
    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new FruitsFragment();
            case 1:
                return new VegetablesFragment();
            default:
                return new FruitsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
