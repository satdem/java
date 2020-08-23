package Gun6;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        // konsoldan girilen iki sayının toplamını bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        int a=oku.nextInt();
        System.out.print("bir sayı daha giriniz: ");
        int b=oku.nextInt();
        System.out.println("Toplam= "+(a+b));

    }
}
