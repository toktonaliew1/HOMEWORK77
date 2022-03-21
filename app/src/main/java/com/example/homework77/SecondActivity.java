package com.example.homework77;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.example.homework77.databinding.ActivityMainBinding;
import com.example.homework77.databinding.SecondActivityBinding;
import com.example.homework77.mainFragment.FirstFragment;

public class SecondActivity extends AppCompatActivity {
    SecondActivityBinding binding;
    Animation topAnim;

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = SecondActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        fragmentManager = getSupportFragmentManager();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container_fragment, FirstFragment.class, null).commit();
        }


    }
}
