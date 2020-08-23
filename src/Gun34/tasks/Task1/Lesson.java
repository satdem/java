package Gun34.tasks.Task1;

public class Lesson {
    String name;
    int haur;

    public static Lesson createLesson(String name,int haur){

        Lesson ders=new Lesson();
        ders.name=name;
        ders.haur=haur;
        return ders;
    }
}
