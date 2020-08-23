package Odevler.Aritmeticoperators;

import java.util.Scanner;

public class Arithmeticoperatorssoru7 {
    public static void main(String[] args) {
        //7.  kullanıcıdan alınan vize ve final notunu alınız ort=0.4*vize+0.6*final olarak bulunuz.
       Scanner sc= new Scanner(System.in);

       System.out.print("Vize notunuzu yazınız: ");
        int vize=sc.nextInt();

        System.out.print("Final notunuzu giriniz: ");
        int finl=sc.nextInt();

        double ort=vize*0.4 +finl*0.6;
        System.out.println("Ders ortalamanız = " + ort);


    }
}
