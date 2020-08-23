package Gun8;

import java.util.Scanner;

public class Sorular {
    public static void main(String[] args) {
        //1- Girilen 2 veya 3 kelimeli ad ve soyadların ilk harflerinin
        //hepsini küçük ve daha sonra büyük hallerini yazdırınız.
        Scanner sc=new Scanner(System.in);
        System.out.print("Adınızı ve soyadınızı yazınız: ");
        String name=sc.nextLine();
        String sk=name.toLowerCase();
        System.out.println("sküçük harfli = " + sk);
        char cad=sk.charAt(0);


        int ibos=sk.indexOf(" ");
        char soyad=sk.charAt(ibos+1);
        System.out.println("ism: "+sk);



    }
}

