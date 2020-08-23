package Odevler.While;

import java.util.Scanner;

public class Whilesoru1 {

    public static void main(String[] args) {
        //1-  Girilen 10 adet sayıdan tek olanları ve çift olanların miktarlarını ayrı ayrı bularak yazdırınız.
        Scanner sc=new Scanner(System.in);
        int sayac=1;
        int s1=0;
        int s2=0;
        while (sayac<=10 ){

            System.out.print("Bir sayı giriniz:");
            int a=sc.nextInt();
            if(a%2==0) s1++;
            else s2++;
            sayac++;

        }
        System.out.println("Tek sayılar = " +s2 +" adettir");
        System.out.println("Çift sayılar = " +s1 +" adettir");
    }
}
