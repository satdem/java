package Gun10;

import java.util.Scanner;

public class JavaIf3 {
    public static void main(String[] args) {
        //Girilen iki sayıdan büyük olanı ekrana yazdırın, eşitse eşit yazdırın
        Scanner oku=new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        int a=oku.nextInt();

        System.out.print("2. sayıyı giriniz:");
        int b=oku.nextInt();

        if(a>b) {
            System.out.println("büyük sayı: " +a);
        }
        if(a<b) {
            System.out.println("büyük sayı: " +b);
        }
        if(a==b) {
            System.out.println("sayılar eşit");
        }
    }
}
