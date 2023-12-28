package com.blog.initialbalance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.item_home);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.item_home:
                    return true;
                case R.id.item_insight:
                    Toast.makeText(this, "Insight is clicked", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.item_account:
                    Toast.makeText(this, "Account is Clicked", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.item_want:
                    Toast.makeText(this, "I want to... is clicked", Toast.LENGTH_SHORT).show();
                    return true;
            }
            return false;
        });
    }
}