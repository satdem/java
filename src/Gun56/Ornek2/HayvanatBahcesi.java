package Gun56.Ornek2;

import java.time.LocalDate;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kedi kedi=new Kedi();
        kedi.setName("Köpük");
        kedi.setVahsi(false);
        kedi.setDogumTarihi(LocalDate.of(2018,1,5));

        kedi.yiyecegi();
        kedi.yemekMiktari();
        kedi.gunlukUykuSuresi();
        kedi.sesi();
        System.out.println("kedi = " + kedi);


        System.out.println("------------------");

        Kartal kartal=new Kartal();
        kartal.setName("Gezgin");
        kartal.setVahsi(true);
        kartal.setDogumTarihi(LocalDate.of(2018,1,5));
        kartal.yiyecegi();
        kartal.yemekMiktari();
        kartal.gunlukUykuSuresi();
        kartal.sesi();
        System.out.println("kartal = " + kartal);

        System.out.println("-------------------");
        Kedi kedi2=new Kedi();
        kedi2.setName("Köpük");
        kedi2.setVahsi(false);
        kedi2.setDogumTarihi(LocalDate.of(2018,1,5));
        kedi2.yiyecegi();
        kedi2.yemekMiktari();
        kedi2.gunlukUykuSuresi();
        kedi2.sesi();
        System.out.println("kedi2= " + kedi2);


    }
}
