package Mentoring.Meryem34.Yemekler;

public class Tatlilar extends yemekler{

    public Tatlilar(String isim) {
        super(isim);
    }

    @Override
    public String siparis() {
        return getIsim()+" alalım.";
    }
}
