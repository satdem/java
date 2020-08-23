package Odevler;


import java.util.Scanner;

public class denemeOdev {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        int b=scan.nextInt();
        int sayac=2;
        int min=b;
        while(sayac<=5){
            System.out.print(sayac+". sayıyı yazınız:");
            int a=scan.nextInt();
            min=Math.min(a,min);
            sayac++;
        }
        System.out.println("min = " + min);



    }
}
