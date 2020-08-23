package Odevler.dateTime2;

import java.time.LocalDate;
import java.util.Scanner;

public class Taksit {
    /*Günün Sorusu : // Müşterinin alacağı bir ürün için taksit yapılcacaktır.
// Kullanıcıdan Alıncak olan malın ücret bilgisini ve kaç taksit olacağı bilgisini alınız.
// Taksit rakamları kuruşlu çıkıyorda kuruşlar toplanıp, son taksite eklensin.
// Günün tarihine göre 1 ay atlatarak oluşan taksit tarihi ve ödencek taksit miktarının listesini yazdırınız.
*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ürünün fiyatını yazınız: ");
        double fiyat=sc.nextDouble();

        System.out.print("Kaç taksit yapılmasını istiyorsunuz: ");
        int taksitSayisi=sc.nextInt();


            double dTaksit=fiyat/taksitSayisi;
            int iTaksit= (int) (fiyat/taksitSayisi);
            double fark=dTaksit-iTaksit;
            double sonTaksit=iTaksit+fark*taksitSayisi;

            LocalDate taksitBaslangic=LocalDate.now();
            System.out.println("taksitBaslangic = " + taksitBaslangic);

            LocalDate sonTaksitTarihi=taksitBaslangic.plusMonths(taksitSayisi);
            System.out.println("sonTaksitTarihi = " + sonTaksitTarihi);

            for (int i = 1; i < taksitSayisi; i++) {
            System.out.println(i+".Taksit Tarihi: "+taksitBaslangic.plusMonths(i)+" ve Miktarı: "+iTaksit);

            }

            System.out.println(taksitSayisi+".Taksit tarihi: "+sonTaksitTarihi+" ve Miktarı: "+sonTaksit);

    }
}
