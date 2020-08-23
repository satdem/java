package Mentoring.Meryem38.Ornek2;

public class benimHesabim extends Banka{
    public benimHesabim(double bakiye) {
        super(bakiye);
    }

    @Override
    double paraCekme(double paracek) {
        bakiye-=paracek;
        return bakiye;
    }

    @Override
    double paraYatir(double parayatir) {
        bakiye+=parayatir;
        return bakiye;
    }
}
