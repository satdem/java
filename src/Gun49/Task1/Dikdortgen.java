package Gun49.Task1;

public class Dikdortgen extends sekil{
    private double en;
    private double boy;

    public Dikdortgen(double en, double boy) {
        this.en = en;
        this.boy = boy;
    }


    @Override
    public String toString() {
        return "Dikdortgen{" +
                "en=" + en +
                ", boy=" + boy +
                "alan="+getAlan()+
                "cevre="+getCevre()+
                '}';
    }

    @Override
    public double getAlan() {
        return this.en*this.boy;
    }

    @Override
    public double getCevre() {
        return 2*(this.en+this.boy);
    }
}
