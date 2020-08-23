package Gun13;

import java.util.Scanner;

public class IfinIf1 {
    public static void main(String[] args) {
        //girilen bir sayının önce yüzden küçük ise ,yüzden küçük yazsın.
        //devamında 50 den küçük ise 50 den küçük yazsın
        //devamında 25 den küçük ise 25 den küçük yazsın

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a=oku.nextInt();

        if(a<100){
            System.out.println("sayı 100 den küçük");
            if(a<50){
                System.out.println("sayı 50 den küçük");
                if(a<25){
                    System.out.println("sayı 25 den küçük");
                }
            }
        }
    }
}
