package Mentoring.Samil32;

public class Baba extends Dede {

    boolean arabasivar;

    public Baba() {
        super();
    }

    public Baba(String isim) {
        super(isim);
    }

    @Override
    public String toString() {
        return "Baba{" +
                "arabasivar=" + arabasivar +
                ", boy=" + boy +
                ", torun=" + torun +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                ", meslek='" + meslek + '\'' +
                ", tatlisever=" + tatlisever +
                '}';
    }
}
