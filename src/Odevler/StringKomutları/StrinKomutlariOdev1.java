package Odevler.StringKomutları;

import java.util.Scanner;

public class StrinKomutlariOdev1 {
    public static void main(String[] args) {
        /*1- Girilen 2 veya 3 kelimeli ad ve soyadların ilk harflerinin
        hepsini küçük ve daha sonra büyük hallerini yazdırınız.*/
        Scanner sc=new Scanner(System.in);

        System.out.print("Adınızı ve soyadınızı büyük harfle yazınız: ");
        String name=sc.nextLine();
        String namekucuk=name.toLowerCase();
        int isoyad=name.indexOf(" ");
        String ilkisim=name.substring(0,isoyad+1);
        String soyisim=name.substring(isoyad+1);
        String sonHaliad=ilkisim.replace(name.charAt(0),namekucuk.charAt(0));
        String sonHalisoyad=soyisim.replace(name.charAt(isoyad+1),namekucuk.charAt((isoyad+1)));
        System.out.println("isim: "+sonHaliad+sonHalisoyad);

      /*  System.out.print("Adınızı ve soyadınızı küçük harfle yazınız: ");
        String isim=sc.nextLine();
        String isimbuyuk=isim.toUpperCase();
        int i=isim.indexOf(" ");
        String ad=isim.substring(0,i);
        String soyad=isim.substring(i+1);
        String sonhal=ad.replace(isim.charAt(0),isimbuyuk.charAt(0))+" "+soyad.replace(isim.charAt(i+1),isimbuyuk.charAt(i+1));
        System.out.println("isminiz: " +sonhal);*/


    }
}
