package Gun10;

import java.util.Scanner;

public class JavaIf4 {
    public static void main(String[] args) {
        //Girilen bir sayının tek ya da çift olduğunu yazdırın

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int a=oku.nextInt();

        int b=a%2;

        if(b==0) {
            System.out.println("a çifttir");
        }
        if(b==1) System.out.println("a tektir");

    }
}
