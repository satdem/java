package Mentoring.Zeynep29;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ornek1 {
    /* ayEkle adli bir metod olusturunuz
        return type bir String
        parametrsi de int(myMonth)

        bugunun tarihini ve
        ardindan uzerine ay eklenmis halini return yapiniz



     mesela:

        bugunun tarihi 07/24/2020
        myMonth = 4

        return  11/24/2020*/
    public static String ayEkle(int myMonth){
        LocalDate bugun=LocalDate.now();
        LocalDate eklenmis=bugun.plusMonths(myMonth);
        DateTimeFormatter f=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String a=eklenmis.format(f);//tarih.toString de kullanabilirdim formatlamadan
        return a;
    }

    public static void main(String[] args) {
        int month=7;
        String x=ayEkle(month);
        System.out.println("x = " + x);
    }
    
}
