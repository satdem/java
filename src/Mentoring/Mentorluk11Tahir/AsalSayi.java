package Mentoring.Mentorluk11Tahir;

import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        //kullanıcıdab aldığımız bir sayının asal olup olmadığını bulunuz
        //girilen sayıya kadar olan asal sayıları yazdırın
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a=sc.nextInt();

        boolean isPrime=true;//country=sayac demek

        int sayac=2;
        while (sayac<a){
            if (a%sayac==0){
                isPrime=false;
                break;
            } sayac++;

        }
        if(isPrime==true) System.out.println("Sayı asal");
        else System.out.println("Asal değil");


    }
}
