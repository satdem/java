package Gun53.Ornekler.Ornek2;

public class Grafikler {
    public static void main(String[] args) {

       //bir interface den bir çok class implemente edilebilir
        Cember cember = new Cember();
        Dikdortgen dikdortgen = new Dikdortgen();

        cember.ciz();
        dikdortgen.ciz();

        //interface lerden nesne üretilemez.fakat referans tipi oluşturulabilir
        //bu bize polymorphism sağladı
        ICizilebilir cember2=new Cember();
        cember2.ciz();
    }
}
