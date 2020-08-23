package Mentoring.Samil32;

public class Dede extends BuyukDede{

    int boy;
    boolean baston;
    int torun;

    public Dede(String isim) {
        super(isim);
    }

    public Dede() {

    }

    @Override
    public String toString() {
        return "Dede{" +
                "boy=" + boy +
                ", baston=" + baston +
                ", torun=" + torun +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                ", meslek='" + meslek + '\'' +
                '}';
    }
}
