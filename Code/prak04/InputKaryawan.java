package com.prak04;

public class InputKaryawan {
    public static void main(String[] args) {
        Pendataan p1 = new Pendataan("mukhlis", "Margonda", 25,"mukhlis@123.com","05060708");
        Pendataan p2 = new Pendataan("Mahmud", "Lenteng", 23,"mahmud@123.com","05060709");
        Pendataan p3 = new Pendataan("udin katagawa", "Jepang", 21,"udinK@123.com","05060710");

        System.out.println("Sebelum Id karyawan diubah");
        p1.tampil();
        p2.tampil();
        p3.tampil();

        p1.setId("80706050");
        p2.setId("90706050");
        p3.setId("01706050");

        System.out.println("Setelah Id karyawan diubah");
        p1.tampil();
        p2.tampil();
        p3.tampil();
    }
}
