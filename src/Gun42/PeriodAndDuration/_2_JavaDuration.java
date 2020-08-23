package Gun42.PeriodAndDuration;

import java.time.Duration;
import java.time.LocalTime;

public class _2_JavaDuration {
    public static void main(String[] args) {
        //period date / duration time de kullanılıyor
        LocalTime geceyarisi=LocalTime.of(0,0);
        LocalTime ogleVakti=LocalTime.of(13,3,2,5);

        Duration fark=Duration.between(geceyarisi,ogleVakti);
        System.out.println("fark = " + fark);
        System.out.println("fark.toMillis = " + fark.toMillis());//milisaniye olarak, toplam olarak veriyor
        System.out.println("fark.toHours = " + fark.toHours());
        System.out.println("fark.toMinutes = " + fark.toMinutes());
        System.out.println("fark.toDays = " + fark.toDays());

        System.out.println("fark.toHoursPart() = " + fark.toHoursPart());
        System.out.println("fark.toMinutesPart() = " + fark.toMinutesPart());//bölüm bölüm veriyor
        System.out.println("fark.toSecondsPart() = " + fark.toSecondsPart());
        System.out.println("fark.toMillisPart() = " + fark.toMillisPart());

    }
}
