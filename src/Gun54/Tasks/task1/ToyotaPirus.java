package Gun54.Tasks.task1;

public class ToyotaPirus extends Vehicle implements IElectric,IGas{
    public ToyotaPirus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String drive() {
        return "Güvenli sürüş";
    }

    @Override
    public String changeBattery() {
        return "10 yılda bir batarya değiştir";
    }

    @Override
    public String changeOil() {
        return "Yağını her 1000km de kontrol et";
    }
}
