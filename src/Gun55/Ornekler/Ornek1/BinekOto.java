package Gun55.Ornekler.Ornek1;

//abstract anahtar kelimesi ile abstract class oluşturmuş oluyoruz.
public abstract class BinekOto {
    private String marka;
    private int uretimYili;
    private int vitesAdedi;

    //implemente edilmek zorunda(soyut =gövdesiz metod)
    public abstract String getMarka();

    //isteğe bağlı override yapılabilir(somut)gövdeli metod)
    public int getUretimYili(){
        return this.uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }
}
