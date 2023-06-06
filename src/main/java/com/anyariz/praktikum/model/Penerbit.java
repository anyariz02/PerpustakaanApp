package com.anyariz.praktikum.model;

public class Penerbit {
    private int id;
    private String Penerbit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public void setPenerbit(String penerbit) {
        Penerbit = penerbit;
    }

    public Penerbit() {
    }

    public Penerbit(int id, String penerbit) {
        this.id = id;
        Penerbit = penerbit;
    }
}
