package Gun53.Ornekler.Ornek4;

public class Test implements IYazdir,IGoster{
    @Override
    public void goster() {
        System.out.println("göster...");
    }
//implemente edilen interface lerde aynı isim ve parametrede
    //olan metodlar dan bir tane yazmak yeterlidir,problem oluşturmaz

    @Override
    public void yaz() {
        System.out.println("Göster Yaz..");
    }
}
