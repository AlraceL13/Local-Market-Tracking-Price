package com.example.localmarketprice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class meat_category extends AppCompatActivity {
    private Button button, button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat_category);

        button = (Button) findViewById(R.id.chick);
        button1 = (Button) findViewById(R.id.beef);
        button2 = (Button) findViewById(R.id.pork);
        button3 = (Button) findViewById(R.id.goat);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChickenCategory();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBeefCategory();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPorkCategory();

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoatCategory();

            }
        });


    }

    public void openChickenCategory() {
        Intent intent = new Intent(this, chicken_meat.class);
        startActivity(intent);
    }

    public void openBeefCategory() {
        Intent intent = new Intent(this, beef_meat.class);
        startActivity(intent);
    }

    public void openPorkCategory() {
        Intent intent = new Intent(this, pork_meat.class);
        startActivity(intent);
    }
    public void openGoatCategory() {
        Intent intent = new Intent(this, goat_meat.class);
        startActivity(intent);
    }
}