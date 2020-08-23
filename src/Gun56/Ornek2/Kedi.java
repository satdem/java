package Gun56.Ornek2;

import Gun51.JavaPolymorphism.Ornek1.Hayvan;

public class Kedi extends hayvan{
    private static int kedisayac;
    Kedi(){
        kedisayac++;
        setId(hayvan.sayac++);
    }

    @Override
    void yemekMiktari() {
        System.out.println("100gr");
    }

    @Override
    void yiyecegi() {
        System.out.println("kedi maması ,balık,süt");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("10 saat");
    }

    @Override
    void sesi() {
        System.out.println("miyav");
    }

    @Override
    public String toString() {
        return super.toString()+"\nkedi sayısı="+kedisayac;
    }
}
