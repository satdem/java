package Mentoring.Menroring23Zeynep;

public class AnaSinif {
    public static void main(String[] args) {
        Sinif sinif=new Sinif();
        sinif.konu="Java";

        sinif.ogrenci=new Ogrenci();
        sinif.ogrenci.isim="Hasaan";
        sinif.ogrenci.bolum="bilgisayar";
        sinif.ogrenci.yas=20;
        sinif.ogrenci.sinav1=69;
        sinif.ogrenci.sinav2=75;
        sinif.ogrenci.sinav3=89;

        sinif.ogretmen=new Ogretmen();
        sinif.ogretmen.isim="Ali";
        sinif.ogretmen.bolum="Mühendis";
        sinif.ogretmen.yil=5;

        System.out.println(sinif);

    }
}
