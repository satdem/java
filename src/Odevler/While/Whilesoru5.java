package Odevler.While;

public class Whilesoru5 {
    public static void main(String[] args) {
        //5-Bir çalışanın başlangıç maaşı 2000 tl olsun.
        // her yıl %15 zam yapılırsa, 5 yıl sonra çalışanın maaşı kaç lira olur.
        double maas=2000;
        int sayac=0;
        while (sayac<5){
            maas=(maas*15/100)+maas;
            sayac++;
        }
        System.out.println("5 yıl sonra maasınız: "+maas);
    }
}
