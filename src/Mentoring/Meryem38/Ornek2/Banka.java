package Mentoring.Meryem38.Ornek2;

public abstract class Banka {
    double bakiye;

    public Banka(double bakiye) {
        this.bakiye = bakiye;
    }
    public Banka() {
        System.out.println("Hesap hareketleri");
    }

    abstract double paraCekme(double paracek);
    abstract double paraYatir(double parayatir);

}
