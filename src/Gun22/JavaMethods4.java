package Gun22;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMethods4 {
    // String şeklinde aralarında boşluklarla girilen bir dizinin
    // enbüyük, enküçük elemanını, bütün elemanların toplamını,
    // sayıların ortalamasını ayrı ayrı metodlarda yapınız.
    // 3 4 12 45 67  gibi giriş yapılacak.
    public static void enBuyukYaz(int[] dizi){
        Arrays.sort(dizi);
        System.out.println("enb= "+dizi[dizi.length-1]);
    }
    public static void enKucukYaz(int[] dizi){
        Arrays.sort(dizi);
        System.out.println("enk= "+dizi[0]);
    }
    public static void tumToplam(int[] dizi){
        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            toplam+=dizi[i];
        }
        System.out.println("Toplam= "+toplam);
    }
    public static void ortalamyaz(int[] dizi)
    {
        int toplam=0;
        for(int i=0;i<dizi.length;i++) {
            toplam += dizi[i];
        }
        System.out.println("ortalama = " + toplam/dizi.length );
    }

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("sayıları bir boşluk bırakarak yazınız");
        String strTumSayilar=oku.nextLine();

        String[] strdizi=strTumSayilar.split(" ");
        int[] intdizi=new int[strdizi.length];

        for (int i = 0; i <strdizi.length ; i++) {
            intdizi[i]=Integer.parseInt(strdizi[i]);
        }
        System.out.println(Arrays.toString(intdizi));

        enBuyukYaz(intdizi);
        enKucukYaz(intdizi);
        tumToplam(intdizi);
        ortalamyaz(intdizi);
    }
}
