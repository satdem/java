package Odevler.StringKomutları;


import java.util.Scanner;

public class StringKomutlariOdev2 {
    public static void main(String[] args) {
        //2- Girilen bir string içinde bir kelime arayınız, büyük harf veya küçük harf de olsa aranan kelimede bulsun
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir string yazınız: ");
        String text=sc.nextLine();
        boolean bool=text.contains("iyi");
        boolean bool2=text.contains("IYI");
        System.out.println("cümlede iyi var mı: " +bool);
        System.out.println("cümlede IYI var mı: " +bool);

    }
}
