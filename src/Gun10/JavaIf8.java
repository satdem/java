package Gun10;

import java.util.Scanner;

public class JavaIf8 {
    public static void main(String[] args) {
        //Girilen bir sayının onlar basamağının tek mi çift mi olduğunu bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int a=oku.nextInt();

        int b=(a/10)%10;
        int c=b%2;
        if (c==0) System.out.println("sayının onlar basamağı çift");
        if (c==1) System.out.println("sayının onlar basamağı tek");
    }
}
