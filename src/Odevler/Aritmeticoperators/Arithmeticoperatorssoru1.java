package Odevler.Aritmeticoperators;

import java.util.Scanner;

public class Arithmeticoperatorssoru1 {

    public static void main(String[] args) {
        //1.  Girilen bir sayının birler basamağını ekrana yazdırın
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a=sc.nextInt();
        a%=10;
        System.out.println("Sayının birler basamağı: " +a);
    }
}
