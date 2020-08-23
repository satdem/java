package Gun41.creatingAndFormatting;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class JavaZoneDateTime {
    //zone:bölge
    public static void main(String[] args) {
        //başka ülke veya bölgelerin saat dilimine göre zamanı alma
        //new yorkun saatini aldık
        ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime local=ZonedDateTime.now();

        System.out.println("local = " + local);
        System.out.println("zdt = " + zdt);

        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println("local.format(format1) = " + local.format(format1));
        System.out.println("zdt.format(format1) = " + zdt.format(format1));


       /* Set<String> bolgeler= ZoneId.getAvailableZoneIds();
        for (String s:bolgeler) {
            //System.out.println("s = " + s);//burada bütün bölgeleri bulduk
            if(s.toLowerCase().contains("ameri"))//burada amerikadaki bölgeleri bulduk
                System.out.println("s = " + s);
            
        }*/
    }
}
