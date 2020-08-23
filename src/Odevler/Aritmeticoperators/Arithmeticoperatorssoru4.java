package Odevler.Aritmeticoperators;

import java.util.Scanner;

public class Arithmeticoperatorssoru4 {
    public static void main(String[] args) {
        //4.  girilen 3 basamaklı bir sayının basamakları toplamını ekrana yazdırın
        Scanner sc=new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz: ");
        int a=sc.nextInt();
        int birler=a%10;
        int onlar=a%100;
        onlar/=10;
        int yuzler=a%1000;
        yuzler/=100;
        System.out.println("Rakamlar toplamı=" +(birler+onlar +yuzler));
    }
}
