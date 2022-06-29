package com.pratiksha.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SimpleRecylerViewAdapter adapter;
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;

    ArrayList<NewSampleModel> meroApikoData=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        meroApikoData.add("Ram");
//        meroApikoData.add("shyam");
//        meroApikoData.add("Ram");
//        meroApikoData.add("Ram");
//        meroApikoData.add("Ram");
//        meroApikoData.add("Ram");
        meroApikoData.add(new NewSampleModel("xyz","11"));
        meroApikoData.add(new NewSampleModel("xyx","12"));
        meroApikoData.add(new NewSampleModel("xyz","22"));
        meroApikoData.add(new NewSampleModel("xyz","33"));
        meroApikoData.add(new NewSampleModel("xyz","4"));



        recyclerView=findViewById(R.id.recycler_view);
        adapter= new SimpleRecylerViewAdapter(this,meroApikoData);
        layoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}