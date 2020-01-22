package com.prak02;

import java.util.Scanner;

public class HitungN {
    public static void main(String[] args) {
        int n, hasil = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Hitung jumlah dari 1 - n, dengan nilai n: ");
        n = in.nextInt();

        for (int i = 1; i<=n; i++) {
            hasil = hasil + i;
        }

        System.out.println("Hasil penjumlahan dari 1 sampai " + n + " adalah " + hasil);
    }
}
