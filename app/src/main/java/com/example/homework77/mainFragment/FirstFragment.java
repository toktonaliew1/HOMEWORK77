package com.example.homework77.mainFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.homework77.R;
import com.example.homework77.databinding.FragmentFirstBinding;


public class FirstFragment extends Fragment {
    FragmentFirstBinding binding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater,container,false);

        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupListener();
        getData();
    }



    private void setupListener() {
        binding.btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String surname = binding.etNumber.getText().toString();
                String name = binding.etPassword.getText().toString();
                if (surname.isEmpty()) {
                    binding.etNumber.setError("number");
                    binding.etPassword.setError("password");
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("key", surname);
                    bundle.putString("ddd",name);

                    SecondFragment secondFragment = new SecondFragment();
                    secondFragment.setArguments(bundle);
                    getParentFragmentManager().beginTransaction()
                            .replace(R.id.container_fragment,secondFragment).commit();
                }
            }
        });




    }
    private void getData() {
        if (getArguments() != null){
            String s = getArguments().getString("key");
            String st = getArguments().getString("ddd");
            binding.etNumber.setText(s);
            binding.etPassword.setText(st);
        }
    }





}