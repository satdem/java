package Gun49.Task1;

public class sekil {
    // 1-aşağıdaki hiyerarşiye göre sınıfları olusturunuz
    //Shape:şekil
    //  Circle:çember alanıyok
    //  Rectangle:dikdörtgen
    //      Square:kare

    // 2- Türetilen sınıflardan uygun olanlarına yarıcap, uzunluk ve genislik ekleyiniz.
    // 3- Her bir sınıfa consructor ekleyiniz.
    // 4- Her metodun toStringini override yapınız.
    // 5- Her sınıfa alan ve çevre hesaplaması metodlarını ekleyiniz.
    // 6- Main de bunlardan nesne oluşturup sonuçları yazdırınız.
    // 7- En üst sınıfta , türetilen sınıflarda uygun metodu olamayan sınıflar için hta mesajı ürettiriniz.


    @Override
    public String toString() {
        return "sekil:Bilgi yok ";
    }
    public double getAlan(){
        throw new RuntimeException("Bu sınıfın bu özelliği yoktur ");

    }
    public double getCevre(){
        throw new RuntimeException("Bu sınıfa bu metod implemente edilmemiştir");
    }


}
