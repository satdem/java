package Gun34.tasks.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Student {
    String name;
    int maxAlabileceğiDersSaatMiktari;
    ArrayList<Lesson> studentLessons=new ArrayList<>();

    public static Student createStudent(String name,int maxAlabileceğiDersSaatMiktari){
        Student ogr=new Student();
        ogr.name=name;
        ogr.maxAlabileceğiDersSaatMiktari=maxAlabileceğiDersSaatMiktari;
        return ogr;
    }

    public  void LessonAdd(Lesson ders){

        int toplamderssaati=0;
        for (Lesson a: studentLessons) {
            toplamderssaati+=a.haur;
        }
        if(toplamderssaati+ders.haur<=maxAlabileceğiDersSaatMiktari){
            studentLessons.add(ders);
        }
        else System.out.println(name+" "+ ders.name+" için Max ders saatiniz dolmuştur");

    }
    public void ogrencidersleri( ){
        int toplamderssaati=0;
         for (Lesson ders:studentLessons) {
             System.out.println( name+"'nin dersleri = " + ders.name);
             toplamderssaati+=ders.haur;
         }
        System.out.println("toplamderssaati = " + toplamderssaati);
    }
}
