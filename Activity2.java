package com.example.my_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Activity2 extends AppCompatActivity {

    private ImageView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        display = findViewById(R.id.imageView19);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain();
            }
        });
    }

    private void openMain() {
        Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
    }
}

