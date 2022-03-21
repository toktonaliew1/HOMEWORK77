package com.example.homework77;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.homework77.adapter.OnnBoardingAdapter;

import com.example.homework77.databinding.OnBoardActivityyBinding;
import com.example.homework77.model.OnBoarModel;

import java.util.ArrayList;
import java.util.List;

public class OnBoardActivity extends AppCompatActivity {

    private OnBoardActivityyBinding binding;

    OnnBoardingAdapter onBoardingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = OnBoardActivityyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupData();
        setupListener();
        pagerListener();
    }
    private void setupData() {
        List<OnBoarModel> list = new ArrayList<>();
        list.add(new OnBoarModel(R.drawable.wallet, "Smart Wallet","Managing your money can be the easiest thing you do all day."));
        list.add(new OnBoarModel(R.drawable.moneybag, "Effortless Budgeting","Customize your budget categories and stay on top of your spending 24/7."));
        list.add(new OnBoarModel(R.drawable.piggybank, "Automatic Savings","Set your savings goal, and let Empower figure out how to get you there."));
        onBoardingAdapter = new OnnBoardingAdapter(getSupportFragmentManager(), getLifecycle(), list);
        binding.pager.setAdapter(onBoardingAdapter);
        binding.wormDotsIndicator.setViewPager2(binding.pager);
    }

    private void setupListener() {
        binding.btnText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.btnText.getText() == "start") {
                    Intent intent = new Intent(OnBoardActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                } else {
                    binding.pager.setCurrentItem(binding.pager.getCurrentItem() + 1);
                }

            }

        });
        binding.btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OnBoardActivity.this, MainActivity.class);
                startActivity(intent);


            }
        });
    }

    private void pagerListener() {
        binding.pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                if (position == 2) {
                    binding.btnText.setText("start");
                } else {
                    binding.btnText.setText("next");
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });

    }
}
