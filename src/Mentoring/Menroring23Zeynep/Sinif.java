package Mentoring.Menroring23Zeynep;

public class Sinif {
    /*
    konu ve ogrenci/ogretmen siniflarini da cagiracak sekilde instance variable lar olusturunuz.
    ogrencinin olusturdugu raporu verecek bir toString methodu olusturunuz.
    soyle gozukmeli:

    Dersin konusu: Java
    Isim: Hasan
    Yas: 26
    Bolum: Bilgisayar
    Not ortalamasi: 67

    Ogretmenin adi: Ali
    Mezun oldugu bolumu: Isletme
    Ogretmenin kalitesi: Olaganustu kaliteli bir ogretmen

     */
    String konu;
    Ogrenci ogrenci;
    Ogretmen ogretmen;

    public String toString(){

        return "Dersin konusu: "+konu+
                "\n öğrencinin ismi: "+ogrenci.isim+
                "\n bölümü: "+ogrenci.bolum+
                "\n yaşı: "+ogrenci.yas+
                "\n sınav1:"+ogrenci.sinav1+
                "\n sınav2:"+ogrenci.sinav2+
                "\n sınav3:"+ogrenci.sinav3+
                "\n ortalaması: "+ogrenci.ortalamaBul()+

                "\n\n öğretmenin ismi: "+ogretmen.isim+
                "\n öğretmenin deneyimi: "+ogretmen.yil+
                "\n öğretmenin kalitesi: "+ogretmen.ogretmenimNasil();
    }




}
