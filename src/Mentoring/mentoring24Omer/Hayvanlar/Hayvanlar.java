package Mentoring.mentoring24Omer.Hayvanlar;

import java.util.Scanner;

public class Hayvanlar {
/*Barınaktan hayvan sahiplenme

todo AMAÇ: ----------------------------
Barınakta sadece kedi ve köpek vardır.
ilk olarak;

Sistem bize "Barınakta bulunan hayvanlar:
Kedi
köpek
        Hangi hayvanı sahiplenmek istiyorsunuz?:

                                  şeklinde bir çıktı versin.

Kullanıcı kedi veya köpek girdiğinde, seçtiği hayvanın bilgileri gelmeli ve sistem son bulmalı.

Eğer başka bir hayvan girerse "barınakta böyle bir hayvan bulunmamaktadır" uyarısını versin ve tekrar en başa dönsün, yani hangi hayvanı sahiplenmek istersiniz? sorusuna dönsün.
Ta ki kedi veya köpek girene kadar...
        todo ----------------------------------------

hayvanlar isminde yan bir class oluşturun.
içerisinde
     String hayvan;
     int yasi;
     String renk;

     olsun.

     bu classın içine tercihler isminde void bir method oluşturun.


     todo---Kedi
     kullanıcı büyük-küçük harf gözetmeksizin   "kedi" yazarsa;
     yaş=4'e , renk ise beyaza eşit olsun.

 ve alt alta:
 hangi hayvan: kedi
 yaş : 4
 renk : beyaz            çıktısı gelsin.

        todo--Köpek
    kullanıcı büyük-küçük harf gözetmeksizin   "köpek" yazarsa;
     yaş=3'e , renk ise siyaha eşit olsun.


 ve alt alta:
 hangi hayvan: köpek
 yaş : 3
 renk : siyah            çıktısı gelsin.

 todo Başka bir değer girilirse(örn: hamster)

Sistem bize
Barınağımızda böyle bir hayvan bulunmamaktadır..
mesajını verdikten sonra tekrar en başa yani:
Hangi hayvanı sahiplenmek istiyorsunuz? sorusuna gelip devam etsin.


*/
    String cinsi;
    String renk;
    int yas;
    public void hangiHayvan(){
        Scanner sc=new Scanner(System.in);
        Hayvanlar hayvan=new Hayvanlar();
        while (true) {//for(int i;i<10;) şeklinde olursa sonsuz for dongüsü oluyor
            System.out.print("Hangi hayvanı istiyorsunuz?");
            hayvan.cinsi = sc.nextLine();
            if (hayvan.cinsi.equalsIgnoreCase("kedi")) {
                hayvan.renk = "Beyaz";
                hayvan.yas = 2;
                System.out.println("cinsi: "+hayvan.cinsi+" yası: "+hayvan.yas+" rengi: "+hayvan.renk);
                break;
            } else if (hayvan.cinsi.equalsIgnoreCase("köpek")) {
                hayvan.renk = "Siyah";
                hayvan.yas = 3;
                System.out.println("cinsi: "+hayvan.cinsi+"yası: "+hayvan.yas+"rengi: "+hayvan.renk);
                break;
            } else System.out.println("barınakta böyle bir hayvan bulunmamaktadır");
        }
    }

}
