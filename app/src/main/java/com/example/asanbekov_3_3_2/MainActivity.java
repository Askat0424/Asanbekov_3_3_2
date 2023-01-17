package com.example.asanbekov_3_3_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<String>UniversityList = new ArrayList<>();
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle_view);

        LoadData();
        UniversityAdapter universityAdapter =
                new UniversityAdapter(UniversityList);
        recyclerView.setAdapter(universityAdapter);
    }

    private void LoadData() {
       UniversityList.add("Harvard University");
       UniversityList.add("Massachusetts institute");
       UniversityList.add("University of Cambridge");
       UniversityList.add("University of Oxford");
       UniversityList.add("University Collage London");
       UniversityList.add("Stanford University");
       UniversityList.add("Princeton University");
       UniversityList.add("Yale University");
       UniversityList.add("Columbia University");
       UniversityList.add("Imperial College London");
       UniversityList.add("Fudan University");
       UniversityList.add("New York University");
       UniversityList.add("National Taiwan University");
       UniversityList.add("University of Chicago");
       UniversityList.add("California institute of Technology");
    }
}