package com.example.organizeme;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class main extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        ImageView dashboard_button = findViewById(R.id.dashboard_button);


        dashboard_button.setOnClickListener(view->{
            Intent intent = new Intent(this, dashboard.class);
            startActivity(intent);
        });
    }



}
