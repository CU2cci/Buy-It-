package com.example.buyit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ItemView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_view);

        TextView header = (TextView)findViewById(R.id.itemValue);

        Bundle b = getIntent().getExtras();
        header.setText("Item search: " + b.getString("key"));

    }

    public void backButton(View view) {
        this.finish();
    }


}