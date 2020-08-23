package Gun53.Ornekler.Ornek3;

public class A4 implements IYazdirilabilir,IGosterilebilir{
//birden fazla interface den implemente edilebilir.
    @Override
    public void goster() {
        System.out.println("Gösterildi...");
    }

    @Override
    public void yaz() {
        System.out.println("Yazdırıldı...");

    }
}
