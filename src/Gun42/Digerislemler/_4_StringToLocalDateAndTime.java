package Gun42.Digerislemler;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _4_StringToLocalDateAndTime {
    public static void main(String[] args) {

        String strDate="01 25 2020";//araları boş olmalı.çünkü aşagıda böyle tanımladık
        // burada  nasıl tanımlarsam aşağıda formatı öyle yazmalıyım
        DateTimeFormatter format=DateTimeFormatter.ofPattern("MM dd yyyy");//yukarıdaki stringin formatı ile  tanımlanmalı

        LocalDate tarih=LocalDate.parse(strDate,format);
        System.out.println("tarih = " + tarih);//kendi default formatında yazdırdı
        System.out.println("tarih = " + tarih.format(format));//bizim formatta yazdırdı

        String strtime="12:49";
        LocalTime time=LocalTime.parse(strtime);//parse ile stringi localtime dönüştürdük
        System.out.println("time = " + time);



    }
}
