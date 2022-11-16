package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final ArrayList YearList = new ArrayList();
    private final YearAdapter adapter = new YearAdapter(YearList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rvYear = findViewById(R.id.recycler_view);
        loadYearsData();
        rvYear.setAdapter(adapter);
    }

    private void loadYearsData() {
        YearList.add("2000");
        YearList.add("2001");
        YearList.add("2002");
        YearList.add("2003");
        YearList.add("2004");
        YearList.add("2005");
        YearList.add("2005");
        YearList.add("2006");
        YearList.add("2007");
        YearList.add("2008");
        YearList.add("2009");
        YearList.add("2010");
        YearList.add("2011");
        YearList.add("2012");
        YearList.add("2013");
        YearList.add("2014");
        YearList.add("2015");
        YearList.add("2016");
        YearList.add("2017");
        YearList.add("2018");
        YearList.add("2019");
        YearList.add("2020");


    }

}