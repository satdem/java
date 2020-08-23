package Gun23;

import java.util.Scanner;

public class JavaMetod5 {
    public static int Ort(int...sayilar){
        int toplam=0;
        int ort=0;
        for (int i = 0; i <sayilar.length ; i++) {
            toplam+=sayilar[i];
            ort=toplam/sayilar.length;

        }
        return ort;
    }
    public static void main(String[] args) {
        //kullanıcı bir öğretmendir. önce öğrencinin adı girilecek
        // ve sonra akdığı farklı notlar girilecek
        //Ahmet Demir bu okunduktan sonra
        //80 56 78 90 okutulacak ve öğrnci adı ve ort yazdırılacak
        //ort bulma işlemi bir fonksiyonda yapınız ,fakat sonucu main de yazdırın
        //her öğrnci için farklı sayıda not girilebilir
        Scanner oku=new Scanner(System.in);
        System.out.print("Öğrencinin adını ve soyadını giriniz: ");
        String adSoyad=oku.nextLine();
        System.out.println("Öğrencinin notlarını arasına bir boşluk bırakarak giriniz:");
        String snotlar=oku.nextLine();
        String[] dnotlar=snotlar.split(" ");
        int[] notlar=new int[dnotlar.length];
        for (int i = 0; i <dnotlar.length ; i++) {
            notlar[i]=Integer.parseInt(dnotlar[i]);

        }
        int ortalama=Ort(notlar);
        System.out.println(adSoyad +" ortlaması: "+ortalama);

       /* System.out.print("Öğrencinin Adı Soyadı="); //hocanın yöntemi
        String isim=oku.nextLine();

        System.out.print("Öğrencinin notları=");
        String strNotlar=oku.nextLine(); // 60 40 70 80

        System.out.println("Öğrenci = " + isim);
        System.out.println("Ortalaması = " + ortalamaBul(strNotlar));
    }

    public static double ortalamaBul(String notlar)
    {
        double toplam=0;
        String[] notDizi=notlar.split(" ");

        for(int i=0;i<notDizi.length;i++)
        {
            toplam += Integer.parseInt(notDizi[i]);
        }

        return toplam/notDizi.length;*/


    }


}
