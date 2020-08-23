package Mentoring.Zeynep26.AccessModifier1;

public class AynipackageSinifi {
    public static void main(String[] args) {
        NeNedir erisim=new NeNedir();
        erisim.yas=5;
        erisim.numara=4.0;
        erisim.yiliYazdir();
        erisim.isim="Ayşe";
        

       double d= erisim.eyaletVergisi("100000,00$");
        System.out.println("d = " + d);



    }
}
