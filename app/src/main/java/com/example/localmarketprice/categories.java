package com.example.localmarketprice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class categories extends AppCompatActivity {
    private Button button, button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        button = (Button) findViewById(R.id.meat);
        button1 = (Button) findViewById(R.id.vege);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openMeatCategory();
        }
    });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openVegetablesCategory();
            }
        });
}
    public void openMeatCategory(){
        Intent intent = new Intent(this, meat_category.class);
        startActivity(intent);
    }
    public void openVegetablesCategory() {
        Intent intent = new Intent(this, veggies.class);
        startActivity(intent);
    }
}