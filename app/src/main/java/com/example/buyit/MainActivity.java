package com.example.buyit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void searchItem(View view) {
        Intent intent = new Intent (getApplicationContext(), ItemView.class);
        startActivity(intent);
    }

    public void myList(View view) {
        Intent intent = new Intent (getApplicationContext(), myList.class);
        startActivity(intent);
    }

    public void availableView(View view) {
        Intent intent = new Intent (getApplicationContext(), availableItems.class);
        startActivity(intent);
    }

}