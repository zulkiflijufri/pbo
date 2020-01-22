package com.prak04;

public class Contohnya {
    void contoh(int a, int b) {
        System.out.println("ini kasus pertama dengan nilai : " +a+ " dan " +b);
        //Kasus pertama sudah benar
    }
    void contoh(int a, int b, int c) {
        //System.out.println(ini kasus kedua dengan nilai : " +a+ " dan  "+b+" dan " + c);
        //Kasus kedua tidak ada tanda petik dua sebelum kata ini, seharusnya :
        System.out.println("ini kasus kedua dengan nilai : " +a+ " dan "+b+" dan " +c);
    }
    void contoh(double x, int y) {
        //Kasus ketiga terjadi error karena pada method pertama sudah terdapat argumen keduanya int
        //Maka harus ada perubahan di method ketiga, salah satu contohnya mengganti parameter pertama dengan double
        System.out.println("ini kasus ketiga dengan nilai : " +x+ " dan " +y);
    }
    void contoh(String a, int b) {
        System.out.println("ini kasus keempat dengan nilai : " +a+ " dan " +b);
        //Kasus keempat sudah benar
    }
    void contoh(int b, String a) {
        //System.out.println("ini kasus kelima dengan nilai : +a+ " dan " +b);
        //Kasus kelima terjadi error karena tidak terdapat tanda petik sebelum memasukkan variabel a, seharusnya:
        System.out.println("ini kasus kelima dengan nilai : " +a+ " dan "+b);
    }
}
