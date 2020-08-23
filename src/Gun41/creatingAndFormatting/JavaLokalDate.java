package Gun41.creatingAndFormatting;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class JavaLokalDate {
    public static void main(String[] args) {

        //sadece gun ay yıl olarak tarih tutar, dk sn saat vermez
        LocalDate date1=LocalDate.now();

        LocalDate date2=LocalDate.of(2019,7,20);
        LocalDate date3=LocalDate.of(2019, Month.JULY,20);

        System.out.println("date1.getYear() = " + date1.getYear());
        System.out.println("date1.getMounth() = " + date1.getMonth());
        System.out.println("date1.getMonthValue() = " + date1.getMonthValue());
        System.out.println("date1.getDayOfMounth() = " + date1.getDayOfMonth());
        System.out.println("date1.getDayOfWeek() = " + date1.getDayOfWeek());
        System.out.println("date1.getDayOfYear() = " + date1.getDayOfYear());

        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd.MM.yyyy");//bu bizim gösterdiğimiz şekilde tarihi yazıyor
        System.out.println("date1.format(format1 = " + date1.format(format1));

        System.out.println("ISO_ DATE = " + date1.format(DateTimeFormatter.ISO_DATE));//2020-07-20 şeklinde yazıyor

        System.out.println("short date = " + date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("medium date = " + date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("long date = " + date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("full date = " + date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println("full date = " + date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));
        //burada withlocal ile istenilen ulkenin dilinde tarihi yazdırabiliyoruz

        //sistemde kullanılabilir lokalleri arattık. norveçce yi bulup yazdırmak için
        Locale[] kullanilabilirLokaller=Locale.getAvailableLocales();
        for (Locale l:kullanilabilirLokaller) {
            if(l.getDisplayCountry().toLowerCase().contains("nor"))
                System.out.println("l+\" \"+l.getDisplayCountry() = " + l+" "+l.getDisplayCountry());

        }
        Locale LocaleNorvec=new Locale("no","NO");
        System.out.println("full date = " + date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(LocaleNorvec)));



    }
}
