package com.pratiksha.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
 TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        name=findViewById(R.id.details_name);

        String passedData=getIntent().getStringExtra("data");

        name.setText(passedData);
                    }
}