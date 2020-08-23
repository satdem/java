package Gun49.Task2.Pak2;
import Gun49.Task2.Pak1.pak1Hayvan;
public class pak2Main {
    public static void main(String[] args) {
        pak1Hayvan hayvan2=new pak1Hayvan();
        hayvan2.ad="köpek";
        //hayvan2.yas=  ulaşamiyorum default old için sadece kendi paketinden ulaşabilirim
       // hayvan2.cinsi="van";default gibi çalışıyor normal class larda
        //sadece kendi paketinden ulaşbilirim
        //hayvan2.renk buna zaten ulaşamıyorum,çünkü private

        Kedi kedi=new Kedi("köpük","tekir");
        kedi.BilgiYaz();
        //kedi.cinsi sadece subclassdan ulaşılabiliyor
    }
}
