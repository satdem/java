package Gun58.Ornek1;

public class Lahmacun implements IFood {
    @Override
    public double ucret() {

        return 2.0;
    }

    @Override
    public void taste() {
        System.out.println("ister acılı ister acısız");
    }
    void dough(){
        System.out.println("Hamuru 1 saat mayalandırıldı");
    }
    void topping(){
        System.out.println("İtina ile şekil verildi");
    }
    void addMeat(){
        System.out.println("isteğe göre et ilaveli yada vejeteryan  çeşidi vardır");
    }
    void bake(){
        System.out.println("fırından taze çıktı");
    }
}
