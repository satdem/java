package Gun22;

import java.util.Scanner;

public class JavaMethods6 {
    // VOID geriye birşey göndermeyen (yani return) olmayan demek
    //eğer return yapacaksam int olmalı
    public static int toplamYaz(int s1,int s2){
        int toplam=s1+s2;
        return toplam;
    }
    public static int enBuyukYaz(int s1,int s2){
        if(s1>s2)
            return s1;
        else
            return s2;
        // return Math.max(s1,s2) ile aynı işlemi yapıyor
    }


    public static void main(String[] args) {
        // kullanıcıdan 2 sayı isteyiniz ,toplamını bir metodda yaptırıp main de yazdrınız
        Scanner sc=new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int sayi1=sc.nextInt();
        System.out.println("2.sayıyı giriniz");
        int sayi2=sc.nextInt();

        toplamYaz(sayi1,sayi2);//fonk daki değişken isimleri verilen ile aynı olmak zorunda değil.
        // cinsleri aynı olmalı
        int enbuyuk=enBuyukYaz(sayi1,sayi2);//math.max ile aynı görevde


    }
}
