package Gun14;

import java.util.Scanner;

public class WhileLoop4 {
    public static void main(String[] args) {
        //girilen bir sayıya kadar olan sayıların toplamını bulunuz ve yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("döngü için bir sayı giriniz: ");
        int a=oku.nextInt();
        int sayac=1;
        int toplam=0;

      while (sayac<=a){

        toplam= toplam+sayac++;

        }
        System.out.println(toplam);


    }
}
