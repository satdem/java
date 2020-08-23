package Gun48.Extends2;

public class Hayvan {
    //Hayvan sınıfı superclass olmak üzere köpek,kedi,ve kuş sınıflarını üreteceğiz
    String renk;
    int kilo;
    String cinsi;

    public Hayvan(String renk, int kilo, String cinsi) {
        this.renk = renk;
        this.kilo = kilo;
        this.cinsi = cinsi;
    }

    public void konustu(){
        System.out.println("konustu...");
    }
    public void yemekYer(){
        System.out.println("yemek yer...");
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }
}
