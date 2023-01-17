package com.example.asanbekov_3_3_2;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
public class UniversityViewHolder extends RecyclerView.ViewHolder {

    private TextView tvUniversity;
    public UniversityViewHolder(@NonNull View itemView) {
        super(itemView);
        tvUniversity = itemView.findViewById(R.id.university);

    }
    public void bind(String university){
        tvUniversity.setText(university);
    }
}
