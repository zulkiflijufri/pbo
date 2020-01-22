package com.prak02;

import java.util.Scanner;

public class HitungAngka {
    public static void main(String[] args) {
        int n,hasil = 0;

        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Masukkan angka 0: ");
            n = in.nextInt();
            hasil = hasil + n;
        }
        while (n != 0);

        System.out.println("Anda telah memasukkan angka 0");
        System.out.println("Hasil penjumlahan sebelum angka 0: " + hasil);
    }
}
