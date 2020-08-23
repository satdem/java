package Gun41.creatingAndFormatting;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class JavaLocalTime {
    public static void main(String[] args) {

        //tarih içermez sadece saat dk,saniye içerir(9:00 gibi)
        LocalTime time1=LocalTime.now();

        LocalTime time2=LocalTime.of(21,21);
        LocalTime time3=LocalTime.of(21,45,21);

        System.out.println("time1.getHour() = " + time1.getHour());
        System.out.println("time1.getMinute() = " + time1.getMinute());
        System.out.println("time1.getSecond() = " + time1.getSecond());
        System.out.println("time1.getNano() = " + time1.getNano());//nanosaniye

        DateTimeFormatter format1=DateTimeFormatter.ofPattern("hh:mm:ss a");//a öğleden sonra=pm ya da öğleden önce=am
        System.out.println("time1.format(format1) = " + time1.format(format1));

        DateTimeFormatter format2=DateTimeFormatter.ofPattern("HH:mm:ss");//HH 24 lü saat sistemine göre gösterim

        System.out.println("time1.format(format2) = " + time1.format(format2));

        DateTimeFormatter format3=DateTimeFormatter.ISO_TIME;//19:13:29.6497138 gibi gösteriyor
        System.out.println("time1.format(format3 = " + time1.format(format3));


        System.out.println("time1 = " + time1);
        LocalTime time4=LocalTime.now();
        System.out.println("time4 = " + time4);
    }
}

