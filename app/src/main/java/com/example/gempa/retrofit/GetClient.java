package com.example.gempa.retrofit;

import com.example.gempa.models.FeaturesItem;
import com.example.gempa.models.Response;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetClient {

    @GET("v1/gempa")
    Call<Response> getpost();

}
