package Gun11;

import java.util.Scanner;

public class ifElse3 {
    public static void main(String[] args) {
        //girilen bir sayının tek mi çift mi olduğunu yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a=oku.nextInt();

        if(a%2==0) System.out.println("Sayı çift");
        else System.out.println("sayı tek");
    }
}
