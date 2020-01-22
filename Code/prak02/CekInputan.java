package com.prak02;

import java.util.Scanner;

public class CekInputan {
    public static void main(String[] args) {
        int value;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer < 100 : ");
        value = in.nextInt();

        if(0 < value && value < 100)
        {
            System.out.println("Angka termasuk diantara 0 dan 100 yaitu : " + value);
        }

        while(value >= 100) {
            System.out.print("Enter an integer < 100 : ");
            value = in.nextInt();

            if(0 < value && value < 100)
            {
                System.out.println("Angka termasuk diantara 0 dan 100 yaitu : " + value);
            }
        }
    }
}
