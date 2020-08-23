package Gun48.Extends3;

public class GenelMudur extends Calisan{
    double tazminat;

    public GenelMudur(String ismi, double maas, int maasKatsayisi,double tazminat) {
        super(ismi, maas, maasKatsayisi);
        this.tazminat=tazminat;
    }

    @Override
    public double maasHesapla() {
        return super.maas*maasKatsayisi*this.tazminat;
        //return super.maasHesaplama()*this.tazminat; da yazabilirim
    }

    @Override
    public String toString() {
        return "GenelMudur{" +
                "tazminat=" + tazminat +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +
                '}';
    }
}
