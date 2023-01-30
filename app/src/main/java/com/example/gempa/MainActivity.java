package com.example.gempa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.gempa.adapters.GempaAdapter;
import com.example.gempa.models.FeaturesItem;
import com.example.gempa.models.Response;
import com.example.gempa.retrofit.GetClient;

import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements GempaAdapter.ItemGempaClickListener{


    private RecyclerView rvGempa;
    private GempaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       rvGempa = findViewById(R.id.rv_gempa);
       rvGempa.setLayoutManager(new LinearLayoutManager(this));

       adapter = new GempaAdapter();
       rvGempa.setAdapter(adapter);

        //Minta data ke Server
        String API_BASE_URL ="https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/2.5_day.geojson/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create() )
                .client( new OkHttpClient.Builder().build())
                .build();

        GetClient client = retrofit.create(GetClient.class);

        Call<Response> call =client.getpost();
        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
            Response getResponse = response.body();
            if(getResponse != null) {
                List<FeaturesItem> features = getResponse.getFeatures();
                adapter.setItemList(features);
              }
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });



    }




//    public ArrayList<Gempa> getGempa(){
//        ArrayList<Gempa> listGempa = new ArrayList<>();
//        listGempa.add(new Gempa(
//                null,
//                "Padang",
//                "13.56",
//                "5.8 SR"
//        ));
//        listGempa.add(new Gempa(
//                null,
//                "Payakumbuh",
//                "13.52",
//                "5.8 SR"
//        ));
//        listGempa.add(new Gempa(
//                null,
//                "Solok",
//                "00.00",
//                "1.8 SR"
//        ));
//        listGempa.add(new Gempa(
//                null,
//                "Bukit Tinggi",
//                "10.52",
//                "2.8 SR"
//        ));
//        listGempa.add(new Gempa(
//                null,
//                "Sawahlunto",
//                "00.52",
//                "2.8 SR"
//        ));
//        listGempa.add(new Gempa(
//                null,
//                "Sijunjung",
//                "06.52",
//                "2,3 SR"
//        ));
//        listGempa.add(new Gempa(
//                null,
//                "Pariaman",
//                "04.52",
//                "2,1 SR"
//        ));listGempa.add(new Gempa(
//                null,
//                "Padang",
//                "13.00",
//                "2.8 SR"
//        ));listGempa.add(new Gempa(
//                null,
//                "Agam",
//                "10.32",
//                "2.4 SR"
//        ));
//
//
//
//
//        return listGempa;
//    }

    @Override
    public void onItemGempaClick(FeaturesItem gempa) {
        Toast.makeText(this, "Lokasi Gempa di " + gempa.getProperties().getPlace(), Toast.LENGTH_SHORT).show();
        Intent detailIntent = new Intent(this, GempatDetailActivity.class);
        detailIntent.putExtra("lokasi", gempa.getProperties().getPlace());
        startActivity(detailIntent);
    }
}