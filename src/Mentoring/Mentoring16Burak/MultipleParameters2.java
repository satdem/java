package Mentoring.Mentoring16Burak;

public class MultipleParameters2 {
    public static void main(String[] args) {
        // todo metodların kullanımmantığı
        selamlama();
        soruBasliklari(1);
        cizgiler();
        soru1();
        soruBasliklari(2);
        cizgiler();
        soru2();



    }public static void selamlama(){
        System.out.println("Kahve dükkanına hoş geldiniz: ");
    }
    public static void cizgiler(){
        System.out.println("-------------------------------------");
    }
    public static void soruBasliklari(int sayi){
        System.out.println("\nSoru"+sayi+" : ");

    }
    public static void soru1(){
        System.out.println("Kahveniz nasıl olsun?");
    }
    public static void soru2(){
        System.out.println("Burada mı i.mek istersiniz yoksa to go mu?");

    }

}
