package Gun48.Extends3;

public class Calisan {
    private String isim;//buna diğer class lardan ulaşamıyoruz.çünkü private
    //sadece get ve set ile ulaşabiliyoruz
    protected double maas;//sadece bu sınıftan türetilenler ulaşabilir.
    int maasKatsayisi;

    public Calisan(String ismi, double maas, int maasKatsayisi) {
        this.isim = ismi;
        this.maas = maas;
        this.maasKatsayisi = maasKatsayisi;
    }
    public double maasHesapla(){
        return this.maas*maasKatsayisi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "ismi='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +
                '}';
    }
}
