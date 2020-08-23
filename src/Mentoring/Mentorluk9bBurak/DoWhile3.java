package Mentoring.Mentorluk9bBurak;

import java.util.Scanner;

public class DoWhile3 {
    public static void main(String[] args) {
        //  girilen bir sayının rakamları toplamını bulun
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi=sc.nextInt();
        int toplam=0;

        do {
            toplam+=sayi%10;
            sayi=sayi/10;
            System.out.println(" basamağın toplamı = " + toplam+" kalan sayı "+sayi);
        }
        while (sayi>0);
        System.out.println("toplam = " + toplam);
    }
}
