package Odevler.While;

import java.util.Scanner;

public class WhileSoru2 {
    public static void main(String[] args) {
        //2- bilgisayar 0-10 arası sayı tutsun(Random).
        // Kullanıcıdan en fazla 3 hak vererek sayıyı bulmasını isteyiniz.Bulduğunda tebrikler yazsın
        Scanner sc=new Scanner(System.in);
        int random=(int)(Math.random()*(10+1));
        int sayac=0;
        while (sayac<3){
            System.out.print("Bir sayı giriniz: ");
            int a=sc.nextInt();
            sayac++;

            if(random==a)
            System.out.println("Tebrikler!");

        }
        System.out.print("random = " + random);
    }
}
