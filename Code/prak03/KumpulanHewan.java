package com.prak03;

public class KumpulanHewan {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        hewan.suara("Kucing", "Meoongg");
        hewan.setKaki(4);
        System.out.println("Kucing memiliki " + hewan.getKaki() + " kaki");
    }
}
