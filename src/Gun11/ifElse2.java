package Gun11;

import java.util.Scanner;

public class ifElse2 {
    public static void main(String[] args) {
        //kullanıcıdan girilen vize(%40) ve final(%60) notunu ouyarak ort bulunuz
        //ort >60 geçtiniz  tebrikler değilse büte kaldınız yazdırın
        Scanner oku=new Scanner(System.in);
        System.out.print("Vize notunuz: ");
        int v=oku.nextInt();
        System.out.print("Final notunuz: ");
        int f=oku.nextInt();
        double ort=v*0.4+f*0.6;
        System.out.println("ort = " + ort);
        if(ort>=60) System.out.println("Geçtiniz tebrikler");
        else System.out.println("Bütünlemeye kaldınız");
    }
}
