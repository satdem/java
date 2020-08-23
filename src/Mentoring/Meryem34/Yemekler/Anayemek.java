package Mentoring.Meryem34.Yemekler;

public class Anayemek extends yemekler{
    public Anayemek(String isim) {
        super(isim);
    }

    @Override
    public String siparis() {
        return getIsim()+" alabilir miyim?";
    }
}
