package com.example.homework77;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.homework77.databinding.ActivityMainBinding;
import com.example.homework77.databinding.SecondActivityBinding;
import com.example.homework77.mainFragment.FirstFragment;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Animation topAnim;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_anim);
        binding.imBank.setAnimation(topAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                finish();

            }
        },3000);
    }









}