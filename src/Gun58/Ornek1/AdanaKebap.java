package Gun58.Ornek1;

public class AdanaKebap implements IFood {
    @Override
    public double ucret() {
        return 5.0;
    }

    @Override
    public void taste() {
        System.out.println("Bol acılı");
    }
    void marinade(){
        System.out.println("Bir gün marine edildi");
    }
    void grill(){
        System.out.println("itina ile mangal yapıldı");
    }

}
