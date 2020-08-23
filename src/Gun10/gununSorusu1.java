package Gun10;

import java.util.Scanner;

public class gununSorusu1 {

    public static void main(String[] args) {
        // Girilen 3 basamaklı bir sayının rakamlarını tersten yazdırın.
        Scanner oku=new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz: ");
        int sayi=oku.nextInt();

        int birler=sayi%10;
        int onlar=(sayi/10)%10;
        int yuzler=(sayi/100);
        System.out.println("birler = " + birler);
        System.out.println("onlar = " + onlar);
        System.out.println("yuzler = " + yuzler);
        System.out.println("sayının tersi: "+(birler*100+onlar*10+yuzler*1));

    }
}
