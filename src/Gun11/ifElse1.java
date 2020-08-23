package Gun11;

import java.util.Scanner;

public class ifElse1 {
    public static void main(String[] args) {
       //girilen bir not 50 den büyükse geçti küçükse kaldı yazdırın

        Scanner oku=new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        int ogrNot=oku.nextInt();
        if(ogrNot>=50){
            System.out.println("geçtiniz");
            System.out.println("tebrikler");
        }
        if(ogrNot<50){
            System.out.println("kaldınız");
        }
        //yukarıdaki iki iften hızlı çalışır.
        if(ogrNot>=50) System.out.println("geçtiniz");
        else System.out.println("kaldınız");
    }
}
