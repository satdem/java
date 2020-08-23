package Gun50.Task1;

public class Ogrenci extends Kisi{

    private double ucret;
    public Ogrenci(String isim, String adres, Okul okul, UyeTipi uyeTipi, double ucret) {
        super(isim, adres, okul, uyeTipi);
        setUcret(ucret);
    }

    public double getUcret() {
        return ucret;
    }

    public void setUcret(double ucret) {
        this.ucret = ucret;
    }

    @Override
    public String toString() {
        return super.toString()+", ücret="+getUcret();
    }
}
