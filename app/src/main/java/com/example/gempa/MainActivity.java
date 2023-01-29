package com.example.gempa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.gempa.adapters.GempaAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvGempa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvGempa = findViewById(R.id.rv_gempa);

        GempaAdapter adapter = new GempaAdapter(new ArrayList<>());
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        rvGempa.setLayoutManager(layoutManager);
        rvGempa.setAdapter(adapter);
    }
}