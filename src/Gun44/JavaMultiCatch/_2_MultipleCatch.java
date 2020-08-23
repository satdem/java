package Gun44.JavaMultiCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _2_MultipleCatch {
    public static void main(String[] args) {

        //kullanıcıdan 5 kez 2 adet sayı alınız ve bölüm sonucunu yazdırınız
        for (int i = 0; i <5 ; i++) {

            try {
                Scanner oku = new Scanner(System.in);
                System.out.print("1. Sayıyı giriniz: ");
                int a = oku.nextInt();

                Scanner oku2 = new Scanner(System.in);//döngüden çıkabiliyordu onun için 2. scanner tanımladık
                System.out.print("2. Sayıyı giriniz: ");
                int b = oku2.nextInt();

                int c = a / b;
                System.out.println("c = " + c);
            } catch (ArithmeticException hata) {

                System.out.println("Hata Oldu!!!");
                System.out.println("2. sayıyı 0 vermeyiniz");
                i--;//hatalı girildiğinde tekrar sayı girmek için i yi azalttık
            }
            catch (InputMismatchException hata){
                System.out.println("Hata Oldu!!!");
                System.out.println("Sayı dedik sayı");
                i--;
            }
        }

    }
}
