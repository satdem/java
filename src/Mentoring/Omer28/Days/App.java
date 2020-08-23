package Mentoring.Omer28.Days;

import org.w3c.dom.ls.LSOutput;

public class App {
/*
    days isminde enum class oluşturun ve haftanın günlerini yazınız.
    Months isminde enum class oluşturun ve ayları yazınız. Parametre olarak ta kaçıncı ay oldugunu yazınız. örn: OCAK(1)

    1-)main class ta ise günlerden salıyı seçip yazdırınız.

    2-)  Herhangi bir ayı seçip konsola şunu yazdırınız:

    Nisan yılın 4. ayıdır.
     */
public static void main(String[] args) {
    Days gun=Days.SALİ;
    System.out.println("gun = " + gun);

    Months ay=Months.TEMMUZ;
    System.out.println(ay+" yılın "+ay.getMonths()+". ayıdır");
}

}
