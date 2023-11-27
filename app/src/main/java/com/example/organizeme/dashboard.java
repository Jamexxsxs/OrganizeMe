package com.example.organizeme;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        ImageView list_button = findViewById(R.id.list_button);

        list_button.setOnClickListener(view -> {
            Intent intent = new Intent(this, main.class);
            startActivity(intent);
        });
    }
}
