package Mentoring.Mentorlük2;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //iki vize bir final not ort. vizelerin artalamasının %30 u finalin %70 not ortalamasını veriyor.

        System.out.print("1. vize notu:");
        double vize1=scan.nextDouble();
        System.out.print("2. vize notu:");
        double vize2=scan.nextDouble();
        System.out.print("Final notu:");
        double fin=scan.nextDouble();
        double vizeort=(vize1+vize2)/2;
        double ort=vizeort*30/100+fin*70/100;
        System.out.println("Ortalamanız: "+ ort);
    }
}
