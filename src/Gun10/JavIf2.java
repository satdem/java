package Gun10;

import java.util.Scanner;

public class JavIf2 {
    public static void main(String[] args) {
        //Girilen bir sayının negatif ya da pozitif olduğunu yazdırın.
        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayı yazınız:" );
        int a=oku.nextInt();
         if(a>0) {
             System.out.println("sayı pozitif");
         }
         if(a<0) {
             System.out.println("sayı negatif");
         }
         if(a==0) {
             System.out.println("sayı sıfır");
         }
    }

}
