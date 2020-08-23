package Gun58.Ornek1;

public class Borsh implements IFood {
    @Override
    public double ucret() {
        return 3;
    }

    @Override
    public void taste() {
        System.out.println("idare eder");
    }
    void boil(){
        System.out.println("istenen ısı ve sürede kaynatılır");
    }
    void eatTomorrow(){
        System.out.println("Yarın yiyebilirsin");
    }

}
