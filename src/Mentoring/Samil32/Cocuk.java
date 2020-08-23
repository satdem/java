package Mentoring.Samil32;

public class Cocuk extends Baba {
    boolean bisikletvar;

    public Cocuk() {
    }

    @Override
    public String toString() {
        return "Cocuk{" +
                "bisikletvar=" + bisikletvar +
                ", boy=" + boy +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                '}';
    }

    public Cocuk(String isim) {
        super(isim);
    }


}
