package com.example.gempa.models;

public class Properties{
    private Object dmin;
    private String code;
    private String sources;
    private Object tz;
    private Object mmi;
    private String type;
    private String title;
    private String magType;
    private int nst;
    private int sig;
    private int tsunami;
    private Object mag;
    private Object alert;
    private int gap;
    private Object rms;
    private String place;
    private String net;
    private String types;
    private Object felt;
    private Object cdi;
    private String url;
    private String ids;
    private long time;
    private String detail;
    private long updated;
    private String status;

    public Object getDmin(){
        return dmin;
    }

    public String getCode(){
        return code;
    }

    public String getSources(){
        return sources;
    }

    public Object getTz(){
        return tz;
    }

    public Object getMmi(){
        return mmi;
    }

    public String getType(){
        return type;
    }

    public String getTitle(){
        return title;
    }

    public String getMagType(){
        return magType;
    }

    public int getNst(){
        return nst;
    }

    public int getSig(){
        return sig;
    }

    public int getTsunami(){
        return tsunami;
    }

    public int getMag(){
        return (int) mag;
    }

    public Object getAlert(){
        return alert;
    }

    public int getGap(){
        return gap;
    }

    public Object getRms(){
        return rms;
    }

    public String getPlace(){
        return place;
    }

    public String getNet(){
        return net;
    }

    public String getTypes(){
        return types;
    }

    public Object getFelt(){
        return felt;
    }

    public Object getCdi(){
        return cdi;
    }

    public String getUrl(){
        return url;
    }

    public String getIds(){
        return ids;
    }

    public long getTime(){
        return time;
    }

    public String getDetail(){
        return detail;
    }

    public long getUpdated(){
        return updated;
    }

    public String getStatus(){
        return status;
    }
}
