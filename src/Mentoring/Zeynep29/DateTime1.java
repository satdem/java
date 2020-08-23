package Mentoring.Zeynep29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime1 {

    public static void bugununTarihi(){
        LocalDate tarih=LocalDate.now();
        System.out.println("tarih = " + tarih);

        DateTimeFormatter format=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String Bugun=tarih.format(format);
        System.out.println(Bugun);

    }
    public static void saatiGöster(){

        LocalTime simdi=LocalTime.now();
        System.out.println("simdi = " + simdi);
        DateTimeFormatter saatf=DateTimeFormatter.ofPattern("hh:ss");
        System.out.println("saatf = " + simdi.format(saatf));

    }
    public static void dogumTarihim(){
        LocalDateTime dt=LocalDateTime.of(1978,07,18,14,55);
        System.out.println("dt = " + dt);
        DateTimeFormatter format=DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("dt.format(format) = " + dt.format(format));

    }

    public static void main(String[] args) {
        bugununTarihi();
        saatiGöster();
        dogumTarihim();
    }

}
