package Mentoring.Mentorlük2;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi1=scan.nextInt();
        System.out.print("Bir sayı  daha giriniz: ");
          scan.nextLine();
        String sayi2=scan.nextLine();
        int i=Integer.parseInt(sayi2);
        System.out.println("Toplam = " + (sayi1+i));

    }
}
