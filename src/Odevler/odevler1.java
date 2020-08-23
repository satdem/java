package Odevler;

public class odevler1 {
    public static void main(String[] args) {
        System.out.println("--------------------1--------------------");
        //1.En sevdiğiniz 3 meyveyi alt alta yazdırınız.

        System.out.println("Karpuz\nKavun\nKiraz");
        System.out.println("--------------------2--------------------");
        //2.Yukarıda yazdırmış olduğunuz meyveleri, başında tırnak işareti ile yazdırınız.
        System.out.println("\"Karpuz\"");
        System.out.println("\"Kavun\"");
        System.out.println("\"Kiraz\"");
        System.out.println("--------------------3--------------------");

       /* 3.Bir String oluşturun ve ismi    'marka' olsun.
        String marka  nın değeri, kullandığınız telefonun markasın olsun.
        String marka 'yı print edin.*/
        String marka= "Iphone";
        System.out.println("marka = " + marka);
        System.out.println("--------------------4--------------------");

        /* 4.String ad        oluşturun. -- Değeri kendi isminiz olsun.
           String soyad  oluşturun-- Değeri kendi soyisminiz olsun.
           int yas              oluşturun. -- Değeri kendi yaşınız olsun.
           Konsolda aynen şu yazmalı:             Benim adım Ömer Özdemir'dir ve ben 23 yaşındayım.
           not:  (Kendi bilgilerim ile örnek verdim, siz kendi bilgileriniz ile dolduracaksınız...
           Oluşturduğunuz String ve int değerlerini kullanın!.)*/
        String ad="Satı";
        String soyad="Demirci";
        int yas=41;
        String yazi="Benim adım "+ad+" "+soyad+"'dir ve ben "+yas+" yaşındayım.";
        System.out.println(yazi);
        System.out.println("--------------------5--------------------");
        /* 5. int a  oluşturun. Değeri 25
            int b oluşturun. Değeri  50
            bu iki integeri toplayın ve sonucu yazdırın.
            konsolda şöyle yazmalı: 25 + 50 = 75*/
            int a=25;
            int b=50;
            int toplam=a+b;
        System.out.println(a +" + "+b+" = "+toplam);
        System.out.println("--------------------6--------------------");
        /* 6.short s oluşturun. Değeri 15 olsun.
           short h oluşturun. değeri 30 olsun.
           Bu iki short 'un toplamını  short toplam ' a eşitleyin.
           short toplamı yazdırın.*/
        short s=15;
        short h=30;
        short toplam1=(short)(s+h);
        System.out.println("toplam1 = " + toplam1);
        System.out.println("--------------------7--------------------");
        /*7.double aylik oluşturun. -- Değeri 30.5 olsun.
           int  aySayisi oluşturun. -- değeri 9 olsun.
           Aylık 30.5 Euro olan fitness salonuna 9  aylık kayıt yaptırıyorsunuz.
           double toplamFiyat   oluşturun ve sonucu yazdırın.     (Çarpma işlemi        *    ile yapılır. )
           Örn: Konsolda şöyle yazmalı:                    Toplam fiyat : 274.5 Euro*/
         double aylik=30.5;
         int aySayisi=9;
         double toplamFiyat=aylik*aySayisi;
        System.out.println("Toplam fiyat : " + toplamFiyat +" Euro") ;
        System.out.println("--------------------8--------------------");
        /*8.int number1 oluşturun ve değeri 100 olsun.
         double number2 oluşturun ve değeri 67.7  olsun.
         short number 3 oluşturun ve değeri 44 olsun.
         Bu 3 değişkeni birbiri ile toplayın ve double toplam2 ' ye eşitleyin.
         toplam2 yi Stringe dönüştürün.
         String i yazdırın.*/
        int number1=100;
        double number2=67.7;
        short number3=44;
        double toplam2=number1+number2+number3;
        String i=Double.toString(toplam2);
        System.out.println("Stringim: "+i);
        System.out.println("--------------------9--------------------");
        /* 9.int k oluşturun ve değeri 40 olsun.
          int l oluşturun ve değeri k'nın değerinin 2 katı olsun.         (Direkt 80 yazmayın, denklem kurarak yazın)  (Çarpma işlemi   *  simgesi ile yapılır)
          int m oluşturun ve  değeri, int k ile int l ' nin toplamdan 35 eksik olsun.
          int sonuc oluşturun ve bu üç değişkeni birbiri ile toplayın.
          sonucu double s 'a döndürün ve
          double sonuc'u yazdırın.*/
        int k=40;
        int l=2*k;
        int m=k+l-35;
        int sonuc=k+l+m;
        double S=sonuc;
        System.out.println("S = " + S);



    }
}
