package com.prak03;

public class Hewan {
    String nama;
    String warna;
    int kaki;

    public void suara(String nama, String suara) {
        System.out.println(nama + " memiliki suara " + suara);
    }

    public int getKaki() {
        return kaki;
    }

    public void setKaki(int kaki) {
        this.kaki = kaki;
    }
}
