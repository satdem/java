package Gun33.Tasks.task2;

import java.util.ArrayList;

public class Student {
    String name;
    int maxCredit;
    ArrayList<Lesson> dersler;

    Lesson info;
    public  int totalCredit(){
        int total=0;
        for (Lesson ders:dersler) {
            total+=ders.credit;

        }
        return total;
    }

}
