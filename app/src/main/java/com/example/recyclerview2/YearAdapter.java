package com.example.recyclerview2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class YearAdapter extends RecyclerView.Adapter<YearViewHolder> {

    private final ArrayList<String> yearList;

    public YearAdapter(ArrayList<String> yearList) {
        this.yearList = yearList;
    }

    @NonNull
    @Override
    public YearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new YearViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_years, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull YearViewHolder holder, int position) {
        holder.bind(yearList.get(position));
    }

    @Override
    public int getItemCount() {
        return yearList.size();
    }
}
