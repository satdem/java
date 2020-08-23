package Gun54.Tasks.task1;

public class Bus extends Vehicle implements IDiesel{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String drive() {
        return "Yavaş ve dikkatli kullan.";
    }

    @Override
    public String changeDiesel() {
        return "Yakıtı bitmeden doldurmaya çalış yolda kalırsın.";
    }
}
