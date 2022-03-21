package com.example.homework77.mainFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework77.R;
import com.example.homework77.databinding.FragmentSecondBinding;


public class SecondFragment extends Fragment {
     private FragmentSecondBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupListener();
        getData();


    }




    private void setupListener() {
        binding.btnOpenToSecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstFragment firstFragment = new FirstFragment();

                getParentFragmentManager().beginTransaction()
                        .replace(R.id.container_fragment, firstFragment).commit();


            }
        });
        binding.tvNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("key",binding.tvNumber.getText().toString());

            }
        });
        binding.tvPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("key",binding.tvPassword.getText().toString());


            }
        });




    }
    private void getData() {
        if (getArguments() != null){
            String s = getArguments().getString("key");
            String st = getArguments().getString("ddd");
            binding.tvNumber.setText(s);
            binding.tvPassword.setText(st);

        }
    }
}