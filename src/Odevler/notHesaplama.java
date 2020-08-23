package Odevler;

import java.util.Scanner;

public class notHesaplama {
    public static void main(String[] args) {
        /*
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.
        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!
        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.
        5. final notu double değerinde olmalı. (örn: 65,5)
        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.
        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.
        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.

             todo    Koşul kısmı

    eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
    80(80dahil)   ile 90 arasında ise  BA,
    70(70 dahil)   ile 80 arasında ise BB,
    60(60dahil) ile 70 arasında ise CB,
    50(50 dahil) ile 60 arasında ise CC,
    40(40 dahil) ile 50 arasında ise DC,
    30(30 dahil) ile 40 arasında ise DD,
    30 'dan düşük ise FF            gelmeli.
 */
        Scanner sc=new Scanner(System.in);
        System.out.print("Vize notunuzu giriniz: ");
        double v=sc.nextDouble();
        System.out.print("Final notunuzu giriniz: ");
        double f=sc.nextDouble();
        System.out.print("Vize yüzdesini giriniz:");
        double vy=sc.nextDouble();
        System.out.print("Final yüzdesini giriniz: ");
        double fy=sc.nextDouble();
        double toplam=v*vy+f*fy;
        System.out.println("toplam: "+toplam);
        if(toplam>=90) System.out.println("Notunuz: AA");
        if (toplam>=70 && toplam<80) System.out.println("Notunuz: BA");
        if (toplam>=60 && toplam<70) System.out.println("Notunuz: BB");
        if (toplam>=50 && toplam<60) System.out.println("Notunuz: CB");
        if (toplam>=40 && toplam<50) System.out.println("Notunuz: CC");
        if (toplam>=30 && toplam<40) System.out.println("Notunuz: DC");
        if (toplam<30) System.out.println("Notunuz: FF");




    }
}
