package Gun6;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        //Kullanıcıdan boy ve kilo bilgisini ekrana yazdırınız.
        System.out.print("boyunuzu yazınız:");
        double boy=oku.nextDouble();
        System.out.print("kilonuzu yazınız:");
        double kilo=oku.nextDouble();
        System.out.println("boyunuz: "+boy+" ,Kilonuz: "+kilo);


    }
}
