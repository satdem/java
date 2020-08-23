package Gun49.Task4;

public class Ogrenci {
    //1-oğrenci isimli id,isim ve tipi olan bir class oluşturunuz
    //2-LiseOgrencisi adlı öğrenci sınıfından bir sınıf üretiniz.
    //3-ilköğrenci adında Ogrenci sınıfından bir sınıf üretiniz
    //4-okul isimli mainde 3 adet öğrnci oluşturun
    //5-oluştururken her öğrenciye ogrenci sınıfından bir sayactan numara tanımlayınız
    int id;
    String isim;
    String tipi;
    public static int sayacId=1;

    public Ogrenci(int id, String isim, String tipi) {
        this.id = id;
        this.isim = isim;
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi='" + tipi + '\'' +
                '}';
    }
}
