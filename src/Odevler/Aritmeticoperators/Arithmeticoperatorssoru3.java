package Odevler.Aritmeticoperators;

import java.util.Scanner;

public class Arithmeticoperatorssoru3 {
    public static void main(String[] args) {
        //3.  Girilen bir sayının yüzler basamağını ekrana yazdırınız
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a=sc.nextInt();
        a%=1000;
        int b=a/100;
        System.out.println("Sayının yüzler basamağı: " +b);

    }
}
