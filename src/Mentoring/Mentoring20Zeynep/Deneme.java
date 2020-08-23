package Mentoring.Mentoring20Zeynep;

import java.util.HashSet;

public class Deneme {
    public static void main(String[] args) {
        /*main method altinda bir double hashSet olusturunuz.

    ve bu seti, adi setOlustur ve return tipi hashSet double olan

    ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.

    adini toplaminiAl koyacagimiz ve parametre olarak bir String hashSet kabul edecek ayri bir method olusturarak

    hashSetin degerlerinin toplamini alacaksiniz.*/
        HashSet<Double> hs=new HashSet<>();
        System.out.println("setOlustur(hs) = " + setOlustur(hs));
        System.out.println("toplaminiAl(hs) = " + toplaminiAl(hs));
        
        
    }
    public static HashSet<Double> setOlustur(HashSet<Double> hSet){
        hSet.add(3.23);
        hSet.add(3.10);
        hSet.add(5.12);
        hSet.add(10.12);
        hSet.add(23.12);
        return hSet;
    }
    public static Double toplaminiAl(HashSet<Double> hs){
        double toplam=0;
        for (Double d:hs) {
            toplam+=d;
        }
      return toplam;  
    }
    
}
