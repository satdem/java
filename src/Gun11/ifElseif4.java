package Gun11;

import java.util.Scanner;

public class ifElseif4 {
    public static void main(String[] args) {
        //Girilen bir sayının pozitif ya da negatif old. yazdırın
        //3 ihtimal var poz neg sıfır

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int sayi=oku.nextInt();

        if(sayi>0) System.out.println("sayı pozitif");
         else if(sayi<0) System.out.println("sayı negatif");
           else System.out.println("sayı sıfırdır");

    }
}
