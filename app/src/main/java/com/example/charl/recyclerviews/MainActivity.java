package com.example.charl.recyclerviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//Main
    RecyclerView rv;
    SeriesAdapter adapter;
    ArrayList<Series> series;
    LinearLayoutManager lManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        series= new ArrayList<>();
        int cont;

        rv=findViewById(R.id.recycler);
        rv.setHasFixedSize(true);
        lManager= new LinearLayoutManager(this );
        rv.setLayoutManager(lManager);

        prepareSeries();
        cont = series.size();


        adapter=new SeriesAdapter(series);
        rv.setAdapter(adapter);

    }

    public void prepareSeries(){
        series = new ArrayList<>();
        series.add(new Series("Smesh Bras 4", "2", R.drawable.smash4, " LUCINA MAKES THIS ONE PERFECT"));
        series.add(new Series("Smesh Bras brawl", "1",R.drawable.smash3, " The akward son of the family" ));
        series.add(new Series("Smesh Bras Melee", "1", R.drawable.smash2, " Hardcore mode"));
        series.add(new Series("Smesh bras 64", "1", R.drawable.smash, " Le classic"));

    }

}
