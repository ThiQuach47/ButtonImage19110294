package com.example.abai1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.ImageDecoder;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView donuts;
    ImageView ice_cream;
    ImageView froyo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        donuts = findViewById(R.id.donuts);
        ice_cream = findViewById(R.id.ice_cream);
        froyo = findViewById(R.id.froyo);

        donuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageClick(donuts);
            }
        });

        ice_cream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageClick(ice_cream);
            }
        });

        froyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageClick(froyo);
            }
        });
    }

    private void imageClick(View view) {
        String str = "";
        switch (view.getId()) {
            case R.id.donuts:
                str = "You orderd a donuts";
                break;
            case R.id.ice_cream:
                str = "You orderd a ice cream";
                break;
            case R.id.froyo:
                str = "You orderd a froyo";
                break;
        }
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }

}