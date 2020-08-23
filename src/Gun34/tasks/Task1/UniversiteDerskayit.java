package Gun34.tasks.Task1;

public class UniversiteDerskayit {
    // universitede öğrencilere ders kaydı programı yapılmak isteniyor
    //önce ders kaydı yapılacak, sonra öğrencilerin kredi alabilme hakkına göre
    // bu dersler öğrencilere eklenecek
    //1.ADIM: Yeni ders oluşturmak için lesson adında bir sınıf tanımlayın.
    // fields:name, haur(saat)
    //2.ADIM: Ders oluşturma metodunu yazınız.
    //3.ADIM: 3 adet ders tanımla mat 6 saat fizik 4, java 6 saat
    //4.ADIM: Student isminde yeni bir class tanımlayınız.
    // fields:name,maxAlabileceğiDersSaatMiktari
    //5.ADIM: Öğrenci oluşturmayı bir metod ile yazınız
    //6.ADIM 2 adet öğrenci oluşturun adı mehmet maxders saati 20 olsun
    //adı ayşe maxderssati 12 olsun
    //7.ADIM: Öğrenciye ders eklemek için Student sınıfına  bir ders listesi
    // tutacak bir field ekleyin
    //8.ADIM: Bu iki öğrenciye der ekleyen lessonAdd isimli bir metod yazınız
    //fakat ders eklenirken toplam ders miktarı öğrencinin maxders saatini aşmasın
    // aşarsa uyarı versin
    //9.ADIM: Her öğrencinin akdığı dersleri yazan bir metod yazınız ve dersleri yazdırınız


    public static void main(String[] args) {

/*static yazmasydım
* lesson ders=new lesson ;
* lesson ders1=ders.creatLesson("matematik",5);
* şeklinde tanımlayacaktım
* */
//static yazdığım için
        //ama bu hafızada yer kapladığı için gerekmedikçe kullanma.

        Lesson mat101=Lesson.createLesson("matematik",6);
        Lesson fiz101=Lesson.createLesson("Fizik",4);
        Lesson java101=Lesson.createLesson("Java",6);

        Student ogr1=Student.createStudent("Mehmet",20);
        Student ogr2=Student.createStudent("Ayşe",12);

ogr1.LessonAdd(mat101);
ogr1.LessonAdd(fiz101);
ogr1.LessonAdd(java101);

ogr2.LessonAdd(mat101);
ogr2.LessonAdd(fiz101);
ogr2.LessonAdd(java101);
       ogr1.ogrencidersleri();
       ogr2.ogrencidersleri();


    }
}
