package Gun54.Tasks.task1;

public class TeslaCar extends Vehicle implements IElectric {

    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String drive() {
        return "Hızlı sür,Auto pilot sür";
    }

    @Override
    public String changeBattery() {
        return "10 yılda bir batarya değiştir";
    }

}
