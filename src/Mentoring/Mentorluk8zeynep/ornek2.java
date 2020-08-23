package Mentoring.Mentorluk8zeynep;

import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {
        //konsoldan belirlenen max ve min değerlerinin istenen random aralığında yazdırın
        Scanner sc=new Scanner(System.in);
        System.out.print("Max değerini giriniz: ");
        int max=sc.nextInt();
        System.out.print("Min değerini giriniz: ");
        int min=sc.nextInt();
        int random=(int)(Math.random()*(max-min)+1)+min;
        System.out.println("random = " + random);
    }
}
