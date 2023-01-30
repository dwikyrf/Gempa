package com.example.gempa.models;

public class FeaturesItem{
    private Geometry geometry;
    private String id;
    private String type;
    private Properties properties;

    public Geometry getGeometry(){
        return geometry;
    }

    public String getId(){
        return id;
    }

    public String getType(){
        return type;
    }

    public Properties getProperties(){
        return properties;
    }
}
