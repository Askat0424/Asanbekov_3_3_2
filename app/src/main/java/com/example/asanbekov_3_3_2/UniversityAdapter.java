package com.example.asanbekov_3_3_2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UniversityAdapter extends RecyclerView.Adapter<UniversityViewHolder> {

    private ArrayList<String>Universitylist;

    public UniversityAdapter(ArrayList<String> universitylist) {
       this.Universitylist = universitylist;
    }

    @NonNull
    @Override
    public UniversityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UniversityViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_university,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull UniversityViewHolder holder, int position) {
        holder.bind(Universitylist.get(position));
    }

    @Override
    public int getItemCount() {
        return Universitylist.size();
    }
}
