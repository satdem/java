package Gun41.periodAndDuration;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class JavaPeriod {
    public static void main(String[] args) {
        //Period: iki tarih arsında geçen zamanı  yıl ay gün olarak veriyor.
        //sadece localdate de kullanılıyor

        LocalDate dt=LocalDate.of(1978,07,18);
        LocalDate bugun=LocalDate.now();
        Period fark=Period.between(dt,bugun);
        System.out.println("fark = " + fark);//P47Y4M29D seklinde yazdırıyor. format kullanarak daha düzgün yazdıramıyoruz.
                                                                            //format yokmuş çünkü

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println("fark = " + fark.getYears()+" yıl, "+fark.getMonths()+" ay, "+fark.getDays()+" gündür");



    }
}
