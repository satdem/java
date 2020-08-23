package Gun49.Task1;

public class Cember  extends sekil{
    private double yariCap;

    public Cember(double yariCap) {
        this.yariCap = yariCap;
    }



    @Override
    public double getCevre() {
        return 2*Math.PI*this.yariCap;
    }

    @Override
    public String toString() {
        return "Cember{" +
                "yariCap=" + this.yariCap +
                " cevre ="+getCevre()+
                '}';
    }

}
