package Odevler.ifelse;

import java.util.Scanner;

public class ifElseOdev2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("p(x,y) koordinatları için:");

        System.out.print("x değerini giriniz:");
        int x=sc.nextInt();

        System.out.print("y değerini giriniz:");
        int y=sc.nextInt();
        if(x>0 && y>0) System.out.println("Nokta 1. bölgededir.");
        else if (x<0 && y>0) System.out.println("Nokta 2. bölgededir.");
        else if (x<0 && y<0) System.out.println("Nokta 3. bölgededir.");
        else if (x>0 && y<0) System.out.println("Nokta 4. bölgededir.");
        else  System.out.println("Nokta  koordinat ekseni üzerindedir.");
    }
}

