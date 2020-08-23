package Gun56.Ornek2;

public class Kartal extends hayvan{
    private static int kartalsayac;
    Kartal(){
       kartalsayac++;
       setId(hayvan.sayac++);
    }

    @Override
    void yemekMiktari() {
        System.out.println("günde 1 kuş");
    }

    @Override
    void yiyecegi() {
        System.out.println("et");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("8 saat");
    }

    @Override
    void sesi() {
        System.out.println("ciyak");
    }
    @Override
    public String toString() {
        return super.toString()+"\nkartal sayısı="+kartalsayac;
    }
}
