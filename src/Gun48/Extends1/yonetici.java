package Gun48.Extends1;

public class yonetici {
    String ad;
    String soyad;
    int yas;
    double maas;
    String departman;
    int sicilNo;
    int baglıPersonelSayisi;
    double gorevTazminati;

    public double getMaas() {
        return this.maas;
    }
    public void zamYap(int yuzde){
        System.out.println(yuzde+" zam yapıldı");
    }
}
