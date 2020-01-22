package com.prak02;

import java.util.Scanner;

public class AngkaNol {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Masukkan angka 0: ");
            n = in.nextInt();
        }
        while (n != 0);

        System.out.println("Anda telah memasukkan angka 0");
    }
}
