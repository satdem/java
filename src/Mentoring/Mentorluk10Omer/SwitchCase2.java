package Mentoring.Mentorluk10Omer;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        /*                      todo   Basit ATM projesi


        int bakiye belirleyin ve bakiyemizde başlangıçta 1000 tl olsun.
       todo ipucu : ->  para çekme ve yatırma işlemleri için de bir int create edin.
        Her işlemde arrtırın veya azaltın. (int islem)

        Sistem bize ilk olarak seçenekleri sunmalı. Örn:

        1.Bakiye görüntüle
        2.Para yatırma
        3.Para çekme
        4.Sistemden çıkış


        Switch - Case kullanarak  4 seçenekten birini seçtirin.

       1. Bakiye görüntüle derse, sistem toplam bakiyeyi yazdırsın.

       2.Para yatırma derse, "ne kadar yatırmak istiyorsunuz?" sorusu gelsin.
        Bir değer girilsin ve yeni  bakiye yazdırılsın.

       3.Para çekme derse, " ne kadar para çekmek istiyorsunuz?" sorusu geldin.
       Bir değer girilsin ve yeni bakiye yazdırılsın.

        4.Sistemden çıkış dediğinde " Sistemden çıkılıyor.." mesajını versin.

        5.Yanlış tuşlama yapıldığında "Geçersiz işlem" mesajını versin.
 */
        Scanner sc=new Scanner(System.in);
        int bakiye=1000;
        System.out.print("Bir işlem seçiniz: \n" +
                "        1.Bakiye görüntüle\n" +
                "        2.Para yatırma\n" +
                "        3.Para çekme\n" +
                "        4.Sistemden çıkış\n");
        int secenek=sc.nextInt();
        int islem;
        switch (secenek){
            case 1:
                System.out.println("Toplam Bakiye= "+bakiye);break;
            case 2:
                System.out.println("ne kadar yatırmak istiyorsunuz?");
                int y=sc.nextInt();
                System.out.println("Yeni bakiye= "+(bakiye+y));break;
            case 3:
                System.out.println(" ne kadar para çekmek istiyorsunuz?");
                int c=sc.nextInt();
                System.out.println("Yeni bakiye= "+(bakiye-c));break;
            case 4:
                System.out.println(" Sistemden çıkılıyor..");
            case 5:
                System.out.println("Geçersiz işlem");break;


        }


    }
}
