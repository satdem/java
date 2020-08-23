package Gun55.Ornekler.Ornek2;

public class Cember extends Sekil{
    final double PI=3.14;
    private double yaricap;

    public Cember(double yaricap) {
        setYaricap(yaricap);
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    double AlanHesabi() {
        return PI*this.getYaricap()*getYaricap();
    }

    @Override
    double CevreHesabi() {
        return 2*PI*getYaricap();
    }
}
