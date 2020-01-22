package com.prak02;

import java.util.Scanner;

public class AngkaBerurutan {
    public static void main(String[] args) {
        int n, hasil = 0, tmp = 0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Masukkan angka: ");
            n = in.nextInt();
            hasil = hasil + n;

            if(n == tmp) {
                break;
            }
            tmp = n;
        }
        while (n != 0);

        if(n == 0) {
            System.out.println("Anda telah memasukkan angka 0");
        }
        else if(n == tmp) {
            System.out.println("Anda memasukkan angka " + n + " secara berurutan");
        }
        System.out.println("Hasil penjumlahan angka-angka tersebut adalah " + hasil);
    }
}