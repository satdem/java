package Gun51.JavaPolymorphism.Ornek2;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci("Özal","Soyad","öğrenci","4a");
        Calısan cal1=new Calısan("Faruk","Soyad","öğretmen","eğitim");

        Kisi.kimlikyaz(ogr1);
        Kisi.kimlikyaz(cal1);

        System.out.println("classının ismi: "+ogr1.getClass().getSimpleName());//classının ismini verir
        System.out.println("superclassının ismi: "+ogr1.getClass().getSuperclass().getSimpleName());//superclassının ismini verir

    }
}
