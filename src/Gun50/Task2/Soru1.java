package Gun50.Task2;
//girilen bir sayının basamaklarına göre tersini yazdırınız

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi=oku.nextInt();
        int tersiSayi=0;
        while (sayi>0){
          int kalan=sayi%10;
          tersiSayi=tersiSayi*10+kalan;
          sayi=sayi/10;
        }
        System.out.println("tersiSayi = " + tersiSayi);


    }

}

