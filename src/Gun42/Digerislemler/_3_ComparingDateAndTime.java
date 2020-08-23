package Gun42.Digerislemler;

import java.time.LocalDate;

public class _3_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        LocalDate dun=bugun.minusDays(1);

        boolean after=bugun.isAfter(dun);//bugun dunden sonramı?
        System.out.println("after = " + after);
        
        boolean before=bugun.isBefore(dun);
        System.out.println("before = " + before);
        
        boolean equal=bugun.isEqual(dun);//esit mi
        System.out.println("equal = " + equal);
        
        boolean leapYear=bugun.isLeapYear();//bugun artık yıl mı?
        System.out.println("leapYear = " + leapYear);
        
        int fark=bugun.compareTo(dun);//iki tarih arasında farkın en buyuk parcası arasındaki farkı verir.
        //en büyüğü gün olduğu için gün farkını verdi.yıllar farklı olsaydı yıl farkını verecekti
        //buradan hangisi küçük hangisi büyük anlayabilyoruz
        System.out.println("fark = " + fark);
        int fark2=bugun.compareTo(dun.minusYears(2));
        System.out.println("fark2 = " + fark2);
        
    }
}
