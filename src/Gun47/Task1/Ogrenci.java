package Gun47.Task1;

public class Ogrenci {

    //1-fieldları ad,soyad,yas olan bir ogrenci sınıfı tanımlayın
    //2-Öğrenci sınıfına ad,soyad ve yas dan olusan bir constructer tanılayınız
    //3-Bütün fieldlar için encapsulation uygulayınız
    //4-Bir Okul isimli sınıf tanımlayınız fieldları okulAD,maxOgrenciSayisi,Arraylist cinsindenÖğrencileri olsun
    //5-OkulMain sınıfı oluşturun
    //6-Bir okul nesnesi oluşturup bu okula maxöğrenci sayısına ulaşana kadar öğrenci ekleyin
    //fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli
    //bu yaşı geçen bir öğrenci eklemek istenir ise yerine başka öğrenci isteyiniz

    private String ad;
    private String soyad;
    private int yas;

    public Ogrenci(String ad, String soyad, int yas) {
        setAd(ad);
        setSoyad(soyad);
        setYas(yas);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas>15)
            throw  new RuntimeException("Öğrencinin yaşı 15 den küçük olmalı. yeni bir öğrenci giriniz");


         this.yas = yas;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
