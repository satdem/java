package Gun51.JavaPolymorphism.Ornek2;

public class Calısan extends Kisi{
    private String departman;

    public Calısan(String ad, String soyad, String gorevi, String departman) {
        super(ad, soyad, gorevi);
        this.departman = departman;
    }

    public String getDepartman() {
        return departman;
    }
}
