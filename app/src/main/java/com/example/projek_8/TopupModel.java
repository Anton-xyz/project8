package com.example.projek_8;

public class TopupModel {

    private int image;
    private String jumlah;
    private String harga;

    public TopupModel(int image, String jumlah, String harga) {
        this.image = image;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public int getImage() {
        return image;
    }

    public String getJumlah() {
        return jumlah;
    }

    public String getHarga() {
        return harga;
    }
}