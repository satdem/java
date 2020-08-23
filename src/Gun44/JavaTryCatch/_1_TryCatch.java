package Gun44.JavaTryCatch;

import java.util.Scanner;

public class _1_TryCatch {
    public static void main(String[] args) {

       try {
           Scanner oku = new Scanner(System.in);
           System.out.print("1. Sayıyı giriniz: ");
           int a = oku.nextInt();
           System.out.print("2. Sayıyı giriniz: ");
           int b = oku.nextInt();

           int c = a / b;
           System.out.println("c = " + c);
       }
       catch (Exception hata){

           System.out.println("Hata Oldu!!!");
           //System.out.println("hata.getMessage() = " + hata.getMessage());
           //hata.printStackTrace();
           System.out.println("2. sayıyı 0 vermeyiniz");
       }
       //2. sayı 0 girildiğinde AritmeticException
        //2. sayı harf girildiğindeInputMismatchException hatası veriyor
    }
}
