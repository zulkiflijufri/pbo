package com.prak03;

public class ContohMobil {
    public static void main(String[] args) {
        Mobil minibus = new Mobil();
        Mobil sedan = new Mobil();

        minibus.nama = "Minibus";
        minibus.jenis = "Avanza";
        minibus.merk = "Toyota";
        minibus.cc = 1300;

        sedan.nama = "Sedan";
        sedan.jenis = "City";
        sedan.merk = "Honda";
        sedan.cc = 1600;

        System.out.println(minibus.nama);
        System.out.println("Jenis: " + minibus.jenis);
        System.out.println("Merk: " + minibus.merk);
        System.out.println("CC: " + minibus.cc);
        System.out.println();
        System.out.println(sedan.nama);
        System.out.println("Jenis: " + sedan.jenis);
        System.out.println("Merk: " + sedan.merk);
        System.out.println("CC: " + sedan.cc);
    }
}
