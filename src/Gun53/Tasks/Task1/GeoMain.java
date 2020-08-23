package Gun53.Tasks.Task1;



public class GeoMain {
    public static void main(String[] args) {
        Diktortgen dd=new Diktortgen();
        Cember cember=new Cember();
        System.out.println("dikdörtgenin cevresi="+dd.cevresi(4,5));
        System.out.println("Dikdörtgenin alanı="+dd.alani(4,5));
        System.out.println("Cemberin cevresi= "+cember.cevresi(5));
        System.out.println("Cemberin alanı= "+cember.alani(5));

        Kare kare =new Kare();
        System.out.println("karenin cevresi = " + kare.cevresi(4,4));
        System.out.println("karenin alanı = " + kare.alani(4,4));
    }
}
