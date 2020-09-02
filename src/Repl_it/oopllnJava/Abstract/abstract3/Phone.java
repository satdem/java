package Repl_it.oopllnJava.Abstract.abstract3;

import java.util.ArrayList;
import java.util.Scanner;

/*4 class oluşturulmuştur. Phone, Apple, Samsung, Main

Phone'u super class yapın.
cart isimli, String'i alarak bir static arraylist oluşturun.
getSum isimli, arraylist'i parametre aldığınız bir method oluşturun.
ve return tipi int;
                 arraylist'in içindeki bütün seçenekleri elde edin ve sayısal olmayan karakterleri(a b c... A B C...)
                 ve özel karakterleri (.,!'^+...)
                 sonra bunları int'e çevirin.
                 tüm sayıları toplayın.

ismi options olan bir abstract method oluşturun.

Apple class'ın içinde;
            Phone class'ı extend edin.
            option method'u override edin.
            parametre olarak 2 String vardır.

Eğer birinci String 64 GB ve 5.5 inch ise
                         cart arraylist'ine "$750" ekleyin.

Eğer birinci String 64 GB ve 6.5 inch ise
                         cart arraylist'ine "$850" ekleyin.

Eğer birinci String 128 GB ve 5.5 inch ise
                         cart arraylist'ine "$950" ekleyin.

Eğer birinci String 128 GB ve 6.5 inch ise
                         cart arraylist'ine "$1200" ekleyin.

Samsung class'ın içinde;
            Phone class'ı extend edin.
            option method'u override edin.
            parametre olarak 2 String vardır.

Eğer birinci String 256 GB ve 5.5 inch ise
                         cart arraylist'ine "$1000" ekleyin.

Eğer birinci String 256 GB ve 7.5 inch ise
                         cart arraylist'ine "$1200" ekleyin.

Eğer birinci String 512 GB ve 5.5 inch ise
                         cart arraylist'ine "$1300" ekleyin.

Eğer birinci String 512 GB ve 6.5 inch ise
                         cart arraylist'ine "$1400" ekleyin.


Main class'ının içinde;
         scanner class object yarat.
              iki adet String oluşturun str1, str2 ve scanner object'ini String'lere atayın.

apple class'ı için object oluştur.
options method'unu apple class'ının içine çağır.
options parametreleri, daha önce oluşturulan iki String'lerdir.

İki adaet String oluşturun. str3 ve str4, sonra scanner object'i bu String'lere atayın.
           samsung class'ı için object oluşturun.
           options method'unu samsung class'ının içinde çağırın.
           options parametreleri daha önce oluşturulan iki String'dir.

getSum method'unu Phone class'ının içinde çağırın.

sonucu yazdırın.

*/
public abstract class Phone {
static ArrayList<String> card=new ArrayList<>();
int getSum(ArrayList<String> card){
    int toplam=0;
    for (String a:card) {
        a=a.replaceAll("[^0-9]","");
        int i=Integer.parseInt(a);
        toplam+=i;
    }
    return toplam;
}

abstract void options(String a,String b);
}
class Apple extends Phone{


    @Override
    void options(String a,String b) {
        if (a.equalsIgnoreCase("64 GB")&&b.equalsIgnoreCase("5.5 inch")){
            card.add("$750");
        }
        else if (a.equalsIgnoreCase("64 GB")&&b.equalsIgnoreCase("6.5 inch")){
            card.add("$850");
        }
        else if (a.equalsIgnoreCase("128 GB")&&b.equalsIgnoreCase("5.5 inch")){
            card.add("$950");
        }
        else if (a.equalsIgnoreCase("128 GB")&&b.equalsIgnoreCase("6.5 inch")){
            card.add("$1200");
        }
    }
}

class Samsung extends Phone{


    @Override
    void options(String a, String b) {
        if (a.equalsIgnoreCase("256 GB")&&b.equalsIgnoreCase("5.5 inch")){
            card.add("$1000");
        }
        else if (a.equalsIgnoreCase("256 GB")&&b.equalsIgnoreCase("7.5 inch")){
            card.add("$1200");
        }
        else if (a.equalsIgnoreCase("512 GB")&&b.equalsIgnoreCase("5.5 inch")){
            card.add("$1300");
        }
        else if (a.equalsIgnoreCase("512 GB")&&b.equalsIgnoreCase("6.5 inch")){
            card.add("$1400");
        }
    }
}



class Main {
    public static void main(String[] args) {
        ArrayList<String> card= Phone.card;
        Scanner sc=new Scanner(System.in);
        System.out.println("kaç gb?");
        String str1=sc.nextLine();
        System.out.println("kaç inch?");
        String str2=sc.nextLine();

        Apple apple=new Apple();

        apple.options(str1,str2);

        Samsung samsung=new Samsung();
        System.out.println("kaç gb?");
        String str3=sc.nextLine();
        System.out.println("kaç inch?");
        String str4=sc.nextLine();

        samsung.options(str3,str4);

        System.out.println(apple.getSum(card));
        //System.out.println(samsung.getSum(card));
    }
}