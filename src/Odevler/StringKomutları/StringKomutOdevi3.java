package Odevler.StringKomutları;

import java.util.Scanner;

public class StringKomutOdevi3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // 3-Girilen bir stringdeki bütün boşluk karakterlerini _ ile değiştiriniz.
        System.out.print("Bir cümle yazınız: ");
        String text=sc.nextLine();
        String yeni=text.replaceAll(" ","_");
        System.out.println("yeni cümle = " + yeni);

    }
}
