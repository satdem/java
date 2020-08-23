package Gun55.Ornekler.Ornek1;

public class Ford extends BinekOto{
//abstract metod olduğundan
// bu metod zorunlu olarak implemente edilmeli
    @Override
    public String getMarka() {
        return "Ford Fokus";
    }

    //abstract class daki somut metodları
    //ister aynen kullanabilirz
    // istenirse override yapabiliriz
    @Override
    public int getUretimYili() {
        System.out.println(super.getUretimYili());
        return super.getUretimYili();
    }
}
