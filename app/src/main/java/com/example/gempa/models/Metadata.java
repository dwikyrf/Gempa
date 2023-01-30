package com.example.gempa.models;

public class Metadata{
    private long generated;
    private int count;
    private String api;
    private String title;
    private String url;
    private int status;

    public long getGenerated(){
        return generated;
    }

    public int getCount(){
        return count;
    }

    public String getApi(){
        return api;
    }

    public String getTitle(){
        return title;
    }

    public String getUrl(){
        return url;
    }

    public int getStatus(){
        return status;
    }
}
