package com.prak02;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int a = 0;
        Scanner baru = new Scanner(System.in);
        System.out.print("Masukkan satu angka dari angka 1 sampai 3 : ");
        a = baru.nextInt();
        switch(a)
        {
            case 1:
                System.out.println("Ini angka satu");
                break;
            case 2:
                System.out.println("Ini angka dua");
                break;
            case 3:
                System.out.println("Ini angka tiga");
                break;
            default:
                System.out.println("Maaf angka yang dimasukkan tidak sesuai");
        }
    }
}
