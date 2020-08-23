package Gun10;

import java.util.Scanner;

public class JavIf6 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int a=oku.nextInt();

        if (a<0) a=-a;//bu bölüm sayı negatif ise çalışacak.

        int b=a%10;
        if(b==0) System.out.println("sayının birler basamağı: sıfır" );
        if(b==1) System.out.println("sayının birler basamağı: bir" );
        if(b==2) System.out.println("sayının birler basamağı: iki" );
        if(b==3) System.out.println("sayının birler basamağı: üç" );
        if(b==4) System.out.println("sayının birler basamağı: dört" );
        if(b==5) System.out.println("sayının birler basamağı: beş" );
        if(b==6) System.out.println("sayının birler basamağı: altı" );
        if(b==7) System.out.println("sayının birler basamağı: yedi" );
        if(b==8) System.out.println("sayının birler basamağı: sekiz" );
        if(b==9) System.out.println("sayının birler basamağı: dokuz" );
    }
}
