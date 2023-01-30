package com.example.gempa.models;

import java.util.List;

public class Geometry{
    private List<Object> coordinates;
    private String type;

    public List<Object> getCoordinates(){
        return coordinates;
    }

    public String getType(){
        return type;
    }
}