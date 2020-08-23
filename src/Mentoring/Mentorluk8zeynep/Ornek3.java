package Mentoring.Mentorluk8zeynep;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        //Math.random() kullanarak cikan sayinin cift ya da tek sayi olup olmamasini kontrol edin
        //Cif sayi ise sift sayi oldugunu, tek ise tek sayi oldugunu yazdiriniz
        Scanner sc=new Scanner(System.in);
        System.out.print("Max değerini giriniz: ");
        int max=sc.nextInt();
        System.out.print("Min değerini giriniz: ");
        int min=sc.nextInt();
        int random=(int)(Math.random()*(max-min)+1)+min;
        if(random%2==0) System.out.println(random+":sayı çift");
        else System.out.println(random+":sayı tek");
        /*2. yol: String text=(sayi%2==0)? "cift sayı":"tek sayı";
        System.out.println(text);
         */
    }
}
