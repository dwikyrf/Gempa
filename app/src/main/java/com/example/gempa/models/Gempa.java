package com.example.gempa.models;

public class Gempa {

    String gambar;
    String lokasi;
    String tanggal;
    String sr;

    public Gempa(Object o, int i, String padang, String s, String s1){ }

    public Gempa(String gambar, String lokasi, String tanggal, String sr) {
        this.gambar = gambar;
        this.lokasi = lokasi;
        this.tanggal = tanggal;
        this.sr = sr;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getSr() {
        return sr;
    }

    public void setSr(String sr) {
        this.sr = sr;
    }
}
