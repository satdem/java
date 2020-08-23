package Gun31.tasks.Tasks1;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        // create class student with fields
        //string name int not
        //daha sonra 3 öğrenci ve notu oluşturun ve bu öğrencileri Arraylisste ekleyin
        //daha sonra öğrenci bilgilerini yazdıran bir metod yazarak öğrenci bilgilerini döngü ile tazdırınız
        //daha sonra bütün öğrencilerin not ortalamasını bir metod ile bularak mainde yazdırınız
        Student ogrenci1=new Student();
        ogrenci1.name="Fatih";
        ogrenci1.not=78;

        Student ogrenci2=new Student();
        ogrenci2.name="Sultan";
        ogrenci2.not=98;

        Student ogrenci3=new Student();
        ogrenci3.name="Mehmet";
        ogrenci3.not=87;

        ArrayList<Student> ogrenciler=new ArrayList<>();
        ogrenciler.add(ogrenci1);
        ogrenciler.add(ogrenci2);
        ogrenciler.add(ogrenci3);

        BilgiYazdir(ogrenciler);

        OrtalamaHesabı(ogrenciler);
       
    }
   public static void BilgiYazdir(ArrayList<Student> ogrenciler){
       for (Student ogr:ogrenciler) {
           System.out.println("ogrenci name "+ogr.name+" ogrenci notu "+ogr.not);
           
       }
   }
   public static void OrtalamaHesabı(ArrayList<Student> ogrenciler){
        int top=0;
        double ort=0;
       for (Student ogr:ogrenciler) {
          top+=ogr.not; 
       }
       ort=top/ogrenciler.size();
       System.out.println("ort = " + ort);
       System.out.printf("ortalama= %6.2f ",ort);
   }

}
