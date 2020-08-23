package Gun6;

import java.util.Scanner;

public class Ornek6 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
//Kullanıcıdan cadde sokak posta kodu ve ülke şeklinde adres bilgilerini yazdırınız.
        System.out.print("cadde =");
        String c=oku.nextLine();
        System.out.print("sokak =");
        String s=oku.nextLine();

        Scanner oku1=new Scanner(System.in);//farklı değişkenler için farklı scanner'ler atanması daha sağlıklı olur.
        System.out.print("posta kodu =");
        int pk=oku1.nextInt();

        System.out.print("ülke=");
        String ulke=oku.nextLine();
        System.out.println("Adresiniz: " +c +" caddesi "+s+" sokağı PK: " +pk+" "+ulke);
    }
}
