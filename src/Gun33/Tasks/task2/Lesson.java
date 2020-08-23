package Gun33.Tasks.task2;

import java.util.ArrayList;

public class Lesson {
    String name;
    int credit;
    public static Lesson creatLesson(String name,int credit){
        Lesson ders=new Lesson();
        ders.name=name;
        ders.credit=credit;
        return ders;
    }
}
