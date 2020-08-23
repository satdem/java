package Mentoring.Meryem34.Yemekler;

public class Salata extends yemekler{
    public Salata(String isim) {
        super(isim);
    }

    @Override
    public String siparis() {
        return getClass().getSimpleName()+"'dan "+getIsim()+" alabilir miyim?";
               //class ismini alıyor(salata' dan)
    }
}
