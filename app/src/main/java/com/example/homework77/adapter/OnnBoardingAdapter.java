package com.example.homework77.adapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.homework77.fragment.OnBoardFragment;
import com.example.homework77.model.OnBoarModel;

import java.util.ArrayList;
import java.util.List;

public class OnnBoardingAdapter extends FragmentStateAdapter {
    List<OnBoarModel> list = new ArrayList<>();

    public OnnBoardingAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, List<OnBoarModel> list) {
        super(fragmentManager, lifecycle);
        this.list = list;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = new OnBoardFragment();
        Bundle bundle = new Bundle();
        bundle.putString(OnBoardFragment.TITLE, list.get(position).getTitle());
        bundle.putString(OnBoardFragment.TITLE, list.get(position).getTitle());
        bundle.putString(OnBoardFragment.TITLE, list.get(position).getTitle());
        bundle.putInt(OnBoardFragment.IMAGE, list.get(position).getImage());
        bundle.putInt(OnBoardFragment.IMAGE, list.get(position).getImage());
        bundle.putInt(OnBoardFragment.IMAGE, list.get(position).getImage());
        bundle.putString(OnBoardFragment.STRING, list.get(position).getString());
        bundle.putString(OnBoardFragment.STRING, list.get(position).getString());
        bundle.putString(OnBoardFragment.STRING, list.get(position).getString());
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}


