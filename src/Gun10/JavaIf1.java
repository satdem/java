package Gun10;

import java.util.Scanner;

public class JavaIf1 {
    public static void main(String[] args) {
        //Girilen bir sayının 10 dan büyük ise 10 dan büyük diye yazdırın
        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        int sayi=oku.nextInt();

        if(sayi>10) { //if içine yaılacaklar 1 satırdan fazlaise kesin küme parantezi kullanılmalı ,
            // 1 satır ise kullanmayabilirsin.
            System.out.println("girilen sayı 10 dan büyüktür.");
        }
    }
}
