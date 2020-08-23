package Odevler.Aritmeticoperators;

import java.util.Scanner;

public class Arithmeticoperatorssoru5 {
    public static void main(String[] args) {
        //5.  Girilen 3 basamaklı bir sayının basamaklarına göre tersini bir sayı olarak ekrana yazdırın(orn:543 345 olcak)

        Scanner sc=new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz: ");
        int a=sc.nextInt();
        int birler=a%10;
        int onlar=a%100;
        onlar/=10;
        int yuzler=a%1000;
        yuzler/=100;
        System.out.println("Sayının tersten yazılışı:"+birler+onlar+yuzler);


    }
}
