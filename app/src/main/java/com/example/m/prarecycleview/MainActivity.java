package com.example.m.prarecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView ;

    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList arrayList = new ArrayList<Listy>();
    String [] gwiazdy,kluby;
    int [] img_id = {R.drawable.arsenal_london,R.drawable.chelsea_londyn,R.drawable.everton_fc,R.drawable.liverpool_fc,R.drawable.manchester_city,R.drawable.manchester_united,R.drawable.reading_fc,R.drawable.tottenham_hotspur};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView  = (RecyclerView)findViewById(R.id.recycler);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        kluby = getResources().getStringArray(R.array.kraje);
        gwiazdy = getResources().getStringArray(R.array.gwiazdy);
        int count = 0;
        for(String name : kluby){
            Log.d("Uwaga",String.valueOf(count));
            Listy listy = new Listy(img_id[count],name,gwiazdy[count]);
            Log.d("Uwaga","niedziala");
            arrayList.add(listy);
            Log.d("Uwaga",String.valueOf(count+"xD"));
            count++;
            Log.d("Uwaga",String.valueOf(count));
        }
        Log.d("Uwaga","DupaBlada");
        adapter = new RecyclerAdapter(arrayList);
        recyclerView.setAdapter(adapter);

    }
}
