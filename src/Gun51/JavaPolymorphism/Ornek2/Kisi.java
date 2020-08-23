package Gun51.JavaPolymorphism.Ornek2;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorevi;

    public Kisi(String ad, String soyad, String gorevi) {
        this.ad = ad;
        this.soyad = soyad;
        this.gorevi = gorevi;
    }
    public static void kimlikyaz(Kisi kisi){
        System.out.println("Ad = " + kisi.ad);
        System.out.println("Soyad= "+kisi.soyad);
        System.out.println("Görev= "+kisi.gorevi);

        if(kisi instanceof Ogrenci){//instanceof bir kontrol sistemi if de kullanılıyor
            //bu kişi oğrenciden mi üretilmiş diye soruyor
            System.out.println(((Ogrenci)kisi).getSube());
        }else if(kisi instanceof Calısan){
            System.out.println(((Calısan)kisi).getDepartman());
        }

        //2.yol instanceof kullanmasaydım

        /*if(kisi.getClass().getSimpleName().equalsIgnoreCase("ogrenci")){
            System.out.println(((Ogrenci)kisi).getSube());
        }
        else if(kisi.getClass().getSimpleName().equalsIgnoreCase("calisan")){
            System.out.println(((Calısan)kisi).getDepartman());
        }*/
    }
}
