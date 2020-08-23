package Gun36.Task2;

public class Banka {
    String kullanici;
    int password;
    int bakiye;

    public Banka(String kullanici, int bakiye, int password) {//sağ tuş Generate bas kısa yoldan oluştur
        // constructor ve toString için
        this.kullanici=kullanici;
        this.bakiye=bakiye;
        this.password=password;
    }
    public Banka(String kullanici, int bakiye){
        this(kullanici,bakiye,0);
    }
    public Banka(String kullanici){
        this(kullanici,0,0);
    }

    @Override
    public String toString() {
        return "Banka{" +
                "kullanici='" + kullanici + '\'' +
                ", password=" + password +
                ", bakiye=" + bakiye +
                '}';
    }
}
