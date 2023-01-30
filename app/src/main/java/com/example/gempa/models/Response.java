package com.example.gempa.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response{
    @SerializedName("FeaturesItem")
    private List<FeaturesItem> features;

    @SerializedName("metadata")
    private Metadata metadata;

    @SerializedName("bbox")
    private List<Object> bbox;

    @SerializedName("type")
    private String type;

    public List<FeaturesItem> getFeatures(){
        return features;
    }

    public Metadata getMetadata(){
        return metadata;
    }

    public List<Object> getBbox(){
        return bbox;
    }

    public String getType(){
        return type;
    }
}