package Gun17;

import java.util.Scanner;

public class GununSorusu1 {
    public static void main(String[] args) {
        //2- bilgisayar 0-10 arası sayı tutsun(Random).
        // Kullanıcıdan en fazla 3 hak vererek sayıyı bulmasını isteyiniz.Bulduğunda tebrikler yazsın
        Scanner sc=new Scanner(System.in);
        int sayac=1;
        int tutulanSayi=(int)(Math.random()*10)+1;
        while (sayac<=3){// for(int sayac=0;sayac<=3;sayac++) şeklinde de yapılır

            System.out.print("Sayıyı tahmin ediniz:");
            int tahmin=sc.nextInt();
            if(tutulanSayi==tahmin){
                System.out.println("Tebrikler!");break;

            }else System.out.println("tekrar dene");
            sayac++;
        }
        if(sayac==4)
        System.out.println("Bulamadınız. Tutulan sayı= "+tutulanSayi);
    }
}
