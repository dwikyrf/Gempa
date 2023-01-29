package com.example.gempa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.gempa.adapters.GempaAdapter;
import com.example.gempa.models.Gempa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvGempa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvGempa = findViewById(R.id.rv_gempa);

        GempaAdapter adapter = new GempaAdapter(getGempa());
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        rvGempa.setLayoutManager(layoutManager);
        rvGempa.setAdapter(adapter);
    }

    public ArrayList<Gempa> getGempa(){
        ArrayList<Gempa> listGempa = new ArrayList<>();
        listGempa.add(new Gempa(
                null,
                "Padang",
                "13.56",
                "5.8 SR"
        ));
        listGempa.add(new Gempa(
                null,
                "Payakumbuh",
                "13.52",
                "5.8 SR"
        ));
        listGempa.add(new Gempa(
                null,
                "Solok",
                "00.00",
                "1.8 SR"
        ));
        listGempa.add(new Gempa(
                null,
                "Bukit Tinggi",
                "10.52",
                "2.8 SR"
        ));
        listGempa.add(new Gempa(
                null,
                "Sawahlunto",
                "00.52",
                "2.8 SR"
        ));
        listGempa.add(new Gempa(
                null,
                "Sijunjung",
                "06.52",
                "2,3 SR"
        ));
        listGempa.add(new Gempa(
                null,
                "Pariaman",
                "04.52",
                "2,1 SR"
        ));listGempa.add(new Gempa(
                null,
                "Padang",
                "13.00",
                "2.8 SR"
        ));listGempa.add(new Gempa(
                null,
                "Agam",
                "10.32",
                "2.4 SR"
        ));




        return listGempa;
    }
}