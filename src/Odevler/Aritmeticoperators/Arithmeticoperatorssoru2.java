package Odevler.Aritmeticoperators;

import java.util.Scanner;

public class Arithmeticoperatorssoru2 {
    public static void main(String[] args) {
        //2.  Girilen bir sayının onlar basamağını ekrana yazdırınız
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a=sc.nextInt();
        a%=100;
        int b=a/10;
        System.out.println("sayının onlar basamağı: " +b);


    }
}
