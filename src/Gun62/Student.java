package Gun62;

public class Student {
    String name;

    public Student(String name) {

        this.name = name;

    }

}

class Test {

    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[1] = new Student("Richard");
        students[2] = new Student("Donald");
        // Sadece String bir değişken olsa idi null yazıp hata vermezdi,
        // ancak oluşturulmamış bir nesneyi yazmaya çalıştığı için, dizinin 0.elemanı için,
        // NullPointerException  hatası vermekte.
        // yani olmayan bir şeyi yazdırmaya çalışıyor.

        for (Student s : students) {
            System.out.println("" + s.name);
        }
    }
}//soru: çıktı nasıldır
//cevap: NullPointerException. 0. studente birşey atanmamış. bunun için onu yazdıramaz.onun defualt değeri belli değil

