package Mentoring.Meryem34.Yemekler;

public class siparisler {
    public static void main(String[] args) {
        yemekler anaYemek=new Anayemek("Özbek pilavı");
        System.out.println(anaYemek.siparis());

        yemekler salata=new Salata("Gevurdağ salatası");
        System.out.println(salata.siparis());

        yemekler tatli=new Tatlilar("Künefe");
        System.out.println(tatli.siparis());


    }
}
