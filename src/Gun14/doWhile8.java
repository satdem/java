package Gun14;

import java.util.Scanner;

public class doWhile8 {
    public static void main(String[] args) {
        // kullanıcı 0 girene kadar sayı girmesini isteyin
        Scanner oku=new Scanner(System.in);
        int sayi1=0;
       /* System.out.println("bir sayı giriniz:");
        int sayi=oku.nextInt();
        while (sayi!=0){
            System.out.println("bir sayı giriniz");
            sayi=oku.nextInt();*/

        //while daki şart gerçekleşmeyene kadar döngü devam eder
        do{
            System.out.println("bir sayı giriniz:");
            sayi1=oku.nextInt();

        }while(sayi1!=0);//burada ;kullanmalıyız
    }
}
