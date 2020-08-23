package Odevler.ifelse;

import java.util.Scanner;

public class ifElselogicodev1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("p(x,y) koordinatları için:");

        System.out.print("x değerini giriniz:");
        int x=sc.nextInt();

        System.out.print("y değerini giriniz:");
        int y=sc.nextInt();

        if (x>-2 && x<8 && y>1 && y<4){
            System.out.println("içinde");
        }
        else if((x<-2 || x>8)||(y<1 || y>4)) {
            System.out.println("dışında");
        }
        else System.out.println("üzerinde");


    }
}
