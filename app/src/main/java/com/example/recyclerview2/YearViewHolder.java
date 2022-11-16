package com.example.recyclerview2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class YearViewHolder extends RecyclerView.ViewHolder {
    private final TextView tvYear;

    public YearViewHolder(@NonNull View itemView) {
        super(itemView);
        tvYear = itemView.findViewById(R.id.tv_year);
    }

    public void bind(String year) {
        tvYear.setText(year);
    }
}
