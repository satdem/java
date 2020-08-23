package Gun38.nonAccessModifier.staticModifier;

public class Ogrenci {
    String ad;
    String soyad;
    static String okuladi="Yıldırım İlk Öğretim Okulu";
    //static kullanmamızın sebebi:hafızayı gereksiz tekrarlardan kurtarmak

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
       // this.okuladi = okuladi;
    }

    void print(){
        System.out.println(ad+" "+soyad+" "+okuladi);
    }
}
