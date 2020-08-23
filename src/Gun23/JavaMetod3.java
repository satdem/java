package Gun23;

public class JavaMetod3 {
    // METODLARDA OVEERLOADİNG Denir
    public static int toplam(int a,int b){
        return a+b;
    }
    public static int toplam(int a,int b,int c){
        return a+b+c;
    }
    public static double toplam(double a,double b){
        return a+b;
    }
    public static double toplam(double a,int b){
        return a+b;
    }
    public static void KllaniciBilgiAl(String ad,int yas){
        System.out.println(ad+" "+yas);
    }
    public static String KllaniciBilgiAl(int yas,String ad){//şeklinde de yazabilirim
        System.out.println(ad+" "+yas);
        return ad+" "+yas;
    }

    public static void main(String[] args) {
        int sayi1=5;
        int sayi2=6;
        int sayi3=78;
        //parametre tipin farklı olduğu durumlarda aynı isim kullanılabilir
        int sonuc=toplam(sayi1,sayi2);
        int sonuc2=toplam(sayi1,sayi2,sayi3);

        double dsayi1=4.2;
        double dsayi2=6.4;
        double sonuc3=toplam(dsayi1,dsayi2);
        //************************************************************************

        //parametrelerin tip sırası farklı olduğunda da aynı isim kullanılır
        KllaniciBilgiAl(34,"Ahnet");
        KllaniciBilgiAl("Ahmet",34);

    }
}
