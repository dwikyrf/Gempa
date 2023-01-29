package com.example.gempa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GempatDetailActivity extends AppCompatActivity {

    String namaGempa;
    TextView textNamaDetailGempa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gempat_detail);

        Intent detailIntent = getIntent();
        if(detailIntent != null) {
            namaGempa = detailIntent.getStringExtra("lokasi");
            textNamaDetailGempa = findViewById(R.id.textNamaDetailGempa);
            textNamaDetailGempa.setText(namaGempa);
        }

    }

}