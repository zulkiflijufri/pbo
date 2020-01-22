package com.prak04;
public class Pendataan {
    String nama;
    String alamat;
    int usia;
    String email;
    private String id;

    Pendataan(String nama, String alamat, int usia, String email, String id) {
        this.nama = nama;
        this.alamat = alamat;
        this.usia = usia;
        this.email = email;
        this.id = id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void tampil(){
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia);
        System.out.println("Email: " + email);
        System.out.println("Id: " + id);
        System.out.println();
    }
}