package Gun53.Tasks.Task1;

public class Cember implements Sekiller{

    @Override
    public double cevresi(int... a) {
        return 2*a[0]*Sekiller.Pi;
    }

    @Override
    public double alani(int... a) {
        return Sekiller.Pi*a[0]*a[0];
    }
}
