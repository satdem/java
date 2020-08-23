package Gun38.nonAccessModifier.staticModifier;

public class Ogrenciler {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci("Ali","Yılmaz");
        Ogrenci ogr2=new Ogrenci("Ayşe","Demir");
        Ogrenci ogr3=new Ogrenci("Mehmet","Kaya");
        //.....
        //......
        //.....
        Ogrenci ogr100=new Ogrenci("Ali Osman","Yılmazer");

        ogr1.print();
        ogr2.print();
        ogr3.print();
        ogr100.print();
        //1. kural:static fiekd a sadece  class dan erişilir
        //2. kural:diğer field lara sadece new ile oluşturulmuş nesnelerden ulaşılır
        //3. kural:ancak oluşturulmuş bir nesnenin metodlarında static değişkene ulaşılabilir
    }
}
