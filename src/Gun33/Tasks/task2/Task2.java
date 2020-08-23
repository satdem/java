package Gun33.Tasks.task2;

import java.util.ArrayList;

public class Task2 {
    //1-bir üniversitede öğrenciler ders kaydı yapacaktır.
    //ders sınıfı:adı:ayrı class da Lesson ,fields: name ,credit(1-3)
    //2-Bir öğrenci sınıfı ayrı dosyada adı:Student,fields:name,maxCredit,
    // derler listesini tutacak bir liste
    //3-LessonCreat adında ders oluşturabileceğimiz bir metod ekleyin
    // direk kullanmak istiyoruz
    //4-3 adet ders oluşturunuz
    //bir ögrenci tanımla maksimum 10 kredi alabilsin
    //bu ögrencinin ders listesine açılmış olan dersleri ekleyin ,fakat ders eklerken maksimum krediyi geçmemeli
    // "max credi dolmuştur şeklinde"
    //6-3. madde ödev
    //7-öğrenciye ders ekleme bölümünü yine ilgili sınıfta bir metod olarak yaz.


    public static void main(String[] args) {
      /*  Lesson math=Lesson.creatLesson("Math",4);
        Lesson java=Lesson.creatLesson("Java Programming",6);
        Lesson fizik=Lesson.creatLesson("Fizik ",4);*/

        //bu uzun yöntem ,yukarıdaki daha kısaydı
        Lesson mat101=new Lesson();
        mat101.name="Matematik";
        mat101.credit=4;

        Lesson java101=new Lesson();
        java101.name="Java Programming";
        java101.credit=6;

        Lesson fizik101=new Lesson();
        fizik101.name="Fizik";
        fizik101.credit=4;

        Student ogr1=new Student();
        ogr1.name="Ayfer";
        ogr1.maxCredit=10;

        ogr1.dersler=new ArrayList<>();

        if(ogr1.totalCredit()+mat101.credit<=ogr1.maxCredit){
        ogr1.dersler.add(mat101);
        }
        else System.out.println("mat101 için Max crediniz dolmuştur");

        if(ogr1.totalCredit()+java101.credit<=ogr1.maxCredit){
        ogr1.dersler.add(java101);
        }
        else System.out.println("java101 içinMax crediniz dolmuştur");

        if(ogr1.totalCredit()+fizik101.credit<=ogr1.maxCredit){
        ogr1.dersler.add(fizik101);
        }
        else System.out.println("fizik101 için Max crediniz dolmuştur");





    }
}
