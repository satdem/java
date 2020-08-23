package Gun49.Task1;

public class Kare extends Dikdortgen{

    public Kare(double en) {
        super(en, en);
    }

    @Override
    public String toString() {
        return "Kare{" +
                "alan="+getAlan()+
                "cevre="+getCevre()+
                '}';
    }
}
