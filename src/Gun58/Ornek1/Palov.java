package Gun58.Ornek1;

public class Palov implements IFood {
    @Override
    public double ucret() {
        return 4;
    }

    @Override
    public void taste() {
        System.out.println("tereyağlısı vazgeçilmezdir");
    }
    void fry(){
        System.out.println("pirinç ve şehriye kavruldu");
    }
    void boil(){
        System.out.println("haşlama kısmı da tamam");
    }
}
