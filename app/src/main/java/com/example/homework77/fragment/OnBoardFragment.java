package com.example.homework77.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework77.R;
import com.example.homework77.databinding.FragmentOnBoardBinding;


public class OnBoardFragment extends Fragment {

    FragmentOnBoardBinding binding;

    public static final String TITLE = "title";
    public static final String IMAGE = "image";
    public static final String STRING = "string";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOnBoardBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.text.setText(getArguments().getString(TITLE));
        binding.avatar.setImageResource(getArguments().getInt(IMAGE));
        binding.text2.setText(getArguments().getString(STRING));

    }

}