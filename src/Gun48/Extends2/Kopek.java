package Gun48.Extends2;

public class Kopek  extends Hayvan{
    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);//super: superclass ı işaret ediyor

    }

    @Override//override:ezmek demek
    public void yemekYer() {
        super.yemekYer();
    }
    @Override//orjinal halini değilde buradaki halini kullan demek
    public void konustu(){
        System.out.println("havladı...");
        super.konustu();//bu şekilde konuştu yazdırır.
    }


}
