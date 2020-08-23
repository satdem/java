package Odevler.Switch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class switchodev2 {
    public static void main(String[] args) {
        //2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız.
        Scanner sc=new Scanner(System.in);
        System.out.print("Üç basamaklı bir sayı giriniz: ");
        int a=sc.nextInt();

        int birler=a%10;
        int onlar=(a/10)%10;
        int yuzler=(a/100)%10;
        String birlery,onlary ,yuzlery;
        yuzlery=" ";
        onlary=" ";
        birlery=" ";


        switch (birler){
            case 0: birlery="";break;
            case 1: birlery="bir";break;
            case 2: birlery="iki";break;
            case 3: birlery="üç";break;
            case 4: birlery="dört";break;
            case 5: birlery="beş";break;
            case 6: birlery="altı";break;
            case 7: birlery="yedi";break;
            case 8: birlery="sekiz";break;
            case 9: birlery="dokuz";break;

        }
         switch (onlar){
             case 0: onlary="";break;
             case 1: onlary="on";break;
             case 2: onlary="yirmi";break;
             case 3: onlary="otuz";break;
             case 4: onlary="kırk";break;
             case 5: onlary="elli";break;
             case 6: onlary="altmış";break;
             case 7: onlary="yetmiş";break;
             case 8: onlary="seksen";break;
             case 9: onlary="doksan";break;

         }
         switch (yuzler){
             case 0: yuzlery="";break;
             case 1: yuzlery="yüz";break;
             case 2: yuzlery="ikiyüz";break;
             case 3: yuzlery="üçyüz";break;
             case 4: yuzlery="dörtyüz";break;
             case 5: yuzlery="beşyüz";break;
             case 6: yuzlery="altıyüz";break;
             case 7: yuzlery="yediyüz";break;
             case 8: yuzlery="sekizyüz";break;
             case 9: yuzlery="dokuzyüz";break;

         }
        System.out.println("sayı: " +yuzlery+" "+onlary+" "+birlery);
    }
}
