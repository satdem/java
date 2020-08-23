package Mentoring.Samil32;

public class Ev {
    public static void main(String[] args) {
        BuyukDede buyukDede = new BuyukDede();//ctrl+alt+v kısa yol tanımlamak için

        buyukDede.isim="Hacı Ahmet";
        buyukDede.soyisim="kaya";
        buyukDede.yas=100;
        buyukDede.meslek="Çiftçi";
        buyukDede.tatlisever=true;
        System.out.println(buyukDede);
        System.out.println("-------------------------------");
        
        Dede dede = new Dede("Mustafa");
        dede.boy=175;
        dede.torun=15;
        dede.baston=false;
        System.out.println("dede = " + dede);


    }
}
