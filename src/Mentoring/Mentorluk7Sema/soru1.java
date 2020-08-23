package Mentoring.Mentorluk7Sema;

public class soru1 {
    public static void main(String[] args) {
        String a=" ";
        a.trim();//bunu a ya atamadığı için aşağıda baştaki a yı alıyor.yani boş olmayan a;
        if (a.isEmpty()) System.out.println("yeap");
        else System.out.println("nope");
    }
}
